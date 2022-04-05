/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.OrdenesDAO;
import ModeloVO.OrdenesVO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sena
 */
@WebServlet(name = "OrdenesControlador", urlPatterns = {"/Ordenes"})
public class OrdenesControlador extends HttpServlet {

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

        String Id_Orden = request.getParameter("txtIdOrden");
        String Id_Usuarios = request.getParameter("txtUsu");
        String fecha_registro = request.getParameter("txtFechaRegistro");
        String fecha_entrega = request.getParameter("txtFechaEntrega");

        int opcion = Integer.parseInt(request.getParameter("opcion"));
        // 2. Quien tiene los datos de forma segura en el sistema? VO
        OrdenesVO ordVO = new OrdenesVO(Id_Orden, Id_Usuarios, fecha_registro, fecha_entrega);

        // 3. Quien hace las operaciones? DAO
        OrdenesDAO ordDAO = new OrdenesDAO(ordVO);

        // 4. Administrar las operaciones del modulo
        switch (opcion) {

            case 1: //Agregar registro

                if (ordDAO.agregarRegistro()) {

                    request.setAttribute("mensajeExito", "La orden se registró correctamente!");

                } else {

                    request.setAttribute("mensajeError", "La orden no se registró correctamente");
                }
                request.getRequestDispatcher("registrarOrdenes.jsp").forward(request, response);
                break;

            case 2:

                if (ordDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "La orden se actualizo correctamente!");

                } else {

                    request.setAttribute("mensajeError", "La orden no se actualizo correctamente!");
                }
                request.getRequestDispatcher("actualizarOrdenes.jsp").forward(request, response);
                break;

            case 3:

                if (ordDAO.eliminarRegistro()) {

                    request.setAttribute("mensajeExito", "La orden se elimino correctamente!");

                } else {

                    request.setAttribute("mensajeError", "La orden no se elimino correctamente!");
                }
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;

            case 4: //Consultar por Orden

                ordVO = ordDAO.consultarOrden(Id_Orden);
                if (ordVO != null) {

                    request.setAttribute("OrdenConsultada", ordVO);
                    request.getRequestDispatcher("actualizarOrdenes.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeExito", "La orden no existe");
                    request.getRequestDispatcher("consultarOrdenes.jsp").forward(request, response);
                }
                break;
                
                 default:
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
