package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.ProductoDAO;
import ModeloDAO.ProductoDAO;
import ModeloVO.ProductoVO;
import ModeloVO.ProductoVO;

public final class producto_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

    ProductoVO prodVO = new ProductoVO();
    ProductoDAO prodDAO = new ProductoDAO();
    ArrayList<ProductoVO> listaProductos = prodDAO.listar();

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
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <title>Producto</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/tableado.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                // Activate tooltip\r\n");
      out.write("                $('[data-toggle=\"tooltip\"]').tooltip();\r\n");
      out.write("\r\n");
      out.write("                // Select/Deselect checkboxes\r\n");
      out.write("                var checkbox = $('table tbody input[type=\"checkbox\"]');\r\n");
      out.write("                $(\"#selectAll\").click(function () {\r\n");
      out.write("                    if (this.checked) {\r\n");
      out.write("                        checkbox.each(function () {\r\n");
      out.write("                            this.checked = true;\r\n");
      out.write("                        });\r\n");
      out.write("                    } else {\r\n");
      out.write("                        checkbox.each(function () {\r\n");
      out.write("                            this.checked = false;\r\n");
      out.write("                        });\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("                checkbox.click(function () {\r\n");
      out.write("                    if (!this.checked) {\r\n");
      out.write("                        $(\"#selectAll\").prop(\"checked\", false);\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-xl\">\r\n");
      out.write("            <div class=\"table-responsive\">\r\n");
      out.write("                <div class=\"table-wrapper\">\r\n");
      out.write("                    <div class=\"table-title\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-6\">\r\n");
      out.write("                                <h2>Gestionar <b>Productos</b></h2>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-6\">\r\n");
      out.write("                                <a href=\"#addProductModal\" class=\"btn btn-success\" data-toggle=\"modal\" ><i class=\"material-icons\" >&#xE147;</i> <span>Añadir Producto</span></a>\r\n");
      out.write("                                <a href=\"#deleteEmployeeModal\" class=\"btn btn-danger\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE15C;</i> <span>Eliminar</span></a>\t\t\t\t\t\t\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mx-auto justify-content-center\">\r\n");
      out.write("                        ");
if (request.getAttribute("error") != null) {
      out.write("\r\n");
      out.write("                        <div class=\"container-fluid d-inline-block d-flex mx-auto\">\r\n");
      out.write("                            <p class=\"text-danger text-center fs-5 mt-5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
   } else {
      out.write("\r\n");
      out.write("                        <p class=\"text-success text-center fs-5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Bien}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <table class=\"table table-striped table-hover\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>\r\n");
      out.write("                                    <span class=\"custom-checkbox\">\r\n");
      out.write("                                        <input type=\"checkbox\" id=\"selectAll\">\r\n");
      out.write("                                        <label for=\"selectAll\"></label>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </th>\r\n");
      out.write("                                <th>Id</th>\r\n");
      out.write("                                <th>Nombre</th>\r\n");
      out.write("                                <th>Acciones</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");


                                for (int i = 0; i < listaProductos.size(); i++) {

                                    prodVO = listaProductos.get(i);

                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <span class=\"custom-checkbox\">\r\n");
      out.write("                                        <input type=\"checkbox\" id=\"checkbox1\" name=\"options[]\" value=\"1\">\r\n");
      out.write("                                        <label for=\"checkbox1\"></label>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>");
      out.print(prodVO.getIdProducto());
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(prodVO.getNombre());
      out.write("</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <form method=\"post\" action=\"Producto\" enctype=\"multipart/form-data\">\r\n");
      out.write("                                        <!-- <a href=\"#editProductModal\" name=\"txtId\" class=\"edit\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Editar\">&#xE254;</i></a>  -->\r\n");
      out.write("                                        <form  method=\"post\" action=\"Producto\" class=\"form-group\" enctype=\"multipart/form-data\"> \r\n");
      out.write("                                            <input type=\"hidden\" name=\"txtId\" value=\"");
      out.print(prodVO.getIdProducto());
      out.write("\">\r\n");
      out.write("                                            <button data-id=\"");
      out.print(prodVO.getNombre());
      out.write("\" name=\"txtId\" class=\"btn boton mt-2 detalles\">Consultar</button>\r\n");
      out.write("                                            <input type=\"hidden\" value=\"4\" name=\"opcion\">\r\n");
      out.write("                                        </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <a href=\"#deleteEmployeeModal\" class=\"delete\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Eliminar\">&#xE872;</i></a>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                    <div class=\"clearfix\">\r\n");
      out.write("                        <div class=\"hint-text\">Showing <b>5</b> out of <b>25</b> entries</div>\r\n");
      out.write("                        <ul class=\"pagination\">\r\n");
      out.write("                            <li class=\"page-item disabled\"><a href=\"#\">Previous</a></li>\r\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">1</a></li>\r\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">2</a></li>\r\n");
      out.write("                            <li class=\"page-item active\"><a href=\"#\" class=\"page-link\">3</a></li>\r\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">4</a></li>\r\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">5</a></li>\r\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">Next</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>        \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <form  class=\"\" method=\"post\" action=\"Producto\" enctype=\"multipart/form-data\">\r\n");
      out.write("            <!-- Añadir Modelo HTML -->\r\n");
      out.write("            <div id=\"addProductModal\" class=\"modal fade\">\r\n");
      out.write("                <div class=\"modal-dialog\">\r\n");
      out.write("                    <div class=\"modal-content\">\r\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\r\n");
      out.write("                            <h4 class=\"modal-title\">Añadir Producto</h4>\r\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Nombre</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtNombre\" required>\r\n");
      out.write("                            </div>\t\t\t\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancelar\">\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <button class=\"btn btn-success\"> Añadir </button>\r\n");
      out.write("                                <input type=\"hidden\" value=\"1\" name=\"opcion\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <form method=\"post\" action=\"Producto\" enctype=\"multipart/form-data\">        \r\n");
      out.write("            <!-- Editar Modelo HTML -->\r\n");
      out.write("            <div id=\"editProductModal\" class=\"modal fade\">\r\n");
      out.write("                <div class=\"modal-dialog\">\r\n");
      out.write("                    <div class=\"modal-content\">\r\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\r\n");
      out.write("                            <h4 class=\"modal-title\">Editar Producto</h4>\r\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\" >&times;</button>\r\n");
      out.write("                        </div\r\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Nombre</label>\r\n");
      out.write("                                <input id=\"nombreModal\" name=\"txtNombre\" value=\"");
      out.print(prodVO.getNombre());
      out.write("\" type=\"text\" class=\"form-control\"  required>\r\n");
      out.write("\r\n");
      out.write("                            </div>\t\t\t\t\t\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancelar\">\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <input type=\"hidden\" name=\"txtId\" value=\"");
      out.print(prodVO.getIdProducto());
      out.write("\">\r\n");
      out.write("                                <button class=\"btn btn-info\"> Guardar </button>\r\n");
      out.write("                                <input type=\"hidden\" value=\"2\" name=\"opcion\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> \r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Delete Modal HTML -->\r\n");
      out.write("        <div id=\"deleteEmployeeModal\" class=\"modal fade\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <form  method=\"post\" action=\"Producto\" class=\"form-group\" enctype=\"multipart/form-data\"> \r\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\r\n");
      out.write("                            <h4 class=\"modal-title\">Eliminar Producto</h4>\r\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\r\n");
      out.write("                            <p>¿Está seguro de eliminar este producto?</p>\r\n");
      out.write("                            <p class=\"text-warning\"><small>Esta acción no puede ser deshecha.</small></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancelar\">\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <input type=\"hidden\" name=\"txtId\" value=\"");
      out.print(prodVO.getIdProducto());
      out.write("\">\r\n");
      out.write("                                <button class=\"btn btn-danger\">Eliminar</button>\r\n");
      out.write("                                <input type=\"hidden\" value=\"3\" name=\"opcion\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"js/indexM.js\" type=\"text/javascript\"></script>\r\n");
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
