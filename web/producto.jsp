<%-- 
    Document   : producto
    Created on : 23-may-2022, 21:32:09
    Author     : cesar
--%>
 <%
        ProductoVO prodVO = new ProductoVO();
        ProductoDAO prodDAO = new ProductoDAO();
        ArrayList<ProductoVO> listaProductos = prodDAO.listar();
    %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page import="ModeloVO.ProductoVO"%>
<%@page import="ModeloVO.ProductoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Producto</title>
        <link rel="stylesheet" href="css/tableado.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <script>
            $(document).ready(function () {
                // Activate tooltip
                $('[data-toggle="tooltip"]').tooltip();

                // Select/Deselect checkboxes
                var checkbox = $('table tbody input[type="checkbox"]');
                $("#selectAll").click(function () {
                    if (this.checked) {
                        checkbox.each(function () {
                            this.checked = true;
                        });
                    } else {
                        checkbox.each(function () {
                            this.checked = false;
                        });
                    }
                });
                checkbox.click(function () {
                    if (!this.checked) {
                        $("#selectAll").prop("checked", false);
                    }
                });
            });
        </script>
    </head>
   
    <body>
        <div class="container-xl">
            <div class="table-responsive">
                <div class="table-wrapper">
                    <div class="table-title">
                        <div class="row">
                            <div class="col-sm-6">
                                <h2>Gestionar <b>Productos</b></h2>
                            </div>
                            <div class="col-sm-6">
                                <a href="#addProductModal" class="btn btn-success" data-toggle="modal" ><i class="material-icons" >&#xE147;</i> <span>Añadir Producto</span></a>
                                <a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Eliminar</span></a>						
                            </div>
                        </div>
                    </div>
                    <div class="mx-auto justify-content-center">
                        <%if (request.getAttribute("error") != null) {%>
                        <div class="container-fluid d-inline-block d-flex mx-auto">
                            <p class="text-danger text-center fs-5 mt-5">${error}</p>
                        </div>
                        <%   } else {%>
                        <p class="text-success text-center fs-5">${Bien}</p>
                        <%}%>
                    </div>
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>
                                    <span class="custom-checkbox">
                                        <input type="checkbox" id="selectAll">
                                        <label for="selectAll"></label>
                                    </span>
                                </th>
                                <th>Id</th>
                                <th>Nombre</th>
                                <th>Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%

                                for (int i = 0; i < listaProductos.size(); i++) {

                                    prodVO = listaProductos.get(i);

                            %>

                            <tr>
                                <td>
                                    <span class="custom-checkbox">
                                        <input type="checkbox" id="checkbox1" name="options[]" value="1">
                                        <label for="checkbox1"></label>
                                    </span>
                                </td>
                                <td><%=prodVO.getIdProducto()%></td>
                                <td><%=prodVO.getNombre()%></td>
                                <td>
                                    <form class="" method="post" action="Producto" enctype="multipart/form-data">
                                        <a href="#editProductModal" name="txtId" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Editar">&#xE254;</i></a>
                                        <a href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Eliminar">&#xE872;</i></a>
                                    </form>
                                </td>
                            </tr>
                            <% }%>

                        </tbody>
                    </table>
                    <div class="clearfix">
                        <div class="hint-text">Showing <b>5</b> out of <b>25</b> entries</div>
                        <ul class="pagination">
                            <li class="page-item disabled"><a href="#">Previous</a></li>
                            <li class="page-item"><a href="#" class="page-link">1</a></li>
                            <li class="page-item"><a href="#" class="page-link">2</a></li>
                            <li class="page-item active"><a href="#" class="page-link">3</a></li>
                            <li class="page-item"><a href="#" class="page-link">4</a></li>
                            <li class="page-item"><a href="#" class="page-link">5</a></li>
                            <li class="page-item"><a href="#" class="page-link">Next</a></li>
                        </ul>
                    </div>
                </div>
            </div>        
        </div>

        <form  class="" method="post" action="Producto" enctype="multipart/form-data">
            <!-- Añadir Modelo HTML -->
            <div id="addProductModal" class="modal fade">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">						
                            <h4 class="modal-title">Añadir Producto</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>Nombre</label>
                                <input type="text" class="form-control" name="txtNombre" required>
                            </div>			
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
                            <div>
                                <button class="btn btn-success"> Añadir </button>
                                <input type="hidden" value="1" name="opcion">
                            </div>

                        </div>

                    </div>
                </div>
            </div>
        </form>

        <form  class="" method="post" action="Producto" enctype="multipart/form-data">        
            <!-- Editar Modelo HTML -->
            <div id="editProductModal" class="modal fade">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">						
                            <h4 class="modal-title">Editar Producto</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true" >&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>Nombre</label>
                                <input type="text" class="form-control" name="txtNombre" value="<%=prodVO.getNombre()%>"  required="">

                            </div>					
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
                            <div>
                                <button class="btn btn-info"> Guardar </button>
                                <input type="hidden" value="2" name="opcion">
                            </div>
                        </div>
                    </div>
                </div>
            </div> 
        </form>


        <!-- Delete Modal HTML -->
        <div id="deleteEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form  method="post" action="Producto" class="form-group" enctype="multipart/form-data"> 
                        <div class="modal-header">						
                            <h4 class="modal-title">Eliminar Producto</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <p>¿Está seguro de eliminar este producto?</p>
                            <p class="text-warning"><small>Esta acción no puede ser deshecha.</small></p>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
                            <input type="hidden" name="txtId" value="<%=prodVO.getIdProducto()%>">
                            <button class="btn btn-danger">Eliminar</button>
                            <input type="hidden" value="6" name="opcion">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>