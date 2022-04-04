<%-- 
    Document   : registrarProducto
    Created on : 9/03/2022, 09:28:13 AM
    Author     : Andrex
--%>
<%@include file="sesiones.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Producto</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/stilosRegistrarProducto.css">
    </head>
    <body class="row">
        <nav class="navbar navbar-light  col-md-6 text-light">
            <div class="container-fluid">
                <a class="L navbar-brand text-light nav-link" href="RegistroOrden.html">
                    <img src="Logo Final.svg" height="70" class="d-inline-block align-text-top ms-4">

                </a>
            </div>
        </nav>
        <div class="col-md-6 ">
            <nav class="navbar navbar-expand-lg navbar-light col-md-12 ">
                <div class="mx-auto mt-3" id="navbarNav">

                    <ul class="navbar-nav mx-auto">
                        <li class="nav-item active me-4">
                            <a class="navbar-brand text-dark " href="Index.html">Inicio</a>
                        </li>
                        <li class="nav-item dropdown font-dark">
                            <a class="navbar-brand dark-link dropdown-toggle " href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Registrar
                            </a>
                            <ul class="dropdown-menu " >
                                <li><a class="dropdown-item font-dark" href="#">Materia Prima</a></li>
                                <li><a class="dropdown-item font-dark" href="#">Producto</a></li>
                                <li><a class="dropdown-item font-dark">Lote Materia Prima</a></li>
                                <li><a class="dropdown-item font-dark"  href="#">Lote Produccion</a></li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown font-dark">
                            <a class="navbar-brand dropdown-toggle " href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Consultar
                            </a>
                            <ul class="dropdown-menu " >
                                <li><a class="dropdown-item font-dark" href="#">Materia Prima</a></li>
                                <li><a class="dropdown-item font-dark" href="#">Producto</a></li>
                                <li><a class="dropdown-item font-dark">Lote Materia Prima</a></li>
                                <li><a class="dropdown-item font-dark"  href="#">Lote Produccion</a></li>
                            </ul>
                        </li>


                        <li class="nav-item Inicio">
                            <a class="nav-link text-light " href="">Iniciar Sesion</a>
                        </li>

                        <li class="nav-item  active Inicio1 ">
                            <a class="nav-link text-dark " href="">Registro</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
        <div class="col-md-3 justify-content-center mx-auto caja border border-info mt-4">
            <h1 class="text-center h1">Registrar Producto</h1>
            <div class="col-md-8 mx-auto mt-4 formulario">
                <form class="form-group" method="post" action="Producto">
                    <input class="form-control" type="text" name="txtNombre" placeholder="Nombre" required="">
                    <br>
                    <select class="form-select">
                        <option selected>Despliega Las Opciones</option>
                        <option value="1">Activo</option>
                        <option value="0">Inactivo</option>
                    </select>
                    <br>
                    <div class="col-md-12 d-flex">
                        <button id="Boton" class="btn boton"> Registrar </button>
                        <input type="hidden" value="1" name="opcion">
                        <a class="nav nav-link link btn" href="consultarProducto.jsp">Lista</a><br>
                    </div>

                </form>
            </div>
        </div>


    </body>
</html>
