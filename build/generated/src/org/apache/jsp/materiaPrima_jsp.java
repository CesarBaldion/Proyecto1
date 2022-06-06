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

    MateriaPrimaVO matPriVO = new MateriaPrimaVO();
    MateriaPrimaDAO matPriDAO = new MateriaPrimaDAO();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"d-flex\">\r\n");
      out.write("            <div id=\"editMateria\" class=\"card col-sm-6\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                     \r\n");
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
      out.write("                        \r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>Nombre Materia</label>\r\n");
      out.write("                            <input type=\"text\" value=\"");
      out.print(matPriVO.getNombre());
      out.write("\" name=\"txtNombre\" class=\"form-control\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <button class=\"btn btn-info\"> Registrar </button>\r\n");
      out.write("                        <input type=\"hidden\" value=\"1\" name=\"opcion\">\r\n");
      out.write("                        \r\n");
      out.write("                        <div>\r\n");
      out.write("                            <button class=\"btn btn-success\"> Actualizar </button>\r\n");
      out.write("                            <input type=\"hidden\" value=\"2\" name=\"opcion\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </form>\r\n");
      out.write("                        \r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-8\">\r\n");
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
