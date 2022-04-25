<%-- 
    Document   : registrarProducto
    Created on : 9/03/2022, 09:28:13 AM
    Author     : Andrex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navegacion.jsp" %>
<%@include file="sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Producto</title>
        <link rel="stylesheet" href="css/estilos.css">
    </head>
    <body class="">
        <div class="col-md-3 justify-content-center mx-auto caja border border-info mt-4">
            <h1 class="text-center fs-2 mt-2">Registrar Producto</h1>
            <div class="mx-auto justify-content-center">
                <%if (request.getAttribute("mensajeError") != null) {%>
                <p class="text-danger text-center fs-5">${mensajeError}</p>

                <%   } else {%>
                <p class="text-success text-center fs-5">${mensajeExito}</p>

                <%}%>
            </div>
            <div class="col-md-10 mx-auto mt-4">
                <form class="form-group" method="post" action="Producto">
                    <input class="form-control" type="text" name="txtNombre" placeholder="Nombre" required="">
                    <br>
                    <select class="form-select" name="txtEstado">
                        <option selected>Despliega Las Opciones</option>
                        <option value="1">Activo</option>
                        <option value="0">Inactivo</option>
                    </select>
                    <br>
                    <div class="col-md-12 d-flex mt-2 mb-3">
                        <button class="btn boton"> Registrar </button>
                        <input type="hidden" value="1" name="opcion">
                    </div>

                </form>
            </div>
        </div>


    </body>
</html>