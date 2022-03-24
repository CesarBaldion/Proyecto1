<%-- 
    Document   : actualizarLoteProduccion
    Created on : 24/03/2022, 07:55:47 AM
    Author     : Sena
--%>

<%@page import="ModeloVO.LoteProduccionVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            LoteProduccionVO ltProducVO = (LoteProduccionVO) request.getAttribute("LoteProduccionConsultada");
            if (ltProducVO != null) {

        %>

        <form action="LoteProduccion" method="post">
            <h1>Actualizar Usuarios</h1>
            <input type="hidden" name="txtid_loteProduccion" value="<%=ltProducVO.getId_Lote_Produccion()%>">
            <input type="number" name="txtcantidad" placeholder="Cantidad" value="<%=ltProducVO.getCantidad()%>"><br>

            <input type="date" name="txtfecha_Fabricacion" value="<%=ltProducVO.getFecha_Fabricacion()%>"><br>

            <input type="text" name="txtId_orden_detalles" placeholder="Id orden detalles" value="<%=ltProducVO.getId_orden_Detalles()%>"><br>
            
            <input type="text" name="txtId_Usuarios" placeholder="Id Usuarios" value="<%=ltProducVO.getId_Usuarios()%>"><br>
            <button>Actualizar</button>
            <input type="hidden" value="2" name="opcion">
            <a href="consultarLoteProduccion.jsp">Volver</a><br>
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
                request.getRequestDispatcher("consultarLoteProduccion.jsp").forward(request, response);

            }%>
    </body>
</html>
