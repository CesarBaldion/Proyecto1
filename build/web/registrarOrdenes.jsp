<%-- 
    Document   : registrarOrdenes
    Created on : 9/03/2022, 09:50:34 AM
    Author     : Sena
--%>
<%@include file="sesiones.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Ordenes</title>
    </head>
    
        <body>
            <center>
            <form method ="post" action="Ordenes"> 
                <h1>Registrar Orden</h1>
                Usuario<br>
                <input type="text" name="txtUsu">
                <br>
                Fecha Registro<br>
                <input type="date" name="txtFechaRegistro">
                <br>
                Fecha Entrega<br>
                <input type="date" name="txtFechaEntrega">
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
