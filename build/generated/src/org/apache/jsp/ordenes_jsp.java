package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.DetallesProductoVO;
import ModeloVO.OrdenesVO;
import ModeloDAO.OrdenesDAO;
import java.util.ArrayList;
import ModeloDAO.OrdenDetallesDAO;
import ModeloVO.OrdenDetallesVO;
import ModeloDAO.DetallesProductoDAO;

public final class ordenes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"d-flex\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <form action=\"OrdenDetalles\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Datos del producto</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group d-flex\">\n");
      out.write("                                <div class=\"col-sm-6 d-flex\">\n");
      out.write("                                    <select name=\"txtIdOrden\" required=\"\" class=\"form-select\">\n");
      out.write("                                        <option>Seleccione un IdOrden...</option>\n");
      out.write("                                        ");

                                            OrdenesDAO ordDAO = new OrdenesDAO();
                                            for (OrdenesVO ordVO : ordDAO.listar()) {

                                        
      out.write("\n");
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(ordVO.getId_Orden());
      out.write('"');
      out.write('>');
      out.print(ordVO.getId_Orden());
      out.write("</option>\n");
      out.write("\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group d-flex\">\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <select name=\"idDetallesProducto\" required=\"\" class=\"form-select\">\n");
      out.write("                                        <option>IdDetalles Producto</option>\n");
      out.write("                                        ");

                                            DetallesProductoDAO dpDAO = new DetallesProductoDAO();
                                            for (DetallesProductoVO dpVO : dpDAO.listar()) {

                                        
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(dpVO.getId_Detalles_Producto());
      out.write('"');
      out.write('>');
      out.print(dpVO.getId_Detalles_Producto());
      out.write("</option>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <input type=\"number\" value=\"1\" name=\"txtcantidadSolicitada\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input class=\"btn btn-outline-info\" type=\"hidden\" name=\"opcion\" value=\"5\" >\n");
      out.write("                                <button class=\"btn btn-outline-info\">Agregar</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-7\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"d-flex col-sm-6 ml-auto\">\n");
      out.write("                            <label>Nro. Serie</label>\n");
      out.write("                            <input type=\"text\" name=\"NroSerie\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <table class=\"table table-hover\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Nro</th>\n");
      out.write("                                    <th>Orden</th>\n");
      out.write("                                    <th>Detalles Producto</th>\n");
      out.write("                                    <th>Cantidad</th>\n");
      out.write("                                    <th>Acciones</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");

                                    DetallesProductoDAO detProDAO = new DetallesProductoDAO();
                                    OrdenDetallesVO OrdenDetallVO = new OrdenDetallesVO();
                                    OrdenDetallesDAO OrdenDetallDAO = new OrdenDetallesDAO(OrdenDetallVO);
                                    ArrayList<OrdenDetallesVO> listaOrdenDetalles = OrdenDetallDAO.Listar();

                                    for (int i = 0; i < listaOrdenDetalles.size(); i++) {

                                        OrdenDetallVO = listaOrdenDetalles.get(i);

                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print(OrdenDetallVO.getItem());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(OrdenDetallVO.getId_Orden());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(OrdenDetallVO.getId_Detalles_Producto());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(OrdenDetallVO.getCantidadSolicitada());
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-footer\">\n");
      out.write("                        <input type=\"submit\" name=\"opcion\" value=\"generar Venta\" class=\"btn btn-success\">\n");
      out.write("                        <input type=\"submit\" name=\"opcion\" value=\"Cancelar\" class=\"btn btn-danger\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
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
