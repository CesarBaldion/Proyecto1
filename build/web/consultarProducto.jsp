<%-- 
    Document   : consultarProducto
    Created on : 4/04/2022, 08:16:18 AM
    Author     : Sena
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page import="ModeloVO.ProductoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cosultar Producto</title>
    </head>
    <body>
        <header>
            <ul>
                <li><a href="registrarProducto.jsp">Registar Producto</a></li>
                <li><a href="consultarProducto.jsp">Consultar Producto</a></li>
                <li><a href="menu.jsp">Menu</a></li>
            </ul>
        </header>
        <center>
        <h1>Productos</h1>
        <form  method="post" action="Producto"> 
            <table>
                <tr>
                    <th>
                        Producto
                        <input type="text" name="txtId" ><br>
                        <input type="hidden" value="4" name="opcion">
                        <button>Consultar</button>
                    </th>
                </tr>
            </table><br><br>
        </form>
        <div style="color: red;">
            <%
                if (request.getAttribute("mensajeError") != null) {%>
            ${mensajeError}

            <%   } else {%>
            ${mensajeExito}

            <%}%>
        </div><br><br>


        <form>

            <table border="1">

                <tr>
                    <th>Producto</th>
                    <th>Nombre Producto</th>
                    <th>Estado</th>
                </tr>
                
                <%
                ProductoVO prodVO = new ProductoVO();
                ProductoDAO prodDAO = new ProductoDAO();
                ArrayList<ProductoVO> listaProductos = prodDAO.listar();
                for (int i = 0; i < listaProductos.size(); i++){
                
                    prodVO = listaProductos.get(i);
                
                %>
                
                
                <tr>
                    <td><%=prodVO.getIdProducto()%></td>
                    <td><%=prodVO.getNombre()%></td>
                    <td><%=prodVO.getEstado()%></td>
                </tr>
                
                <% }%>
            
            </table>
            
        </form>
            
    </center>
    </body>
</html>
