package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloVO.LoteProduccionVO;
import ModeloDAO.LoteProduccionDAO;
import ModeloVO.LoteProduccionVO;

public final class consultarLoteProduccion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("         <h1>Lote Produccion</h1>\r\n");
      out.write("\r\n");
      out.write("        <form method=\"post\" action=\"LoteProduccion\">\r\n");
      out.write("\r\n");
      out.write("            Id\r\n");
      out.write("            <input type=\"text\" name=\"txtid_loteProduccion\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"hidden\" value=\"4\" name=\"opcion\">\r\n");
      out.write("            <button>Consultar</button>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("        <div class=\"mensaje\">\r\n");
      out.write("            ");

                if (request.getAttribute("mensajeError") != null) {
      out.write("\r\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("\r\n");
      out.write("        <form>\r\n");
      out.write("\r\n");
      out.write("            <table border=\"1\">\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>Id</th>\r\n");
      out.write("                    <th>Id Usuarios</th>\r\n");
      out.write("                    <th>Id orden Detalles</th>\r\n");
      out.write("                    <th>Cantidad</th>\r\n");
      out.write("                    <th>Fecha Fabricacion</th>\r\n");
      out.write("                   \r\n");
      out.write("                    \r\n");
      out.write("                </tr>\r\n");
      out.write("                ");

                    LoteProduccionVO ltProducVO = new LoteProduccionVO();
                    LoteProduccionDAO ltProducDAO = new LoteProduccionDAO(ltProducVO);

                    ArrayList<LoteProduccionVO> listaLoteProduccion = ltProducDAO.Listar();

                    for (int i = 0; i < listaLoteProduccion.size(); i++) {
                        
                        ltProducVO = listaLoteProduccion.get(i);

                
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print(ltProducVO.getId_Lote_Produccion());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(ltProducVO.getId_Usuarios());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(ltProducVO.getId_orden_Detalles());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(ltProducVO.getCantidad());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(ltProducVO.getFecha_Fabricacion());
      out.write("</td>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write(" \r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
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
