<%-- 
    Document   : registrarDetallesProducto
    Created on : 28/03/2022, 10:21:09 AM
    Author     : Sena
--%>
<%@include file="sesiones.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Detalles del Producto</title>
    </head>
    
        <body>
            <center>
            <form method ="post" action="DetallesProducto"> 
                <h1>Registrar Detalles del Producto</h1>
                Id Producto<br>
                <input type="text" name="txtIdProducto">
                <br>
                Descripcion<br>
                <input type="text" name="txtDescripcion">
                <br>
                Talla<br>
                <input type="text" name="txtTalla">
                <br><br>
                <button id="Boton"> Registrar </button>
                <input type="hidden" value="1" name="opcion">

                <div class="mensaje" style="color: red;">
                    <%
                    if (request.getAttribute("mensajeError") != null) {%>
                    ${mensajeError}

                    <%   } else {%>
                    ${mensajeExito}

                    <%}%>
                </div>
            </form>
                </center>
        </body>
    
</html>
