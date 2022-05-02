/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.UsuarioRolDAO;
import ModeloVO.Usuario_rolVO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 1Usuario
 */
@WebServlet(name = "UsuarioRolControlador", urlPatterns = {"/UsuarioRol"})
public class UsuarioRolControlador extends HttpServlet {

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
        String id_Rol = request.getParameter("txtIdRol");
        String id_Usuarios = request.getParameter("txtIdUsu");
        String estado = request.getParameter("txtEstado");;

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //2. Quien tiene los datos de forma segura en el sistema? VO
        Usuario_rolVO uRVO = new Usuario_rolVO(id_Rol, id_Usuarios, estado);

        // 3. Quien hace las operaciones? DAO
        UsuarioRolDAO uRDAO = new UsuarioRolDAO(uRVO);

        // 4. Administrar las operaciones del modulo
        switch (opcion) {

            case 1: //Agregar registro

                if (uRDAO.agregarRegistro()) {

                    request.setAttribute("mensajeExito", "El rol se registro correctamente!");

                } else {

                    request.setAttribute("mensajeError", "El rol no se registro correctamente");
                }
                request.getRequestDispatcher("registrarRol.jsp").forward(request, response);
                break;

            case 2:

                if (uRDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "El rol se actualizo correctamente!");

                } else {

                    request.setAttribute("mensajeExito", "El rol no se actualizo correctamente!");
                }
                request.getRequestDispatcher("actualizarRol.jsp").forward(request, response);
                break;

            case 3:

                if (uRDAO.eliminarRegistro()) {

                    request.setAttribute("mensajeExito", "El rol se elimino correctamente!");

                } else {

                    request.setAttribute("mensajeExito", "El rol no se elimino correctamente!");
                }
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;

            default:
                break;

            case 4: {
                uRVO = uRDAO.consultarRol(id_Rol);
            }
            if (uRVO != null) {
                request.setAttribute("UsuarioRolConsultado", uRVO);
                request.getRequestDispatcher("actualizarUsuarioRol.jsp").forward(request, response);
            } else {
                request.setAttribute("mensajError", "El rol no existe");
                request.getRequestDispatcher("consultarUsuarioRol.jsp").forward(request, response);
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
