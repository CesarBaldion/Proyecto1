<%-- 
    Document   : consularProducto
    Created on : 1/04/2022, 06:00:05 PM
    Author     : Juan Pablo
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page import="ModeloVO.ProductoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    <body>
        <h1>Productos</h1>

        <form method="post" action="Producto">

            Id
            <input type="text" name="txtId">
            <br>
            <input type="hidden" value="4" name="opcion">
            <button>Consultar</button>

        </form>
        <div class="mensaje">
            <%
                if (request.getAttribute("mensajeError") != null) {%>
            ${mensajeError}

            <%}%>
        </div>
        <br>
        <br>

        <form>

            <table border="1">

                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Estado</th>
                </tr>
                <%
                    ProductoVO prodVO = new ProductoVO();
                    ProductoDAO prodDAO = new ProductoDAO();

                    ArrayList<ProductoVO> ListaProductos = prodDAO.Listar();

                    for (int i = 0; i < ListaProductos.size(); i++) {
                        
                        prodVO = ListaProductos.get(i);

                %>
                <tr>
                    <td><%=prodVO.getIdProducto()%></td>
                    <td><%=prodVO.getNombre()%></td>
                    <td><%=prodVO.getEstado()%></td>
                </tr>
                
                <% } %>

            </table>

        </form>
    </body>
</html>

