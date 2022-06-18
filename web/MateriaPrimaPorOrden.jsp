<%-- 
    Document   : MateriaPrimaPorOrden
    Created on : 17/06/2022, 09:52:23 PM
    Author     : 57319
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.OrdenDetallesDAO"%>
<%@page import="ModeloVO.OrdenDetallesVO"%>
<%@page import="ModeloDAO.MateriaPrimaDAO"%>
<%@page import="ModeloVO.MateriaPrimaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/estilos.css">

        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.12.1/css/jquery.dataTables.css">
    </head>
    <body>
        <div class="col-md-8 mx-auto ">
            <h1 class="text-center mb-5 ">Materia Prima Por Orden</h1>
            <div class="d-flex"> 
                <div>
                    <form action="MateriaPrima" method="post" class="form-group">
                        <button  class="boton btn" title="Reporte de existencias">
                            Generar Reporte
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-download" viewBox="0 0 16 16">
                            <path d="M.5 9.9a.5.5 0 0 1 .5.5v2.5a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1v-2.5a.5.5 0 0 1 1 0v2.5a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2v-2.5a.5.5 0 0 1 .5-.5z"/>
                            <path d="M7.646 11.854a.5.5 0 0 0 .708 0l3-3a.5.5 0 0 0-.708-.708L8.5 10.293V1.5a.5.5 0 0 0-1 0v8.793L5.354 8.146a.5.5 0 1 0-.708.708l3 3z"/>
                            </svg>
                        </button>
                        <input type="hidden" value="10" name="opcion">
                    </form>
                </div>
            </div>
            <div class="actualizarTBody" id="actualizarTBody">
                <table id="MatPrimXorden" class="table border-dark ">
                    <thead class="table-dark">
                        <tr >
                            <th>Id</th>
                            <th>Detalles <br>Producto</th>
                            <th>Materia<br> Prima</th>
                            <th>Cantidad <br>Solicitada</th>
                            <th>Materia Prima<br> por unidad</th>
                            <th>Materia Prima <br>Necesaria</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            OrdenDetallesVO ordeDettVO = new OrdenDetallesVO();
                            OrdenDetallesDAO ordeDettDAO = new OrdenDetallesDAO();

                            ArrayList<OrdenDetallesVO> listaMateriaPrimaPorOrden = ordeDettDAO.ListarMateriaPrimaEnProducto();
                            for (int i = 0; i < listaMateriaPrimaPorOrden.size(); i++) {
                                ordeDettVO = listaMateriaPrimaPorOrden.get(i);
                        %>
                        <tr>
                            <td><%=ordeDettVO.getId_Ordenes()%></td>
                            <td><%=ordeDettVO.getId_Detalles_Producto()%></td>
                            <td><%=ordeDettVO.getIdMateriaPrima()%></td>
                            <td><%=ordeDettVO.getCantidadSolicitada()%></td>
                            <td><%=ordeDettVO.getMateriaPrimaPorUnidad()%></td>
                            <td><%=ordeDettVO.getMateriaPrimaNecesaria()%></td>
                        </tr>
                        <% }%>
                    </tbody>
                </table>
            </div>
        </div>
        <script>

            $(document).ready(function () {
                $('#MatPrimXorden').DataTable({
                    language: {
                        "emptyTable": "No se encontro ningun resultado",
                        "lengthMenu": "Mostar _MENU_ Registros",
                        "info": "Muestra _START_ de _END_ de _TOTAL_ Registros",
                        "infoEmpty": "Muestra 0 to 0 of 0 Registros",
                        "search": "buscar:",
                        "paginate": {
                            "first": "Primero",
                            "last": "Ultimo",
                            "next": "Siguiente",
                            "previous": "Anterior"
                        },
                    }}
                );
            });
        </script>
    </body>
</html>
