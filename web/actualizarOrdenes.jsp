<%-- 
    Document   : actualizarOrdenes
    Created on : 23/03/2022, 08:48:09 AM
    Author     : Sena
--%>
<%@page import="ModeloVO.OrdenesVo"%>
<%@include file="sesiones.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% 
        OrdenesVo ordVO = (OrdenesVo)request.getAttribute("ordenConsultada");
        if(ordVO != null){
        
        %>
        
        <form action="Ordenes" method="post">
            <h1>Actualizar Ordenes</h1>
            <input type="text" name="txtIdOrden" value="<%=ordVO.getId_Orden()%> " required="" >
            <br>
            <input type="text" name="txtUsu" value="<%=ordVO.getId_Usuarios()%> "  required="">
            <br>
            <input type="text" name="txtFechaRegistro" value="<%=ordVO.getFecha_registro()%> " required="" >
            <br>
            <input type="text" name="txtFechaEntrega" value="<%=ordVO.getFecha_entrega()%>" required="" >
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

