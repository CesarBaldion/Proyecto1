<%-- 
    Document   : consultarProducto
    Created on : 4/04/2022, 08:16:18 AM
    Author     : Sena
--%>
<%@include file="sesionesAlmacenista.jsp" %>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page import="ModeloVO.ProductoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navegacion.jsp" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/">
        <title>Cosultar Producto</title>
    </head>
    <body>
        <div class="col-md-4 justify-content-center mx-auto mt-4">
            <h1 class="text-center">Productos</h1>
            <div class="col-md-6 mx-auto ">
                <form  method="post" action="Producto" class="form-group"> 
                    <input type="text" name="txtId" class="form-control" placeholder="Id Producto">
                    <input type="hidden" value="4" name="opcion">
                    <button class="btn">Consultar</button>
                </form>
                <div style="color: red;">
                    <%
                        if (request.getAttribute("mensajeError") != null) {%>
                    ${mensajeError}

                    <%   } else {%>
                    ${mensajeExito}

                    <%}%>
                </div>
            </div>
        </div>


        <div class="col-md-9 mx-auto justify-content-center mt-4">
            <div class="col-md-7 mx-auto justify-content-center">
                <table class="table table-light table-hover table-striped text-center">

                    <tr>
                        <th>Id</th>
                        <th>Nombre Producto</th>
                        
                    </tr>

                    <%
                        ProductoVO prodVO = new ProductoVO();
                        ProductoDAO prodDAO = new ProductoDAO();
                        ArrayList<ProductoVO> listaProductos = prodDAO.listar();
                        for (int i = 0; i < listaProductos.size(); i++) {

                            prodVO = listaProductos.get(i);

                    %>


                    <tr>
                        <td><%=prodVO.getIdProducto()%></td>
                        <td><%=prodVO.getNombre()%></td>
                        
                         <td>
                            <form action="Producto" method="post">
                                <input type="hidden" name="txtEstado" value="0">
                                <input type="hidden" name="txtId" value="<%=prodVO.getIdProducto()%>">
                                <button>Desactivar</button>
                                <input type="hidden" value="3" name="opcion">
                            </form>
                        </td>
                        
                    </tr>

                    <% }%>

                </table>
            </div>
        </div>
    </body>
</html>
