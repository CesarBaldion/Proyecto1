package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.ProductoDAO;
import ModeloVO.ProductoVO;

public final class consultarProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
<<<<<<< Updated upstream
=======
      out.write("\n");
>>>>>>> Stashed changes
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
<<<<<<< Updated upstream
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Consultar Producto</h1>\n");
      out.write("        <form mehtod=\"post\" action=\"producto\" >\n");
=======
      out.write("        <title>Cosultar Producto</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("        <h1>Productos</h1>\n");
      out.write("        <form  method=\"post\" action=\"Producto\"> \n");
>>>>>>> Stashed changes
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        Producto\n");
<<<<<<< Updated upstream
      out.write("                        <input type=\"text\" name=\"txtProducto\"> <br>\n");
      out.write("                        <input type=\"hidden\" value=\"3\" name=\"opcion\"><br>\n");
      out.write("                        <input type=\"submit\" value=\"Consultar\">\n");
      out.write("\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Nombre Producto</th>\n");
      out.write("                    <th>Estado</th>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");

                    ProductoVO prodVo = new ProductoVO();
                    ProductoDAO prodDao = new ProductoDAO();

                    ArrayList<ProductoVO> ListaVehiculo = prodDao.Listar();
                    for (int i = 0; i < ListaVehiculo.size(); i++) {
                        prodVo = ListaVehiculo.get(i);

                
      out.write(" \n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(prodVo.getNombre());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(prodVo.getEstado());
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
=======
      out.write("                        <input type=\"text\" name=\"txtId\" ><br>\n");
      out.write("                        <input type=\"hidden\" value=\"4\" name=\"opcion\">\n");
      out.write("                        <button>Consultar</button>\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("            </table><br><br>\n");
      out.write("        </form>\n");
      out.write("        <div style=\"color: red;\">\n");
      out.write("            ");

                if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("            ");
   } else {
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("\n");
      out.write("            <table border=\"1\">\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <th>Producto</th>\n");
      out.write("                    <th>Nombre Producto</th>\n");
      out.write("                    <th>Estado</th>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");

                ProductoVO prodVO = new ProductoVO();
                ProductoDAO prodDAO = new ProductoDAO();
                ArrayList<ProductoVO> listaProductos = prodDAO.listar();
                for (int i = 0; i < listaProductos.size(); i++){
                
                    prodVO = listaProductos.get(i);
                
                
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(prodVO.getIdProducto());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(prodVO.getNombre());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(prodVO.getEstado());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            \n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("    </center>\n");
>>>>>>> Stashed changes
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
