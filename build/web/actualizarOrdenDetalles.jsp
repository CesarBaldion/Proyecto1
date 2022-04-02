<%-- 
    Document   : actualizarOrdenDetalles
    Created on : 1/04/2022, 11:29:53 PM
    Author     : Juan Pablo
--%>

<%@page import="ModeloDAO.DetallesProductoDAO"%>
<%@page import="ModeloVO.OrdenesVo"%>
<%@page import="ModeloDAO.OrdenesDao"%>
<%@page import="ModeloVO.DetallesProductoVO"%>
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
             <select name="txtIdOrden">
                <option value="<%=ordenDetallVO.getId_Orden()%>"><%=ordenDetallVO.getId_Orden()%></option>
                <%
                 OrdenesDao orDao = new OrdenesDao(); 
                 for (OrdenesVo orVO:orDao.listar()){
                    
                    %>
                    <option value="<%=orVO.getId_Orden()%>"><%=orVO.getId_Orden()%></option>
                    <%}%>
                    
                    
            </select>    
                <br>
                Id Detalles de Producto<br>
                <select name="txtidDetallesProducto">
                    <option value="<%=dpVO.getId_Detalles_Producto()%>"><%=dpVO.getId_Detalles_Producto()%></option>
                <%
                 DetallesProductoDAO dpDAO = new DetallesProductoDAO(); 
                 for (DetallesProductoVO depVO:dpDAO.listar()){
                    
                    %>
                    <option value="<%=dpVO.getId_Detalles_Producto()%>"><%=dpVO.getId_Detalles_Producto()%></option>
                    <%}%>
            </select>
                <input type="text" name="txtidDetallesProducto" value="<%=ordenDetallVO.getId_Detalles_Producto()%>">
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
