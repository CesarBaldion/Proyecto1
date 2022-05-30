<%-- 
    Document   : materiaPrima
    Created on : 24-may-2022, 22:10:36
    Author     : cesar
--%>

<%@page import="ModeloDAO.ProductoDAO"%>
<%@page import="ModeloVO.ProductoVO"%>
<%@page import="java.util.ArrayList"%>
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
        <title>JSP Page</title>
    </head>

    <body>
        <div class="d-flex">
            <div id="editMateria" class="card col-sm-5">
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

                        <button class="btn btn-info"> Registrar </button>
                        <input type="hidden" value="1" name="opcion">

                        <div>
                            <button class="btn btn-success"> Actualizar </button>
                            <input type="hidden" value="2" name="opcion">
                        </div>

                    </form>


                </div>
            </div>
            <div class="col-sm-8">
                <table class="table">
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
