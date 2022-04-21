<%-- 
    Document   : Registrar
    Created on : 10/03/2022, 08:21:00 AM
    Author     : Sena
--%>
<%@page import="ModeloVO.OrdenDetallesVO"%>
<%@page import="ModeloDAO.OrdenDetallesDAO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@include file="navegacion.jsp" %>
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
            <label>Id usuario</label>
            <br>
            <select name="txtId_Usuarios">
                <option>Seleccione...</option>

                <%
                    UsuarioDAO usuDAO = new UsuarioDAO();
                    for (UsuarioVO usuVO : usuDAO.Listar()) {

                %>
                <option value="<%=usuVO.getIdUsuarios()%>"><%=usuVO.getNombre()%></option>
                <%}%>
            </select>
            <br>
            <label>Id orden detalles</label>
            <br>
            <select name="txtId_orden_detalles">
                <option>Seleccione...</option>
                <%
                    OrdenDetallesDAO odDAO = new OrdenDetallesDAO();
                    for (OrdenDetallesVO odVO : odDAO.Listar()) {
                %>
                <option value="<%=odVO.getId_Orden_Detalles()%>"><%=odVO.getId_Orden_Detalles()%></option>
                <%}%>
            </select>
            <br>
            <label>Cantidad</label>
            <br>
            <input type="number" name="txtcantidad" placeholder="Cantidad">
            <br>
            <label>Fecha de fabricacion</label>
            <br>
            <input type="date" name="txtfecha_Fabricacion">
            <br>


            <button>Registrar</button>
            <input type="hidden" value="1" name="opcion">
            <div class="">
                <%if (request.getAttribute("mensajeError") != null) {%>
                ${mensajeError}

                <%   } else {%>
                ${mensajeExito}

                <%}%>
            </div>
        </form>


    </body>

</html>
