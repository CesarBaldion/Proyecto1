/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.UsuarioDAO;
import ModeloVO.UsuarioVO;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Juan Pablo
 */
@WebServlet(name = "UsuariosControlador", urlPatterns = {"/Usuarios"})
public class UsuariosControlador extends HttpServlet {

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
        String Contrasena2 = request.getParameter("txtContrasena2");
        String Nombre = request.getParameter("txtNombre");
        String Telefono = request.getParameter("txtTelefono");
        String Email = request.getParameter("txtEmail");
        String Email2 = request.getParameter("txtEmail2");
        String Direccion = request.getParameter("txtDireccion");
        String Estado = request.getParameter("txtEstado");
        String codigo = request.getParameter("txtcodigo");

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        // 2. Quien tiene los datos de forma segura en el sistema? VO
        UsuarioVO usuVO = new UsuarioVO(Id_Usuarios, Nombre, Documento, Telefono, Email, Direccion,
                Estado, Contrasena);
        // 3. Quien hace las operaciones? DAO
        UsuarioDAO usuDAO = new UsuarioDAO(usuVO);
        //Generar codigo
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MM/dd");
        String codigo2 = String.valueOf(dtf.format(LocalDateTime.now()));
        codigo2 = usuDao.Encriptar(codigo2);

        // 4. Administrar las operaciones del modulo
        switch (opcion) {

            case 1: //Agregar registro
                if (!"".equals(Id_Usuarios)) {
                    if (!"".equals(Documento)) {
                        if (!"".equals(Contrasena)) {
                            if (Contrasena.equals(Contrasena2)) {
                                if (!"".equals(Nombre)) {
                                    if (!"".equals(Telefono)) {
                                        if (!"".equals(Email)) {
                                            if (Email.equals(Email2)) {
                                                if (!"".equals(Direccion)) {
                                                    if (!"".equals(Estado)) {
                                                        if (usuDao.validarContrasena(Contrasena) == true) {
                                                            usuDAO.Encriptar(Contrasena);
                                                            if (usuDao.ValidarNumero(Documento) == true) {
                                                                if (usuDAO.agregarRegistro() == true) {
                                                                    usuDao.enviarCorreoRegistro(Email);
                                                                    request.setAttribute("Bien", "Se ha registrado");
                                                                    request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);

                                                                } else {
                                                                    request.setAttribute("Error", "Error al Registrar!");
                                                                    request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);

                                                                }
                                                            } else {
                                                                request.setAttribute("error", "Ingrese un documento valido");
                                                                request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                                                            }
                                                        } else {
                                                            request.setAttribute("error", "Ingrese una contraseña valida");
                                                            request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                                                        }
                                                    } else {
                                                        request.setAttribute("error", "Complete el campo de estado");
                                                        request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                                                    }
                                                } else {
                                                    request.setAttribute("error", "Complete el campo de Direccion");
                                                    request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                                                }
                                            } else {
                                                request.setAttribute("error", "Los campos Email no coinciden");
                                                request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                                            }
                                        } else {
                                            request.setAttribute("error", "Complete el campo de Email");
                                            request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                                        }
                                    } else {
                                        request.setAttribute("error", "Complete el campo de Telefono");
                                        request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                                    }
                                } else {
                                    request.setAttribute("error", "Complete el campo de Nombre");
                                    request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                                }
                            } else {

                                request.setAttribute("error", "Las contraseñas no coinciden");
                                request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                            }
                        } else {
                            request.setAttribute("error", "Complete el campo de Contraseña");
                            request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                        }
                    } else {
                        request.setAttribute("error", "Complete el campo de Documento");
                        request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                    }
                } else {
                    request.setAttribute("error", "Complete el campo Id");
                    request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
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
                usuVO = usuDAO.iniciarSesion(Documento, usuDao.Encriptar(Contrasena));

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

            case 6:
                usuVO = usuDAO.RecuperacionContraseña(Email);
                if (usuVO != null) {
                    usuDAO.enviarCorreoRecuperacionContraseña(usuVO.getEmail(), codigo2);
                    HttpSession miSesion = request.getSession();
                    miSesion.setAttribute("datosUsuario", usuVO);
                    request.getRequestDispatcher("VerificacionCodigo.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "No encontramos ningun Usuario asociado a este email");
                    request.getRequestDispatcher("VerificacionCodigo.jsp").forward(request, response);
                }

                break;
            case 7:
                if (codigo.equals(codigo2)) {
                    request.getRequestDispatcher("actualizarContrasena.jsp").forward(request, response);
                } else {
                    request.setAttribute("error", "Los codigos no coinciden, "
                            + "vuelva a realizar la solicitud de codigo de recuperacion de Contraseña");
                    request.getRequestDispatcher("actualizarContrasena.jsp").forward(request, response);
                }
                break;
            case 8:
                usuVO = usuDAO.RecuperacionContraseña(Email);

                if (Contrasena.equals(Contrasena2)) {
                    if (usuDao.validarContrasena(Contrasena) == true) {
                        if (usuVO != null) {
                            usuDAO.actualizarContraseña(usuVO.getIdUsuarios(), usuDao.Encriptar(Contrasena));
                            HttpSession buscarSesion = request.getSession();
                            buscarSesion.removeAttribute("datosUsuario");
                            buscarSesion.invalidate();
                            request.getRequestDispatcher("iniciarSesion.jsp").forward(request, response);

                        } else {
                            request.setAttribute("error", "Erro al actualizar, Haga la solicitud de nuevo");
                            request.getRequestDispatcher("actualizarContrasena.jsp").forward(request, response);
                        }
                    } else {
                        request.setAttribute("error", "Ingrese una contraseña valida");
                        request.getRequestDispatcher("actualizarContrasena.jsp").forward(request, response);

                    }
                } else {
                    request.setAttribute("error", "Las contraseñas no coinciden");
                    request.getRequestDispatcher("actualizarContrasena.jsp").forward(request, response);
                }

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
