package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.OrdenDetallesDAO;
import ModeloVO.OrdenDetallesVO;
import ModeloVO.DetallesProductoVO;
import ModeloDAO.DetallesProductoDAO;
import ModeloVO.OrdenesVO;
import ModeloDAO.OrdenesDAO;

public final class Ordenes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"Imagen/icono.ico\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/normalize.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/sweetalert2.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/material.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/material-design-iconic-font.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/main.css\">\r\n");
      out.write("         <link href=\"css/bootstrapp.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"js/jqueryy.js\" type=\"text/javascript\"></script>    \r\n");
      out.write("        <script src=\"js/BuscadorTabla.js\" type=\"text/javascript\"></script>\r\n");
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
      out.write("\r\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-6 d-flex mt-5 mx-auto\">\r\n");
      out.write("                <div class=\"col-md-12 ms-4\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <div class=\"col-md-10 d-flex  \"> \r\n");
      out.write("                            <button id=\"btnAñadirOrden\"  type=\"button\" class=\"btn boton mt-3 me-3\" data-bs-toggle=\"modal\" data-bs-target=\"#modalAñadirOrden\" >Registrar\r\n");
      out.write("                                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-plus-circle\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                <path d=\"M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z\"/>\r\n");
      out.write("                                <path d=\"M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z\"/>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <button id=\"btnAñadirVariasOrdenes\" type=\"button\" class=\" btn boton me-3 mt-3\" data-bs-toggle=\"modal\" data-bs-target=\"#modalAñadirVariasOrdenes\" >Registrar +Ordenes\r\n");
      out.write("                                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-plus-circle\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                <path d=\"M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z\"/>\r\n");
      out.write("                                <path d=\"M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z\"/>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <form action=\"OrdenDetalles\" method=\"post\" class=\"form-group\">\r\n");
      out.write("                                <button  class=\"boton btn mt-5\" title=\"Reporte de Producto\">\r\n");
      out.write("                                    Generar Reporte\r\n");
      out.write("                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-download\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                    <path d=\"M.5 9.9a.5.5 0 0 1 .5.5v2.5a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1v-2.5a.5.5 0 0 1 1 0v2.5a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2v-2.5a.5.5 0 0 1 .5-.5z\"/>\r\n");
      out.write("                                    <path d=\"M7.646 11.854a.5.5 0 0 0 .708 0l3-3a.5.5 0 0 0-.708-.708L8.5 10.293V1.5a.5.5 0 0 0-1 0v8.793L5.354 8.146a.5.5 0 1 0-.708.708l3 3z\"/>\r\n");
      out.write("                                    </svg>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <input type=\"hidden\" value=\"10\" name=\"opcion\">\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <label class=\"mt-3\">Buscar</label><br>\r\n");
      out.write("                        <input type=\"text\" onkeyup=\"doSearch()\" class=\"form-control col-md-3\"  id=\"buscar\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"actualizarTBody\" id=\"actualizarTBody\">\r\n");
      out.write("                        <table id=\"datos\" class=\"table text-center table-bordered border-dark table-hover table-responsive\">\r\n");
      out.write("\r\n");
      out.write("                            <tr class=\"table-dark\">\r\n");
      out.write("                                <th>Id</th>\r\n");
      out.write("                                <th>Id Orden</th>\r\n");
      out.write("                                <th>Id Detalles<br> Producto</th>\r\n");
      out.write("                                <th>Cantidad</th>\r\n");
      out.write("                                <th>Acciones</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            ");

                                OrdenDetallesVO orddetllVO = new OrdenDetallesVO();
                                OrdenDetallesDAO orddetllDAO = new OrdenDetallesDAO();

                                ArrayList<OrdenDetallesVO> listaOrdenDetalles = orddetllDAO.Listar();
                                for (int i = 0; i < listaOrdenDetalles.size(); i++) {

                                    orddetllVO = listaOrdenDetalles.get(i);

                            
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>");
      out.print(orddetllVO.getId_Orden_Detalles());
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(orddetllVO.getId_Orden());
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(orddetllVO.getId_Detalles_Producto());
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(orddetllVO.getCantidadSolicitada());
      out.write("</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <div class=\"d-flex mx-auto justify-content-center\" >\r\n");
      out.write("                                        <button data-id=\"");
      out.print(orddetllVO.getId_Orden_Detalles());
      out.write("\" data-id2=\"");
      out.print(orddetllVO.getId_Orden());
      out.write("\" data-id3=\"");
      out.print(orddetllVO.getId_Detalles_Producto());
      out.write("\" data-id4=\"");
      out.print(orddetllVO.getCantidadSolicitada());
      out.write("\"  class=\"btn boton mt-2  detalles\">\r\n");
      out.write("                                            <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-zoom-in\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path fill-rule=\"evenodd\" d=\"M6.5 12a5.5 5.5 0 1 0 0-11 5.5 5.5 0 0 0 0 11zM13 6.5a6.5 6.5 0 1 1-13 0 6.5 6.5 0 0 1 13 0z\"/>\r\n");
      out.write("                                            <path d=\"M10.344 11.742c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1 6.538 6.538 0 0 1-1.398 1.4z\"/>\r\n");
      out.write("                                            <path fill-rule=\"evenodd\" d=\"M6.5 3a.5.5 0 0 1 .5.5V6h2.5a.5.5 0 0 1 0 1H7v2.5a.5.5 0 0 1-1 0V7H3.5a.5.5 0 0 1 0-1H6V3.5a.5.5 0 0 1 .5-.5z\"/>\r\n");
      out.write("                                            </svg>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                        <button data-id5=\"");
      out.print(orddetllVO.getId_Orden_Detalles());
      out.write("\" data-id6=\"");
      out.print(orddetllVO.getId_Orden());
      out.write("\" data-id7=\"");
      out.print(orddetllVO.getId_Detalles_Producto());
      out.write("\" data-id8=\"");
      out.print(orddetllVO.getCantidadSolicitada());
      out.write("\"  class=\"btn boton ms-3 mt-2 eliminar\">\r\n");
      out.write("                                            <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-trash3\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path d=\"M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5ZM11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H2.506a.58.58 0 0 0-.01 0H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1h-.995a.59.59 0 0 0-.01 0H11Zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5h9.916Zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47ZM8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5Z\"/>\r\n");
      out.write("                                            </svg>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            ");
 }
      out.write("\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <div class=\"modal fade\" id=\"modalAñadirOrden\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog \">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h5 class=\"modal-title\" id=\"staticBackdropLabel\">Añadir Orden</h5>\r\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <div class=\"col-md-8 mx-auto\">\r\n");
      out.write("                            <form class=\"form-group\">\r\n");
      out.write("                                <div class=\"d-flex \">\r\n");
      out.write("                                    <div class=\"col-md-5\">\r\n");
      out.write("                                        <select name=\"txtIdOrden\" id=\"txtIdOrden\" class=\"form-select\">\r\n");
      out.write("                                            <option>Id Orden </option>\r\n");
      out.write("                                            ");

                                                OrdenesDAO ordDAO1 = new OrdenesDAO();
                                                for (OrdenesVO ordVO1 : ordDAO1.listar()) {
                                            
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print(ordVO1.getId_Orden());
      out.write('"');
      out.write('>');
      out.print(ordVO1.getId_Orden());
      out.write("</option>\r\n");
      out.write("                                            ");
}
      out.write("\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-md-7 ms-1\">\r\n");
      out.write("                                        <select name=\"txtIdDetallesProducto\" id=\"txtIdDetallesProducto\" class=\"form-select\">\r\n");
      out.write("                                            <option>IdDetalles Producto</option>\r\n");
      out.write("                                            ");

                                                DetallesProductoDAO dpDAO1 = new DetallesProductoDAO();
                                                for (DetallesProductoVO dpVO1 : dpDAO1.listar()) {
                                            
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print(dpVO1.getId_Detalles_Producto());
      out.write('"');
      out.write('>');
      out.print(dpVO1.getId_Detalles_Producto());
      out.write("</option>\r\n");
      out.write("                                            ");
}
      out.write("\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>       \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-8\">\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control mt-2\" name=\"txtcantidadSolicitada1\" id=\"txtcantidadSolicitada\" placeholder=\"Cantidad\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input type=\"hidden\" value=\"1\" name=\"opcion\" id=\"opcion\">\r\n");
      out.write("                                <input type=\"button\" id=\"submit\" value=\"Guardar\" class=\"btn boton mt-3\">\r\n");
      out.write("                                <div id=\"respuesta\"></div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <div class=\"modal fade\" id=\"modalAñadirVariasOrdenes\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog modal-xl modal-dialog-scrollable\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h5 class=\"modal-title\" id=\"staticBackdropLabel\">Añadir Varias Ordenes</h5>\r\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"d-flex\">\r\n");
      out.write("                                <div class=\"col-md-5 mx-auto\">\r\n");
      out.write("                                    <form class=\"form-group\">\r\n");
      out.write("                                        <div class=\"d-flex \">\r\n");
      out.write("                                            <div class=\"col-md-3\">\r\n");
      out.write("                                                <select name=\"txtIdOrden\" id=\"idOrdenLista\" class=\"form-select\">\r\n");
      out.write("                                                    <option>Id Orden </option>\r\n");
      out.write("                                                    ");

                                                        OrdenesDAO ordDAO3 = new OrdenesDAO();
                                                        for (OrdenesVO ordVO1 : ordDAO3.listar()) {
                                                    
      out.write("\r\n");
      out.write("                                                    <option value=\"");
      out.print(ordVO1.getId_Orden());
      out.write('"');
      out.write('>');
      out.print(ordVO1.getId_Orden());
      out.write("</option>\r\n");
      out.write("                                                    ");
}
      out.write("\r\n");
      out.write("                                                </select>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-5 ms-1\">\r\n");
      out.write("                                                <select name=\"txtIdDetallesProducto\" id=\"detallesProductoLista\" class=\"form-select\">\r\n");
      out.write("                                                    <option>IdDetalles Producto</option>\r\n");
      out.write("                                                    ");

                                                        DetallesProductoDAO dpDAO12 = new DetallesProductoDAO();
                                                        for (DetallesProductoVO dpVO12 : dpDAO12.listar()) {
                                                    
      out.write("\r\n");
      out.write("                                                    <option value=\"");
      out.print(dpVO12.getId_Detalles_Producto());
      out.write('"');
      out.write('>');
      out.print(dpVO12.getId_Detalles_Producto());
      out.write("</option>\r\n");
      out.write("                                                    ");
}
      out.write("\r\n");
      out.write("                                                </select>\r\n");
      out.write("                                            </div>       \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-8\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control mt-2\" name=\"txtcantidadSolicitada\" id=\"cantidadLista\" placeholder=\"Cantidad\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <input type=\"hidden\" value=\"5\" name=\"opcionLista\" id=\"opcionLista\">\r\n");
      out.write("                                        <input type=\"button\" id=\"submitVarios\" value=\"Guardar\" class=\"btn boton mt-3\">\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                    <div id=\"respuestaCargaLista\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-7 mx-auto\">\r\n");
      out.write("                                    <form>\r\n");
      out.write("                                        <button class=\"btn boton\" id=\"cargarLista\">Cargar Lista</button>\r\n");
      out.write("                                        <input type=\"hidden\" id=\"opcionCargarLista\" value=\"12\">\r\n");
      out.write("                                    </form>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"contenerdorLista\" id=\"contenerdorLista\">\r\n");
      out.write("                                        <table class=\"table text-center table-bordered border-dark table-hover table-responsive\">\r\n");
      out.write("                                            <thead>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>Num.</th>\r\n");
      out.write("                                                    <th>Id Orden</th>\r\n");
      out.write("                                                    <th>Id Detalles<br> Producto</th>\r\n");
      out.write("                                                    <th>Cantidad</th>\r\n");
      out.write("                                                    <th>Acciones</th>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </thead>\r\n");
      out.write("                                            <tbody id=\"tabla\">\r\n");
      out.write("                                            </tbody>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <div class=\"modal fade\" id=\"editarProductoModal\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header \">\r\n");
      out.write("                        <h5 class=\"modal-title\" id=\"staticBackdropLabel\">Editar Orden</h5>\r\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <div class=\"col-md-8 mx-auto justify-content-center\">\r\n");
      out.write("\r\n");
      out.write("                            <form>\r\n");
      out.write("                                <label class=\"text-center\">Id Orden</label>\r\n");
      out.write("                                <label id=\"idOrdenEdit\"></label>\r\n");
      out.write("                                <div class=\"d-flex col-md-12\">\r\n");
      out.write("                                    <div class=\"col-md-6\">\r\n");
      out.write("                                        <select id=\"idDetallesProEdit\" class=\"form-select\">\r\n");
      out.write("                                            <option id=\"opcionDetallesProEdit\"></option>\r\n");
      out.write("                                            ");

                                                DetallesProductoDAO dpDAOedit = new DetallesProductoDAO();
                                                for (DetallesProductoVO dpVOedit : dpDAOedit.listar()) {
                                            
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print(dpVOedit.getId_Detalles_Producto());
      out.write('"');
      out.write('>');
      out.print(dpVOedit.getId_Detalles_Producto());
      out.write("</option>\r\n");
      out.write("                                            ");
}
      out.write("\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-md-6\">\r\n");
      out.write("                                        <select id=\"idOrdenesEdit\" class=\"form-select\">\r\n");
      out.write("                                            <option id=\"opcionOrdenEdit\" ></option>\r\n");
      out.write("                                            ");

                                                OrdenesDAO ordDAOedit = new OrdenesDAO();
                                                for (OrdenesVO ordVOedit : ordDAOedit.listar()) {
                                            
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print(ordVOedit.getId_Orden());
      out.write('"');
      out.write('>');
      out.print(ordVOedit.getId_Orden());
      out.write("</option>\r\n");
      out.write("                                            ");
}
      out.write("\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input type=\"hidden\" value=\"2\" name=\"opcion\" id=\"opcionEdit\">\r\n");
      out.write("                                <label>Cantidad</label><br>\r\n");
      out.write("                                <input id=\"cantidadEdit\" type=\"text\" required class=\"form-control\">\r\n");
      out.write("                                <input type=\"button\" id=\"submitEdit\" value=\"Editar\" class=\"btn boton d-inline-block mx-auto ms-5 justify-content-center mt-3\"> \r\n");
      out.write("\r\n");
      out.write("                            </form>\r\n");
      out.write("                            <div id=\"respuestaEdit\"></div>\r\n");
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
      out.write("                        <div class=\"col-md-8 mx-auto\">\r\n");
      out.write("                            <h5 class=\"text-center text-danger mb-5\" id=\"staticBackdropLabel\">¿Esta seguro que desea Eliminar este Producto?</h5>\r\n");
      out.write("                            <table class=\"table table-hover table-light table-responsive text-center\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th>Id</th>\r\n");
      out.write("                                        <th>Id Orden</th>\r\n");
      out.write("                                        <th>Id Detalles<br> Producto</th>\r\n");
      out.write("                                        <th>Cantidad</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td id=\"idDel\"></td>\r\n");
      out.write("                                        <td id=\"idOrdenDel\"></td>\r\n");
      out.write("                                        <td id=\"idOrdenDetallesDel\"></td>\r\n");
      out.write("                                        <td id=\"CantidadDel\"></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                            <form>\r\n");
      out.write("                                <input type=\"hidden\" value=\"3\" id=\"opcioneDel\">\r\n");
      out.write("                                <input type=\"button\" id=\"submitDel\" value=\"Eliminar\" class=\"btn btn-danger d-inline-block mx-auto ms-5 justify-content-center mt-3\"> \r\n");
      out.write("                                <div id=\"respuestaDel\"></div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"responseDel\" class=\"col-md-12 mx-auto justify-content-center\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-latest.js\"></script>\r\n");
      out.write("        <script src=\"js/JS/ControladorOrdenes.js\"></script>\r\n");
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
