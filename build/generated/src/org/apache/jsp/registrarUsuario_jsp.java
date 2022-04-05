package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"styles/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/registrarUsuario.css\" />\r\n");
      out.write("        <title>Registrar Usuario</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form class=\"Formulario\" method = \"post\" action = \"Usuarios\" > \r\n");
      out.write("                <h2>Registrese para empezar</h2>\r\n");
      out.write("                <h3>Ingrese sus datos</h3>  \r\n");
      out.write("                <input type=\"text\" name= \"txtNombre\" placeholder=\"Nombres\">\r\n");
      out.write("                <input type=\"text\" name= \"txtDocumento\" placeholder=\"Documento\">\r\n");
      out.write("                <input type=\"text\" name= \"txtTelefono\" placeholder=\"Telefono\">\r\n");
      out.write("                <input type=\"text\" name= \"txtEmail\" placeholder=\"Email\">\r\n");
      out.write("                <input type=\"text\" name= \"txtDireccion\" placeholder=\"Direccion\">\r\n");
      out.write("                <input type=\"password\" name= \"txtContrasena\" placeholder=\"Contrasena\"><br>\r\n");
      out.write("                <select name=\"txtEstado\">\r\n");
      out.write("                    <option>Estado</option>\r\n");
      out.write("                    <option value=\"1\">\r\n");
      out.write("                        Activo\r\n");
      out.write("                    </option>\r\n");
      out.write("                    <option value=\"0\">\r\n");
      out.write("                        Inactivo\r\n");
      out.write("                    </option>\r\n");
      out.write("                </select><br>\r\n");
      out.write("                <button> Registrar </button>\r\n");
      out.write("                <input type=\"hidden\" value=\"1\" name=\"opcion\">\r\n");
      out.write("                <a href=\"iniciarSesion.jsp\">¿Ya tiene una cuenta?</a><br>\r\n");
      out.write("            <div class=\"mensaje\">\r\n");
      out.write("                ");

                    if (request.getAttribute("mensajeError") != null) {
      out.write("\r\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
   } else {
      out.write("\r\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
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
