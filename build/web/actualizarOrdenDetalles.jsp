<%-- 
    Document   : actualizarOrdenDetalles
    Created on : 30/03/2022, 11:27:26 AM
    Author     : Sena
--%>

<%@page import="ModeloVO.OrdenDetallesVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            OrdenDetallesVO ordenDetallVO = (OrdenDetallesVO) request.getAttribute("OrdenDetallesConsultada");
            if (ordenDetallVO != null) {

        %>

        <form action="OrdenDetalles" method="post">
            <h1>Actualizar Usuarios</h1>
            <input type="hidden" name="txtIdOrdenDetalles" value="<%=ordenDetallVO.getId_Orden_Detalles()%>">
             Id Orden<br>
             <input type="text" name="txtIdOrden" value="<%=ordenDetallVO.getId_Orden()%>">
                <br>
                Id Detalles de Producto<br>
                <input type="text" name="idDetallesProducto" value="<%=ordenDetallVO.getId_Detalles_Producto()%>">
                <br>
                Cantidad Solicitada<br>
                <input type="number" name="txtcantidadSolicitada" value="<%=ordenDetallVO.getCantidadSolicitada()%>">
                <br><br>
                
            <button>Actualizar</button>
            <input type="hidden" value="2" name="opcion">
            <a href="consultarOrdenDetalles.jsp">Volver</a><br>
            <div class="">
                <%
                if (request.getAttribute("mensajeError") != null) {%>
                ${mensajeError}

                <%   } else {%>
                ${mensajeExito}

                <%}%>
            </div>
        </form>

        <% } else {
                request.getRequestDispatcher("consultarOrdenDetalles.jsp").forward(request, response);

            }%>
    </body>
</html>
