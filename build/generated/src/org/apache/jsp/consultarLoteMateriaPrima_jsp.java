package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.loteMateriaPrimaDAO;
import ModeloVO.loteMateriaPrimaVO;

public final class consultarLoteMateriaPrima_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Lote Materia Prima</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <div class=\"col-md-6 \">\n");
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
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <h1>Lote Materia Prima</h1>\n");
      out.write("            <form  method=\"post\" action=\"loteMateriaPrima\"> \n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            Lote Materia Prima\n");
      out.write("                            <input type=\"text\" name=\"txtIdLoteMateriaPrima\" ><br>\n");
      out.write("                            <input type=\"hidden\" value=\"4\" name=\"opcion\">\n");
      out.write("                            <button>Consultar</button>\n");
      out.write("                        </th>\n");
      out.write("                    </tr>\n");
      out.write("                </table><br><br>\n");
      out.write("            </form>\n");
      out.write("            <div style=\"color: red;\">\n");
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
      out.write("            </div><br><br>\n");
      out.write("            <form>\n");
      out.write("                <table border=\"1\">\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Id</th>\n");
      out.write("                        <th>Cantidad</th>\n");
      out.write("                        <th>Observaciones</th>\n");
      out.write("                        <th>Fecha Ingreso</th>\n");
      out.write("                        <th>Fecha Salida</th>\n");
      out.write("                        <th>Id Materia Prima</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        loteMateriaPrimaVO ltMatPriVO = new loteMateriaPrimaVO();
                        loteMateriaPrimaDAO ltMatPriDAO = new loteMateriaPrimaDAO(ltMatPriVO);

                        ArrayList<loteMateriaPrimaVO> listaLoteMateriaPrima = ltMatPriDAO.Listar();

                        for (int i = 0; i < listaLoteMateriaPrima.size(); i++) {

                            ltMatPriVO = listaLoteMateriaPrima.get(i);

                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(ltMatPriVO.getId_loteMateria_Prima());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(ltMatPriVO.getCantidad());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(ltMatPriVO.getObservaciones());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(ltMatPriVO.getFecha_ingreso());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(ltMatPriVO.getFecha_salida());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(ltMatPriVO.getId_Materia_Prima());
      out.write("</td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
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
