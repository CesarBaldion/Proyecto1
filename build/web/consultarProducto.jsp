<%-- 
    Document   : consultarProducto
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
<%@page import="ModeloVO.ProductoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Consultar Producto</h1>
        <form mehtod="post" action="producto" >
            <table>
                <tr>
                    <th>
                        Producto
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
