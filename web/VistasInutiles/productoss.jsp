<%-- 
    Document   : materiaPrima
    Created on : 24-may-2022, 22:10:36
    Author     : cesar
--%>

<%@page import="ModeloDAO.ProductoDAO"%>
<%@page import="ModeloVO.ProductoVO"%>
<%@page import="java.util.ArrayList"%>
<%@include file="css-paginacion.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ProductoVO prodVO = new ProductoVO();
    ProductoDAO prodDAO = new ProductoDAO();
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="css/estilos.css">
        <title>JSP Page</title>
    </head>

    <body>
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">

                    <form method ="post" action="Producto" class="form-group" enctype="multipart/form-data">

                        <div class="mx-auto justify-content-center">
                            <%if (request.getAttribute("error") != null) {%>
                            <div class="container-fluid d-inline-block d-flex mx-auto">
                                <p class="text-danger text-center fs-5 mt-5">${error}</p>
                            </div>
                            <%   } else {%>
                            <p class="text-success text-center fs-5">${mensajeExito}</p>
                            <%}%>
                        </div>

                        <div class="form-group">
                            <label>Nombre Producto</label>
                            <input type="text" value="<%=prodVO.getNombre()%>" name="txtNombre" class="form-control" required>
                        </div>

                        <button class="btn boton"> Registrar </button>
                        <input type="hidden" value="1" name="opcion">

                        <div>
                            <button class="btn btn-success"> Actualizar </button>
                            <input type="hidden" value="2" name="opcion">
                        </div>

                    </form>


                </div>
            </div>
            <div class="col-sm-8">
                <div class=" mx-auto mt-4 d-flex">
                    <div class="col-md-5 ms-5 mt-3">

                        <label>Carga Masiva <b>Archivo Excel(xlsx)</b></label>
                        <form action="Producto" method="post" enctype="multipart/form-data" class="form-group">
                            <input type="file" name="archivocsv" class="form-control">
                            <button class="btn boton mt-3 col-sm-6">Cargar
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-upload" viewBox="0 0 16 16">
                                <path d="M.5 9.9a.5.5 0 0 1 .5.5v2.5a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1v-2.5a.5.5 0 0 1 1 0v2.5a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2v-2.5a.5.5 0 0 1 .5-.5z"/>
                                <path d="M7.646 1.146a.5.5 0 0 1 .708 0l3 3a.5.5 0 0 1-.708.708L8.5 2.707V11.5a.5.5 0 0 1-1 0V2.707L5.354 4.854a.5.5 0 1 1-.708-.708l3-3z"/>
                                </svg></button>
                            <input type="hidden" value="11" name="opcion">
                        </form>
                    </div>
                    <div class="">
                        <form action="Producto" method="post" class="form-group" enctype="multipart/form-data">
                            <button  class="boton btn mt-5 ms-5" title="Reporte de Producto">
                                Generar Reporte
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-download" viewBox="0 0 16 16">
                                <path d="M.5 9.9a.5.5 0 0 1 .5.5v2.5a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1v-2.5a.5.5 0 0 1 1 0v2.5a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2v-2.5a.5.5 0 0 1 .5-.5z"/>
                                <path d="M7.646 11.854a.5.5 0 0 0 .708 0l3-3a.5.5 0 0 0-.708-.708L8.5 10.293V1.5a.5.5 0 0 0-1 0v8.793L5.354 8.146a.5.5 0 1 0-.708.708l3 3z"/>
                                </svg>
                            </button>
                            <input type="hidden" value="10" name="opcion">
                        </form>
                    </div>
                    <div class="col-md-3 mt-3 ms-5">
                        <label class="mdl-button mdl-js-button mdl-button--icon" for="buscar">
                            <i class="zmdi zmdi-search">Buscar</i>
                        </label>

                        <input type="text" onkeyup="doSearch()" class="form-control"  id="buscar">
                        <label class="mdl-textfield__label"></label>
                    </div>
                </div>
                <table id="datos" class="table">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%

                            ArrayList<ProductoVO> listaProductos = prodDAO.listar();
                            for (int i = 0; i < listaProductos.size(); i++) {

                                prodVO = listaProductos.get(i);

                        %>
                        <tr>
                            <<td><%=prodVO.getIdProducto()%></td>
                            <td><%=prodVO.getNombre()%></td>
                            <td>
                                <form method ="post" action="Producto" class="form-group" enctype="multipart/form-data">

                                    <input type="hidden" name="txtIdMateriaPrima" value="<%=prodVO.getIdProducto()%>">
                                    <input type="hidden"  value="4" name="opcion">
                                    <button class="btn btn-warning">Editar</button>
                                </form>

                                <form method ="post" action="Producto" class="form-group" enctype="multipart/form-data">
                                    <input type="hidden" name="txtIdMateriaPrima" value="<%=prodVO.getIdProducto()%>">
                                    <button class="btn btn-danger">Eliminar</button>
                                    <input type="hidden" value="3" name="opcion">

                                </form>
                            </td>
                        </tr>
                    </tbody>
                    <% }%>
                </table>
            </div>
        </div>


        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
