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
import java.sql.Array;
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
    private String id_Usuarios = "", Nombre = "", Documento = "", Telefono = "",
            Email = "", Direccion = "", Estado = "", Contrasena = "";
    
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

            id_Usuarios = usuVO.getIdUsuarios();
            Nombre = usuVO.getNombre();
            Documento = usuVO.getDocumento();
            Telefono = usuVO.getTelefono();
            Email = usuVO.getEmail();
            Direccion = usuVO.getDireccion();
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
            sql = "insert into usuarios( Nombre, Documento, Telefono, Email, Direccion,"
                    + " Estado, Contrasena) values (?,?,?,?,?,?,?)";
            // crear el camino por donde va la sentencia
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Nombre);
            puente.setString(2, Documento);
            puente.setString(3, Telefono);
            puente.setString(4, Email);
            puente.setString(5, Direccion);
            puente.setString(6, Estado);
            
            puente.setString(7,Encriptar(Contrasena));
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
            sql = " update usuarios set Nombre = ?, Documento = ?, Telefono = ?, Email = ?"
                    + ", Direccion = ?, Estado = ?, Contrasena = ? where id_Usuarios = ? ";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Nombre);
            puente.setString(2, Documento);
            puente.setString(3, Telefono);
            puente.setString(4, Email);
            puente.setString(5, Direccion);
            puente.setString(6, Estado);
            puente.setString(7, Contrasena);
            puente.setString(8, id_Usuarios);
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
            //Armar sentencia
            sql = "delete from usuarios where id_Usuarios" + id_Usuarios;
            puente = conexion.prepareStatement(sql);
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

                usuVO = new UsuarioVO(mensajero.getString(1));

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
            sql = "select * from usuarios where id_usuarios = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                usuVO = new UsuarioVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4),
                        mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8));

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

    public ArrayList<UsuarioVO> Listar() {

        ArrayList<UsuarioVO> listaUsuarios = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from usuarios";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                UsuarioVO usuVO = new UsuarioVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4),
                        mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8));

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
    
    public SecretKeySpec crearClave(String llave){
        
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

}
