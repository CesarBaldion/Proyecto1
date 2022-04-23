<%-- 
    Document   : consultarExistenciasMateriaPrima
    Created on : 18/04/2022, 05:48:18 PM
    Author     : Juan Pablo
--%>

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
        <div class="col-md-9 mx-auto justify-content-center mt-4">
            <h1 class="text-center">Consultar Existencias<br>Materia Prima</h1>
            <table class="table table-light table-hover table-striped text-center mt-5">

                <tr>
                    <th>Id Materia Prima</th>
                    <th>Nombre</th>
                    <th>Existencias</th>
                    <th>Estado</th>
                </tr>
                
                <%
                MateriaPrimaVO matPriVO = new MateriaPrimaVO();
                MateriaPrimaDAO matPriDAO = new MateriaPrimaDAO();
                ArrayList<MateriaPrimaVO> listaMateriaPrima = matPriDAO.Listar();
                for (int i = 0; i < listaMateriaPrima.size(); i++){
                
                    matPriVO = listaMateriaPrima.get(i);
                
                %>
                
                
                <tr>
                    <td><%=matPriVO.getId_materia_Prima()%></td>
                    <td><%=matPriVO.getNombre()%></td>
                    <td><%=matPriVO.getActualizacion()%></td>
                    <td><%=matPriVO.getEstado()%></td>
                </tr>
                
                <% }%>
            
            </table>
        </div>
            
</body>
</html>

