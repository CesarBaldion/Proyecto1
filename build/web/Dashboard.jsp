
<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.Usuario_rolVO"%>
<%@page import="ModeloDAO.UsuarioRolDAO"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-control", "no-cache, no-store, must-revalidate");
    response.setDateHeader("Expires", 0);
%>


<%
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

%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>SuiteFactor Dashboard</title>
        <!-- plugins:css -->
        <link rel="stylesheet" href="Dashboard/assets/vendors/mdi/css/materialdesignicons.min.css">
        <link rel="stylesheet" href="Dashboard/assets/vendors/css/vendor.bundle.base.css">
        <!-- endinject -->
        <!-- Plugin css for this page -->
        <link rel="stylesheet" href="Dashboard/assets/vendors/jvectormap/jquery-jvectormap.css">
        <link rel="stylesheet" href="Dashboard/assets/vendors/flag-icon-css/css/flag-icon.min.css">
        <link rel="stylesheet" href="Dashboard/assets/vendors/owl-carousel-2/owl.carousel.min.css">
        <link rel="stylesheet" href="Dashboard/assets/vendors/owl-carousel-2/owl.theme.default.min.css">

        <!-- End plugin css for this page -->
        <!-- inject:css -->
        <!-- endinject -->
        <!-- Layout styles -->
        <link rel="stylesheet" href="Dashboard/assets/css/style.css">
        <!-- End layout styles -->
        <link rel="shortcut icon" href="Dashboard/assets/images/favicon.png" />
    </head>
    <body>
        <div class="container-scroller">
            <!-- partial:partials/_sidebar.html -->
            <nav class="sidebar sidebar-offcanvas" id="sidebar">
                <div class="sidebar-brand-wrapper d-none d-lg-flex align-items-center justify-content-center fixed-top">
                    <a class="sidebar-brand brand-logo" href="index.html"><img src="Dashboard/assets/images/logoLogin.svg" alt="logo SuiteFactor" /></a>

                </div>
                <ul class="nav">
                    <li class="nav-item profile">
                        <div class="profile-desc">
                            <div class="profile-pic">
                                <div class="profile-name">
                                    <h5 class="mb-0 font-weight-normal"><%=usuVO1.getNombre()%></h5>
                                    <span><%=rolVO1.getRoltipo()%></span>
                                </div>
                            </div>
                    </li>

                    <li class="nav-item menu-items">
                        <a class="nav-link" data-toggle="collapse" href="#usuarios" aria-expanded="false" aria-controls="ui-basic">
                            <span class="menu-icon">
                                <i class="mdi mdi-laptop"></i>
                            </span>
                            <span class="menu-title">Usuarios</span>
                            <i class="menu-arrow"></i>
                        </a>
                        <div class="collapse" id="usuarios">
                            <ul class="nav flex-column sub-menu">
                                <li class="nav-item"> <a class="nav-link btn" id="UsuariosView">Usuarios</a></li>
                                <li class="nav-item"> <a class="nav-link btn" id="RolesView">Roles de usuario</a></li>

                            </ul>
                        </div>
                    </li>


                    <li class="nav-item menu-items">
                        <a class="nav-link btn" id="OrdenesView">
                            <span class="menu-icon">
                                <i class="mdi mdi-file-document-box"></i>
                            </span>
                            <span class="menu-title">Orden producción</span>
                        </a>
                    </li>



                    <li class="nav-item menu-items">
                        <a class="nav-link" data-toggle="collapse" href="#productos" aria-expanded="false" aria-controls="ui-basic">
                            <span class="menu-icon">
                                <i class="mdi mdi-laptop"></i>
                            </span>
                            <span class="menu-title" id="ProductoView">Productos</span>
                        </a>
                    </li>

                    <li class="nav-item menu-items">
                        <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
                            <span class="menu-icon">
                                <i class="mdi mdi-laptop"></i>
                            </span>
                            <span class="menu-title">Materia Prima</span>
                            <i class="menu-arrow"></i>
                        </a>
                        <div class="collapse" id="ui-basic">
                            <ul class="nav flex-column sub-menu">
                                <li class="nav-item"> <a class="nav-link btn" id="MateriaPrimaView">Materia prima</a></li>
                                <li class="nav-item"> <a class="nav-link btn" id="ExistenciasView">Existencias</a></li>
                                <li class="nav-item"> <a class="nav-link btn" id="LoteMateriaPrimaView">Lote de materia prima</a></li>
                            </ul>
                        </div>
                    </li>
                </ul>
            </nav>
            <!-- partial -->
            <div class="container-fluid page-body-wrapper">
                <!-- partial:partials/_navbar.html -->
                <nav class="navbar p-0 fixed-top d-flex flex-row">
                    <div class="navbar-menu-wrapper flex-grow d-flex align-items-stretch" style="background-color: #fff;">
                        <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
                            <span class="mdi mdi-menu"></span>
                        </button>
                        <ul class="navbar-nav navbar-nav-right">
                            
                            <li class="nav-item dropdown">
                                <a class="nav-link" id="profileDropdown" href="#" data-toggle="dropdown">
                                    <div class="navbar-profile">
                                        <p class="mb-0 d-none d-sm-block navbar-profile-name"><%=usuVO1.getNombre()%></p>
                                        <i class="mdi mdi-menu-down d-none d-sm-block"></i>
                                    </div>
                                </a>
                                <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list" aria-labelledby="profileDropdown">
                                    <h6 class="p-3 mb-0"><%=rolVO1.getRoltipo()%></h6>
                                    <div class="dropdown-divider"></div>
                                    <a href="#" class="dropdown-item preview-item">
                                        <div class="preview-thumbnail">
                                            <div class="preview-icon bg-dark rounded-circle">
                                                <i class="mdi mdi-onepassword text-info"></i>
                                            </div>
                                        </div>
                                        <div class="preview-item-content">
                                            <p class="preview-subject ellipsis mb-1 text-small">Cambiar contraseña</p>
                                        </div>
                                    </a>

                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item preview-item">
                                        <div class="preview-thumbnail">
                                            <div class="preview-icon bg-dark rounded-circle">
                                                <i class="mdi mdi-logout text-danger"></i>
                                            </div>
                                        </div>
                                        <div class="preview-item-content">
                                            <p class="preview-subject mb-1">Salir</p>
                                        </div>
                                    </a>

                            </li>
                        </ul>
                        <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
                            <span class="mdi mdi-format-line-spacing"></span>
                        </button>
                    </div>
                </nav>
                <!-- partial -->
                <div class="main-panel">
                    <div class="content-wrapper">
                        <div class="row">  
                            <div class="col-md-12 grid-margin">
                                <div class="card-body" id="CargarVistas">

                                </div>
                            </div>
                        </div>
                    </div>


                    <!-- content-wrapper ends -->
                    <!-- partial:partials/_footer.html -->
                    <footer class="footer">
                        <div class="d-sm-flex justify-content-center justify-content-sm-between">
                            <span class="text-muted d-block text-center text-sm-left d-sm-inline-block">Copyright &copy; 2022</span>
                        </div>
                    </footer>
                    <!-- partial -->
                </div>
                <!-- main-panel ends -->
            </div>
            <!-- page-body-wrapper ends -->
        </div>
        <!-- container-scroller -->
        <!-- plugins:js -->
        <script src="Dashboard/assets/vendors/js/vendor.bundle.base.js"></script>
        <!-- endinject -->
        <!-- Plugin js for this page -->
        <script src="Dashboard/assets/vendors/chart.js/Chart.min.js"></script>
        <script src="Dashboard/assets/vendors/progressbar.js/progressbar.min.js"></script>
        <script src="Dashboard/assets/vendors/jvectormap/jquery-jvectormap.min.js"></script>
        <script src="Dashboard/assets/vendors/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
        <script src="Dashboard/assets/vendors/owl-carousel-2/owl.carousel.min.js"></script>
        <!-- End plugin js for this page -->
        <!-- inject:js -->
        <script src="Dashboard/assets/js/off-canvas.js"></script>
        <script src="Dashboard/assets/js/hoverable-collapse.js"></script>
        <script src="Dashboard/assets/js/misc.js"></script>
        <script src="Dashboard/assets/js/settings.js"></script>
        <script src="Dashboard/assets/js/todolist.js"></script>
        <!-- endinject -->
        <!-- Custom js for this page -->
        <script src="Dashboard/assets/js/dashboard.js"></script>
        <!-- End custom js for this page -->
        <script src="js/JS/ControladorDashboard.js"></script>
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script src="js/ScriptPaginacion/jquery-2.1.3.js"></script>
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.js"></script>
    </body>
</html>