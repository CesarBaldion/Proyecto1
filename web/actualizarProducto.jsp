<%-- 
    Document   : actualizarProducto
    Created on : 1/04/2022, 06:07:19 PM
    Author     : Juan Pablo
--%>

<%@page import="ModeloVO.ProductoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% 
        ProductoVO prodVO = (ProductoVO)request.getAttribute("productoConsultado");
        if(prodVO != null){
        
        %>
        
        <form action="Producto" method="post">
            <h1>Actualizar Productos</h1>
            <label> Id Producto </label>
            <br>
            <input type="text" name="txtId" value="<%=prodVO.getIdProducto()%> " required="" >
            <br>
             <label> Nombre </label>
             <br>
            <input type="text" name="txtNombre" value="<%=prodVO.getNombre()%> "  required="">
            <br>
             <label> Estado </label>
             <br>
            <select name="txtEstado" >
                <option value="<%=prodVO.getEstado()%>"><%=prodVO.getEstado()%></option>
                <option value="1">Activo</option>
                <option value="0">Inactivo</option>
            </select>
            <br>
            <button id="Boton"> Actualizar </button>
            <input type="hidden" value="2" name="opcion">
            <a href="consultarProducto.jsp">Volver</a><br>
            
        </form>
        
            <% }else{
request.getRequestDispatcher("consultarProducto.jsp").forward(request, response);

}%>
        
    </body>
</html>

