/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.OrdenesDao;
import ModeloVO.OrdenesVo;
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
        OrdenesVo ordVo = new OrdenesVo(Id_Orden,Id_Usuarios, fecha_registro, fecha_entrega);

        // 3. Quien hace las operaciones? DAO
        OrdenesDao ordDao = new OrdenesDao(ordVo);

        // 4. Administrar las operaciones del modulo
        switch (opcion) {

            case 1: //Agregar registro

                if (ordDao.agregarRegistro()) {

                    request.setAttribute("mensajeExito", "El usuario se registro correctamente!");

                } else {

                    request.setAttribute("mensajeError", "El usuario no se registro correctamente");
                }
                request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                break;

            case 2:

                if (ordDao.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "El usuario se actualizo correctamente!");

                } else {

                    request.setAttribute("mensajeExito", "El usuario no se actualizo correctamente!");
                }
                request.getRequestDispatcher("actualizarUsuario.jsp").forward(request, response);
                break;

            case 3:

                if (ordDao.eliminarRegistro()) {

                    request.setAttribute("mensajeExito", "El usuario se elimino correctamente!");

                } else {

                    request.setAttribute("mensajeExito", "El usuario no se elimino correctamente!");
                }
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;
        }
        }
    }


