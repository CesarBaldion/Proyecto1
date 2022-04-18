<%-- 
    Document   : registrarOrdenDetalles
    Created on : 30/03/2022, 10:39:11 AM
    Author     : Daniel
--%>

<%@page import="ModeloDAO.OrdenesDAO"%>
<%@page import="ModeloVO.DetallesProductoVO"%>
<%@page import="ModeloDAO.DetallesProductoDAO"%>
<%@page import="ModeloVO.OrdenesVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="OrdenDetalles" method="post">
            <h1>Actualizar Ordenes</h1>
            <label>Id orden</label>
            <br>
            <select name="txtIdOrden" required="">
                <option>Seleccione...</option>
                <%
                OrdenesDAO ordDAO = new OrdenesDAO();
                for(OrdenesVO ordVO:ordDAO.listar()){
                
                %>
                
                <option value="<%=ordVO.getId_Orden()%>"><%=ordVO.getId_Orden()%></option>
                
                 <%}%>
            </select>
            <br>
            <label>Id Detalles de producto</label>
            <br>
            <select name="idDetallesProducto" required="">
                <option>Seleccione...</option>
                <%
                DetallesProductoDAO dpDAO = new DetallesProductoDAO();
                for(DetallesProductoVO dpVO:dpDAO.listar()){
                
                %>
                
                <option value="<%=dpVO.getId_Detalles_Producto()%>"><%=dpVO.getId_Detalles_Producto()%></option>
 
                <%}%>
            </select>
            <br>
            <label>Cantidad Solicitada</label>
            <br>
            <input type="number" name="txtcantidadSolicitada" required="">
            <br>
            <button id="Boton"> Registrar </button>
            <input type="hidden" value="1" name="opcion">
            <a href="consultarOrdenDetalles.jsp">Volver</a><br>
            
        </form>
        
    </body>
</html>
