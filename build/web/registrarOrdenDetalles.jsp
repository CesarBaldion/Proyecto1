<%-- 
    Document   : registrarOrdenDetalles
    Created on : 30/03/2022, 10:39:11 AM
    Author     : Daniel
--%>

<%@include file="sesiones.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <center>
            <form method ="post" action="OrdenDetalles"> 
                <h1>Registrar Orden_Detalles</h1>
                Id Orden<br>
                <input type="text" name="txtIdOrden">
                <br>
                Id Detalles de Producto<br>
                <input type="text" name="idDetallesProducto">
                <br>
                Cantidad Solicitada<br>
                <input type="number" name="txtcantidadSolicitada">
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
