package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.MateriaPrimaDAO;
import ModeloVO.MateriaPrimaVO;

public final class materiaPrima_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/css-paginacion.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"Imagen/icono.ico\" />\r\n");
      out.write("        \r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/normalize.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/sweetalert2.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/material.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/material-design-iconic-font.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/main.css\">\r\n");
      out.write("         <link href=\"css/bootstrapp.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"js/jqueryy.js\" type=\"text/javascript\"></script>    \r\n");
      out.write("        \r\n");
      out.write("        <script src=\"js/BuscadorTabla.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"js/bootstrapp.min.js\" type=\"text/javascript\"></script> \r\n");
      out.write("\t<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("\t<script>window.jQuery || document.write('<script src=\"js/jquery-1.11.2.min.js\"><\\/script>')</script>\r\n");
      out.write("\t<script src=\"js/material.min.js\" ></script>\r\n");
      out.write("\t<script src=\"js/sweetalert2.min.js\" ></script>\r\n");
      out.write("\t<script src=\"js/jquery.mCustomScrollbar.concat.min.js\" ></script>\r\n");
      out.write("\t<script src=\"js/main.js\" ></script>\r\n");
      out.write("        \r\n");
      out.write("        <script  type=\"text/javascript\" src=\"js/jquery-1.12.4.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/paginacion.js\"></script>\r\n");
      out.write("       \r\n");
      out.write("     \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("  <!--codigo de paginacion-->\r\n");
      out.write("  <style>\r\n");
      out.write("  \r\n");
      out.write("ulll {\r\n");
      out.write("  list-style: none;\r\n");
      out.write("  margin-top: 10px;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("liii {\r\n");
      out.write("  border-radius: 3px;\r\n");
      out.write("  color: black;\r\n");
      out.write("  background: #eee;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  display: inline;\r\n");
      out.write("  font-weight: 200;\r\n");
      out.write("  margin: 10px 5px 0px 2px;\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  width: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".activeee {\r\n");
      out.write("  background: teal;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\"#datos\").pagination();\r\n");
      out.write("\t});\r\n");
      out.write("        </script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("  var _gaq = _gaq || [];\r\n");
      out.write("  _gaq.push(['_setAccount', 'UA-36251023-1']);\r\n");
      out.write("  _gaq.push(['_setDomainName', 'jqueryscript.net']);\r\n");
      out.write("  _gaq.push(['_trackPageview']);\r\n");
      out.write("\r\n");
      out.write("  (function() {\r\n");
      out.write("    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\r\n");
      out.write("    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\r\n");
      out.write("    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\r\n");
      out.write("  })();\r\n");
      out.write("\r\n");
      out.write("</script>   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");

    MateriaPrimaVO matPriVO = new MateriaPrimaVO();
    MateriaPrimaDAO matPriDAO = new MateriaPrimaDAO();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"d-flex\">\r\n");
      out.write("            <div id=\"editMateria\" class=\"card col-sm-4\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("                    <form method =\"post\" action=\"MateriaPrima\" class=\"form-group\" enctype=\"multipart/form-data\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"mx-auto justify-content-center\">\r\n");
      out.write("                            ");
if (request.getAttribute("error") != null) {
      out.write("\r\n");
      out.write("                            <div class=\"container-fluid d-inline-block d-flex mx-auto\">\r\n");
      out.write("                                <p class=\"text-danger text-center fs-5 mt-5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
   } else {
      out.write("\r\n");
      out.write("                            <p class=\"text-success text-center fs-5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>Nombre Materia</label>\r\n");
      out.write("                            <input type=\"text\" value=\"");
      out.print(matPriVO.getNombre());
      out.write("\" name=\"txtNombre\" class=\"form-control\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <button class=\"btn btn-info\"> Registrar </button>\r\n");
      out.write("                        <input type=\"hidden\" value=\"1\" name=\"opcion\">\r\n");
      out.write("\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <button class=\"btn btn-success\"> Actualizar </button>\r\n");
      out.write("                            <input type=\"hidden\" value=\"2\" name=\"opcion\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-8\">\r\n");
      out.write("                <div class=\" mx-auto mt-4 d-flex\">\r\n");
      out.write("                    <div class=\"col-md-5 ms-5 mt-3\">\r\n");
      out.write("\r\n");
      out.write("                        <label>Carga Masiva <b>Archivo Excel(xlsx)</b></label>\r\n");
      out.write("                        <form action=\"MateriaPrima\" method=\"post\" enctype=\"multipart/form-data\" class=\"form-group\">\r\n");
      out.write("                            <input type=\"file\" name=\"archivocsv\" class=\"form-control\">\r\n");
      out.write("                            <button class=\"btn boton mt-3 col-sm-6\">Cargar\r\n");
      out.write("                                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-upload\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                <path d=\"M.5 9.9a.5.5 0 0 1 .5.5v2.5a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1v-2.5a.5.5 0 0 1 1 0v2.5a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2v-2.5a.5.5 0 0 1 .5-.5z\"/>\r\n");
      out.write("                                <path d=\"M7.646 1.146a.5.5 0 0 1 .708 0l3 3a.5.5 0 0 1-.708.708L8.5 2.707V11.5a.5.5 0 0 1-1 0V2.707L5.354 4.854a.5.5 0 1 1-.708-.708l3-3z\"/>\r\n");
      out.write("                                </svg></button>\r\n");
      out.write("                            <input type=\"hidden\" value=\"11\" name=\"opcion\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"\">\r\n");
      out.write("                        <form action=\"MateriaPrima\" method=\"post\" class=\"form-group\" enctype=\"multipart/form-data\">\r\n");
      out.write("                            <button  class=\"boton btn mt-5 ms-5\" title=\"Reporte de Producto\">\r\n");
      out.write("                                Generar Reporte\r\n");
      out.write("                                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-download\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                <path d=\"M.5 9.9a.5.5 0 0 1 .5.5v2.5a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1v-2.5a.5.5 0 0 1 1 0v2.5a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2v-2.5a.5.5 0 0 1 .5-.5z\"/>\r\n");
      out.write("                                <path d=\"M7.646 11.854a.5.5 0 0 0 .708 0l3-3a.5.5 0 0 0-.708-.708L8.5 10.293V1.5a.5.5 0 0 0-1 0v8.793L5.354 8.146a.5.5 0 1 0-.708.708l3 3z\"/>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <input type=\"hidden\" value=\"10\" name=\"opcion\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3 mt-3 ms-5\">\r\n");
      out.write("                        <label class=\"mdl-button mdl-js-button mdl-button--icon\" for=\"buscar\">\r\n");
      out.write("                            <i class=\"zmdi zmdi-search\">Buscar</i>\r\n");
      out.write("                        </label>\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"text\" onkeyup=\"doSearch()\" class=\"form-control\"  id=\"buscar\">\r\n");
      out.write("                        <label class=\"mdl-textfield__label\"></label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <table class=\"table\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Id</th>\r\n");
      out.write("                            <th>Nombre Materia</th>\r\n");
      out.write("                            <th>Acciones</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        ");

                            ArrayList<MateriaPrimaVO> listaMateriaPrima = matPriDAO.ListarDos();
                            for (int i = 0; i < listaMateriaPrima.size(); i++) {

                                matPriVO = listaMateriaPrima.get(i);

                        
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <<td>");
      out.print(matPriVO.getId_materia_Prima());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(matPriVO.getNombre());
      out.write("</td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <form method =\"post\" action=\"MateriaPrima\" class=\"form-group\" enctype=\"multipart/form-data\">\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <input type=\"hidden\" name=\"txtIdMateriaPrima\" value=\"");
      out.print(matPriVO.getId_materia_Prima());
      out.write("\">\r\n");
      out.write("                                        <input type=\"hidden\"  value=\"4\" name=\"opcion\">\r\n");
      out.write("                                        <button class=\"btn btn-warning\">Editar</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                                <form method =\"post\" action=\"MateriaPrima\" class=\"form-group\" enctype=\"multipart/form-data\">\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <input type=\"hidden\" name=\"txtIdMateriaPrima\" value=\"");
      out.print(matPriVO.getId_materia_Prima());
      out.write("\">\r\n");
      out.write("                                        <button class=\"btn btn-danger\">Eliminar</button>\r\n");
      out.write("                                        <input type=\"hidden\" value=\"3\" name=\"opcion\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                    ");
 }
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
