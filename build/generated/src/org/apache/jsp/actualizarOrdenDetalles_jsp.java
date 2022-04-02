package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.DetallesProductoDAO;
import ModeloVO.OrdenesVo;
import ModeloDAO.OrdenesDao;
import ModeloVO.DetallesProductoVO;
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

      out.write("\n");
      out.write("\n");
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
      out.write("         ");

            OrdenDetallesVO ordenDetallVO = (OrdenDetallesVO) request.getAttribute("OrdenDetallesConsultada");
            if (ordenDetallVO != null) {
        
      out.write("\n");
      out.write("\n");
      out.write("        ");

            DetallesProductoVO dpVO = (DetallesProductoVO) request.getAttribute("DetallesProductoConsultada");
            if (dpVO != null) {
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form action=\"OrdenDetalles\" method=\"post\">\n");
      out.write("            <h1>Actualizar Usuarios</h1>\n");
      out.write("            <input type=\"hidden\" name=\"txtIdOrdenDetalles\" value=\"");
      out.print(ordenDetallVO.getId_Orden_Detalles());
      out.write("\">\n");
      out.write("             Id Orden<br>\n");
      out.write("             <select name=\"txtIdOrden\">\n");
      out.write("                <option value=\"");
      out.print(ordenDetallVO.getId_Orden());
      out.write('"');
      out.write('>');
      out.print(ordenDetallVO.getId_Orden());
      out.write("</option>\n");
      out.write("                ");

                 OrdenesDao orDao = new OrdenesDao(); 
                 for (OrdenesVo orVO:orDao.listar()){
                    
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(orVO.getId_Orden());
      out.write('"');
      out.write('>');
      out.print(orVO.getId_Orden());
      out.write("</option>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("            </select>\n");
      out.write("                <br>\n");
      out.write("                Id Detalles de Producto<br>\n");
      out.write("                <select name=\"txtidDetallesProducto\">\n");
      out.write("                    <option value=\"");
      out.print(dpVO.getId_Detalles_Producto());
      out.write('"');
      out.write('>');
      out.print(dpVO.getId_Detalles_Producto());
      out.write("</option>\n");
      out.write("                ");

                 DetallesProductoDAO dpDAO = new DetallesProductoDAO(); 
                 for (DetallesProductoVO depVO:dpDAO.listar()){
                    
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(dpVO.getId_Detalles_Producto());
      out.write('"');
      out.write('>');
      out.print(dpVO.getId_Detalles_Producto());
      out.write("</option>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("            </select>\n");
      out.write("                <input type=\"text\" name=\"txtidDetallesProducto\" value=\"");
      out.print(ordenDetallVO.getId_Detalles_Producto());
      out.write("\">\n");
      out.write("                <br>\n");
      out.write("                Cantidad Solicitada<br>\n");
      out.write("                \n");
      out.write("                <br><br>\n");
      out.write("                \n");
      out.write("            <button>Actualizar</button>\n");
      out.write("            <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("            <a href=\"consultarOrdenDetalles.jsp\">Volver</a><br>\n");
      out.write("            <div class=\"\">\n");
      out.write("                ");

                if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("                ");
   } else {
      out.write("\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");
 } else {
                request.getRequestDispatcher("consultarOrdenDetalles.jsp").forward(request, response);

            }
      out.write("\n");
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
