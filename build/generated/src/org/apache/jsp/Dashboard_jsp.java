package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.RolVO;
import ModeloDAO.RolDAO;
import ModeloVO.Usuario_rolVO;
import ModeloDAO.UsuarioRolDAO;
import ModeloVO.UsuarioVO;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");

    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-control", "no-cache, no-store, must-revalidate");
    response.setDateHeader("Expires", 0);

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    HttpSession buscarSesion = (HttpSession) request.getSession();
    UsuarioVO usuVO1 = null;
    RolVO rolVO1 = null;

    if (buscarSesion.getAttribute("datosUsuario") == null) {
        request.getRequestDispatcher("iniciarSesion.jsp").forward(request, response);
    } else {
        UsuarioRolDAO uRDAO = new UsuarioRolDAO();
        usuVO1 = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");

         rolVO1 = (RolVO) buscarSesion.getAttribute("datosRol");
        

    }


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Required meta tags -->\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <title>SuiteFactor Dashboard</title>\r\n");
      out.write("        <!-- plugins:css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Dashboard/assets/vendors/mdi/css/materialdesignicons.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Dashboard/assets/vendors/css/vendor.bundle.base.css\">\r\n");
      out.write("        <!-- endinject -->\r\n");
      out.write("        <!-- Plugin css for this page -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Dashboard/assets/vendors/jvectormap/jquery-jvectormap.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Dashboard/assets/vendors/flag-icon-css/css/flag-icon.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Dashboard/assets/vendors/owl-carousel-2/owl.carousel.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Dashboard/assets/vendors/owl-carousel-2/owl.theme.default.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- End plugin css for this page -->\r\n");
      out.write("        <!-- inject:css -->\r\n");
      out.write("        <!-- endinject -->\r\n");
      out.write("        <!-- Layout styles -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Dashboard/assets/css/style.css\">\r\n");
      out.write("        <!-- End layout styles -->\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Dashboard/assets/images/favicon.png\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-scroller\">\r\n");
      out.write("            <!-- partial:partials/_sidebar.html -->\r\n");
      out.write("            <nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\r\n");
      out.write("                <div class=\"sidebar-brand-wrapper d-none d-lg-flex align-items-center justify-content-center fixed-top\">\r\n");
      out.write("                    <a class=\"sidebar-brand brand-logo\" href=\"index.html\"><img src=\"Dashboard/assets/images/logoLogin.svg\" alt=\"logo SuiteFactor\" /></a>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"nav\">\r\n");
      out.write("                    <li class=\"nav-item profile\">\r\n");
      out.write("                        <div class=\"profile-desc\">\r\n");
      out.write("                            <div class=\"profile-pic\">\r\n");
      out.write("                                <div class=\"profile-name\">\r\n");
      out.write("                                    <h5 class=\"mb-0 font-weight-normal\">");
      out.print(usuVO1.getNombre());
      out.write("</h5>\r\n");
      out.write("                                    <span>");
      out.print(rolVO1.getRoltipo());
      out.write("</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"nav-item menu-items\">\r\n");
      out.write("                        <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#usuarios\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\r\n");
      out.write("                            <span class=\"menu-icon\">\r\n");
      out.write("                                <i class=\"mdi mdi-laptop\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <span class=\"menu-title\">Usuarios</span>\r\n");
      out.write("                            <i class=\"menu-arrow\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"collapse\" id=\"usuarios\">\r\n");
      out.write("                            <ul class=\"nav flex-column sub-menu\">\r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link btn\" id=\"UsuariosView\">Usuarios</a></li>\r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link btn\" id=\"RolesView\">Roles de usuario</a></li>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"nav-item menu-items\">\r\n");
      out.write("                        <a class=\"nav-link btn\" id=\"OrdenesView\">\r\n");
      out.write("                            <span class=\"menu-icon\">\r\n");
      out.write("                                <i class=\"mdi mdi-file-document-box\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <span class=\"menu-title\">Orden producción</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"nav-item menu-items\">\r\n");
      out.write("                        <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#productos\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\r\n");
      out.write("                            <span class=\"menu-icon\">\r\n");
      out.write("                                <i class=\"mdi mdi-laptop\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <span class=\"menu-title\">Productos</span>\r\n");
      out.write("                            <i class=\"menu-arrow\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"collapse\" id=\"productos\">\r\n");
      out.write("                            <ul class=\"nav flex-column sub-menu\">\r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link btn\" id=\"ProductoView\">Productos</a></li>\r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link btn\" id=\"DetallesProductoView\">Detalles del producto</a></li>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"nav-item menu-items\">\r\n");
      out.write("                        <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#ui-basic\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\r\n");
      out.write("                            <span class=\"menu-icon\">\r\n");
      out.write("                                <i class=\"mdi mdi-laptop\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <span class=\"menu-title\">Materia Prima</span>\r\n");
      out.write("                            <i class=\"menu-arrow\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"collapse\" id=\"ui-basic\">\r\n");
      out.write("                            <ul class=\"nav flex-column sub-menu\">\r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link btn\" id=\"MateriaPrimaView\">Materia prima</a></li>\r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link btn\" id=\"ExistenciasView\">Existencias</a></li>\r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link btn\" id=\"LoteMateriaPrimaView\">Lote de materia prima</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"nav-item menu-items\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("                            <span class=\"menu-icon\">\r\n");
      out.write("                                <i class=\"mdi mdi-file-document-box\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <span class=\"menu-title\">Documentation</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <!-- partial -->\r\n");
      out.write("            <div class=\"container-fluid page-body-wrapper\">\r\n");
      out.write("                <!-- partial:partials/_navbar.html -->\r\n");
      out.write("                <nav class=\"navbar p-0 fixed-top d-flex flex-row\">\r\n");
      out.write("                    <div class=\"navbar-menu-wrapper flex-grow d-flex align-items-stretch\" style=\"background-color: #fff;\">\r\n");
      out.write("                        <button class=\"navbar-toggler navbar-toggler align-self-center\" type=\"button\" data-toggle=\"minimize\">\r\n");
      out.write("                            <span class=\"mdi mdi-menu\"></span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <ul class=\"navbar-nav navbar-nav-right\">\r\n");
      out.write("                            <li class=\"nav-item dropdown d-none d-lg-block\">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown preview-list\" aria-labelledby=\"createbuttonDropdown\">\r\n");
      out.write("                                    <h6 class=\"p-3 mb-0\">Projects</h6>\r\n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                    <a class=\"dropdown-item preview-item\">\r\n");
      out.write("                                        <div class=\"preview-thumbnail\">\r\n");
      out.write("                                            <div class=\"preview-icon bg-dark rounded-circle\">\r\n");
      out.write("                                                <i class=\"mdi mdi-file-outline text-primary\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"preview-item-content\">\r\n");
      out.write("                                            <p class=\"preview-subject ellipsis mb-1\">Software Development</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                    <a class=\"dropdown-item preview-item\">\r\n");
      out.write("                                        <div class=\"preview-thumbnail\">\r\n");
      out.write("                                            <div class=\"preview-icon bg-dark rounded-circle\">\r\n");
      out.write("                                                <i class=\"mdi mdi-web text-info\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"preview-item-content\">\r\n");
      out.write("                                            <p class=\"preview-subject ellipsis mb-1\">UI Development</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                    <a class=\"dropdown-item preview-item\">\r\n");
      out.write("                                        <div class=\"preview-thumbnail\">\r\n");
      out.write("                                            <div class=\"preview-icon bg-dark rounded-circle\">\r\n");
      out.write("                                                <i class=\"mdi mdi-layers text-danger\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"preview-item-content\">\r\n");
      out.write("                                            <p class=\"preview-subject ellipsis mb-1\">Software Testing</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                    <p class=\"p-3 mb-0 text-center\">See all projects</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item dropdown\">\r\n");
      out.write("                                <a class=\"nav-link\" id=\"profileDropdown\" href=\"#\" data-toggle=\"dropdown\">\r\n");
      out.write("                                    <div class=\"navbar-profile\">\r\n");
      out.write("                                        <p class=\"mb-0 d-none d-sm-block navbar-profile-name\">");
      out.print(usuVO1.getNombre());
      out.write("</p>\r\n");
      out.write("                                        <i class=\"mdi mdi-menu-down d-none d-sm-block\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown preview-list\" aria-labelledby=\"profileDropdown\">\r\n");
      out.write("                                    <h6 class=\"p-3 mb-0\">");
      out.print(rolVO1.getRoltipo());
      out.write("</h6>\r\n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-item preview-item\">\r\n");
      out.write("                                        <div class=\"preview-thumbnail\">\r\n");
      out.write("                                            <div class=\"preview-icon bg-dark rounded-circle\">\r\n");
      out.write("                                                <i class=\"mdi mdi-onepassword text-info\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"preview-item-content\">\r\n");
      out.write("                                            <p class=\"preview-subject ellipsis mb-1 text-small\">Cambiar contraseña</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                    <a class=\"dropdown-item preview-item\">\r\n");
      out.write("                                        <div class=\"preview-thumbnail\">\r\n");
      out.write("                                            <div class=\"preview-icon bg-dark rounded-circle\">\r\n");
      out.write("                                                <i class=\"mdi mdi-logout text-danger\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"preview-item-content\">\r\n");
      out.write("                                            <p class=\"preview-subject mb-1\">Salir</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <button class=\"navbar-toggler navbar-toggler-right d-lg-none align-self-center\" type=\"button\" data-toggle=\"offcanvas\">\r\n");
      out.write("                            <span class=\"mdi mdi-format-line-spacing\"></span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("                <!-- partial -->\r\n");
      out.write("                <div class=\"main-panel\">\r\n");
      out.write("                    <div class=\"content-wrapper\">\r\n");
      out.write("                        <div class=\"row\">  \r\n");
      out.write("                            <div class=\"col-md-12 grid-margin\">\r\n");
      out.write("                                <div class=\"card-body\" id=\"CargarVistas\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!-- content-wrapper ends -->\r\n");
      out.write("                    <!-- partial:partials/_footer.html -->\r\n");
      out.write("                    <footer class=\"footer\">\r\n");
      out.write("                        <div class=\"d-sm-flex justify-content-center justify-content-sm-between\">\r\n");
      out.write("                            <span class=\"text-muted d-block text-center text-sm-left d-sm-inline-block\">Copyright &copy; 2022</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </footer>\r\n");
      out.write("                    <!-- partial -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- main-panel ends -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- page-body-wrapper ends -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- container-scroller -->\r\n");
      out.write("        <!-- plugins:js -->\r\n");
      out.write("        <script src=\"Dashboard/assets/vendors/js/vendor.bundle.base.js\"></script>\r\n");
      out.write("        <!-- endinject -->\r\n");
      out.write("        <!-- Plugin js for this page -->\r\n");
      out.write("        <script src=\"Dashboard/assets/vendors/chart.js/Chart.min.js\"></script>\r\n");
      out.write("        <script src=\"Dashboard/assets/vendors/progressbar.js/progressbar.min.js\"></script>\r\n");
      out.write("        <script src=\"Dashboard/assets/vendors/jvectormap/jquery-jvectormap.min.js\"></script>\r\n");
      out.write("        <script src=\"Dashboard/assets/vendors/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\r\n");
      out.write("        <script src=\"Dashboard/assets/vendors/owl-carousel-2/owl.carousel.min.js\"></script>\r\n");
      out.write("        <!-- End plugin js for this page -->\r\n");
      out.write("        <!-- inject:js -->\r\n");
      out.write("        <script src=\"Dashboard/assets/js/off-canvas.js\"></script>\r\n");
      out.write("        <script src=\"Dashboard/assets/js/hoverable-collapse.js\"></script>\r\n");
      out.write("        <script src=\"Dashboard/assets/js/misc.js\"></script>\r\n");
      out.write("        <script src=\"Dashboard/assets/js/settings.js\"></script>\r\n");
      out.write("        <script src=\"Dashboard/assets/js/todolist.js\"></script>\r\n");
      out.write("        <!-- endinject -->\r\n");
      out.write("        <!-- Custom js for this page -->\r\n");
      out.write("        <script src=\"Dashboard/assets/js/dashboard.js\"></script>\r\n");
      out.write("        <!-- End custom js for this page -->\r\n");
      out.write("        <script src=\"js/JS/ControladorDashboard.js\"></script>\r\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-latest.js\"></script>\r\n");
      out.write("        <script src=\"js/ScriptPaginacion/jquery-2.1.3.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" charset=\"utf8\" src=\"https://cdn.datatables.net/1.12.1/js/jquery.dataTables.js\"></script>\r\n");
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
