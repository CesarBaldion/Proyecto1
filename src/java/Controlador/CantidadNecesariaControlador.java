/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.CantidadNecesariaDAO;
import ModeloVO.CantidadNecesariaVO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ESCOBAR
 */
@WebServlet(name = "CantidadNecesariaControlador", urlPatterns = {"/CantidadNecesaria"})
public class CantidadNecesariaControlador extends HttpServlet {

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
        ServletOutputStream out1 = response.getOutputStream();
        String idCantidadNecesaria = request.getParameter("txtIdCantidadNec");
        String id_materia_prima = request.getParameter("Id_Materia_Prima");
        String id_detalles_producto = request.getParameter("Id_Detalles_Producto");
        String materiaprimaenproducto = request.getParameter("materiaprimaenproducto");

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        CantidadNecesariaVO cantNecVO = new CantidadNecesariaVO(idCantidadNecesaria, id_detalles_producto, id_materia_prima, materiaprimaenproducto);

        // 3. Quien hace las operaciones? DAO
        CantidadNecesariaDAO cantNecDAO = new CantidadNecesariaDAO(cantNecVO);

        switch (opcion) {

            case 1: //Agregar registro
                if (cantNecDAO.verificarCantidadNec()) {
                    if (cantNecDAO.agregarRegistro()) {
                        out1.println("<label class='text-success'><b>Se ha registrado Correctamente</b></label>");
                    } else {
                        out1.println("<label class='text-danger'><b>Error al Registrar</b></label>");
                    }
                } else {
                    out1.println("<label class='text-danger'><b>Ya existe esta Cantidad Necesaria Para el Producto</b></label>");

                }

                break;
            case 2:
                if (cantNecDAO.actualizarRegistro()) {
                    out1.println("<label class='text-success'><b>Se ha Actualizado Correctamente</b></label>");
                } else {
                        out1.println("<label class='text-danger'><b>Error al Actualizar</b></label>");

                }
                break;
            case 3:

                if (cantNecDAO.eliminarRegistro()) {
                    out1.println("<label class='text-success'><b>Se ha Eliminado Correctamente</b></label>");
                } else {
                    out1.println("<label class='text-success'><b>Error al Eliminar</b></label>");
                }
                break;

            default:
                break;

            case 4: {
                cantNecVO = cantNecDAO.consultarCantidadNecesaria(id_materia_prima);
            }
            if (cantNecVO != null) {
                request.setAttribute("productoCosultado", cantNecVO);
                request.getRequestDispatcher("actualizarProducto.jsp").forward(request, response);
            } else {
                request.setAttribute("mensajError", "El producto no existe");
                request.getRequestDispatcher("consultarProducto.jsp").forward(request, response);
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
