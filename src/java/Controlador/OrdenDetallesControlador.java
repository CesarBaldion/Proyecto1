/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.DetallesProductoDAO;
import ModeloDAO.OrdenDetallesDAO;
import ModeloVO.DetallesProductoVO;
import ModeloVO.OrdenDetallesVO;
import Util.Conexion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author Sena
 */
@MultipartConfig
@WebServlet(name = "OrdenDetallesControlador", urlPatterns = {"/OrdenDetalles"})
public class OrdenDetallesControlador extends HttpServlet {

    int item;
    ArrayList<OrdenDetallesVO> listaOrdenDetalles = new ArrayList<>();

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
        String id_Ordenes = request.getParameter("txtIdOrdenes");
        String idUsuarios = request.getParameter("txtIdUsuario");
        String id_Detalles_Producto = request.getParameter("txtIdDetallesProducto");
        String cantidadSolicitada = request.getParameter("txtcantidadSolicitada");
        String fechaRegistro = request.getParameter("txtFechaRegistro");
        String fechaEntrega = request.getParameter("txtFechaEntrega");
        String Estado = request.getParameter("txtEstado");
        String nombreProducto = request.getParameter("infoProducto");
        String nombreUsuario = request.getParameter("nombreUsuario");
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        // 2. Quien tiene los datos de forma segura en el sistema? VO
        OrdenDetallesVO ordenDetallVO = new OrdenDetallesVO(id_Ordenes, idUsuarios, id_Detalles_Producto,
                cantidadSolicitada, fechaRegistro, fechaEntrega, Estado);
        

        // 3. Quien hace las operaciones? DAO
        OrdenDetallesDAO ordenDetalDAO = new OrdenDetallesDAO(ordenDetallVO);

        // 4. Administrar las operaciones del modulo
        switch (opcion) {

            case 1: //Agregar registro

                if (ordenDetalDAO.agregarRegistro()) {
                    out1.println("<label class='text-success'><b>La orden Detalles se registr?? correctamente</b></label>");
                } else {
                    out1.println("<label class='text-danger'><b>Error al registrar la orden</b></label>");
                }
                break;

            case 2:

                if (ordenDetalDAO.actualizarRegistro()) {
                    out1.println("<label class='text-success'><b>La orden Detalles se actualiz?? correctamente</b></label>");
                } else {
                    out1.println("<label class='text-danger'><b>Error al actulizar la orden</b></label>");
                }
                break;

            case 3:

                if (ordenDetalDAO.eliminarRegistro()) {
                    out1.println("<label class='text-success'><b>La orden se Elimino correctamente</b></label>");
                } else {
                    out1.println("<label class='text-danger'><b>Error al Eliminar la orden</b></label>");
                }

                break;

            case 4: //Consultar por Orden_Detalles

                ordenDetallVO = ordenDetalDAO.consultarIdOrden(id_Ordenes);
                //prodVO = prodDAO.listar(Id_Producto);
                if (ordenDetallVO != null) {

                    request.setAttribute("OrdenDetallesConsultada", ordenDetallVO);
                    request.getRequestDispatcher("actualizarOrdenDetalles.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeExito", "La orden Detalles no existe");
                    request.getRequestDispatcher("consultarOrdenDetalles.jsp").forward(request, response);
                }
                break;

            case 5: //agregar
                OrdenDetallesVO ordenDetallVOlista = new OrdenDetallesVO(id_Ordenes, idUsuarios, id_Detalles_Producto,
                cantidadSolicitada, fechaRegistro, fechaEntrega, Estado,nombreUsuario,nombreProducto);
                
                listaOrdenDetalles.add(ordenDetallVOlista);
                for (int i = 0; i < listaOrdenDetalles.size(); i++) {
                    OrdenDetallesVO ordetllVO2 = listaOrdenDetalles.get(i);
                    out1.println("<tr>");
                    out1.println("<td>" + i + "</td>");
                    out1.println("<td>" + ordenDetallVO.getId_Usuarios() + "</td>");
                    out1.println("<td >" + ordetllVO2.getId_Detalles_Producto() + "</td>");
                    out1.println("<td >" + ordetllVO2.getCantidadSolicitada() + "</td>");
                    out1.println("<td >" + ordetllVO2.getFecha_registro() + "</td>");
                    out1.println("<td >" + ordetllVO2.getFecha_entrega() + "</td>");
                    out1.println("<td><button  class='btn btn-danger submitEliminarLista' data-id9=" + i + " data-id10='11'>Eliminar</button></td>");
                    out1.println("</tr>");
                }
                break;
            /*case 7:

                if (ordenDetalDAO.ActivarRegistro()) {

                    request.setAttribute("mensajeExito", "La orden detalles se activo correctamente!");
                    request.getRequestDispatcher("eliminarOrdenDetalles.jsp").forward(request, response);

                } else {

                    request.setAttribute("mensajeError", "El lote de Produccion no se activo correctamente!");
                    request.getRequestDispatcher("eliminarOrdenDetalles.jsp").forward(request, response);

                }
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;

            case 8:

                if (ordenDetalDAO.eliminarRegistroTotal()) {

                    request.setAttribute("mensajeExito", "La orden detalles se elimino correctamente!");
                    request.getRequestDispatcher("eliminarOrdenDetalles.jsp").forward(request, response);

                } else {

                    request.setAttribute("mensajeError", "El lote de Produccion no se elimino correctamente!");
                    request.getRequestDispatcher("eliminarOrdenDetalles.jsp").forward(request, response);

                }
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;*/

            case 10:
                response.setHeader("Content-Disposition", "attachment; filename=\"reporteOrdenDetalle.pdf\";");
                response.setHeader("Cache-Control", "no-cache");
                response.setHeader("Pragma", "no-cache");
                response.setDateHeader("Expires", 0);
                response.setContentType("application/pdf");

                ServletOutputStream out = response.getOutputStream();
                try {
                    Conexion conexion = new Conexion();
                    JasperReport reporte = (JasperReport) JRLoader.loadObject(getServletContext().getRealPath("reportes/reportesOrdenDetalles/reporteOrdenDetalle.jasper"));
                    JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, conexion.obtenerConexion());

                    JRExporter exporter = new JRPdfExporter();
                    exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
                    exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, out);
                    exporter.exportReport();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case 11:
                int itemEliminar = Integer.parseInt(request.getParameter("itemEliminar"));

                listaOrdenDetalles.remove(itemEliminar);
                for (int i = 0; i < listaOrdenDetalles.size(); i++) {
                    OrdenDetallesVO ordetllVO2 = listaOrdenDetalles.get(i);
                    out1.println("<tr>");
                    out1.println("<td>" + i + "</td>");
                    out1.println("<td>" + ordenDetallVO.getNombreUsuario() + "</td>");
                    out1.println("<td>" + ordenDetallVO.getId_Detalles_Producto() + "</td>");
                    out1.println("<td >" + ordetllVO2.getCantidadSolicitada() + "</td>");
                    out1.println("<td >" + ordetllVO2.getFecha_registro() + "</td>");
                    out1.println("<td >" + ordetllVO2.getFecha_entrega() + "</td>");
                    out1.println("<td><button  class='btn btn-danger submitEliminarLista' data-id9=" + i + " data-id10='11'>Eliminar</button></td>");
                    out1.println("</tr>");
                }
                break;

            case 12://Cargar Lista
                if (ordenDetalDAO.cargarListaOrdenDetalles(listaOrdenDetalles)) {
                    out1.println("<b class='text-success'>La lista se ha cargado con exito</b>");
                    listaOrdenDetalles.clear();
                } else {
                    out1.println("<b class='text-danger'>Error al cargar la lista</b>");
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
