<%-- 
    Document   : menu
    Created on : 3/03/2022, 09:40:36 PM
    Author     : Juan Pablo
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%    HttpSession buscarSesion = (HttpSession) request.getSession();
%>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- OG Meta Tags to improve the way the post looks when you share the page on LinkedIn, Facebook, Google+ -->
        <meta property="og:site_name" content="" /> <!-- website name -->
        <meta property="og:site" content="" /> <!-- website link -->
        <meta property="og:title" content="" /> <!-- title shown in the actual shared post -->
        <meta property="og:description" content="" /> <!-- description shown in the actual shared post -->
        <meta property="og:image" content="" /> <!-- image link, make sure it's jpg -->
        <meta property="og:url" content="" /> <!-- where do you want your post to link to -->
        <meta property="og:type" content="article" />

        <!-- Website Title -->
        <title>SuiteFactor</title>

        <!-- Estilos -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,400i,700&display=swap&subset=latin-ext"
              rel="stylesheet">
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/fontawesome-all.css" rel="stylesheet">
        <link href="css/swiper.css" rel="stylesheet">
        <link href="css/magnific-popup.css" rel="stylesheet">
        <link href="css/menu.css" rel="stylesheet">

        <!-- Icono  -->
        <link rel="icon" href="img/menu/logoPeque.png">
        <title>Menu</title>
    </head>

    <body data-spy="scroll" data-target=".fixed-top">

        <!-- Preloader -->
        <div class="spinner-wrapper">
            <div class="spinner">
                <div class="bounce1"></div>
                <div class="bounce2"></div>
                <div class="bounce3"></div>
            </div>
        </div>
        <!-- end of preloader -->


        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-dark navbar-custom fixed-top">
            <div class="container">

                <!-- Text Logo - Use this if you don't have a graphic logo -->
                <!-- <a class="navbar-brand logo-text page-scroll" href="index.html">Tivo</a> -->

                <!-- Image Logo -->
                <a class="navbar-brand logo-image" href="index.jsp"><img src="img/menu/logo.svg" alt="alternative"
                                                                         height="100"></a>

                <!-- Mobile Menu Toggle Button -->
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault"
                        aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-awesome fas fa-bars"></span>
                    <span class="navbar-toggler-awesome fas fa-times"></span>
                </button>
                <!-- end of mobile menu toggle button -->

                <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <a class="nav-link page-scroll" href="#header">INICIO <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link page-scroll" href="#details">SUITEFACTOR</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link page-scroll" href="#modules">MÓDULOS</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link page-scroll" href="#functions">FUNCIONALIDADES</a>
                        </li>

                        <!-- Dropdown Menu -->
                        <!-- <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle page-scroll" href="#video" id="navbarDropdown" role="button" aria-haspopup="true" aria-expanded="false">VIDEO</a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="article-details.html"><span class="item-text">ARTICLE DETAILS</span></a>
                                <div class="dropdown-items-divide-hr"></div>
                                <a class="dropdown-item" href="terms-conditions.html"><span class="item-text">TERMS CONDITIONS</span></a>
                                <div class="dropdown-items-divide-hr"></div>
                                <a class="dropdown-item" href="privacy-policy.html"><span class="item-text">PRIVACY POLICY</span></a>
                            </div>
                        </li> -->
                        <!-- end of dropdown menu -->

                        <li class="nav-item">
                            <a class="nav-link page-scroll" href="#advantages">VENTAJAS</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link page-scroll" href="#contact-us">CONTÁCTENOS</a>
                        </li>
                    </ul>
                    <%if (buscarSesion.getAttribute("datosUsuario") == null) {%>
                    <span class="nav-item">
                        <a class="btn-outline-sm" href="iniciarSesion.jsp">INICIAR SESIÓN</a>
                    </span>
                    <% } else {%>
                    <span class="nav-item">
                        <form method="post" action="Sesiones" name="CerrarSesion">
                            <input type="hidden" value="1" name="opcion">
                        </form>
                        <a class="btn-outline-sm" href="#" id="btnCerrarSesion">CERRAR SESIÓN</a>
                    </span>
                    <% }%>
                </div>
            </div> <!-- end of container -->
        </nav> <!-- end of navbar -->
        <!-- end of navigation -->
        <!-- Header -->
        <header id="header" class="header">
            <div class="header-content">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-6 col-xl-5">
                            <div class="text-container">
                                <h1>Automatización de insumos para la producción</h1>
                                <p class="p-large">
                                    Permite la organización de insumos para la fabricación y la actualización constante de materia prima en el inventario
                                </p>
                                <a class="btn-solid-lg page-scroll" href="iniciarSesion.jsp">REGISTRO</a>
                            </div> <!-- end of text-container -->
                        </div> <!-- end of col -->
                        <div class="col-lg-6 col-xl-7">
                            <div class="image-container">
                                <div class="img-wrapper">
                                    <img class="img-fluid" src="img/menu/header.svg" alt="alternative">
                                </div> <!-- end of img-wrapper -->
                            </div> <!-- end of image-container -->
                        </div> <!-- end of col -->
                    </div> <!-- end of row -->
                </div> <!-- end of container -->
            </div> <!-- end of header-content -->
        </header> <!-- end of header -->
        <svg class="header-frame" data-name="Layer 1" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="none"
             viewBox="0 0 1920 310">
        <defs>
        <style>
            .cls-1 {
                fill: #A7E6F2;
            }
        </style>
        </defs>
        <title>header-frame</title>
        <path class="cls-1"
              d="M0,283.054c22.75,12.98,53.1,15.2,70.635,14.808,92.115-2.077,238.3-79.9,354.895-79.938,59.97-.019,106.17,18.059,141.58,34,47.778,21.511,47.778,21.511,90,38.938,28.418,11.731,85.344,26.169,152.992,17.971,68.127-8.255,115.933-34.963,166.492-67.393,37.467-24.032,148.6-112.008,171.753-127.963,27.951-19.26,87.771-81.155,180.71-89.341,72.016-6.343,105.479,12.388,157.434,35.467,69.73,30.976,168.93,92.28,256.514,89.405,100.992-3.315,140.276-41.7,177-64.9V0.24H0V283.054Z" />
        </svg>
        <!-- end of header -->
        <!-- Mejoramos el manejo de los insumos utilizados en la
        producción del área textil para un mejor uso de estos, sin desperdicios, pedidos de material
        de más, insumos desaparecidos y todo problema que se pueda presetar. -->

        <!-- Details -->
        <div id="details" class="basic-1">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6">
                        <div class="text-container">
                            <div class="left-heading">Acerca de SuiteFactor</div><br>
                            <h2>Plataforma capaz de mejorar la productividad en el manejo de los insumos</h2>
                            <p>Gestiona la materia prima para una mayor optimización en la producción del área téxtil de su empresa, fácilitando y optimizando el tiempo de respuesta en sus procesos de producción ayudando a cumplir 
                                sus objetivos.</p>
                            <ul class="list-unstyled li-space-lg">
                                <li class="media">
                                    <i class="fas fa-square"></i>
                                    <div class="media-body">Gestionamos su inventario en tiempo real para mantenerlo actualizado acerca de sus insumos activos en cada momento</div>
                                </li>
                            </ul>
                        </div> <!-- end of text-container -->
                    </div> <!-- end of col -->
                    <div class="col-lg-6">
                        <div class="image-container">
                            <img class="img-fluid" src="img/menu/2668383.svg" alt="alternative">
                        </div> <!-- end of image-container -->
                    </div> <!-- end of col -->
                </div> <!-- end of row -->
            </div> <!-- end of container -->
        </div> <!-- end of basic-1 -->
        <!-- end of details -->

        <!-- Description -->
        <div id="modules" class="tabs">
            <div class="cards-1">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="above-heading">MÓDULOS DE SUITEFACTOR</div>
                            <h2 class="h2-heading">Módulos</h2><br>
                        </div> <!-- end of col -->
                    </div> <!-- end of row -->
                    <div class="row">
                        <div class="col-lg-12">

                            <!-- Card -->
                            <!-- <div class="card">
                            <div class="card-image">
                                <img class="img-fluid" src="images/Modulo1.png" alt="alternative">
                            </div>
                            <div class="card-body">
                                <h4 class="card-title">Calculadora</h4>
                                <p></p>
                            </div>
                        </div> -->
                            <!-- end of card -->

                            <!-- Card -->
                            <div class="card">
                                <div class="card-image">
                                    <img class="img-fluid" src="img/menu/Modulo2.png" alt="alternative">
                                </div>
                                <div class="card-body">
                                    <h4 class="card-title">Producción</h4>
                                    <p>Mejora la elaboración de sus productos y la organización de estos gracias al cálculo
                                        del consumo de su materia prima y el uso inteligente de ésta.</p>
                                </div>
                            </div>
                            <!-- end of card -->

                            <!-- Card -->
                            <div class="card">
                                <div class="card-image">
                                    <img class="img-fluid" src="img/menu/Modulo3.png" alt="alternative">
                                </div>
                                <div class="card-body">
                                    <h4 class="card-title">Inventario</h4>
                                    <p>Obtenga una mejor organización de los insumos que utiliza para la fabricación de sus
                                        productos
                                        gracias al sistema de actualización constante de materia prima en el inventario.
                                    </p>
                                </div>
                            </div>
                            <!-- end of card -->

                        </div> <!-- end of col -->
                    </div> <!-- end of row -->
                </div> <!-- end of container -->
            </div> <!-- end of cards-1 -->
        </div>
        <!-- end of description -->


        <!-- Functions -->
        <div id="functions" class="cards-2">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="above-heading">FUNCIONALIDADES DE SUITEFACTOR</div>
                        <h2 class="h2-heading">Funcionalidades</h2>
                    </div> <!-- end of col -->
                </div> <!-- end of row -->
                <div class="row">
                    <div class="col-lg-12">

                        <!-- Card-->
                        <div class="card">
                            <div class="card-body">
                                <div class="card-title">Automatización</div>
                                <div class="divider"></div>
                                <ul class="list-unstyled li-space-lg">
                                    <li class="media">
                                        <i class="fas fa-check"></i>
                                        <div class="media-body">Actualiza su inventario con la cantidad exacta de cada
                                            materia prima que tenga disponible</div>
                                    </li>
                                    <li class="media">
                                        <i class="fas fa-check"></i>
                                        <div class="media-body">Realiza órdenes sabiendo la cantidad necesaria de materia
                                            prima para cada una de ellas</div>
                                    </li>
                                </ul>
                            </div>
                        </div> <!-- end of card -->
                        <!-- end of card -->

                        <!-- Card-->
                        <div class="card">
                            <div class="card-body">
                                <div class="card-title">Administración</div>
                                <div class="divider"></div>
                                <ul class="list-unstyled li-space-lg">
                                    <li class="media">
                                        <i class="fas fa-check"></i>
                                        <div class="media-body">Gestiona sus materias primas basandose en la disponibilidad de éstas</div>
                                    </li>
                                    <li class="media">
                                        <i class="fas fa-check"></i>
                                        <div class="media-body">Establece de forma óptima las órdenes ingresandolas en el sistema para dar paso al proceso de producción. </div>
                                    </li>
                                </ul>
                            </div>
                        </div> <!-- end of card -->
                        <!-- end of card -->

                        <!-- Card-->
                        <div class="card">
                            <!--<div class="label">
                                <p class="best-value">Best Value</p>
                            </div> -->
                            <div class="card-body">
                                <div class="card-title">Reportes</div>
                                <div class="divider"></div>
                                <ul class="list-unstyled li-space-lg">
                                    <li class="media">
                                        <i class="fas fa-check"></i>
                                        <div class="media-body">Entrega reportes de manera rápida y eficaz que le permita conocer el avance de sus procesos.</div>
                                    </li>
                                    <li class="media">
                                        <i class="fas fa-check"></i>
                                        <div class="media-body">Genera reportes específicos en el caso de novedades, problemas y/o quejas.</div>
                                    </li>
                                </ul>
                            </div>
                        </div> <!-- end of card -->
                        <!-- end of card -->

                    </div> <!-- end of col -->
                </div> <!-- end of row -->
            </div> <!-- end of container -->
        </div> <!-- end of cards-2 -->
        <!-- end of pricing -->


        <!-- Service Section -->
        <div id="advantages" class="tabs">
            <section class="pattern-style-4 ">
                <div class="container raise-2">
                    <div class="col-lg-12">
                        <div class="above-heading">VENTAJAS DE SUITEFACTOR</div>
                        <h2 class="h2-heading">Ventajas</h2>
                    </div> <!-- end of col --><br><br>
                    <div class="row">
                        <div class="col-md-6 mb-4">
                            <div class="custom-list">
                                <div class="img-holder">
                                    <img src="img/menu/settings.png" alt="">
                                </div>
                                <div class="info">
                                    <div class="bodyV">
                                        <p>Lleva un control riguroso de sus movimientos, ordenes, insumos y productos.</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 mb-4">
                            <div class="custom-list">
                                <div class="img-holder">
                                    <img src="img/menu/settings.png" alt="">
                                </div>
                                <div class="info">
                                    <div class="bodyV">
                                        <p>Mejora el proceso de realización en las ordenes para un mejor manejo de su inventario y tiempo.</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 mb-4">
                            <div class="custom-list">
                                <div class="img-holder">
                                    <img src="img/menu/settings.png" alt="">
                                </div>
                                <div class="info">
                                    <div class="bodyV">
                                        <p>Presenta los datos de una manera simple por medio de informes. </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 mb-4">
                            <div class="custom-list">
                                <div class="img-holder">
                                    <img src="img/menu/settings.png" alt="">
                                </div>
                                <div class="info">
                                    <div class="bodyV">
                                        <p>Administración de recursos efectiva en tiempo real.</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 mb-4">
                            <div class="custom-list">
                                <div class="img-holder">
                                    <img src="img/menu/settings.png" alt="">
                                </div>
                                <div class="info">
                                    <div class="bodyV">
                                        <p>Simpe y fácil de usar.</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 mb-4">
                            <div class="custom-list">
                                <div class="img-holder">
                                    <img src="img/menu/settings.png" alt="">
                                </div>
                                <div class="info">
                                    <div class="bodyV">
                                        <p>Dispone de soporte especializado para atender sus necesidades, inquietudes o
                                            dudas 24/7.</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>
        <!-- End of Featured Food Section -->


        <!-- ======= Contact Section ======= -->

        <div id="contact-us" class="space" >
            <section class="contact">
                <div class="container" data-aos="fade-up">

                    <div class="section-title">
                        <h2>Contacto</h2>
                        <p>Si tiene alguna duda, inconveniente, problema, o cualquier tipo de cuestion. Puede contactarnos a
                            continuación.</p>
                    </div>

                    <div class="row" data-aos="fade-up" data-aos-delay="100">

                        <div class="col-lg-6">

                            <div class="row">
                                <div class="col-md-12">
                                    <div class="info-box">

                                        <h3>Dirección</h3>
                                        <p>Cl 52 #13-65, Bogotá, Colombia</p>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="info-box mt-4">

                                        <h3>Correo</h3>
                                        <p>suitefactorgestion@gmail.com<br></p>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="info-box mt-4">

                                        <h3>Teléfono</h3>
                                        <p>+57 322-282-7321</p>
                                    </div>
                                </div>
                            </div>

                        </div>

                        <div class="col-lg-6">
                            <form action="forms/contact.php" method="post" role="form" class="php-email-form">
                                <div class="row">
                                    <div class="col form-group">
                                        <input type="text" name="name" class="form-control" id="name" placeholder="Nombre"
                                               required>
                                    </div>
                                    <div class="col form-group">
                                        <input type="email" class="form-control" name="email" id="email"
                                               placeholder="Correo Electrónico" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control" name="subject" id="subject" placeholder="Asunto"
                                           required>
                                </div>
                                <div class="form-group">
                                    <textarea class="form-control" name="message" rows="5" placeholder="Mensaje"
                                              required></textarea>
                                </div>
                                <div class="my-3">
                                    <div class="loading">Cargando</div>
                                    <div class="error-message"></div>
                                    <div class="sent-message">Su mensaje ha sido enviado. ¡Gracias!</div>
                                </div>
                                <div class="text-center"><button type="submit">Enviar Mensaje</button></div>
                            </form>
                        </div>

                    </div>

                </div>
            </section><!-- End Contact Section -->
        </div>


        <!-- Footer -->
        <svg class="footer-frame" data-name="Layer 2" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="none"
             viewBox="0 0 1920 79">
        <defs>
        <style>
            .cls-2 {
                fill: #A7E6F2;
            }
        </style>
        </defs>
        <title>footer-frame</title>
        <path class="cls-2"
              d="M0,72.427C143,12.138,255.5,4.577,328.644,7.943c147.721,6.8,183.881,60.242,320.83,53.737,143-6.793,167.826-68.128,293-60.9,109.095,6.3,115.68,54.364,225.251,57.319,113.58,3.064,138.8-47.711,251.189-41.8,104.012,5.474,109.713,50.4,197.369,46.572,89.549-3.91,124.375-52.563,227.622-50.155A338.646,338.646,0,0,1,1920,23.467V79.75H0V72.427Z"
              transform="translate(0 -0.188)" />
        </svg>
        <div class="footer">
            <div class="container">
                <div class="row">
                    <div class="col-md-4">
                        <div class="footer-col first">
                            <img src="img/menu/logoFooter.svg" alt="alternative" height="60">
                        </div>
                    </div> <!-- end of col -->
                    <div class="col-md-4">
                        <div class="footer-col middle">
                            <h4>Links Importantes</h4>
                            <ul class="list-unstyled li-space-lg p-small">
                                <li class="media">
                                    <i class="fas fa-square"></i>
                                    <div class="media-body">Lee nuestros <a class="white"
                                                                            href="terms-conditions.html">Términos &
                                            Condiciones</a>, <a class="white" href="privacy-policy.html">Política de
                                            Privacidad</a>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div> <!-- end of col -->
                    <div class="col-md-4">
                        <div class="footer-col last">
                            <h4>Contacto</h4>
                            <ul class="list-unstyled li-space-lg p-small">
                                <li class="media">
                                    <i class="fas fa-map-marker-alt"></i>
                                    <div class="media-body">Cl 52 #13-65, Bogotá, Colombia</div>
                                </li>
                                <li class="media">
                                    <i class="fas fa-envelope"></i>
                                    <div class="media-body"><a class="white"
                                                               href="mailto:suitefactorgestion@gmail.com">suitefactorgestion@gmail.com</a><br>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div> <!-- end of col -->
                </div> <!-- end of row -->
            </div> <!-- end of container -->
        </div> <!-- end of footer -->
        <!-- end of footer -->


        <!-- Copyright -->
        <div class="copyright">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <p class="p-small">Copyright © 2022</p>
                    </div> <!-- end of col -->
                </div> <!-- enf of row -->
            </div> <!-- end of container -->
        </div> <!-- end of copyright -->
        <!-- end of copyright -->


        <!-- Scripts -->
        <script src="js/ScriptsIndex/jquery.min.js"></script> <!-- jQuery for Bootstrap's JavaScript plugins -->
        <script src="js/ScriptsIndex/popper.min.js"></script> <!-- Popper tooltip library for Bootstrap -->
        <script src="js/ScriptsIndex/bootstrap.min.js"></script> <!-- Bootstrap framework -->
        <script src="js/ScriptsIndex/jquery.easing.min.js"></script> <!-- jQuery Easing for smooth scrolling between anchors -->
        <script src="js/ScriptsIndex/swiper.min.js"></script> <!-- Swiper for image and text sliders -->
        <script src="js/ScriptsIndex/jquery.magnific-popup.js"></script> <!-- Magnific Popup for lightboxes -->
        <script src="js/ScriptsIndex/validator.min.js"></script> <!-- Validator.js - Bootstrap plugin that validates forms -->
        <script src="js/ScriptsIndex/scripts.js"></script> <!-- Custom scripts -->
        <script>
           var btnCerrarSession = document.getElementById("btnCerrarSesion")
            btnCerrarSession.addEventListener("click",()=>{
                alert("messirve");
                document.CerrarSesion.submit();
            })
        </script>
    </body>
</html>
