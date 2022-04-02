<%-- 
    Document   : registrarOrdenDetalles
    Created on : 30/03/2022, 10:39:11 AM
    Author     : Daniel
--%>

<%@page import="ModeloVO.DetallesProductoVO"%>
<%@page import="ModeloDAO.DetallesProductoDAO"%>
<%@page import="ModeloVO.OrdenesVo"%>
<%@page import="ModeloDAO.OrdenesDao"%>
<%@page import="ModeloVO.OrdenDetallesVO"%>
<%@page import="ModeloDAO.OrdenDetallesDAO"%>
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
                <br>
                <label>Id orden </label>
                <br>
                <select name="txtIdOrden">
                <option>Seleccione...</option>
                <%
                 OrdenesDao orDao = new OrdenesDao(); 
                 for (OrdenesVo orVO:orDao.listar()){
                
                    
                    %>
                    <option value="<%=orVO.getId_Orden()%>"><%=orVO.getId_Orden()%></option>
                    <%}%>
            </select>
                <br>
                <label>Id Detalles producto </label>
                <br>
                <select name="txtidDetallesProducto">
                <option>Seleccione...</option>
                <%
                 DetallesProductoDAO dpDAO = new DetallesProductoDAO(); 
                 for (DetallesProductoVO dpVO:dpDAO.listar()){
                
                    
                    %>
                    <option value="<%=dpVO.getId_Detalles_Producto()%>"><%=dpVO.getId_Detalles_Producto()%></option>
                    <%}%>
            </select>
            <br>
                <input type="number" name="txtcantidadSolicitada" placeholder="Cantidad Solicitada">
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
