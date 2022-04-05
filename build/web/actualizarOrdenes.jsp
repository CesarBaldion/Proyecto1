<%--
    Document   : actualizarOrdenes
    Created on : 23/03/2022, 08:48:09 AM
    Author     : Sena
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloVO.OrdenesVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Ordenes</title>
    </head>
    <body>
        
        
        <%     
        OrdenesVO ordVO = (OrdenesVO)request.getAttribute("OrdenConsultada");
        if(ordVO != null){
        
        %>
        
        
        
        
        <form action="Ordenes" method="post">
            <h1>Actualizar Ordenes</h1>
            
            <label>Id Usuario </label>
            <br>
            <select name="txtUsu">
                <option value="<%=ordVO.getId_Usuarios()%>"><%=ordVO.getId_Usuarios()%></option>
                <option value="<%=ordVO.getId_Usuarios()%>"><%=ordVO.getId_Usuarios()%></option>
            </select>
            <br>
            <label>Fecha Registro </label>
            <br>
            <input type="date" name="txtFechaRegistro" >
            <br>
            <label>Fecha Entrega </label>
            <br>
            <input type="date" name="txtFechaEntrega" required="">
            <br>
            <button id="Boton"> Actualizar </button>
            <input type="hidden" value="2" name="opcion">
            <a href="consultarOrdenes.jsp">Volver</a><br>
            
        </form>
        
            <% }else{
request.getRequestDispatcher("consultarOrdenes.jsp").forward(request, response);

}%>

        
    </body>
</html>

