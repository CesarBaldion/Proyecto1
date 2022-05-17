<%-- 
    Document   : navegacion
    Created on : 20/04/2022, 01:32:17 PM
    Author     : Juan Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
        <link rel="icon" href="img/LogoFinal.svg" >
        <link rel="stylesheet" href="css/estilos.css">


    </head>
    <body class="row">

        <nav class="navbar navbar-light  col-md-4 text-light">
            <div class="container-fluid">
                <a class="navbar-brand text-light nav-link" href="menu.jsp">
                    <img src="img/LogoFinal.svg" height="55" class="d-inline-block align-text-top mt-2">
                </a>
            </div>
        </nav>
        <div class="col-md-4">
            <nav class="navbar navbar-expand-lg navbar-light">
                <div class="mt-4 mx-auto " id="navbarNav">
                    <ul class="navbar-nav fs-4">
                        <li class="nav-item active ">
                            <a class="navbar-brand text-dark " href="index.jsp">Inicio</a>
                        </li>
                        <li class="nav-item dropdown font-dark">
                            <a class="navbar-brand  " href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Registrar
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pen" viewBox="0 0 16 16">
                                <path d="m13.498.795.149-.149a1.207 1.207 0 1 1 1.707 1.708l-.149.148a1.5 1.5 0 0 1-.059 2.059L4.854 14.854a.5.5 0 0 1-.233.131l-4 1a.5.5 0 0 1-.606-.606l1-4a.5.5 0 0 1 .131-.232l9.642-9.642a.5.5 0 0 0-.642.056L6.854 4.854a.5.5 0 1 1-.708-.708L9.44.854A1.5 1.5 0 0 1 11.5.796a1.5 1.5 0 0 1 1.998-.001zm-.644.766a.5.5 0 0 0-.707 0L1.95 11.756l-.764 3.057 3.057-.764L14.44 3.854a.5.5 0 0 0 0-.708l-1.585-1.585z"/>
                                </svg>
                            </a>
                            <ul class="dropdown-menu " >
                                <li><a class="dropdown-item font-dark" href="registrarMateriasPrimas.jsp">Materia Prima</a></li>
                                <li><a class="dropdown-item font-dark" href="registrarProducto.jsp">Producto</a></li>
                                <li><a class="dropdown-item font-dark" href="registrarLoteMateriaPrima.jsp">Lote Materia Prima</a></li>
                                <li><a class="dropdown-item font-dark"  href="registrarLoteProduccion.jsp">Lote Produccion</a></li>
                                <li><a class="dropdown-item font-dark"  href="registrarOrdenes.jsp">Ordenes</a></li>
                                <li><a class="dropdown-item font-dark"  href="registrarOrdenDetalles.jsp">Orden Detalles</a></li>
                                <li><a class="dropdown-item font-dark"  href="registrarUsuario.jsp">Usuarios</a></li>
                                <li><a class="dropdown-item font-dark"  href="registrarDetallesProducto.jsp">Detalles Producto</a></li>
                                <li><a class="dropdown-item font-dark" href="registrarRol.jsp">Rol</a></li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown font-dark ">
                            <a class="navbar-brand " href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Consultar
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
                                <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z"/>
                                </svg>
                            </a>
                            <ul class="dropdown-menu " >
                                <li><a class="dropdown-item font-dark" href="consultarMateriaPrima.jsp">Materia Prima</a></li>
                                <li><a class="dropdown-item font-dark" href="consultarExistenciasMateriaPrima.jsp">Existencias Materia Prima</a></li>
                                <li><a class="dropdown-item font-dark" href="consultarProducto.jsp">Producto</a></li>
                                <li><a class="dropdown-item font-dark" href="consultarLoteMateriaPrima.jsp">Lote Materia Prima</a></li>
                                <li><a class="dropdown-item font-dark"  href="consultarLoteProduccion.jsp">Lote Produccion</a></li>
                                <li><a class="dropdown-item font-dark"  href="consultarOrdenes.jsp">Ordenes</a></li>
                                <li><a class="dropdown-item font-dark"  href="consultarOrdenDetalles.jsp">Orden Detalles</a></li>
                                <li><a class="dropdown-item font-dark"  href="consultarUsuarios.jsp">Usuarios</a></li>
                                <li><a class="dropdown-item font-dark"  href="consultarDetallesProducto.jsp">Detalles Producto</a></li>
                                <li><a class="dropdown-item font-dark" href="consultarRol.jsp">Rol</a></li>
                            </ul>
                        </li>

                    </ul>
                </div>
            </nav>
        </div>
        <div class="col-md-4 mt-3  justify-content-center d-flex">
            <form action="Sesiones" method="post">
                <button  class="btn boton mt-3">Cerrar sesion</button>
                <input type="hidden" value="1" name="opcion">
            </form>

        </div>

    </body>
</html>
