/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.AdministrarArchivos;
import ModeloDAO.ProductoDAO;
import ModeloVO.ProductoVO;
import Util.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
 * @author Andrex
 */
@MultipartConfig
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
        ServletOutputStream out1 = response.getOutputStream();
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
                if (prodDAO.verificarProducto(Nombre) == false) {
                    if (prodDAO.agregarRegistro() == true) {
                        out1.println("<label class='text-success'><b>Se ha registrado Correctamente</b></label>");
                    } else {
                        out1.print("<label class='text-danger'><b>Error al Registrar</b></label>");;
                    }
                } else {
                    out1.print("<label class='text-danger'><b>El Producto Ya existe</b></label>");;
                }
                break;

            case 2:
                if (prodDAO.actualizarRegistro()) {
                    out1.println("<label class='text-success'><b>Se ha actualizado Correctamente</b></label>");
                } else {
                    out1.println("<label class='text-danger'><b>Error al Registrar</b></label>");;
                }
                break;
            case 3:
                if (prodDAO.eliminarRegistro()) {
                    out1.println("<label class='text-success'><b>Se ha Eliminado Correctamente</b></label>");
                } else {
                    out1.println("<label class='text-success'><b>Error al Eliminar</b></label>");
                }
                break;

            default:
                break;

            case 4: {
                prodVO = prodDAO.consultarProducto(Id_Producto);
            }
            if (prodVO != null) {
                request.setAttribute("productoConsultado", prodVO);
                request.getRequestDispatcher("productoss.jsp").forward(request, response);
            } else {
                request.setAttribute("Error", "El producto no existe");
                request.getRequestDispatcher("productoss.jsp").forward(request, response);
            }
            break;

            case 5:

                if (prodDAO.ActivarRegistro()) {

                    request.setAttribute("Bien", "El producto se activo correctamente!");
                    request.getRequestDispatcher("eliminarProducto.jsp").forward(request, response);

                } else {

                    request.setAttribute("Error", "El producto no se elimino correctamente!");
                }
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;

            case 6:

                if (prodDAO.EliminarRegistroTotal()) {

                    request.setAttribute("Bien", "El producto se elimino correctamente!");
                    request.getRequestDispatcher("eliminarProducto.jsp").forward(request, response);

                } else {

                    request.setAttribute("Error", "El producto no se elimino correctamente!");
                    request.getRequestDispatcher("eliminarProducto.jsp").forward(request, response);
                }
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;

            case 10:
                //generarReporte
                response.setHeader("Content-Disposition", "attachment; filename=\"reporteProductos.pdf\";");
                response.setHeader("Cache-Control", "no-cache");
                response.setHeader("Pragma", "no-cache");
                response.setDateHeader("Expires", 0);
                response.setContentType("application/pdf");

                ServletOutputStream out = response.getOutputStream();
                try {
                    Conexion conexion = new Conexion();
                    JasperReport reporte = (JasperReport) JRLoader.loadObject(getServletContext().getRealPath("reportes/reportesProducto/reporteProducto.jasper"));
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
                //CargaMasiva
                Part archivocsv = request.getPart("archivocsv");
                AdministrarArchivos adminFiles = new AdministrarArchivos();
                String rutaAbsoluta = adminFiles.guardarArchivo(archivocsv, adminFiles.validarRuta());
                try {
                    boolean validacionAccion = prodDAO.cargarProductos(rutaAbsoluta);
                    if(validacionAccion==true){
                        out1.println("<b class='text-success'>La carga masiva se realizo exitosamente</b>");
                    }else{
                        out1.println("<b class='text-danger'>Error en la carga masiva</b>");
                    }
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
