<%-- 
    Document   : consultarOrdenDetalles
    Created on : 30/03/2022, 11:06:16 AM
    Author     : Sena
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.OrdenDetallesDAO"%>
<%@page import="ModeloVO.OrdenDetallesVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Detalles orden</h1>

        <form method="post" action="OrdenDetalles">

            Id
            <input type="text" name="txtIdOrdenDetalles">
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
                    <th>Id Orden</th>
                    <th>Id Detalles Producto</th>
                    <th>Cantidad Solicitada</th>
                </tr>
                <%
                    OrdenDetallesVO OrdenDetallVO = new OrdenDetallesVO();
                    OrdenDetallesDAO OrdenDetallDAO = new OrdenDetallesDAO(OrdenDetallVO);

                    ArrayList<OrdenDetallesVO> listaLOrdenDetalles = OrdenDetallDAO.Listar();

                    for (int i = 0; i < listaLOrdenDetalles.size(); i++) {
                        
                        OrdenDetallVO = listaLOrdenDetalles.get(i);

                %>
                <tr>
                    <td><%=OrdenDetallVO.getId_Orden_Detalles()%></td>
                    <td><%=OrdenDetallVO.getId_Orden()%></td>
                    <td><%=OrdenDetallVO.getId_Detalles_Producto()%></td>
                    <td><%=OrdenDetallVO.getCantidadSolicitada()%></td>
                    
 
                </tr>
                
                <% } %>

            </table>

        </form>
    </body>
</html>
