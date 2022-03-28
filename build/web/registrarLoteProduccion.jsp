<%-- 
    Document   : Registrar
    Created on : 10/03/2022, 08:21:00 AM
    Author     : Sena
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
         <form action="LoteProduccion" method="post">
            <input type="number" name="txtcantidad" placeholder="Cantidad"><br>
            <input type="date" name="txtfecha_Fabricacion"><br>
            <input type="text" name="txtId_orden_detalles" placeholder="Id orden detalles"><br>
            <input type="text" name="txtId_Usuarios" placeholder="Id Usuarios"><br>
            <button>Registrar</button>
            <input type="hidden" value="1" name="opcion">
        <div class="">
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
