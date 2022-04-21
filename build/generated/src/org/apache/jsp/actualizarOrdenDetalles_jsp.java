package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.OrdenDetallesDAO;
import ModeloVO.DetallesProductoVO;
import ModeloDAO.DetallesProductoDAO;
import ModeloVO.OrdenesVO;
import ModeloDAO.OrdenesDAO;
import ModeloVO.OrdenDetallesVO;

public final class actualizarOrdenDetalles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("             <h1>Actualizar orden detalles</h1>\r\n");
      out.write("             <label>Id orden detalles </label>\r\n");
      out.write("             <br>\r\n");
      out.write("            <input type=\"hidden\" name=\"txtIdOrdenDetalles\" value=\"");
      out.print(ordenDetallVO.getId_Orden_Detalles());
      out.write("\">\r\n");
      out.write("             Id Orden<br>\r\n");
      out.write("             <select name=\"txtIdOrden\">\r\n");
      out.write("                 <option value=\"");
      out.print(ordenDetallVO.getId_Orden());
      out.write('"');
      out.write('>');
      out.print(ordenDetallVO.getId_Orden());
      out.write("</option>\r\n");
      out.write("                  ");

                OrdenesDAO ordDAO = new OrdenesDAO();
                for(OrdenesVO ordVO:ordDAO.listar()){
                
                
      out.write("\r\n");
      out.write("            \r\n");
      out.write("                <option value=\"");
      out.print(ordVO.getId_Orden());
      out.write('"');
      out.write('>');
      out.print(ordVO.getId_Orden());
      out.write("</option>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("             </select>\r\n");
      out.write("                <br>\r\n");
      out.write("                Id Detalles de Producto<br>\r\n");
      out.write("                <select name=\"idDetallesProducto\">\r\n");
      out.write("                    <option value=\"");
      out.print(ordenDetallVO.getId_Detalles_Producto());
      out.write('"');
      out.write('>');
      out.print(ordenDetallVO.getId_Detalles_Producto());
      out.write("</option>\r\n");
      out.write("                    ");

                DetallesProductoDAO dpDAO = new DetallesProductoDAO();
                for(DetallesProductoVO dpVO:dpDAO.listar()){
                
                
      out.write("\r\n");
      out.write("            \r\n");
      out.write("                <option value=\"");
      out.print(dpVO.getId_Detalles_Producto());
      out.write('"');
      out.write('>');
      out.print(dpVO.getId_Detalles_Producto());
      out.write("</option>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("                </select>\r\n");
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
