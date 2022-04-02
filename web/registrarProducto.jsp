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
    </head>
    <body>
        <form class="Formulario" method = "post" action = "Producto" > 
            <h1>Registrar Producto</h1>
            <input type="text" name="txtNombre" placeholder="Nombre" required="" >
            <br>
            <select name="txtEstado">
                <option>Elije una opcion</option>
                <option value="1">Activo</option>
                <option value="0">Inactivo</option>  
            </select>
            <br>
            <button id="Boton"> Registrar </button>
            <input type="hidden" value="1" name="opcion">
            <a href="index.jsp">Iniciar Sesion</a><br>
            
            <div class="mensaje">
                <%
                if (request.getAttribute("mensajeError") != null) {%>
                ${mensajeError}

                <%   } else {%>
                ${mensajeExito}

                <%}%>
            </div>
        </form>
    </body>
</html>
