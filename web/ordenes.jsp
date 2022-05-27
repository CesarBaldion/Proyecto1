<%-- 
    Document   : ordenes
    Created on : 25-may-2022, 22:39:10
    Author     : cesar
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="ModeloVO.DetallesProductoVO"%>
<%@page import="ModeloVO.OrdenesVO"%>
<%@page import="ModeloDAO.OrdenesDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.OrdenDetallesDAO"%>
<%@page import="ModeloVO.OrdenDetallesVO"%>
<%@page import="ModeloDAO.DetallesProductoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>

        <div class="d-flex">
            <div class="col-sm-4">
                <div class="card">
                    <div class="card-body">
                        <form action="OrdenDetalles" method="post" enctype="multipart/form-data">
                            <label>Datos del producto</label>
                            <select name="txtIdOrden" class="form-select">
                                <option>Seleccione un IdOrden...</option>
                                <%
                                    OrdenesDAO ordDAO = new OrdenesDAO();
                                    for (OrdenesVO ordVO : ordDAO.listar()) {
                                %>
                                <option value="<%=ordVO.getId_Orden()%>"><%=ordVO.getId_Orden()%></option>
                                <%}%>
                            </select>
                            <select name="txtIdDetallesProducto" class="form-select">
                                <option>IdDetalles Producto</option>
                                <%
                                    DetallesProductoDAO dpDAO = new DetallesProductoDAO();
                                    for (DetallesProductoVO dpVO : dpDAO.listar()) {
                                %>
                                <option value="<%=dpVO.getId_Detalles_Producto()%>"><%=dpVO.getId_Detalles_Producto()%></option>
                                <%}%>
                            </select>
                            <input type="text"  name="txtcantidadSolicitada" class="form-control">
                            <button class="btn btn-outline-info">Agregar</button>
                            <input type="hidden" value="5" name="opcion">
                        </form>
                    </div>
                </div>
            </div>
            <div class="col-sm-7">
                <div class="card">
                    <div class="card-body">
                        <div class="d-flex col-sm-6 ml-auto">
                            <label>Nro. Serie</label>
                            <input type="text" name="NroSerie" class="form-control">
                        </div>
                        <br>
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Nro</th>
                                    <th>Orden</th>
                                    <th>Detalles Producto</th>
                                    <th>Cantidad</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="list" items="${lista}">
                                    <%-- <%
                                         DetallesProductoDAO detProDAO = new DetallesProductoDAO();
                                         OrdenDetallesVO OrdenDetallVO = new OrdenDetallesVO();
                                         OrdenDetallesDAO OrdenDetallDAO = new OrdenDetallesDAO(OrdenDetallVO);
                                         ArrayList<OrdenDetallesVO> listaOrdenDetalles = OrdenDetallDAO.Listar();

                                    for (int i = 0; i < listaOrdenDetalles.size(); i++) {

                                        OrdenDetallVO = listaOrdenDetalles.get(i);

                                %>--%>
                                    <tr>
                                        <td>${list.getItem()}</td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <%--<td><%=OrdenDetallVO.getItem()%></td>
                                        <td><%=OrdenDetallVO.getId_Orden()%></td>
                                        <td><%=OrdenDetallVO.getId_Detalles_Producto()%></td>
                                        <td><%=OrdenDetallVO.getCantidadSolicitada()%></td>--%>
                                    </tr>
                                    <%--<% }%>--%>
                                </c:forEach>>
                            </tbody>
                        </table>

                    </div>
                    <div class="card-footer">
                        <input type="submit" name="opcion" value="Generar Orden" class="btn btn-success">
                        <input type="submit" name="opcion" value="Cancelar" class="btn btn-danger">

                    </div>
                </div>

            </div>
        </div>


        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>
</html>
