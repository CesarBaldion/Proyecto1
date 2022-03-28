<%-- 
    Document   : consultarLoteProduccion
    Created on : 24/03/2022, 08:25:13 AM
    Author     : Sena
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.LoteProduccionVO"%>
<%@page import="ModeloDAO.LoteProduccionDAO"%>
<%@page import="ModeloVO.LoteProduccionVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Lote Produccion</h1>

        <form method="post" action="LoteProduccion">

            Id
            <input type="text" name="txtid_loteProduccion">
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
                    <th>Cantidad</th>
                    <th>Fecha Fabricacion</th>
                    <th>Id orden Detalles</th>
                    <th>Id Usuarios</th>
                </tr>
                <%
                    LoteProduccionVO ltProducVO = new LoteProduccionVO();
                    LoteProduccionDAO ltProducDAO = new LoteProduccionDAO(ltProducVO);

                    ArrayList<LoteProduccionVO> listaLoteProduccion = ltProducDAO.Listar();

                    for (int i = 0; i < listaLoteProduccion.size(); i++) {
                        
                        ltProducVO = listaLoteProduccion.get(i);

                %>
                <tr>
                    <td><%=ltProducVO.getId_Lote_Produccion()%></td>
                    <td><%=ltProducVO.getCantidad()%></td>
                    <td><%=ltProducVO.getFecha_Fabricacion()%></td>
                    <td><%=ltProducVO.getId_orden_Detalles()%></td>
                    <td><%=ltProducVO.getId_Usuarios()%></td>
 
                </tr>
                
                <% } %>

            </table>

        </form>
    </body>
</html>
