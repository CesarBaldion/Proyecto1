package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;

public final class registrarOrdenDetalles_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/sesiones.jsp");
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

      out.write('\n');
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
      out.write("\r\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <center>\n");
      out.write("            <form method =\"post\" action=\"OrdenDetalles\"> \n");
      out.write("                <h1>Registrar Orden_Detalles</h1>\n");
      out.write("                Id Orden<br>\n");
      out.write("                <input type=\"text\" name=\"txtIdOrden\">\n");
      out.write("                <br>\n");
      out.write("                Id Detalles de Producto<br>\n");
      out.write("                <input type=\"text\" name=\"idDetallesProducto\">\n");
      out.write("                <br>\n");
      out.write("                Cantidad Solicitada<br>\n");
      out.write("                <input type=\"number\" name=\"txtcantidadSolicitada\">\n");
      out.write("                <br><br>\n");
      out.write("                <button id=\"Boton\"> Registrar </button>\n");
      out.write("                <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("\n");
      out.write("                <div class=\"mensaje\" style=\"color: red;\">\n");
      out.write("                    ");

                    if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("                    ");
   } else {
      out.write("\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("                </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
