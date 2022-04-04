/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.ProductoDAO;
import ModeloVO.ProductoVO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andrex
 */
@WebServlet(name = "ProductoControlador", urlPatterns = {"/Producto"})
public class ProductoControlador extends HttpServlet {

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
        //recibir datos
        String Id_Producto = request.getParameter("txtId");
        String Nombre = request.getParameter("txtNombre");
        String Estado = request.getParameter("txtEstado");
        
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        
         //2. Quien tiene los datos de forma segura en el sistema? VO
        ProductoVO prodVO = new ProductoVO(Id_Producto, Nombre, Estado);
        
        // 3. Quien hace las operaciones? DAO
        ProductoDAO prodDAO = new ProductoDAO(prodVO);
        
        // 4. Administrar las operaciones del modulo
        switch (opcion) {

            case 1: //Agregar registro

                if (prodDAO.agregarRegistro()) {

                    request.setAttribute("mensajeExito", "El producto se registro correctamente!");

                } else {

                    request.setAttribute("mensajeError", "El producto no se registro correctamente");
                }
                request.getRequestDispatcher("registrarProducto.jsp").forward(request, response);
                break;

            case 2:

                if (prodDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "El producto se actualizo correctamente!");

                } else {

                    request.setAttribute("mensajeExito", "El producto no se actualizo correctamente!");
                }
                request.getRequestDispatcher("actualizarProducto.jsp").forward(request, response);
                break;

            case 3:

                if (prodDAO.eliminarRegistro()) {

                    request.setAttribute("mensajeExito", "El producto se elimino correctamente!");

                } else {

                    request.setAttribute("mensajeExito", "El producto no se elimino correctamente!");
                }
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;
                
                 case 4: // consultar por Id

                prodVO = prodDAO.consultarProducto(Id_Producto);
                if (prodVO != null) {
                    request.setAttribute("productoConsultado", prodVO);
                    request.getRequestDispatcher("actualizarProducto.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "El producto no existe!");
                    request.getRequestDispatcher("consultarProducto.jsp").forward(request, response);

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
