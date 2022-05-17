package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.UsuarioDAO;
import ModeloVO.UsuarioVO;

public final class consultarUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/navegacion.jsp");
    _jspx_dependants.add("/css-paginacion.jsp");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("              integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("                integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"icon\" href=\"img/LogoFinal.svg\" >\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"row\">\r\n");
      out.write("        \r\n");
      out.write("        <nav class=\"navbar navbar-light  col-md-4 text-light\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <a class=\"navbar-brand text-light nav-link\" href=\"menu.jsp\">\r\n");
      out.write("                <img src=\"img/LogoFinal.svg\" height=\"55\" class=\"d-inline-block align-text-top mt-2\">\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div class=\"col-md-4\">\r\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light\">\r\n");
      out.write("                <div class=\"mt-4 mx-auto \" id=\"navbarNav\">\r\n");
      out.write("                    <ul class=\"navbar-nav fs-4\">\r\n");
      out.write("                            <li class=\"nav-item active \">\r\n");
      out.write("                                <a class=\"navbar-brand text-dark \" href=\"index.jsp\">Inicio</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item dropdown font-dark\">\r\n");
      out.write("                                <a class=\"navbar-brand dark-link dropdown-toggle \" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                                  Registrar\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul class=\"dropdown-menu \" >\r\n");
      out.write("                                  <li><a class=\"dropdown-item font-dark\" href=\"registrarMateriasPrimas.jsp\">Materia Prima</a></li>\r\n");
      out.write("                                    <li><a class=\"dropdown-item font-dark\" href=\"registrarProducto.jsp\">Producto</a></li>\r\n");
      out.write("                                    <li><a class=\"dropdown-item font-dark\" href=\"registrarLoteMateriaPrima.jsp\">Lote Materia Prima</a></li>\r\n");
      out.write("                                    <li><a class=\"dropdown-item font-dark\"  href=\"registrarLoteProduccion.jsp\">Lote Produccion</a></li>\r\n");
      out.write("                                    <li><a class=\"dropdown-item font-dark\"  href=\"registrarOrdenes.jsp\">Ordenes</a></li>\r\n");
      out.write("                                    <li><a class=\"dropdown-item font-dark\"  href=\"registrarOrdenDetalles.jsp\">Orden Detalles</a></li>\r\n");
      out.write("                                    <li><a class=\"dropdown-item font-dark\"  href=\"registrarUsuario.jsp\">Usuarios</a></li>\r\n");
      out.write("                                    <li><a class=\"dropdown-item font-dark\"  href=\"registrarDetallesProducto.jsp\">Detalles Producto</a></li>\r\n");
      out.write("                                    <li><a class=\"dropdown-item font-dark\" href=\"registrarRol.jsp\">Rol</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                              </li>\r\n");
      out.write("                              <li class=\"nav-item dropdown font-dark \">\r\n");
      out.write("                                <a class=\"navbar-brand dropdown-toggle \" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                                  Consultar\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul class=\"dropdown-menu \" >\r\n");
      out.write("                                  <li><a class=\"dropdown-item font-dark\" href=\"consultarMateriaPrima.jsp\">Materia Prima</a></li>\r\n");
      out.write("                                  <li><a class=\"dropdown-item font-dark\" href=\"consultarExistenciasMateriaPrima.jsp\">Existencias Materia Prima</a></li>\r\n");
      out.write("                                    <li><a class=\"dropdown-item font-dark\" href=\"consultarProducto.jsp\">Producto</a></li>\r\n");
      out.write("                                    <li><a class=\"dropdown-item font-dark\" href=\"consultarLoteMateriaPrima.jsp\">Lote Materia Prima</a></li>\r\n");
      out.write("                                    <li><a class=\"dropdown-item font-dark\"  href=\"consultarLoteProduccion.jsp\">Lote Produccion</a></li>\r\n");
      out.write("                                    <li><a class=\"dropdown-item font-dark\"  href=\"consultarOrdenes.jsp\">Ordenes</a></li>\r\n");
      out.write("                                    <li><a class=\"dropdown-item font-dark\"  href=\"consultarOrdenDetalles.jsp\">Orden Detalles</a></li>\r\n");
      out.write("                                    <li><a class=\"dropdown-item font-dark\"  href=\"consultarUsuarios.jsp\">Usuarios</a></li>\r\n");
      out.write("                                    <li><a class=\"dropdown-item font-dark\"  href=\"consultarDetallesProducto.jsp\">Detalles Producto</a></li>\r\n");
      out.write("                                    <li><a class=\"dropdown-item font-dark\" href=\"consultarRol.jsp\">Rol</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                              </li>\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4 mt-3  justify-content-center d-flex\">\r\n");
      out.write("                <form action=\"Sesiones\" method=\"post\">\r\n");
      out.write("                    <button  class=\"btn boton mt-3\">Cerrar sesion</button>\r\n");
      out.write("                    <input type=\"hidden\" value=\"1\" name=\"opcion\">\r\n");
      out.write("                </form>\r\n");
      out.write("                 \r\n");
      out.write("            </div>\r\n");
      out.write("       \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"Imagen/icono.ico\" />\r\n");
      out.write("        \r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/normalize.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/sweetalert2.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/material.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/material-design-iconic-font.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/main.css\">\r\n");
      out.write("         <link href=\"css/bootstrapp.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"js/jqueryy.js\" type=\"text/javascript\"></script>    \r\n");
      out.write("        \r\n");
      out.write("        <script src=\"js/BuscadorTabla.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"js/bootstrapp.min.js\" type=\"text/javascript\"></script> \r\n");
      out.write("\t<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("\t<script>window.jQuery || document.write('<script src=\"js/jquery-1.11.2.min.js\"><\\/script>')</script>\r\n");
      out.write("\t<script src=\"js/material.min.js\" ></script>\r\n");
      out.write("\t<script src=\"js/sweetalert2.min.js\" ></script>\r\n");
      out.write("\t<script src=\"js/jquery.mCustomScrollbar.concat.min.js\" ></script>\r\n");
      out.write("\t<script src=\"js/main.js\" ></script>\r\n");
      out.write("        \r\n");
      out.write("        <script  type=\"text/javascript\" src=\"js/jquery-1.12.4.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/paginacion.js\"></script>\r\n");
      out.write("       \r\n");
      out.write("     \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("  <!--codigo de paginacion-->\r\n");
      out.write("  <style>\r\n");
      out.write("  \r\n");
      out.write("ulll {\r\n");
      out.write("  list-style: none;\r\n");
      out.write("  margin-top: 10px;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("liii {\r\n");
      out.write("  border-radius: 3px;\r\n");
      out.write("  color: black;\r\n");
      out.write("  background: #eee;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  display: inline;\r\n");
      out.write("  font-weight: 200;\r\n");
      out.write("  margin: 10px 5px 0px 2px;\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  width: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".activeee {\r\n");
      out.write("  background: teal;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\"#datos\").pagination();\r\n");
      out.write("\t});\r\n");
      out.write("        </script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("  var _gaq = _gaq || [];\r\n");
      out.write("  _gaq.push(['_setAccount', 'UA-36251023-1']);\r\n");
      out.write("  _gaq.push(['_setDomainName', 'jqueryscript.net']);\r\n");
      out.write("  _gaq.push(['_trackPageview']);\r\n");
      out.write("\r\n");
      out.write("  (function() {\r\n");
      out.write("    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\r\n");
      out.write("    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\r\n");
      out.write("    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\r\n");
      out.write("  })();\r\n");
      out.write("\r\n");
      out.write("</script>   \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1 class=\"text-center\">Usuarios</h1>\r\n");
      out.write("        <div class=\"col-md-4 justify-content-center mx-auto mt-4 d-flex\">\r\n");
      out.write("            <div class=\"col-md-6 me-3 \">\r\n");
      out.write("                <label>Consultar</label>\r\n");
      out.write("                <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--expandable\">\r\n");
      out.write("                    <label class=\"mdl-button mdl-js-button mdl-button--icon\" for=\"buscar\">\r\n");
      out.write("                        <i class=\"zmdi zmdi-search\"></i>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <div class=\"mdl-textfield__expandable-holder\">\r\n");
      out.write("                        <input type=\"text\" onkeyup=\"doSearch()\" class=\"mdl-textfield__input\"  id=\"buscar\">\r\n");
      out.write("                        <label class=\"mdl-textfield__label\"></label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");
if (request.getAttribute("mensajeError") != null) {
      out.write("\r\n");
      out.write("                <p class=\"text-danger text-center fs-5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                ");
   } else {
      out.write("\r\n");
      out.write("                <p class=\"text-success text-center fs-5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6\">\r\n");
      out.write("                <label>Generar Reporte</label>\r\n");
      out.write("                <form action=\"Usuarios\" method=\"post\" class=\"form-group\">\r\n");
      out.write("                    <select name=\"txtEstado\" class=\"form-select\">\r\n");
      out.write("                        <option selected>Escoja Una Opcion</option>\r\n");
      out.write("                        <option value=\"1\">Usuarios Activos</option>\r\n");
      out.write("                        <option value=\"0\">Usuarios Inactivos</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <button class=\"btn boton mt-3\">\r\n");
      out.write("                        Generar Reporte\r\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-download\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                        <path d=\"M.5 9.9a.5.5 0 0 1 .5.5v2.5a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1v-2.5a.5.5 0 0 1 1 0v2.5a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2v-2.5a.5.5 0 0 1 .5-.5z\"/>\r\n");
      out.write("                        <path d=\"M7.646 11.854a.5.5 0 0 0 .708 0l3-3a.5.5 0 0 0-.708-.708L8.5 10.293V1.5a.5.5 0 0 0-1 0v8.793L5.354 8.146a.5.5 0 1 0-.708.708l3 3z\"/>\r\n");
      out.write("                        </svg>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <input type=\"hidden\" value=\"10\" name=\"opcion\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>   \r\n");
      out.write("        <div class=\"col-md-11 mx-auto justify-content-center mt-4\">\r\n");
      out.write("            <div class=\"col-md-7 mx-auto justify-content-center\">\r\n");
      out.write("                <table id=\"datos\" number-per-page=\"10\" class=\"table table-light table-hover table-striped text-center\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>Id</th>\r\n");
      out.write("                        <th>Nombres</th>\r\n");
      out.write("                        <th>Documento</th>\r\n");
      out.write("                        <th>Telefono</th>\r\n");
      out.write("                        <th>Email</th>\r\n");
      out.write("                        <th>Direccion</th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");

                        UsuarioVO usuVO = new UsuarioVO();
                        UsuarioDAO usuDAO = new UsuarioDAO();

                        ArrayList<UsuarioVO> ListaUsuarios = usuDAO.Listar();

                        for (int i = 0; i < ListaUsuarios.size(); i++) {

                            usuVO = ListaUsuarios.get(i);

                    
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>");
      out.print(usuVO.getIdUsuarios());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(usuVO.getNombre());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(usuVO.getDocumento());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(usuVO.getTelefono());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(usuVO.getEmail());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(usuVO.getDireccion());
      out.write("</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <form action=\"Usuarios\" method=\"post\">\r\n");
      out.write("                                <input type=\"hidden\" name=\"txtEstado\" value=\"0\">\r\n");
      out.write("                                <input type=\"hidden\" name=\"txtId\" value=\"");
      out.print(usuVO.getIdUsuarios());
      out.write("\">\r\n");
      out.write("                                <button class=\"btn boton\">Desactivar</button>\r\n");
      out.write("                                <input type=\"hidden\" value=\"3\" name=\"opcion\">\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </td>\r\n");
      out.write("\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <form action=\"Usuarios\" method=\"post\">\r\n");
      out.write("                                <input type=\"hidden\" value=\"");
      out.print(usuVO.getIdUsuarios());
      out.write("\" name=\"txtId\">\r\n");
      out.write("                                <input type=\"hidden\" value=\"");
      out.print(usuVO.getNombre());
      out.write("\"  name= \"txtNombre\" class=\"form-control ms-1  mt-2\" >\r\n");
      out.write("                                <input type=\"hidden\" value=\"");
      out.print(usuVO.getDocumento());
      out.write("\" name= \"txtDocumento\"  class=\" form-control  ms-3 mt-2\" >\r\n");
      out.write("                                <input type=\"hidden\" value=\"");
      out.print(usuVO.getTelefono());
      out.write("\" name= \"txtTelefono\"  class=\"form-control  ms-1  mt-2\">\r\n");
      out.write("                                <input type=\"hidden\" value=\"");
      out.print(usuVO.getDireccion());
      out.write("\" name= \"txtDireccion\"  class=\"form-control ms-3 mt-2\">\r\n");
      out.write("                                <input type=\"hidden\" value=\"");
      out.print(usuVO.getEmail());
      out.write("\" name= \"txtEmail\"  class=\"form-control ms-1 mt-2\">\r\n");
      out.write("                                <input type=\"hidden\" value=\"");
      out.print(usuVO.getEstado());
      out.write("\" name= \"txtEstado\"  class=\"form-control ms-1 mt-2\">\r\n");
      out.write("                                <input type=\"hidden\" value=\"");
      out.print(usuVO.getContrasena());
      out.write("\" name= \"txtEstado\"  class=\"form-control ms-1 mt-2\">\r\n");
      out.write("                                <button class=\"btn boton\">Añadir Rol</button>\r\n");
      out.write("                                <input type=\"hidden\" value=\"9\" name=\"opcion\">\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("            </div> \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.js\"\r\n");
      out.write("                integrity=\"sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=\" crossorigin=\"anonymous\">\r\n");
      out.write("        </script>\r\n");
      out.write("        <!-- DATATABLES -->\r\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js\">\r\n");
      out.write("        </script>\r\n");
      out.write("        <!-- BOOTSTRAP -->\r\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js\">\r\n");
      out.write("        </script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                $('#tablax').DataTable({\r\n");
      out.write("                    language: {\r\n");
      out.write("                        processing: \"Tratamiento en curso...\",\r\n");
      out.write("                        search: \"Buscar&nbsp;:\",\r\n");
      out.write("                        lengthMenu: \"Agrupar de _MENU_ items\",\r\n");
      out.write("                        info: \"Mostrando del item _START_ al _END_ de un total de _TOTAL_ items\",\r\n");
      out.write("                        infoEmpty: \"No existen datos.\",\r\n");
      out.write("                        infoFiltered: \"(filtrado de _MAX_ elementos en total)\",\r\n");
      out.write("                        infoPostFix: \"\",\r\n");
      out.write("                        loadingRecords: \"Cargando...\",\r\n");
      out.write("                        zeroRecords: \"No se encontraron datos con tu busqueda\",\r\n");
      out.write("                        emptyTable: \"No hay datos disponibles en la tabla.\",\r\n");
      out.write("                        paginate: {\r\n");
      out.write("                            first: \"Primero\",\r\n");
      out.write("                            previous: \"Anterior\",\r\n");
      out.write("                            next: \"Siguiente\",\r\n");
      out.write("                            last: \"Ultimo\"\r\n");
      out.write("                        },\r\n");
      out.write("                        aria: {\r\n");
      out.write("                            sortAscending: \": active para ordenar la columna en orden ascendente\",\r\n");
      out.write("                            sortDescending: \": active para ordenar la columna en orden descendente\"\r\n");
      out.write("                        }\r\n");
      out.write("                    },\r\n");
      out.write("                    scrollY: 400,\r\n");
      out.write("                    lengthMenu: [[10, 25, -1], [10, 25, \"All\"]];\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
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
