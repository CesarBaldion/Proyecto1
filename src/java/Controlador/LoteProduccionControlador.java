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
             // 1. Recibir datos de la vista
        String Id_Lote_Produccion = request.getParameter("txtIdLote");
        int Cantidad = Integer.parseInt(request.getParameter("txtCantidad"));
        String Fecha_Fabricacion = request.getParameter("txtfecha_Fabricacion"); 
        String Id_orden_detalles = request.getParameter("txt_id_orden_detalles");
        String Id_Usuarios = request.getParameter("txtId_Usuarios");
        
        
        

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        // 2. Quien tiene los datos de forma segura en el sistema? VO
        LoteProduccionVO loteVO = new LoteProduccionVO(Id_Lote_Produccion,Cantidad, Fecha_Fabricacion, Id_orden_detalles, Id_Usuarios);

        // 3. Quien hace las operaciones? DAO
        LoteProduccionDAO loteDAO = new LoteProduccionDAO(loteVO);

        // 4. Administrar las operaciones del modulo
        switch (opcion) {

            case 1: //Agregar registro

                if (loteDAO.agregarRegistro()) {

                    request.setAttribute("mensajeExito", "El lote se registro correctamente!");

                } else {

                    request.setAttribute("mensajeError", "El lote no se registro correctamente");
                }
                request.getRequestDispatcher("Registrar.jsp").forward(request, response);
                break;

            case 2:

                if (loteDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "El usuario se actualizo correctamente!");

                } else {

                    request.setAttribute("mensajeExito", "El usuario no se actualizo correctamente!");
                }
                request.getRequestDispatcher("actualizarUsuario.jsp").forward(request, response);
                break;

            case 3:

                if (loteDAO.eliminarRegistro()) {

                    request.setAttribute("mensajeExito", "El usuario se elimino correctamente!");

                } else {

                    request.setAttribute("mensajeExito", "El usuario no se elimino correctamente!");
                }
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;

            /*case 4:
                if (loteDAO.iniciarSesion(Documento, Contrasena)) {

                    request.getRequestDispatcher("menu.jsp").forward(request, response);

                } else {

                    request.setAttribute("mensajeError", "Corregir datos!");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                break;*/
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
        
        /*Manipular acceso a las vistas}
          if(action.equalsIgnoreCase("consultar")){
            acceso=consultar;
        }else if(action.equalsIgnoreCase("registrar")){
            ArrayList<Usuario> listaUsuarios = mtDAO.listarUsuarios();
            request.setAttribute("listaU",listaUsuarios);
            acceso=registrar;
        }else if(action.equalsIgnoreCase("Agregar")){
            String id,idU;
            String idU;
            String Nom;
            id = request.getParameter("idmt");
            Nom = request.getParameter("nombremt");
            idU = request.getParameter("idx");
            mp.setId(Integer.parseInt(id));
            idU = request.getParameter("usuarioId");
            mp.setIdUs(Integer.parseInt(idU));
            mp.setNombre(Nom);
            mtDAO.registrar(mp);
            acceso=consultar;
        }else if(action.equalsIgnoreCase("index")){
            acceso=index;
        }

        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);*/
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
