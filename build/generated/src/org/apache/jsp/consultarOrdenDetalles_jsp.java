package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.Usuario_rolVO;
import ModeloDAO.UsuarioRolDAO;
import ModeloVO.UsuarioVO;
import java.util.ArrayList;
import ModeloDAO.OrdenDetallesDAO;
import ModeloVO.OrdenDetallesVO;

public final class consultarOrdenDetalles_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/sesionesAlmacenista.jsp");
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-control", "no-cache, no-store, must-revalidate");
    response.setDateHeader("Expires", 0);

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    HttpSession buscarSesion = (HttpSession) request.getSession();
    UsuarioVO usuVO1 = null;
    if (buscarSesion.getAttribute("datosUsuario") == null) {

        request.getRequestDispatcher("iniciarSesion.jsp").forward(request, response);

    } else {
        UsuarioRolDAO uRDAO = new UsuarioRolDAO();
        usuVO1 = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
        Usuario_rolVO uRVO2 = uRDAO.consultarRol(usuVO1.getIdUsuarios());
        String id = uRVO2.getId_Rol();
        if (id.equals("2") || id.equals("1") || id.equals("3")) {

        } else {
            request.getRequestDispatcher("errorPermisos.jsp").forward(request, response);

        }

    }


      out.write('\r');
      out.write('\n');
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"col-md-4 justify-content-center mx-auto mt-4\">\r\n");
      out.write("            <h1 class=\"text-center\">Orden Detalles</h1>\r\n");
      out.write("            <div class=\"col-md-6 mx-auto \">\r\n");
      out.write("                <form method=\"post\" action=\"OrdenDetalles\" class=\"form-group\">\r\n");
      out.write("                    <input type=\"text\" name=\"txtIdOrdenDetalles\" placeholder=\"Id Orden Detalles\" class=\"form-control\">\r\n");
      out.write("                    <input type=\"hidden\" value=\"4\" name=\"opcion\">\r\n");
      out.write("                    <button class=\"btn\">Consultar</button>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("                <div class=\"mensaje\">\r\n");
      out.write("                    ");

                        if (request.getAttribute("mensajeError") != null) {
      out.write("\r\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-md-9 mx-auto justify-content-center mt-4\">\r\n");
      out.write("            <div class=\"col-md-7 mx-auto justify-content-center\">\r\n");
      out.write("                <table class=\"table table-light table-hover table-striped text-center\">\r\n");
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>Id</th>\r\n");
      out.write("                        <th>Id Orden</th>\r\n");
      out.write("                        <th>Id Detalles Producto</th>\r\n");
      out.write("                        <th>Cantidad Solicitada</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");

                        OrdenDetallesVO OrdenDetallVO = new OrdenDetallesVO();
                        OrdenDetallesDAO OrdenDetallDAO = new OrdenDetallesDAO(OrdenDetallVO);

                        ArrayList<OrdenDetallesVO> listaOrdenDetalles = OrdenDetallDAO.Listar();

                        for (int i = 0; i < listaOrdenDetalles.size(); i++) {

                            OrdenDetallVO = listaOrdenDetalles.get(i);

                    
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>");
      out.print(OrdenDetallVO.getId_Orden_Detalles());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(OrdenDetallVO.getId_Orden());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(OrdenDetallVO.getId_Detalles_Producto());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(OrdenDetallVO.getCantidadSolicitada());
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
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
