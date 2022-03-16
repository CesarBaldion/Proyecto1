<%-- 
    Document   : registrarOrdenes
    Created on : 16/03/2022, 08:20:45 AM
    Author     : Sena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Ordenes</title>
    </head>
    <body>
        <h1>Registrar Orden</h1>
    <center>
        <form method="post" action="Ordenes">
            Usuario<br>
            <input type="text" name="txtUsu" ><br>
            Fecha Registro<br>
            <input type="date" name="txtFechaRegistro" ><br>
            Fecha Entrega<br>
            <input type="date" name="txtFechaEntrega" ><br>

            <button> Registrar </button>
            <input type="hidden" value="1" name="opcion">

            <div style="color: red;">
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
