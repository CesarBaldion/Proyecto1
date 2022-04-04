package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
<<<<<<< Updated upstream
=======
import ModeloVO.UsuarioVO;
>>>>>>> Stashed changes

public final class registrarProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

<<<<<<< Updated upstream
=======
  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/sesiones.jsp");
  }

>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
=======
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");

    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-control", "no-cache, no-store, must-revalidate");
    response.setDateHeader("Expires", 0);
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


    HttpSession buscarSesion = (HttpSession) request.getSession();
    String nombre = "";
    if (buscarSesion.getAttribute("datosUsuario") == null) {

        request.getRequestDispatcher("iniciarSesion.jsp").forward(request, response);

    } else {
        UsuarioVO usuVO = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
        
        nombre = usuVO.getNombre();

    }



      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>\r\n");
      out.write("                <h1> Bienvenido: ");
      out.print(nombre);
      out.write("</h1>\r\n");
      out.write("                <form method=\"post\" action=\"Sesiones\">\r\n");
      out.write("                    <input type=\"submit\" value=\"Cerrar Sesion\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </div> <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <div></div><br><br>\r\n");
      out.write("            <div></div> <br><br>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
>>>>>>> Stashed changes
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Registrar Producto</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
<<<<<<< Updated upstream
=======
      out.write("        <header>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"registrarProducto.jsp\">Registar Producto</a></li>\r\n");
      out.write("                <li><a href=\"consultarProducto.jsp\">Consultar Producto</a></li>\r\n");
      out.write("                <li><a href=\"menu.jsp\">Menu</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </header>\r\n");
>>>>>>> Stashed changes
      out.write("        <form class=\"Formulario\" method = \"post\" action = \"Producto\" > \r\n");
      out.write("            <h1>Registrar Producto</h1>\r\n");
      out.write("            <input type=\"text\" name=\"txtNombre\" placeholder=\"Nombre\" required=\"\" >\r\n");
      out.write("            <br>\r\n");
<<<<<<< Updated upstream
      out.write("            <select name=\"txtEstado\">\r\n");
      out.write("                <option>Selecione...</option>\r\n");
      out.write("                <option value=\"1\">Activo</option>\r\n");
      out.write("                <option value=\"2\">Inactivo</option>\r\n");
=======
      out.write("            <select name=\"txtEstado\" required=\"\">\r\n");
      out.write("                <option>Seleccionar...</option>\r\n");
      out.write("                <option value=\"1\">Activo</option>\r\n");
      out.write("                <option value=\"0\">Inactivo</option>\r\n");
>>>>>>> Stashed changes
      out.write("            </select>\r\n");
      out.write("            <br>\r\n");
      out.write("            <button id=\"Boton\"> Registrar </button>\r\n");
      out.write("            <input type=\"hidden\" value=\"1\" name=\"opcion\">\r\n");
<<<<<<< Updated upstream
      out.write("            <a href=\"index.jsp\">Iniciar Sesion</a><br>\r\n");
=======
>>>>>>> Stashed changes
      out.write("            \r\n");
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
