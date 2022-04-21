/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.LoteProduccionDAO;
import ModeloVO.LoteProduccionVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sena
 */
@WebServlet(name = "LoteProduccionControlador", urlPatterns = {"/LoteProduccion"})
public class LoteProduccionControlador extends HttpServlet {

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
        String id_loteProduccion = request.getParameter("txtid_loteProduccion");
        String cantidad = request.getParameter("txtcantidad");
        String fecha_Fabricacion = request.getParameter("txtfecha_Fabricacion");
        String Id_orden_detalles = request.getParameter("txtId_orden_detalles");
        String Id_Usuarios = request.getParameter("txtId_Usuarios");
        
        if(cantidad==null){
            cantidad ="0";
        }
        ;
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        // 2. Quien tiene los datos de forma segura en el sistema? VO
        LoteProduccionVO ltProducVO = new LoteProduccionVO(id_loteProduccion,Id_Usuarios,Id_orden_detalles, Integer.parseInt(cantidad), fecha_Fabricacion);

        // 3. Quien hace las operaciones? DAO
        LoteProduccionDAO ltProducDAO = new LoteProduccionDAO(ltProducVO);

        // 4. Administrar las operaciones del modulo
        switch (opcion) {

            case 1: //Agregar registro

                if (ltProducDAO.agregarRegistro()) {

                    request.setAttribute("mensajeExito", "El lote de Produccion se registró correctamente!");

                } else {

                    request.setAttribute("mensajeError", "El lote de Produccion no se registró correctamente");
                }
                request.getRequestDispatcher("registrarLoteProduccion.jsp").forward(request, response);
                break;

            case 2:

                if (ltProducDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "El lote de Produccion se actualizo correctamente!");

                } else {

                    request.setAttribute("mensajeError", "El lote de Produccion no se actualizo correctamente!");
                }
                request.getRequestDispatcher("actualizarLoteProduccion.jsp").forward(request, response);
                break;

            case 3:

                if (ltProducDAO.eliminarRegistro()) {

                    request.setAttribute("mensajeExito", "El lote de Produccion se elimino correctamente!");

                } else {

                    request.setAttribute("mensajeError", "El lote de Produccion no se elimino correctamente!");
                }
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;

            case 4: //Consultar por Orden

                ltProducVO = ltProducDAO.consultarIdLoteProduccion(id_loteProduccion);
                if (ltProducVO != null) {

                    request.setAttribute("LoteProduccionConsultada", ltProducVO);
                    request.getRequestDispatcher("actualizarLoteProduccion.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeExito", "El lote de Produccion no existe");
                    request.getRequestDispatcher("consultarLoteProduccion.jsp").forward(request, response);
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
