package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.ProductoDAO;
import ModeloVO.ProductoVO;
import java.util.ArrayList;

public final class productoss_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    ProductoVO prodVO = new ProductoVO();
    ProductoDAO prodDAO = new ProductoDAO();

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"d-flex\">\n");
      out.write("            <div id=\"editMateria\" class=\"card col-sm-5\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                    <form method =\"post\" action=\"Producto\" class=\"form-group\" enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("                        <div class=\"mx-auto justify-content-center\">\n");
      out.write("                            ");
if (request.getAttribute("error") != null) {
      out.write("\n");
      out.write("                            <div class=\"container-fluid d-inline-block d-flex mx-auto\">\n");
      out.write("                                <p class=\"text-danger text-center fs-5 mt-5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                            ");
   } else {
      out.write("\n");
      out.write("                            <p class=\"text-success text-center fs-5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Nombre Producto</label>\n");
      out.write("                            <input type=\"text\" value=\"");
      out.print(prodVO.getNombre());
      out.write("\" name=\"txtNombre\" class=\"form-control\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <button class=\"btn btn-info\"> Registrar </button>\n");
      out.write("                        <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <button class=\"btn btn-success\"> Actualizar </button>\n");
      out.write("                            <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Id</th>\n");
      out.write("                            <th>Nombre</th>\n");
      out.write("                            <th>Acciones</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");


                            ArrayList<ProductoVO> listaProductos = prodDAO.listar();
                            for (int i = 0; i < listaProductos.size(); i++) {

                                prodVO = listaProductos.get(i);

                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <<td>");
      out.print(prodVO.getIdProducto());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(prodVO.getNombre());
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                                <form method =\"post\" action=\"Producto\" class=\"form-group\" enctype=\"multipart/form-data\">\n");
      out.write("                                  \n");
      out.write("                                        <input type=\"hidden\" name=\"txtIdMateriaPrima\" value=\"");
      out.print(prodVO.getIdProducto());
      out.write("\">\n");
      out.write("                                        <input type=\"hidden\"  value=\"4\" name=\"opcion\">\n");
      out.write("                                        <button class=\"btn btn-warning\">Editar</button>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                        <input type=\"hidden\" name=\"txtIdMateriaPrima\" value=\"");
      out.print(prodVO.getIdProducto());
      out.write("\">\n");
      out.write("                                        <button class=\"btn btn-danger\">Eliminar</button>\n");
      out.write("                                        <input type=\"hidden\" value=\"3\" name=\"opcion\">\n");
      out.write("                                   \n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
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
