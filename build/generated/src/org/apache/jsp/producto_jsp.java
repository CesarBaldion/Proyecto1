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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Producto</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/tableado.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                // Activate tooltip\n");
      out.write("                $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("\n");
      out.write("                // Select/Deselect checkboxes\n");
      out.write("                var checkbox = $('table tbody input[type=\"checkbox\"]');\n");
      out.write("                $(\"#selectAll\").click(function () {\n");
      out.write("                    if (this.checked) {\n");
      out.write("                        checkbox.each(function () {\n");
      out.write("                            this.checked = true;\n");
      out.write("                        });\n");
      out.write("                    } else {\n");
      out.write("                        checkbox.each(function () {\n");
      out.write("                            this.checked = false;\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                checkbox.click(function () {\n");
      out.write("                    if (!this.checked) {\n");
      out.write("                        $(\"#selectAll\").prop(\"checked\", false);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-xl\">\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <div class=\"table-wrapper\">\n");
      out.write("                    <div class=\"table-title\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <h2>Gestionar <b>Productos</b></h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <a href=\"#addProductModal\" class=\"btn btn-success\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE147;</i> <span>Añadir Producto</span></a>\n");
      out.write("                                <a href=\"#deleteEmployeeModal\" class=\"btn btn-danger\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE15C;</i> <span>Eliminar</span></a>\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mx-auto justify-content-center\">\n");
      out.write("                        ");
if (request.getAttribute("error") != null) {
      out.write("\n");
      out.write("                        <div class=\"container-fluid d-inline-block d-flex mx-auto\">\n");
      out.write("                            <p class=\"text-danger text-center fs-5 mt-5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("                        ");
   } else {
      out.write("\n");
      out.write("                        <p class=\"text-success text-center fs-5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Bien}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <table class=\"table table-striped table-hover\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>\n");
      out.write("                                    <span class=\"custom-checkbox\">\n");
      out.write("                                        <input type=\"checkbox\" id=\"selectAll\">\n");
      out.write("                                        <label for=\"selectAll\"></label>\n");
      out.write("                                    </span>\n");
      out.write("                                </th>\n");
      out.write("                                <th>Id</th>\n");
      out.write("                                <th>Nombre</th>\n");
      out.write("                                <th>Acciones</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <!--\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <span class=\"custom-checkbox\">\n");
      out.write("                                        <input type=\"checkbox\" id=\"checkbox1\" name=\"options[]\" value=\"1\">\n");
      out.write("                                        <label for=\"checkbox1\"></label>\n");
      out.write("                                    </span>\n");
      out.write("                                </td>\n");
      out.write("                                <td>Thomas Hardy</td>\n");
      out.write("                                <td>thomashardy@mail.com</td>\n");
      out.write("                                <td>89 Chiaroscuro Rd, Portland, USA</td>\n");
      out.write("                                <td>(171) 555-2222</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a href=\"#editEmployeeModal\" class=\"edit\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Edit\">&#xE254;</i></a>\n");
      out.write("                                    <a href=\"#deleteEmployeeModal\" class=\"delete\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Delete\">&#xE872;</i></a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            -->\n");
      out.write("\n");
      out.write("                            ");

                                ProductoVO prodVO = new ProductoVO();
                                ProductoDAO prodDAO = new ProductoDAO();
                                ArrayList<ProductoVO> listaProductos = prodDAO.listar();
                                for (int i = 0; i < listaProductos.size(); i++) {

                                    prodVO = listaProductos.get(i);

                            
      out.write("\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <span class=\"custom-checkbox\">\n");
      out.write("                                        <input type=\"checkbox\" id=\"checkbox1\" name=\"options[]\" value=\"1\">\n");
      out.write("                                        <label for=\"checkbox1\"></label>\n");
      out.write("                                    </span>\n");
      out.write("                                </td>\n");
      out.write("                                <td>");
      out.print(prodVO.getIdProducto());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(prodVO.getNombre());
      out.write("</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <form class=\"\" method=\"post\" action=\"Producto\" enctype=\"multipart/form-data\">\n");
      out.write("                                        <div value=\"");
      out.print(prodVO.getIdProducto());
      out.write("\">\n");
      out.write("                                            <input type=\"hidden\" value=\"4\" name=\"opcion\">\n");
      out.write("                                            <button><a href=\"#editProductModal\" name=\"txtId\" class=\"edit\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Editar\">&#xE254;</i></a></button>\n");
      out.write("                                        </div>\n");
      out.write("                                        <a href=\"#deleteEmployeeModal\" class=\"delete\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Eliminar\">&#xE872;</i></a>\n");
      out.write("                                    </form>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    <div class=\"clearfix\">\n");
      out.write("                        <div class=\"hint-text\">Showing <b>5</b> out of <b>25</b> entries</div>\n");
      out.write("                        <ul class=\"pagination\">\n");
      out.write("                            <li class=\"page-item disabled\"><a href=\"#\">Previous</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">1</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">2</a></li>\n");
      out.write("                            <li class=\"page-item active\"><a href=\"#\" class=\"page-link\">3</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">4</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">5</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">Next</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>        \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <form  class=\"\" method=\"post\" action=\"Producto\" enctype=\"multipart/form-data\">\n");
      out.write("            <!-- Añadir Modelo HTML -->\n");
      out.write("            <div id=\"addProductModal\" class=\"modal fade\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Añadir Producto</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Nombre</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtNombre\" required>\n");
      out.write("                            </div>\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancelar\">\n");
      out.write("                            <div>\n");
      out.write("                                <button class=\"btn btn-success\"> Añadir </button>\n");
      out.write("                                <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <form  class=\"\" method=\"post\" action=\"Producto\" enctype=\"multipart/form-data\">        \n");
      out.write("            <!-- Editar Modelo HTML -->\n");
      out.write("            <div id=\"editProductModal\" class=\"modal fade\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Editar Producto</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Nombre</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtNombre\"  required>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtNombre\" value=\"");
      out.print(prodVO.getNombre());
      out.write(" \"  required=\"\">\n");
      out.write("                            </div>\t\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancelar\">\n");
      out.write("                            <div>\n");
      out.write("                                <button class=\"btn btn-info\"> Guardar </button>\n");
      out.write("                                <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Delete Modal HTML -->\n");
      out.write("        <div id=\"deleteEmployeeModal\" class=\"modal fade\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form>\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Eliminar Producto</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("                            <p>¿Está seguro de eliminar este producto?</p>\n");
      out.write("                            <p class=\"text-warning\"><small>Esta acción no puede ser deshecha.</small></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancelar\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-danger\" value=\"Eliminar\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
