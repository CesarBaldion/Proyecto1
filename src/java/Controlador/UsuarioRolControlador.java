/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.UsuarioRolDAO;
import ModeloVO.Usuario_rolVO;
import Util.Conexion;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
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
 * @author 1Usuario
 */
@WebServlet(name = "UsuarioRolControlador", urlPatterns = {"/UsuarioRol"})
public class UsuarioRolControlador extends HttpServlet {

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

        ServletOutputStream out1 = response.getOutputStream();

        response.setContentType("text/html;charset=UTF-8");
        String id_Rol = request.getParameter("txtIdRol");
        String id_Usuarios = request.getParameter("txtIdUsu");
        String estado = request.getParameter("txtEstado");;

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //2. Quien tiene los datos de forma segura en el sistema? VO
        Usuario_rolVO uRVO = new Usuario_rolVO(id_Rol, id_Usuarios, estado);

        // 3. Quien hace las operaciones? DAO
        UsuarioRolDAO uRDAO = new UsuarioRolDAO(uRVO);

        // 4. Administrar las operaciones del modulo
        switch (opcion) {

            case 1: //Agregar registro
                if (uRDAO.verificarUsuarioRol()) {
                    if (uRDAO.agregarRegistro()) {
                        out1.println("<label class='text-success'><b>El Usuario Rol se ha registrado Correctamente</b><label>");
                    } else {
                        out1.println("<label class='text-danger'><b>El Usuario Rol se ha registrado Correctamente</b><label>");
                    }
                } else {
                    out1.println("<label class='text-danger'><b>Este Usuario ya contiene un Rol</b><label>");
                }

                break;

            case 2:

                if (uRDAO.actualizarRegistro()) {

                    out1.println("<label class='text-success'><b>El Usuario Rol se ha Actualizado Correctamente</b><label>");
                } else {
                    out1.println("<label class='text-danger'><b>Error al Actualizar El Usuario Rol</b><label>");

                }
                break;

            case 3:

                if (uRDAO.eliminarRegistro()) {

                    out1.println("<label class='text-success'><b>El Usuario Rol se ha Eliminado Correctamente</b><label>");

                } else {

                    out1.println("<label class='text-danger'><b>Error al Eliminar El Usuario Rol</b><label>");
                }
                break;

            default:
                break;

            case 4: {
                uRVO = uRDAO.consultarRol(id_Rol);
            }
            if (uRVO != null) {
                request.setAttribute("UsuarioRolConsultado", uRVO);
                request.getRequestDispatcher("actualizarUsuarioRol.jsp").forward(request, response);
            } else {
                request.setAttribute("mensajError", "El rol no existe");
                request.getRequestDispatcher("consultarUsuarioRol.jsp").forward(request, response);
            }
            break;
            case 10:
                //generarReporte
                response.setHeader("Content-Disposition", "attachment; filename=\"reporteUsuariosRol.pdf\";");
                response.setHeader("Cache-Control", "no-cache");
                response.setHeader("Pragma", "no-cache");
                response.setDateHeader("Expires", 0);
                response.setContentType("application/pdf");

                ServletOutputStream out = response.getOutputStream();
                try {
                    Conexion conexion = new Conexion();
                    String rol = uRVO.getId_Rol();
                    if (rol.equals("1") | rol.equals("2") | rol.equals("3")) {
                        JasperReport reporte = (JasperReport) JRLoader.loadObject(getServletContext().getRealPath("reportes/reportesUsuarioRol/reporteUsuarioRol.jasper"));
                        Map parametros = new HashMap();
                        parametros.put("roltipo", rol);
                        JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametros, conexion.obtenerConexion());
                        JRExporter exporter = new JRPdfExporter();
                        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
                        exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, out);
                        exporter.exportReport();
                    } else {
                        JasperReport reporte = (JasperReport) JRLoader.loadObject(getServletContext().getRealPath("reportes/reportesUsuarioRol/reporteUsuarioRol2.jasper"));
                        JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, conexion.obtenerConexion());
                        JRExporter exporter = new JRPdfExporter();
                        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
                        exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, out);
                        exporter.exportReport();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
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
