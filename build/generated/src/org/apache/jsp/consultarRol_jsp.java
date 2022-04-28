package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.RolDAO;
import ModeloVO.RolVO;

public final class consultarRol_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"col-md-4 justify-content-center mx-auto mt-4\">\n");
      out.write("            <h1 class=\"text-center\">Rol</h1>\n");
      out.write("            <div class=\"col-md-6 mx-auto \">\n");
      out.write("                <form method=\"post\" action=\"Rol\" class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"txtId\" placeholder=\"Id Rol\" class=\"form-control\">\n");
      out.write("                    <input type=\"hidden\" value=\"4\" name=\"opcion\">\n");
      out.write("                    <button class=\"btn\">Consultar</button>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("                <div class=\"mensaje\">\n");
      out.write("                    ");

                        if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"col-md-9 mx-auto justify-content-center mt-4\">\n");
      out.write("            <div class=\"col-md-7 mx-auto justify-content-center\">\n");
      out.write("                <table class=\"table table-light table-hover table-striped text-center\">\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Id</th>\n");
      out.write("                        <th>Tipo de rol</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        RolVO RVO = new RolVO();
                        RolDAO RDAO = new RolDAO(RVO);

                        ArrayList<RolVO> listaRol = RDAO.listar();

                        for (int i = 0; i < listaRol.size(); i++) {

                            RVO = listaRol.get(i);

                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(RVO.getId_rol());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(RVO.getRoltipo());
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
