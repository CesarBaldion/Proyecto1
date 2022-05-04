<%-- 
    Document   : consultarMateriaPrima
    Created on : 30/03/2022, 11:51:35 AM
    Author     : Sena
--%>
<%@include file="sesionesAlmacenista.jsp" %>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.MateriaPrimaDAO"%>
<%@page import="ModeloVO.MateriaPrimaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navegacion.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/">
        <title>Consultar materias primas</title>
    </head>
    <body>
        <div class="col-md-4 justify-content-center mx-auto mt-4">
            <h1 class="text-center">Materias Primas</h1>
            <div class="col-md-4 mx-auto ">
                <form method="post" action="MateriaPrima" class="form-group"> 
                    <input type="text" name="txtIdMateriaPrima" placeholder="Id" class="form-control d-flex">
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
        
                
        <div class="col-md-9 mx-auto  mt-4">
            <div class="col-md-7 mx-auto justify-content-center">
                <table class="table table-light table-hover table-striped text-center">

                    <tr>
                        <th>Id <br>Materia Prima</th>
                        <th>Nombre</th>
                        <th>Estado</th>
                    </tr>

                    <%
                    MateriaPrimaVO matPriVO = new MateriaPrimaVO();
                    MateriaPrimaDAO matPriDAO = new MateriaPrimaDAO();
                    ArrayList<MateriaPrimaVO> listaMateriaPrima = matPriDAO.ListarDos();
                    for (int i = 0; i < listaMateriaPrima.size(); i++){

                        matPriVO = listaMateriaPrima.get(i);

                    %>


                    <tr>
                        <td><%=matPriVO.getId_materia_Prima()%></td>
                        <td><%=matPriVO.getNombre()%></td>
                        <td><%=matPriVO.getEstado()%></td>

                    </tr>

                    <% }%>

                </table>
            </div>
        </div>
</body>
</html>
