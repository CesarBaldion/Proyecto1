<%-- 
    Document   : consultarDetallesProducto
    Created on : 28/03/2022, 10:12:45 AM
    Author     : Sena
--%>
<%@include file="sesiones.jsp" %>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.DetallesProductoDAO"%>
<%@page import="ModeloVO.DetallesProductoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navegacion.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/">
        <title>Detalles Producto</title>
    </head>
    <body>
        <div class="col-md-4 justify-content-center mx-auto mt-4">
            <h1 class="text-center">Detalles Producto</h1>
            <div class="col-md-5 mx-auto ">
                <form  method="post" action="DetallesProducto" class="form-group"> 
                    <input type="text" name="txtIdProducto" class="form-control" placeholder="Id Detalles Producto">
                    <input type="hidden" value="4" name="opcion" >
                    <button class="btn">Consultar</button>
                </form>
                <div style="color: green;">
                    <%                if (request.getAttribute("mensajeError") != null) {%>
                    ${mensajeError}

                    <%   } else {%>
                    ${mensajeExito}

                    <%}%>
                </div>
            </div>
        </div>


        <div class="col-md-9 mx-auto justify-content-center mt-4">
                <table class="table table-light table-hover table-striped text-center">

                    <tr>
                        
                        <th>Id</th>
                        <th>IdProducto</th>
                        <th>Descripcion</th>
                        <th>Talla</th>
                    </tr>

                    <%
                        DetallesProductoVO detProVO = new DetallesProductoVO();
                        DetallesProductoDAO detProDAO = new DetallesProductoDAO();
                        ArrayList<DetallesProductoVO> listarDetallesProducto = detProDAO.listar();
                        for (int i = 0; i < listarDetallesProducto.size(); i++) {

                            detProVO = listarDetallesProducto.get(i);

                    %>


                    <tr>
                        <td><%=detProVO.getId_Detalles_Producto()%></td>
                        <td><%=detProVO.getId_Producto()%></td>
                        <td><%=detProVO.getDescripcion()%></td>
                        <td><%=detProVO.getTalla()%></td>
                    </tr>
                    <% }%>
                </table>

               
        </div>

    </body>
</html>