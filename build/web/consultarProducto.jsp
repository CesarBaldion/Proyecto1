<%-- 
    Document   : consultarProducto
<<<<<<< Updated upstream
<<<<<<< Updated upstream
    Created on : 23/03/2022, 08:59:45 AM
    Author     : Sena
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.ProductoDAO"%>
=======
    Created on : 30/03/2022, 11:14:24 AM
    Author     : Sena
--%>

<%@page import="ModeloDAO.ProductoDAO"%>
<%@page import="java.util.ArrayList"%>
>>>>>>> Stashed changes
=======
    Created on : 1/04/2022, 06:24:44 PM
    Author     : ESCOBAR
--%>

<%@include file="sesiones.jsp" %>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.ProductoDAO"%>
>>>>>>> Stashed changes
<%@page import="ModeloVO.ProductoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<<<<<<< Updated upstream
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Consultar Producto</h1>
        <form mehtod="post" action="producto" >
=======
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
>>>>>>> Stashed changes
            <table>
                <tr>
                    <th>
                        Producto
<<<<<<< Updated upstream
                        <input type="text" name="txtProducto"> <br>
                        <input type="hidden" value="3" name="opcion"><br>
                        <input type="submit" value="Consultar">

                    </th>
                </tr>
            </table>
        </form>

        <form>
            <table>
                <tr>
                    <th>Nombre Producto</th>
                    <th>Estado</th>
                </tr>

                <%
                    ProductoVO prodVo = new ProductoVO();
<<<<<<< Updated upstream
                    ProductoDAO prodDao = new ProductoDAO();

                    ArrayList<ProductoVO> ListaVehiculo = prodDao.Listar();
                    for (int i = 0; i < ListaVehiculo.size(); i++) {
                        prodVo = ListaVehiculo.get(i);
=======
                    //ProductoDAO prodDao = new ProductoDAO();

                    //ArrayList<ProductoVO> ListaVehiculo = prodDao.Listar();
                    //for (int i = 0; i < ListaVehiculo.size(); i++) {
                    //    prodVo = ListaVehiculo.get(i);
>>>>>>> Stashed changes

                %> 

                <tr>

                    <td><%=prodVo.getNombre()%></td>
                    <td><%=prodVo.getEstado()%></td>


                    <%}%>

                </tr>
            </table>
        </form>
    </body>
<<<<<<< Updated upstream
</html>
=======
</html>
>>>>>>> Stashed changes
=======
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
>>>>>>> Stashed changes
