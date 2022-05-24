<%-- 
    Document   : actualizarDetallesProducto
    Created on : 28/03/2022, 10:20:31 AM
    Author     : Sena
--%>
<%@page import="ModeloVO.DetallesProductoVO"%>
<%@include file="sesionesJefeProduccion.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalles de producto</title>
    </head>
    <body>
        <% 
        DetallesProductoVO proVO = (DetallesProductoVO)request.getAttribute("detallesProductoConsultado");
        if(proVO != null){
        
        %>
        
        <form action="DetallesProducto" method="post" enctype="multipart/form-data">
            <h1>Actualizar Detalles de Producto</h1>
            <label>Id detalle producto</label>
            <br>
            
            <label>Id Producto</label>
            <br>
            <input type="text" name="txtNombre" value="<%=proVO.getId_Producto()%> "  required="">
            
            <label>Id Producto</label>
            <br>
            <input type="text" name="txtNombre" value="<%=proVO.getTalla()%> "  required="">
            
            <label>Id Producto</label>
            <br>
            <input type="text" name="txtNombre" value="<%=proVO.getDescripcion()%> "  required="">
            
            <br>
            <label>Estado</label>
            <br>
            <select name="txtEstado">
                <option value="<%=proVO.getEstado()%>"><%=proVO.getEstado()%></option>
                <option value="1">Activo</option>
                <option value="0">Inactivo</option>
            </select>
            <br>
            <button id="Boton"> Actualizar </button>
            <input type="hidden" value="2" name="opcion">
            <a href="consultarProducto.jsp">Volver</a><br>
            
        </form>
        
            <% }else{
request.getRequestDispatcher("registrarproducto.jsp").forward(request, response);

}%>
    </body>
</html>
