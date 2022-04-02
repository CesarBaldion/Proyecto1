/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.LoteProduccionDAO;
import ModeloDAO.OrdenDetallesDAO;
import ModeloVO.LoteProduccionVO;
import ModeloVO.OrdenDetallesVO;
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
@WebServlet(name = "OrdenDetallesControlador", urlPatterns = {"/OrdenDetalles"})
public class OrdenDetallesControlador extends HttpServlet {

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
        
       String id_Orden_Detalles = request.getParameter("txtIdOrdenDetalles");
       String id_Orden = request.getParameter("txtIdOrden");
       String id_Detalles_Producto = request.getParameter("txtidDetallesProducto");
       String cantidadSolicitada = request.getParameter("txtcantidadSolicitada");
       
       int opcion = Integer.parseInt(request.getParameter("opcion"));
        // 2. Quien tiene los datos de forma segura en el sistema? VO
        OrdenDetallesVO ordenDetallVO = new OrdenDetallesVO(id_Orden_Detalles, id_Orden, id_Detalles_Producto, cantidadSolicitada);

        // 3. Quien hace las operaciones? DAO
        OrdenDetallesDAO ordenDetalDAO = new OrdenDetallesDAO(ordenDetallVO);

        // 4. Administrar las operaciones del modulo
        switch (opcion) {

            case 1: //Agregar registro

                if (ordenDetalDAO.agregarRegistro()) {

                        request.setAttribute("mensajeExito", "La orden Detalles se registró correctamente!");

                } else {

                    request.setAttribute("mensajeError", "La orden Detalles no se registró correctamente");
                }
                request.getRequestDispatcher("registrarOrdenDetalles.jsp").forward(request, response);
                break;

            case 2:

                if (ordenDetalDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "La orden Detalles se actualizo correctamente!");

                } else {

                    request.setAttribute("mensajeError", "La orden Detalles no se actualizo correctamente!");
                }
                request.getRequestDispatcher("consultarOrdenDetalles.jsp").forward(request, response);
                break;

            case 3:

                if (ordenDetalDAO.eliminarRegistro()) {

                    request.setAttribute("mensajeExito", "El lote de Produccion se elimino correctamente!");

                } else {

                    request.setAttribute("mensajeError", "El lote de Produccion no se elimino correctamente!");
                }
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;

            case 4: //Consultar por Orden_Detalles

                ordenDetallVO = ordenDetalDAO.cosnultarId(id_Orden_Detalles);
                if (ordenDetallVO != null) {

                    request.setAttribute("OrdenDetallesConsultada", ordenDetallVO);
                    request.getRequestDispatcher("actualizarOrdenDetalles.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeExito", "La orden Detalles no existe");
                    request.getRequestDispatcher("consultarOrdenDetalles.jsp").forward(request, response);
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
