package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;
import ModeloVO.OrdenDetallesVO;
import ModeloDAO.OrdenDetallesDAO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.LoteProduccionVO;

public final class actualizarLoteProduccion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navegacion.jsp");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("                integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("          <div class=\"col-md-6 \">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light col-md-12 \">\n");
      out.write("                <div class=\"mx-auto mt-3\" id=\"navbarNav\">\n");
      out.write("\n");
      out.write("                    <ul class=\"navbar-nav mx-auto\">\n");
      out.write("                        <li class=\"nav-item active me-4\">\n");
      out.write("                            <a class=\"navbar-brand text-dark \" href=\"menu.jsp\">Inicio</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item dropdown font-dark\">\n");
      out.write("                            <a class=\"navbar-brand dark-link dropdown-toggle \" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                Registrar\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu \" >\n");
      out.write("                                <li><a class=\"dropdown-item font-dark\" href=\"registrarMateriasPrimas.jsp\">Materia Prima</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item font-dark\" href=\"registrarProducto.jsp\">Producto</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item font-dark\" href=\"registrarLoteMateriaPrima.jsp\">Lote Materia Prima</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item font-dark\"  href=\"registrarLoteProduccion.jsp\">Lote Produccion</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item font-dark\"  href=\"registrarOrdenes.jsp.jsp\">Ordenes</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item font-dark\"  href=\"consultarOrdenDetalles.jsp.jsp\">Ordene Detalles</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item font-dark\"  href=\"registrarUsuario.jsp\">Usuarios</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item font-dark\"  href=\"registrarDetallesProducto.jsp\">Detalles Producto</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item dropdown font-dark\">\n");
      out.write("                            <a class=\"navbar-brand dropdown-toggle \" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                Consultar\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu \" >\n");
      out.write("                                <li><a class=\"dropdown-item font-dark\" href=\"consultarMateriaPrima.jsp\">Materia Prima</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item font-dark\" href=\"consultarProducto.jsp\">Producto</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item font-dark\" href=\"consultarMateriaPrima.jsp\">Lote Materia Prima</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item font-dark\"  href=\"consultarLoteProduccion.jsp\">Lote Produccion</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item font-dark\"  href=\"consultarOrdenes.jsp\">Ordenes</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item font-dark\"  href=\"consultarOrdenDetalles.jsp.jsp\">Orden Detalles</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item font-dark\"  href=\"consultarUsuarios.jsp\">Usuarios</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item font-dark\"  href=\"consultarDetallesProducto.jsp\">Detalles Producto</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <br><br>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
      out.write("        ");

            LoteProduccionVO ltProducVO = (LoteProduccionVO) request.getAttribute("LoteProduccionConsultada");
            if (ltProducVO != null) {

        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <form action=\"LoteProduccion\" method=\"post\">\r\n");
      out.write("            <h1>Actualizar Usuarios</h1>\r\n");
      out.write("            <label>Id lote de produccion</label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"hidden\" name=\"txtid_loteProduccion\" value=\"");
      out.print(ltProducVO.getId_Lote_Produccion());
      out.write("\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Id usuarios</label>\r\n");
      out.write("            <select name=\"txtId_Usuarios\">\r\n");
      out.write("                <option value=\"");
      out.print(ltProducVO.getId_Usuarios());
      out.write('"');
      out.write('>');
      out.print(ltProducVO.getId_Usuarios());
      out.write("</option>\r\n");
      out.write("                ");
 
                UsuarioDAO usuDAO = new UsuarioDAO();
                for(UsuarioVO usuVO:usuDAO.Listar()){
                
      out.write("\r\n");
      out.write("                <option value=\"");
      out.print(usuVO.getIdUsuarios());
      out.write("\">value=\"");
      out.print(usuVO.getNombre());
      out.write("</option>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Id orden detalles</label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <select name=\"txtId_orden_detalles\">\r\n");
      out.write("                <option value=\"");
      out.print(ltProducVO.getId_orden_Detalles());
      out.write('"');
      out.write('>');
      out.print(ltProducVO.getId_orden_Detalles());
      out.write("</option>\r\n");
      out.write("                ");
 
                OrdenDetallesDAO odDAO = new OrdenDetallesDAO();
                for(OrdenDetallesVO odVO:odDAO.Listar()){
                
      out.write("\r\n");
      out.write("                <option value=\"");
      out.print(odVO.getId_Orden_Detalles());
      out.write("\">value=\"");
      out.print(odVO.getId_Orden_Detalles());
      out.write("</option>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Cantidad</label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"number\" name=\"txtcantidad\" placeholder=\"Cantidad\" value=\"");
      out.print(ltProducVO.getCantidad());
      out.write("\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Fecha de fabricacion</label>\r\n");
      out.write("            <input type=\"date\" name=\"txtfecha_Fabricacion\" value=\"");
      out.print(ltProducVO.getFecha_Fabricacion());
      out.write("\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <button>Actualizar</button>\r\n");
      out.write("            <input type=\"hidden\" value=\"2\" name=\"opcion\">\r\n");
      out.write("            <a href=\"consultarLoteProduccion.jsp\">Volver</a><br>\r\n");
      out.write("            <div class=\"\">\r\n");
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
      out.write("\r\n");
      out.write("        ");
 } else {
                request.getRequestDispatcher("consultarLoteProduccion.jsp").forward(request, response);

            }
      out.write("\r\n");
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
