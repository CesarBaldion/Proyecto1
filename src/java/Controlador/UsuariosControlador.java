/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.UsuarioDAO;
import ModeloVO.UsuarioVO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Juan Pablo
 */
@WebServlet(name = "UsuariosControlador", urlPatterns = {"/Usuarios"})
public class UsuariosControlador extends HttpServlet {
    
    public boolean enviarCorreo(String correoDestino ) {

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
    
    public boolean ValidarNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        UsuarioDAO usuDao = new UsuarioDAO();
        // 1. Recibir datos de la vista
        String Id_Usuarios = request.getParameter("txtId");
        String Documento = request.getParameter("txtDocumento");
        String Contrasena = request.getParameter("txtContrasena");
        String Nombre = request.getParameter("txtNombre");
        String Telefono = request.getParameter("txtTelefono");
        String Email = request.getParameter("txtEmail");
        String Direccion = request.getParameter("txtDireccion");
        String Estado = request.getParameter("txtEstado");

        final int MAX = 8;

        // Especificando el número de letras mayúsculas en la contraseña
        final int min_Mayus = 1;
        // Especificando el mínimo de minúsculas en la contraseña
        final int min_Minus = 1;
        // Especificando el número de dígitos en una contraseña
        final int num_Numeros = 1;
        // Especificar el número mínimo de letras en mayúsculas y minúsculas
        final int min_CaracterEspecial = 1;
        // Contar el número de letras mayúsculas en una contraseña
        int mayusculas = 0;
        // Contador de letras minúsculas en una contraseña
        int minusculas = 0;
        // Contar numeros en una contraseña
        int numeros = 0;
        // Contar caracteres especiales en una constraseña
        int caracterEspecial = 0;

        for (int i = 0; i < Contrasena.length(); i++) {
            char c = Contrasena.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
            if (c >= 33 && c <= 46 || c == 64) {
                caracterEspecial++;
            }

        }

        // 3. Quien hace las operaciones? DAO
        
        /*Contrasena = usuDao.Encriptar(Contrasena);
        System.out.println(Contrasena);
        Contrasena = usuDao.Desencriptar(Contrasena);
        System.out.println(Contrasena);*/
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        // 2. Quien tiene los datos de forma segura en el sistema? VO
        UsuarioVO usuVO = new UsuarioVO(Id_Usuarios, Nombre, Documento, Telefono, Email, Direccion,
                Estado, Contrasena);

        UsuarioDAO usuDAO = new UsuarioDAO(usuVO);
        
        // 4. Administrar las operaciones del modulo
        switch (opcion) {

            case 1: //Agregar registro
                if (Contrasena.length() >= MAX && mayusculas >= min_Mayus
                        && minusculas >= min_Minus && numeros >= num_Numeros && caracterEspecial >= min_CaracterEspecial) {
                    request.setAttribute("Valida", "Contraseña es Valida");
                    if (Documento.equals("")) {

                    }else if (ValidarNumero(Documento) == false) {

                    }else if (Nombre.equals("")){
                        
                    }else if (Direccion.equals("")){
                        
                    }else if (Telefono.equals("")){
                        
                    }else if(Email.equals("")){
                        
                    }else if(Estado.equals("")){
                    
                    }else if (usuDAO.agregarRegistro()) {
                        enviarCorreo(Email);
                        request.setAttribute("mensajeExito", "El usuario se registro correctamente!");
                        request.getRequestDispatcher("index.jsp").forward(request, response);

                    } else {

                        request.setAttribute("mensajeError", "El usuario no se registro correctamente");
                        request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                    }

                } else {
                    request.setAttribute("NoValida", "Contraseña debe contener 1 numero,1 minuscula,1 mayuscula,1 caracter especial y minimo 8 caracteres");
                }

                
                break;

            case 2:

                if (usuDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "El usuario se actualizo correctamente!");

                } else {

                    request.setAttribute("mensajeExito", "El usuario no se actualizo correctamente!");
                }
                request.getRequestDispatcher("actualizarUsuarios.jsp").forward(request, response);
                break;

            case 3:

                if (usuDAO.eliminarRegistro()) {

                    request.setAttribute("mensajeExito", "El usuario se elimino correctamente!");

                } else {

                    request.setAttribute("mensajeExito", "El usuario no se elimino correctamente!");
                }
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;

            case 4:
                usuVO = usuDAO.iniciarSesion(Documento,usuDao.Encriptar(Contrasena));

                if (usuVO != null) {

                    HttpSession miSesion = request.getSession();
 
                    miSesion.setAttribute("datosUsuario", usuVO);

                    request.getRequestDispatcher("index.jsp").forward(request, response);

                } else {

                    request.setAttribute("mensajeError", "Corregir datos!");
                    request.getRequestDispatcher("iniciarSesion.jsp").forward(request, response);
                }
                break;

            case 5: // consultar por Id

                usuVO = usuDAO.consultaruSUARIO(Id_Usuarios);
                if (usuVO != null) {
                    request.setAttribute("usuarioConsultado", usuVO);
                    request.getRequestDispatcher("actualizarUsuarios.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "El Usuario no existe!");
                    request.getRequestDispatcher("consultarUsuarios.jsp").forward(request, response);

                }
                break;
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
