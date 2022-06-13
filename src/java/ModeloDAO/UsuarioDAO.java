/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.UsuarioVO;
import Util.Conexion;
import Util.Crud;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

;

/**
 *
 * @author Juan Pablo
 */
public class UsuarioDAO extends Conexion implements Crud {

    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    // Declarar variables del modulo(VO)
    private String Id_Usuarios = "", Nombre = "", Tipo_Documento="",  Documento = "", Telefono = "",
            Email = "", Direccion = "", Ciudad="", Estado = "", Contrasena = "";

    //Llave Encriptacion de Contraseña
    private String llave = "SuiteFactor";

    public UsuarioDAO() {
    }

    //2. Crear metodo principal para recibir los datos del VO
    public UsuarioDAO(UsuarioVO usuVO) {
        super();

        //3. Conectarse a la base de datos
        try {

            conexion = this.obtenerConexion();
            // 4. traer al DAO los datos del VO para hacer las operaciones.

            Id_Usuarios = usuVO.getIdUsuarios();
            Nombre = usuVO.getNombre();
            Tipo_Documento = usuVO.getTipo_Documento();
            Documento = usuVO.getDocumento();
            Telefono = usuVO.getTelefono();
            Email = usuVO.getEmail();
            Direccion = usuVO.getDireccion();
            Ciudad = usuVO.getCiudad();
            Estado = usuVO.getEstado();
            Contrasena = usuVO.getContrasena();

        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public boolean agregarRegistro() {
        try {
            //Armar sentencia
            sql = "insert into usuarios( Nombre, `Tipo de documento`, Documento, Telefono, Email, Direccion, Ciudad, Contrasena)"
                    + "values (?,?,?,?,?,?,?,?)";
            // crear el camino por donde va la sentencia
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Nombre);
            puente.setString(2, Tipo_Documento);
            puente.setString(3, Documento);
            puente.setString(4, Telefono);
            puente.setString(5, Email);
            puente.setString(6, Direccion);
            puente.setString(7, Ciudad);
            puente.setString(8, Encriptar(Contrasena));
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {

        try {
            sql = " update usuarios set Nombre = ?, `Tipo de documento` = ?, Documento = ?, Telefono = ?, Email = ?"
                    + ", Direccion = ?, Ciudad = ? where id_Usuarios = ? ";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Nombre);
            puente.setString(2, Tipo_Documento);
            puente.setString(3, Documento);
            puente.setString(4, Telefono);
            puente.setString(5, Email);
            puente.setString(6, Direccion);
            puente.setString(7, Ciudad);
            puente.setString(8, Id_Usuarios);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }
    

    @Override
    public boolean eliminarRegistro() {

        try {
            sql = "UPDATE `usuarios` SET `Estado`= 0 WHERE Id_usuarios = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_Usuarios);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    public UsuarioVO iniciarSesion(String Documento, String Contrasena) {

        UsuarioVO usuVO = null;

        try {
            conexion = this.obtenerConexion();
            sql = "select * from usuarios where Documento = ? and Contrasena = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Documento);
            puente.setString(2, Contrasena);
            mensajero = puente.executeQuery();

            if (mensajero.next()) {

                usuVO = new UsuarioVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4),
                        mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9), mensajero.getString(10));

            }

        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return usuVO;

    }

    public UsuarioVO consultaruSUARIO(String Id) {

        UsuarioVO usuVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from usuarios where id_usuarios = ? and estado = 1";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                usuVO = new UsuarioVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4),
                        mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9), mensajero.getString(10));

            }

        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        }   
        

        return usuVO;

    }

    public ArrayList<UsuarioVO> Listar() {

        ArrayList<UsuarioVO> listaUsuarios = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from usuarios where Estado = 1";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                UsuarioVO usuVO = new UsuarioVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4),
                        mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9), mensajero.getString(10));

                listaUsuarios.add(usuVO);

            }

        } catch (SQLException e) {
            Logger.getLogger(UsuarioVO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return listaUsuarios;

    }
    
    public ArrayList<UsuarioVO> ListarDos() {

        ArrayList<UsuarioVO> listaUsuarios = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from usuariosview2";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                UsuarioVO usuVO = new UsuarioVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4),
                        mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9), mensajero.getString(10));

                listaUsuarios.add(usuVO);

            }

        } catch (SQLException e) {
            Logger.getLogger(UsuarioVO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return listaUsuarios;

    }

  
    
    public SecretKeySpec crearClave(String llave) {

        try {
            byte[] cadena = llave.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            cadena = md.digest(cadena);
            cadena = Arrays.copyOf(cadena, 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(cadena, "AES");
            return secretKeySpec;
        } catch (Exception e) {
            return null;
        }

    }

    public String Encriptar(String encriptar) {

        try {
            SecretKeySpec secretKeySpec = crearClave(llave);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] cadena = encriptar.getBytes("UTF-8");
            byte[] encriptada = cipher.doFinal(cadena);
            String cadena_encriptada = Base64.encode(encriptada);
            return cadena_encriptada;

        } catch (Exception e) {
            return "";
        }
    }

    public String Desencriptar(String desencriptar) {

        try {
            SecretKeySpec secretKeySpec = crearClave(llave);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            byte[] cadena = Base64.decode(desencriptar);
            byte[] desencriptacioon = cipher.doFinal(cadena);
            String cadena_desencriptada = new String(desencriptacioon);
            return cadena_desencriptada;
        } catch (Exception e) {
            return "";
        }
    }

    public ArrayList validarDatosRegistroUsuario(String email2, String contrasena2) {
        //Expresiones regulares 
        String nombreReg = "^[a-zA-ZÀ-ÿ\\s]{5,40}$";
        String passwordReg = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])([A-Za-z\\d$@$!%*?&]|[^ ]){8,15}$";
        String correoReg = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
        String telefonoReg = "^\\d{10}$";
        String documentoReg = "^\\d{7,20}";
        String direccionReg = "^[a-zA-ZÀ-ÿ\\s#-_]{5,40}$";
        String tipoDocumentoReg = "^(CC?|TI?|PA?)$";

        ArrayList respuesta = new ArrayList();
        /*Pattern pat = Pattern.compile(nombreReg);
        Matcher comparacion = pat.matcher(datosUsuario.getNombre())*/
        if (Nombre.matches(nombreReg) == false) {
            respuesta.add("Verifique El nombre");
        }if (Tipo_Documento.matches(tipoDocumentoReg) == false) {
            respuesta.add("Verifique su Tipo de Documento");
        }if (Documento.matches(documentoReg) == false) {
            respuesta.add("Veifique su Documento");
        }if (Direccion.matches(direccionReg) == false) {
            respuesta.add("Verifique su Direccion");
        }if (Ciudad.matches(nombreReg) == false) {
            respuesta.add("Verifique Ciudad");
        }if (Telefono.matches(telefonoReg) == false) {
            respuesta.add("verifique Telefono");
        }if (Email.matches(correoReg) == false) {
            respuesta.add("Verifique Email");
        }if (email2.matches(correoReg) == false) {
            respuesta.add("Verifique Email2");
        }if (Email.equals(email2) == false) {
            respuesta.add("los email no coinciden");
        }if (Contrasena.matches(passwordReg) == false) {
            respuesta.add("Verifique el Password1");
        }if (contrasena2.matches(passwordReg) == false) {
            respuesta.add("Verifique el Password2");
        }if (Contrasena.equals(contrasena2) == false) {
            respuesta.add("Las contraseñas no coinciden");
        }

        return respuesta;
    }

    public boolean ValidarNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean enviarCorreoRegistro(String correoDestino) {

        String correo = "suitefactorgestion@gmail.com";
        String contrasena = "qjoy zefu tctf tbyd";

        Properties p = new Properties();
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.trust", "smtp.gmail.com");
        p.setProperty("mail.smtp.port", "587");
        p.setProperty("mail.smtp.user", correo);
        p.setProperty("mail.smtp.auth", "true");

        Session s = Session.getDefaultInstance(p);
        MimeMessage mensaje = new MimeMessage(s);
        try {
            mensaje.setFrom(new InternetAddress(correo));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestino));
            mensaje.setSubject("Registro");
            mensaje.setText("Usted Se ha registrado en el proyecto de Suitefactor, Gracias!");

            Transport t = s.getTransport("smtp");
            t.connect(correo, contrasena);
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();

            return true;
        } catch (Exception e) {

            return false;

        }

    }

    public UsuarioVO RecuperacionContraseña(String documento) {

        UsuarioVO usuVO = null;

        try {
            sql = "select * from usuarios where documento = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, documento);
            mensajero = puente.executeQuery();

            if (mensajero.next()) {

                usuVO = new UsuarioVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4),
                        mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9), mensajero.getString(10));

            }

        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        }

        return usuVO;

    }

    public boolean enviarCorreoRecuperacionContraseña(String correoDestino, String codigo) {

        String correo = "suitefactorgestion@gmail.com";
        String contrasena = "qjoy zefu tctf tbyd";

        Properties p = new Properties();
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.trust", "smtp.gmail.com");
        p.setProperty("mail.smtp.port", "587");
        p.setProperty("mail.smtp.user", correo);
        p.setProperty("mail.smtp.auth", "true");

        Session s = Session.getDefaultInstance(p);
        MimeMessage mensaje = new MimeMessage(s);
        try {
            mensaje.setFrom(new InternetAddress(correo));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestino));
            mensaje.setSubject("Recuperacion Contraseña");
            mensaje.setText("Este es su codigo de Recuperacion de contrseña " + codigo + " No lo comparta con nadie");

            Transport t = s.getTransport("smtp");
            t.connect(correo, contrasena);
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();

            return true;
        } catch (Exception e) {

            return false;

        }

    }

    public boolean actualizarContraseña(String id, String contrasena) {

        try {

            sql = " update usuarios set contrasena = ? where id_Usuarios = ? ";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, contrasena);
            puente.setString(2, id);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            operacion = false;
        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    public boolean verificarUsuario(String Documento) {

        UsuarioVO usuVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from usuarios where documento = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Documento);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                usuVO = new UsuarioVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4),
                        mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9), mensajero.getString(10));
            }
            if (usuVO == null) {
                operacion = false;
            } else {
                operacion = true;
            }

        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;

    }

    public boolean cargarUsuarios(String rutaAbsoluta) throws SQLException, IOException {

        try {
            sql = "insert into usuarios( Nombre, `Tipo de documento`, Documento, Direccion, Ciudad, Telefono, Email, Contrasena)"
                    + "values (?,?,?,?,?,?,?,?)";
            conexion = obtenerConexion();
            FileInputStream file = new FileInputStream(new File(rutaAbsoluta));

            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            DataFormatter dataFormater = new DataFormatter();
            int numFilas = sheet.getLastRowNum();

            for (int a = 1; a <= numFilas; a++) {
                Row fila = sheet.getRow(a);
                puente = conexion.prepareStatement(sql);
                puente.setString(1, dataFormater.formatCellValue(fila.getCell(0)));
                puente.setString(2, dataFormater.formatCellValue(fila.getCell(1)));
                puente.setString(3, dataFormater.formatCellValue(fila.getCell(2)));
                puente.setString(4, dataFormater.formatCellValue(fila.getCell(3)));
                puente.setString(5, dataFormater.formatCellValue(fila.getCell(4)));
                puente.setString(6, dataFormater.formatCellValue(fila.getCell(5)));
                puente.setString(7, dataFormater.formatCellValue(fila.getCell(6)));
                puente.setString(8, dataFormater.formatCellValue(fila.getCell(7)));
                puente.execute();
            }
            File buscarArchivo = new File(rutaAbsoluta);
            buscarArchivo.delete();
            operacion = true;
            conexion = cerrarConexion();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return operacion;
    }
    

}