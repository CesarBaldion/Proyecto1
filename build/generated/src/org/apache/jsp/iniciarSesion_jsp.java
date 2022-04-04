package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class iniciarSesion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"styles/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/IniciarSesion.css\" />\r\n");
      out.write("        <title>Login y registro</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"forms-container\">\r\n");
      out.write("                <div class=\"signin-signup\">\r\n");
      out.write("                    <form action = \"Usuarios\" class=\"sign-in-form\">\r\n");
      out.write("                        <img src=\"img/LogoFinal.svg\" class=\"image\" alt=\"\" height=\"115\" />\r\n");
      out.write("                        <h2 class=\"title\">Iniciar Sesión</h2>\r\n");
      out.write("                        <div class=\"input-field\">\r\n");
      out.write("                            <i class=\"fas fa-user\"></i>\r\n");
      out.write("                            <input type=\"text\" name=\"txtDocumento\" placeholder=\"Usuario\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-field\">\r\n");
      out.write("                            <i class=\"fas fa-lock\"></i>\r\n");
      out.write("                            <input type=\"password\" name=\"txtContrasena\" placeholder=\"Contraseña\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button class=\"btn solid\"> Ingresar </button>\r\n");
      out.write("                        <input type=\"hidden\" value=\"4\" name=\"opcion\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"mensaje\">\r\n");
      out.write("                            ");

                                if (request.getAttribute("mensajeError") != null) {
      out.write("\r\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("                              \r\n");
      out.write("\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"panels-container\">\r\n");
      out.write("                <div class=\"panel left-panel\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <h3>¿Nuevo usuario?</h3>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            Si es nuevo usuario y no tiene cuente puede crear una a continuación:\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <button onclick=\"location.href = 'registrarUsuario.jsp'\"  class=\"btn transparent\" id=\"sign-up-btn\">\r\n");
      out.write("                            Registrarse\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <img src=\"img/Login.svg\" class=\"image\" alt=\"\" />\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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
