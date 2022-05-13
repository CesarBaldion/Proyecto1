<%-- 
    Document   : consultarLoteProduccion
    Created on : 24/03/2022, 08:25:13 AM
    Author     : Daniel
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.LoteProduccionVO"%>
<%@page import="ModeloDAO.LoteProduccionDAO"%>
<%@page import="ModeloVO.LoteProduccionVO"%>
<%@include file="navegacion.jsp" %>
<%@include file="sesionesAlmacenista.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="col-md-4 justify-content-center mx-auto mt-4">
            <h1 class="text-center">Lote Produccion</h1>
            <div class="col-md-4 mx-auto ">
                <form method="post" action="LoteProduccion" class="form-group"> 
                    <input type="text" name="txtid_loteProduccion" placeholder="Id" class="form-control d-flex">
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
                <table class="table table-light table-hover table-striped text-center">

                <tr>
                    <th>Id</th>
                    <th>Id Usuarios</th>
                    <th>Id orden Detalles</th>
                    <th>Cantidad</th>
                    <th>Fecha Fabricacion</th>


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
                    <td><%=ltProducVO.getId_Usuarios()%></td>
                    <td><%=ltProducVO.getId_orden_Detalles()%></td>
                    <td><%=ltProducVO.getCantidad()%></td>
                    <td><%=ltProducVO.getFecha_Fabricacion()%></td>
                    
                    <td>
                            <form action="LoteProduccion" method="post">
                                <input type="hidden" name="txtEstado" value="0">
                                <input type="hidden" name="txtid_loteProduccion" value="<%=ltProducVO.getId_Lote_Produccion()%>">
                                <button>Desactivar</button>
                                <input type="hidden" value="3" name="opcion">
                            </form>
                        </td>
                </tr>

                <% }%>

            </table>
        </div>

    </body>
</html>
