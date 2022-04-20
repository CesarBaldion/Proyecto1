package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.DetallesProductoVO;
import ModeloDAO.DetallesProductoDAO;
import ModeloVO.OrdenesVO;
import ModeloDAO.OrdenesDAO;
import ModeloVO.OrdenDetallesVO;

public final class actualizarOrdenDetalles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("       ");

            OrdenDetallesVO ordenDetallVO = (OrdenDetallesVO) request.getAttribute("OrdenDetallesConsultada");
            if (ordenDetallVO != null) {
        
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <form action=\"OrdenDetalles\" method=\"post\">\r\n");
      out.write("             <h1>Actualizar Usuarios</h1>\r\n");
      out.write("            <input type=\"hidden\" name=\"txtIdOrdenDetalles\" value=\"");
      out.print(ordenDetallVO.getId_Orden_Detalles());
      out.write("\">\r\n");
      out.write("             Id Orden<br>\r\n");
      out.write("             <input type=\"text\" name=\"txtIdOrden\" value=\"");
      out.print(ordenDetallVO.getId_Orden());
      out.write("\">\r\n");
      out.write("                <br>\r\n");
      out.write("                Id Detalles de Producto<br>\r\n");
      out.write("                <input type=\"text\" name=\"idDetallesProducto\" value=\"");
      out.print(ordenDetallVO.getId_Detalles_Producto());
      out.write("\">\r\n");
      out.write("                <br>\r\n");
      out.write("                Cantidad Solicitada<br>\r\n");
      out.write("                <input type=\"number\" name=\"txtcantidadSolicitada\" value=\"");
      out.print(ordenDetallVO.getCantidadSolicitada());
      out.write("\">\r\n");
      out.write("                <br><br>\r\n");
      out.write("                \r\n");
      out.write("            <button>Actualizar</button>\r\n");
      out.write("            <input type=\"hidden\" value=\"2\" name=\"opcion\">\r\n");
      out.write("            <a href=\"consultarOrdenDetalles.jsp\">Volver</a><br>\r\n");
      out.write("            \r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("            ");
 }else{
request.getRequestDispatcher("consultarOrdenDetalles.jsp").forward(request, response);

}
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
