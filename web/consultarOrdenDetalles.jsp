<%-- 
    Document   : consultarOrdenDetalles
    Created on : 30/03/2022, 11:06:16 AM
    Author     : Sena
--%>
<%@include file="sesionesAlmacenista.jsp" %>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.OrdenDetallesDAO"%>
<%@page import="ModeloVO.OrdenDetallesVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navegacion.jsp" %>
<%@include file="css-paginacion.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="col-md-4 justify-content-center mx-auto mt-4">
            <h1 class="text-center">Orden Detalles</h1>
            <div class="col-md-6 mx-auto ">
                <form method="post" action="OrdenDetalles" class="form-group">
                    <input type="text" name="txtIdOrdenDetalles" placeholder="Id Orden Detalles" class="form-control">
                    <input type="hidden" value="4" name="opcion">
                    <button class="btn">Consultar</button>

                </form>
                <div class="mensaje">
                    <%
                        if (request.getAttribute("mensajeError") != null) {%>
                    ${mensajeError}

                    <%}%>
                </div>
            </div>
        </div>

        <div class="col-md-9 mx-auto justify-content-center mt-4">
            <div class="col-md-7 mx-auto justify-content-center">
                <table id="datos" number-per-page="10" class="table table-light table-hover table-striped text-center">

                    <tr>
                        <th>Id</th>
                        <th>Id Orden</th>
                        <th>Id Detalles Producto</th>
                        <th>Cantidad Solicitada</th>
                    </tr>
                    <%
                        OrdenDetallesVO OrdenDetallVO = new OrdenDetallesVO();
                        OrdenDetallesDAO OrdenDetallDAO = new OrdenDetallesDAO(OrdenDetallVO);

                        ArrayList<OrdenDetallesVO> listaOrdenDetalles = OrdenDetallDAO.Listar();

                        for (int i = 0; i < listaOrdenDetalles.size(); i++) {

                            OrdenDetallVO = listaOrdenDetalles.get(i);

                    %>
                    <tr>
                        <td><%=OrdenDetallVO.getId_Orden_Detalles()%></td>
                        <td><%=OrdenDetallVO.getId_Orden()%></td>
                        <td><%=OrdenDetallVO.getId_Detalles_Producto()%></td>
                        <td><%=OrdenDetallVO.getCantidadSolicitada()%></td>
                        
                        <td>
                            <form action="OrdenDetalles" method="post">
                                <input type="hidden" name="txtEstado" value="0">
                                <input type="hidden" name="txtIdOrdenDetalles" value="<%=OrdenDetallVO.getId_Orden_Detalles()%>">
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
