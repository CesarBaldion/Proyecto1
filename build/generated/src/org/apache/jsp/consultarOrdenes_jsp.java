package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;
import java.util.ArrayList;
import ModeloDAO.OrdenesDao;
import ModeloVO.OrdenesVo;

public final class consultarOrdenes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Consultar Ordenes</title>\r\n");
      out.write("    </head>\r\n");
      out.write("      <body>\r\n");
      out.write("    <center>\r\n");
      out.write("        <h1>Ordenes</h1>\r\n");
      out.write("        <form  method=\"post\" action=\"Ordenes\"> \r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>\r\n");
      out.write("                        Orden\r\n");
      out.write("                        <input type=\"text\" name=\"txtIdOrden\" ><br>\r\n");
      out.write("                        <input type=\"hidden\" value=\"4\" name=\"opcion\">\r\n");
      out.write("                        <button>Consultar</button>\r\n");
      out.write("                    </th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table><br><br>\r\n");
      out.write("        </form>\r\n");
      out.write("        <div style=\"color: red;\">\r\n");
      out.write("            ");

                if (request.getAttribute("mensajeError") != null) {
      out.write("\r\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
   } else {
      out.write("\r\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </div><br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <form>\r\n");
      out.write("\r\n");
      out.write("            <table border=\"1\">\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>Orden</th>\r\n");
      out.write("                    <th>Usuario</th>\r\n");
      out.write("                    <th>Fecha Registro</th>\r\n");
      out.write("                    <th>Fecha Entrega</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                ");

                OrdenesVo ordVo = new OrdenesVo();
                OrdenesDao ordDao = new OrdenesDao();
                ArrayList<OrdenesVo> listaOrdenes = ordDao.listar();
                for (int i = 0; i < listaOrdenes.size(); i++){
                
                    ordVo = listaOrdenes.get(i);
                
                
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print(ordVo.getId_Orden());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(ordVo.getId_Usuarios());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(ordVo.getFecha_registro());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(ordVo.getFecha_entrega());
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                ");
 }
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            </table>\r\n");
      out.write("            \r\n");
      out.write("        </form>\r\n");
      out.write("            \r\n");
      out.write("    </center>\r\n");
      out.write("</body>\r\n");
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
