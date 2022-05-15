<%-- 
    Document   : consultarMateriaPrima
    Created on : 30/03/2022, 11:51:35 AM
    Author     : Sena
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.MateriaPrimaDAO"%>
<%@page import="ModeloVO.MateriaPrimaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navegacion.jsp" %>
<%@include file="css-paginacion.jsp" %>
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
                <div class="mensaje">
                    <%                        if (request.getAttribute("mensajeError") != null) {%>
                    ${mensajeError}

                    <%}%>
                </div>
            </div>
        </div>


        <div class="col-md-9 mx-auto  mt-4">
            <div class="col-md-7 mx-auto justify-content-center">
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--expandable">
                    <label class="mdl-button mdl-js-button mdl-button--icon" for="buscar">
                        <i class="zmdi zmdi-search"></i>
                    </label>
                    <div class="mdl-textfield__expandable-holder">
                        <input type="text" onkeyup="doSearch()" class="mdl-textfield__input"  id="buscar">
                        <label class="mdl-textfield__label"></label>
                    </div>
                </div>
                <table id="datos" number-per-page="10" class="table table-light table-hover table-striped text-center">

                    <tr>
                        <th>Id</th>
                        <th>Nombre</th>
                        <th>Estado</th>

                    </tr>

                    <%
                        MateriaPrimaVO matPriVO = new MateriaPrimaVO();
                        MateriaPrimaDAO matPriDAO = new MateriaPrimaDAO();
                        ArrayList<MateriaPrimaVO> listaMateriaPrima = matPriDAO.ListarDos();
                        for (int i = 0; i < listaMateriaPrima.size(); i++) {

                            matPriVO = listaMateriaPrima.get(i);

                    %>


                    <tr>
                        <td><%=matPriVO.getId_materia_Prima()%></td>
                        <td><%=matPriVO.getNombre()%></td>

                        <td>
                            <form action="MateriaPrima" method="post">
                                <input type="hidden" name="txtEstado" value="0">
                                <input type="hidden" name="txtIdMateriaPrima" value="<%=matPriVO.getId_materia_Prima()%>">
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
