<%-- 
    Document   : consultarDetallesProducto
    Created on : 28/03/2022, 10:12:45 AM
    Author     : Sena
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.DetallesProductoDAO"%>
<%@page import="ModeloVO.DetallesProductoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalles Producto</title>
    </head>
    <body>
    <center>
        <h1>Detalles Producto</h1>
        <form  method="post" action="DetallesProducto"> 
            <table>
                <tr>
                    <th>
                        Detalles Producto
                        <input type="text" name="txtIdProducto" ><br>
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
                    <th>IdProducto</th>
                    <th>Id Detalles Producto</th>
                    <th>Descripcion</th>
                    <th>Talla</th>
                </tr>
                
                <%
                DetallesProductoVO detProVO = new DetallesProductoVO();
                DetallesProductoDAO detProDAO = new DetallesProductoDAO();
                ArrayList<DetallesProductoVO> listarDetallesProducto = detProDAO.listar();
                for (int i = 0; i < listarDetallesProducto.size(); i++){
                
                    detProVO = listarDetallesProducto.get(i);
                
                %>
                
                
                <tr>
                    <td><%=detProVO.getId_Producto()%></td>
                    <td><%=detProVO.getId_Detalles_Producto()%></td>
                    <td><%=detProVO.getDescripcion()%></td>
                    <td><%=detProVO.getTalla()%></td>
                </tr>
                
                <% }%>
            
            </table>
            
        </form>
            
    </center>
</body>
</html>
