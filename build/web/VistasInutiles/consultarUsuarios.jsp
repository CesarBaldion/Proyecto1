<%-- 
    Document   : consultarUsuarios
    Created on : 22/03/2022, 08:37:29 AM
    Author     : Sena
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navegacion.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/">
        <title>JSP Page</title>
    </head>

    <body>
        <h1 class="text-center mb-5 mt-3">Usuarios</h1>
        <div class="col-md-4 justify-content-center mx-auto mt-5 d-flex">
            <div class="col-md-5 me-3 ">
                <label>Buscar</label>
                <label class="" for="buscar">
                    <i class="zmdi zmdi-search"></i>
                </label>
                <input type="text" onkeyup="doSearch()" class="form-control"  id="buscar">
                <label class=""></label>
                <%if (request.getAttribute("mensajeError") != null) {%>
                <p class="text-danger text-center fs-5">${mensajeError}</p>
                <%   } else {%>
                <p class="text-success text-center fs-5">${mensajeExito}</p>
                <%}%>
            </div>
            <div class="col-md-6">
                <label>Generar Reporte</label>
                <form action="Usuarios" method="post" class="form-group" enctype="multipart/form-data">
                    <select name="txtEstado" class="form-select">
                        <option selected>Escoja Una Opcion</option>
                        <option value="1">Usuarios Activos</option>
                        <option value="0">Usuarios Inactivos</option>
                    </select>
                    <button class="btn boton mt-3">
                        Generar Reporte
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-download" viewBox="0 0 16 16">
                        <path d="M.5 9.9a.5.5 0 0 1 .5.5v2.5a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1v-2.5a.5.5 0 0 1 1 0v2.5a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2v-2.5a.5.5 0 0 1 .5-.5z"/>
                        <path d="M7.646 11.854a.5.5 0 0 0 .708 0l3-3a.5.5 0 0 0-.708-.708L8.5 10.293V1.5a.5.5 0 0 0-1 0v8.793L5.354 8.146a.5.5 0 1 0-.708.708l3 3z"/>
                        </svg>
                    </button>
                    <input type="hidden" value="10" name="opcion">
                </form>
            </div>
            <div class="col-md-7 ms-5">
                <label>Carga Masiva <b>Archivo Excel(xlsx)</b></label>
                <form action="Usuarios" method="post" enctype="multipart/form-data" class="form-group" name="pruebaConfirmacion">
                    <input type="file" name="archivocsv" class="form-control">
                    <button type="button" class="btn boton mt-3" data-bs-toggle="modal" data-bs-target="#staticBackdrop">Cargar
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-upload" viewBox="0 0 16 16">
                        <path d="M.5 9.9a.5.5 0 0 1 .5.5v2.5a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1v-2.5a.5.5 0 0 1 1 0v2.5a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2v-2.5a.5.5 0 0 1 .5-.5z"/>
                        <path d="M7.646 1.146a.5.5 0 0 1 .708 0l3 3a.5.5 0 0 1-.708.708L8.5 2.707V11.5a.5.5 0 0 1-1 0V2.707L5.354 4.854a.5.5 0 1 1-.708-.708l3-3z"/>
                        </svg></button>
                    <input type="hidden" value="11" name="opcion">
                </form>
            </div>
        </div>   
        <div class="col-md-11 mx-auto justify-content-center mt-4">
            <div class="col-md-12 mx-auto justify-content-center">
                <table number-per-page="10" class="table table-light table-hover table-striped text-center">
                    <tr>
                        <th>Id</th>
                        <th>Nombres</th>
                        <th>Documento</th>
                        <th>Telefono</th>
                        <th>Email</th>
                        <th>Direccion</th>
                        <th>Ciudad</th>


                    </tr>
                    <%
                        UsuarioVO usuVO = new UsuarioVO();
                        UsuarioDAO usuDAO = new UsuarioDAO();

                        ArrayList<UsuarioVO> ListaUsuarios = usuDAO.Listar();

                        for (int i = 0; i < ListaUsuarios.size(); i++) {

                            usuVO = ListaUsuarios.get(i);

                    %>
                    <tr>
                        <td><%=usuVO.getIdUsuarios()%></td>
                        <td><%=usuVO.getNombre()%></td>
                        <td><%=usuVO.getDocumento()%></td>
                        <td><%=usuVO.getTelefono()%></td>
                        <td><%=usuVO.getEmail()%></td>
                        <td><%=usuVO.getDireccion()%></td>
                        <td><%=usuVO.getCiudad()%></td>
                        

                        <td>
                            <form action="Usuarios" method="post" enctype="multipart/form-data">
                                <input type="hidden" value="<%=usuVO.getIdUsuarios()%>" name="txtId">
                                <input type="hidden" value="<%=usuVO.getNombre()%>"  name= "txtNombre" class="form-control ms-1  mt-2" >
                                <input type="hidden" value="<%=usuVO.getDocumento()%>" name= "txtDocumento"  class=" form-control  ms-3 mt-2" >
                                <input type="hidden" value="<%=usuVO.getTelefono()%>" name= "txtTelefono"  class="form-control  ms-1  mt-2">
                                <input type="hidden" value="<%=usuVO.getDireccion()%>" name= "txtDireccion"  class="form-control ms-3 mt-2">
                                <input type="hidden" value="<%=usuVO.getEmail()%>" name= "txtEmail"  class="form-control ms-1 mt-2">
                                <input type="hidden" value="<%=usuVO.getEstado()%>" name= "txtEstado"  class="form-control ms-1 mt-2">
                                <input type="hidden" value="<%=usuVO.getContrasena()%>" name= "txtEstado"  class="form-control ms-1 mt-2">
                                <button class="btn boton">Añadir Rol</button>
                                <input type="hidden" value="9" name="opcion">
                            </form>
                        </td>
                    </tr>
                    <% }%>

                </table>

            </div> 
        </div>
        <%--
        Ventanas Modales
        --%>
        <div class="modal fade " id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
             aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered modal-sm mt-5 ">
                <div class="modal-content ventana ">
                    <div class="justify-content-center mx-auto">
                        <h5 class="text-center">Confirmar Envio De Datos</h5>
                    </div>
                    <div class="col-md-2 justify-content-center mx-auto d-flex mb-3 ">
                        <button type="button" class="btn btn-danger  me-3" data-bs-dismiss="modal">Volver</button>
                        <button type="button" onclick="enviar()" class="btn boton">Enviar</button>
                    </div>
                </div>
            </div>
        </div>
        <script>
            function enviar() {
                document.pruebaConfirmacion.submit()
            }
            ;
        </script>
        <script src="https://code.jquery.com/jquery-3.4.1.js"
                integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous">
        </script>
        <!-- DATATABLES -->
        <script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js">
        </script>
        <!-- BOOTSTRAP -->
        <script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js">
        </script>
        <script>
            $(document).ready(function () {
                $('#tablax').DataTable({
                    language: {
                        processing: "Tratamiento en curso...",
                        search: "Buscar&nbsp;:",
                        lengthMenu: "Agrupar de _MENU_ items",
                        info: "Mostrando del item _START_ al _END_ de un total de _TOTAL_ items",
                        infoEmpty: "No existen datos.",
                        infoFiltered: "(filtrado de _MAX_ elementos en total)",
                        infoPostFix: "",
                        loadingRecords: "Cargando...",
                        zeroRecords: "No se encontraron datos con tu busqueda",
                        emptyTable: "No hay datos disponibles en la tabla.",
                        paginate: {
                            first: "Primero",
                            previous: "Anterior",
                            next: "Siguiente",
                            last: "Ultimo"
                        },
                        aria: {
                            sortAscending: ": active para ordenar la columna en orden ascendente",
                            sortDescending: ": active para ordenar la columna en orden descendente"
                        }
                    },
                    scrollY: 400,
                    lengthMenu: [[10, 25, -1], [10, 25, "All"]];
                });
            });
        </script>
    </body>
</html>