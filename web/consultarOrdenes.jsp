<%-- 
    Document   : consultarOrdenes
    Created on : 23/03/2022, 08:38:26 AM
    Author     : Sena
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.OrdenesDAO"%>
<%@page import="ModeloVO.OrdenesVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navegacion.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/">
        <title>Consultar Ordenes</title>
        
    </head>
    <body>
        <div class="col-md-4 justify-content-center mx-auto mt-4">
            <h1 class="text-center">Ordenes</h1>
            <div class="col-md-6 mx-auto ">
                <form  method="post" action="Ordenes" class="form-group"> 
                    <input type="text" name="txtIdOrden" placeholder="Id Orden" class="form-control"><br>
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
                        <th>Orden</th>
                        <th>Usuario</th>
                        <th>Fecha Registro</th>
                        <th>Fecha Entrega</th>
                    </tr>

                    <%
                        OrdenesVO ordVO = new OrdenesVO();
                        OrdenesDAO ordDAO = new OrdenesDAO();
                        ArrayList<OrdenesVO> listaOrdenes = ordDAO.listar();
                        for (int i = 0; i < listaOrdenes.size(); i++) {

                            ordVO = listaOrdenes.get(i);

                    %>


                    <tr>
                        <td><%=ordVO.getId_Orden()%></td>
                        <td><%=ordVO.getId_Usuarios()%></td>
                        <td><%=ordVO.getFecha_registro()%></td>
                        <td><%=ordVO.getFecha_entrega()%></td>
                    </tr>

                    <% }%>

                </table> 
            </div>
        </div>
    </body>
</html>
