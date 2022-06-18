package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.ProductoDAO;
import ModeloVO.ProductoVO;
import java.util.ArrayList;

public final class Producto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("              integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("                integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.12.1/css/jquery.dataTables.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\r\n");
      out.write("\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"col-md-6 mx-auto \">\r\n");
      out.write("            <h1 class=\"text-center mb-5 \">Producto</h1>\r\n");
      out.write("            <div class=\"d-flex\"> \r\n");
      out.write("                <div>\r\n");
      out.write("                    <button type=\"button\" class=\"boton me-2 btn mt-5\" data-bs-toggle=\"modal\" data-bs-target=\"#registrar\" >Registrar\r\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-plus-circle\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                        <path d=\"M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z\"/>\r\n");
      out.write("                        <path d=\"M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z\"/>\r\n");
      out.write("                        </svg>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <button type=\"button\" class=\"boton me-2 btn mt-5\" data-bs-toggle=\"modal\" data-bs-target=\"#CargaMasiva\" >Carga Masiva\r\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-plus-circle\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                        <path d=\"M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z\"/>\r\n");
      out.write("                        <path d=\"M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z\"/>\r\n");
      out.write("                        </svg>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <form action=\"Producto\" method=\"post\" class=\"form-group\" enctype=\"multipart/form-data\">\r\n");
      out.write("                        <button  class=\"btn boton  mt-5\" title=\"Reporte de Producto\">\r\n");
      out.write("                            Generar Reporte\r\n");
      out.write("                            <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-download\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                            <path d=\"M.5 9.9a.5.5 0 0 1 .5.5v2.5a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1v-2.5a.5.5 0 0 1 1 0v2.5a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2v-2.5a.5.5 0 0 1 .5-.5z\"/>\r\n");
      out.write("                            <path d=\"M7.646 11.854a.5.5 0 0 0 .708 0l3-3a.5.5 0 0 0-.708-.708L8.5 10.293V1.5a.5.5 0 0 0-1 0v8.793L5.354 8.146a.5.5 0 1 0-.708.708l3 3z\"/>\r\n");
      out.write("                            </svg>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <input type=\"hidden\" value=\"10\" name=\"opcion\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mt-2\">\r\n");
      out.write("                <div class=\"actualizarTBody mx-auto\" id=\"actualizarTBody\">\r\n");
      out.write("                    <table id=\"table_id\" class=\"table  border-dark  \">\r\n");
      out.write("                        <thead class=\"table-dark\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>Id</th>\r\n");
      out.write("                                <th>Nombre</th>\r\n");
      out.write("                                <th>Acciones</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody >\r\n");
      out.write("                            ");

                                ProductoVO proVO = new ProductoVO();
                                ProductoDAO proDAO = new ProductoDAO();

                                ArrayList<ProductoVO> listaProductos = proDAO.listar();

                                for (int i = 0; i < listaProductos.size(); i++) {

                                    proVO = listaProductos.get(i);
                            
      out.write("\r\n");
      out.write("                            <tr >\r\n");
      out.write("                                <td>");
      out.print(proVO.getIdProducto());
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(proVO.getNombre());
      out.write("</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <div >\r\n");
      out.write("                                        <button data-id=\"");
      out.print(proVO.getNombre());
      out.write("\" data-id2=\"");
      out.print(proVO.getIdProducto());
      out.write("\"  class=\"btn boton mt-2 detalles\">\r\n");
      out.write("                                            <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-zoom-in\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path fill-rule=\"evenodd\" d=\"M6.5 12a5.5 5.5 0 1 0 0-11 5.5 5.5 0 0 0 0 11zM13 6.5a6.5 6.5 0 1 1-13 0 6.5 6.5 0 0 1 13 0z\"/>\r\n");
      out.write("                                            <path d=\"M10.344 11.742c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1 6.538 6.538 0 0 1-1.398 1.4z\"/>\r\n");
      out.write("                                            <path fill-rule=\"evenodd\" d=\"M6.5 3a.5.5 0 0 1 .5.5V6h2.5a.5.5 0 0 1 0 1H7v2.5a.5.5 0 0 1-1 0V7H3.5a.5.5 0 0 1 0-1H6V3.5a.5.5 0 0 1 .5-.5z\"/>\r\n");
      out.write("                                            </svg>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                        <button data-id3=\"");
      out.print(proVO.getNombre());
      out.write("\" data-id4=\"");
      out.print(proVO.getIdProducto());
      out.write("\"  class=\"btn boton mt-2 eliminar\">\r\n");
      out.write("                                            <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-trash3\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path d=\"M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5ZM11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H2.506a.58.58 0 0 0-.01 0H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1h-.995a.59.59 0 0 0-.01 0H11Zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5h9.916Zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47ZM8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5Z\"/>\r\n");
      out.write("                                            </svg>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                        ");
 }
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <div class=\"modal fade\" id=\"registrar\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header \">\r\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <div class=\"col-md-5 mx-auto\">\r\n");
      out.write("                            <h5 class=\"modal-title  text-center mb-5\" id=\"staticBackdropLabel\">Registrar Producto</h5>\r\n");
      out.write("                            <form class=\"form-group\" method=\"post\" action=\"Producto\" enctype=\"multipart/form-data\">\r\n");
      out.write("                                <input type=\"text\" id=\"txtNombre\" class=\"form-control\">\r\n");
      out.write("                                <input type=\"hidden\" id=\"opcion\" value=\"1\">\r\n");
      out.write("                                <input type=\"button\" id=\"submit\" value=\"Guardar\" class=\"btn boton mt-3\"> \r\n");
      out.write("                            </form>\r\n");
      out.write("                            <div id=\"response\">\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <div class=\"modal fade\" id=\"CargaMasiva\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header \">\r\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <label>Carga Masiva <b>Archivo Excel(xlsx)</b></label>\r\n");
      out.write("                        <form  enctype=\"multipart/form-data\" id=\"formCargaMasiva\" method=\"post\">\r\n");
      out.write("                            <input type=\"file\" name=\"archivocsv\" id=\"archivocsv\" class=\"form-control\">\r\n");
      out.write("                            <button class=\"btn boton mt-3\">Cargar\r\n");
      out.write("                                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-upload\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                <path d=\"M.5 9.9a.5.5 0 0 1 .5.5v2.5a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1v-2.5a.5.5 0 0 1 1 0v2.5a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2v-2.5a.5.5 0 0 1 .5-.5z\"/>\r\n");
      out.write("                                <path d=\"M7.646 1.146a.5.5 0 0 1 .708 0l3 3a.5.5 0 0 1-.708.708L8.5 2.707V11.5a.5.5 0 0 1-1 0V2.707L5.354 4.854a.5.5 0 1 1-.708-.708l3-3z\"/>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <input type=\"hidden\" value=\"11\" name=\"opcion\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <div id=\"mensaje\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <div class=\"modal fade\" id=\"editarProductoModal\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header \">\r\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <div class=\"col-md-5 mx-auto\">\r\n");
      out.write("                            <h5 class=\"modal-title text-center mb-5\" id=\"staticBackdropLabel\">Actualizar Producto</h5>\r\n");
      out.write("                            <form class=\"form-group\" method=\"post\" action=\"Producto\" enctype=\"multipart/form-data\">\r\n");
      out.write("                                <input id=\"txtIdEdit\" type=\"hidden\" value=\"\" class=\"form-control\">\r\n");
      out.write("                                <input id=\"txtNombreEdit\" value=\"\" type=\"text\" class=\"form-control\"  required>\r\n");
      out.write("                                <input type=\"hidden\" value=\"2\" id=\"opcionedit\">\r\n");
      out.write("                                <input type=\"button\" id=\"submitEdit\" value=\"Guardar\" class=\"btn boton mt-3\"> \r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"responseEdit\" class=\"mx-auto justify-content-center\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <div class=\"modal fade\" id=\"eliminarProductoModal\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header \">\r\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <div class=\"col-md-5 mx-auto\">\r\n");
      out.write("                            <h5 class=\"text-center text-danger mb-5\" id=\"staticBackdropLabel\">¿Esta seguro que desea Eliminar este Producto?</h5>\r\n");
      out.write("                            <table class=\"table table-hover table-light table-responsive text-center\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th>Id</th>\r\n");
      out.write("                                        <th>Nombre</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td id=\"txtIdDel\"></td>\r\n");
      out.write("                                        <td id=\"txtNombreDel\"></td>\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                            <form>\r\n");
      out.write("                                <input type=\"hidden\" value=\"3\" id=\"opcioneDel\">\r\n");
      out.write("                                <input type=\"button\" id=\"submitDel\" value=\"Eliminar\" class=\"btn btn-danger d-inline-block mx-auto ms-5 justify-content-center mt-3\"> \r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"responseDel\" class=\"col-md-12 mx-auto justify-content-center\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"js/JS/ControladorProducto.js\"></script>\r\n");
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
