/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.AdministrarArchivos;
import ModeloDAO.DetallesProductoDAO;
import ModeloVO.DetallesProductoVO;
import Util.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
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
@WebServlet(name = "DetallesProductoControlador", urlPatterns = {"/DetallesProducto"})
public class DetallesProductoControlador extends HttpServlet {

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
        
        String Id_Detalles_Producto = request.getParameter("txtIdDetallesProducto");
        String Id_Producto = request.getParameter("txtIdProducto");
        String Descripcion = request.getParameter("txtDescripcion");
        String Talla = request.getParameter("txtTalla");
        String Estado = request.getParameter("txtEstado");
        Part archivocsv = request.getPart("archivocsv");

        int opcion = Integer.parseInt(request.getParameter("opcion"));
        // 2. Quien tiene los datos de forma segura en el sistema? VO
        DetallesProductoVO detProVO = new DetallesProductoVO(Id_Detalles_Producto, Id_Producto, Descripcion, Talla, Estado);

        // 3. Quien hace las operaciones? DAO
        DetallesProductoDAO detProDAO = new DetallesProductoDAO(detProVO);

        switch (opcion) {

             case 1: //Agregar registro
                    if (detProDAO.agregarRegistro()) {

                        out1.println("<label class='text-success'><b>Se ha registrado Correctamente</b></label>");
                    } else {
                        out1.print("<label class='text-danger'><b>Error al Registrar</b></label>");;
                    }

                break;

            case 2:

                if (detProDAO.actualizarRegistro()) {
                    out1.println("<label class='text-success'><b>Se ha actualizado Correctamente</b></label>");
                } else {
                    out1.println("<label class='text-danger'><b>Error al Registrar</b></label>");;
                }
                break;
            case 3:

                if (detProDAO.eliminarRegistro()) {

                    request.setAttribute("mensajeExito", "Los detalles de la orden se eliminaron correctamente!");
                    request.getRequestDispatcher("consultarDetallesProducto.jsp").forward(request, response);

                } else {

                    request.setAttribute("mensajeError", "Los detalles de la orden no se eliminaron correctamente!");
                }
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;

            case 4: //Consultar por DetallesProducto

                detProVO = detProDAO.consultarDetallesProducto(Descripcion);
                if (detProVO != null) {

                    request.setAttribute("OrdenConsultada", detProVO);
                    request.getRequestDispatcher("actualizarDetallesProducto.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeExito", "Los detalles del producto no existen");
                    request.getRequestDispatcher("consultarDetallesProducto.jsp").forward(request, response);
                }
                break;

            case 5:

                if (detProDAO.activarRegistro()) {

                    request.setAttribute("mensajeExito", "La orden detalles se activo correctamente!");
                    request.getRequestDispatcher("eliminarDetallesProducto.jsp").forward(request, response);

                } else {

                    request.setAttribute("mensajeError", "La orden detalles no se activo correctamente!");
                    request.getRequestDispatcher("eliminarDetallesProducto.jsp").forward(request, response);

                }
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;

            case 6:

                if (detProDAO.eliminarRegistroTotal()) {

                    request.setAttribute("mensajeExito", "Los detalles de la orden se eliminaron correctamente!");
                    request.getRequestDispatcher("eliminarDetallesProducto.jsp").forward(request, response);

                } else {

                    request.setAttribute("mensajeError", "Los detalles de la orden no se eliminaron correctamente!");
                    request.getRequestDispatcher("eliminarDetallesProducto.jsp").forward(request, response);

                }
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;
                
               case 10:
                //generarReporte
                response.setHeader("Content-Disposition", "attachment; filename=\"reporteDetallesProductos.pdf\";");
                response.setHeader("Cache-Control", "no-cache");
                response.setHeader("Pragma", "no-cache");
                response.setDateHeader("Expires", 0);
                response.setContentType("application/pdf");

                ServletOutputStream out = response.getOutputStream();
                try {
                    Conexion conexion = new Conexion();
                    JasperReport reporte = (JasperReport) JRLoader.loadObject(getServletContext().getRealPath("reportes/reportesDetallesProducto/reporteDetallesProducto.jasper"));
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
                AdministrarArchivos adminFiles = new AdministrarArchivos();
                String rutaAbsoluta = adminFiles.guardarArchivo(archivocsv, adminFiles.validarRuta());
                try {
                    detProDAO.cargarDetallesProductos(rutaAbsoluta);
                    request.getRequestDispatcher("detallesProducto.jsp").forward(request, response);
                } catch (SQLException e) {
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
