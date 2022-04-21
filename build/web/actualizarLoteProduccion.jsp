<%-- 
    Document   : actualizarLoteProduccion
    Created on : 24/03/2022, 08:24:57 AM
    Author     : Daniel
--%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloVO.OrdenDetallesVO"%>
<%@page import="ModeloDAO.OrdenDetallesDAO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@include file="navegacion.jsp" %>
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
            <label>Id lote de produccion</label>
            <br>
            <input type="text" name="txtid_loteProduccion" value="<%=ltProducVO.getId_Lote_Produccion()%>">
            <br>
            <label>Id usuarios</label>
            <br>
            <select name="txtId_Usuarios">
                <option value="<%=ltProducVO.getId_Usuarios()%>"><%=ltProducVO.getId_Usuarios()%></option>
                <% 
                UsuarioDAO usuDAO = new UsuarioDAO();
                for(UsuarioVO usuVO:usuDAO.Listar()){
                %>
                <option value="<%=usuVO.getIdUsuarios()%>"><%=usuVO.getNombre()%></option>
                <%}%>
            </select>
            <br>
            <label>Id orden detalles</label>
            <br>
            <select name="txtId_orden_detalles">
                <option value="<%=ltProducVO.getId_orden_Detalles()%>"><%=ltProducVO.getId_orden_Detalles()%></option>
                <% 
                OrdenDetallesDAO odDAO = new OrdenDetallesDAO();
                for(OrdenDetallesVO odVO:odDAO.Listar()){
                %>
                <option value="<%=odVO.getId_Orden_Detalles()%>"><%=odVO.getId_Orden_Detalles()%></option>
                <%}%>
            </select>
            <br>
            <label>Cantidad</label>
            <br>
            <input type="number" name="txtcantidad" placeholder="Cantidad" value="<%=ltProducVO.getCantidad()%>">
            <br>
            <label>Fecha de fabricacion</label>
            <br>
            <input type="date" name="txtfecha_Fabricacion" value="<%=ltProducVO.getFecha_Fabricacion()%>">
            <br><br>
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
