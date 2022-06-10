<%-- 
    Document   : Ordenes
    Created on : 09-jun-2022, 0:27:46
    Author     : 1Usuario
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.OrdenDetallesDAO"%>
<%@page import="ModeloVO.OrdenDetallesVO"%>
<%@page import="ModeloVO.DetallesProductoVO"%>
<%@page import="ModeloDAO.DetallesProductoDAO"%>
<%@page import="ModeloVO.OrdenesVO"%>
<%@page import="ModeloDAO.OrdenesDAO"%>
<%@include file="css-paginacion.jsp" %>
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
        <title>JSP Page</title>
    </head>
    <body>
        <div class="row">
            <div class="col-md-6 d-flex mt-5 mx-auto">
                <div class="col-md-12 ms-4">
                    <div class="col-md-12">
                        <div class="col-md-10 d-flex  "> 
                            <button id="btnAñadirOrden"  type="button" class="btn boton mt-3 me-3" data-bs-toggle="modal" data-bs-target="#modalAñadirOrden" >Registrar
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-circle" viewBox="0 0 16 16">
                                <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
                                <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
                                </svg>
                            </button>
                            <button id="btnAñadirVariasOrdenes" type="button" class=" btn boton me-3 mt-3" data-bs-toggle="modal" data-bs-target="#modalAñadirVariasOrdenes" >Registrar +Ordenes
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-circle" viewBox="0 0 16 16">
                                <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
                                <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
                                </svg>
                            </button>
                            <form action="OrdenDetalles" method="post" class="form-group">
                                <button  class="boton btn mt-5" title="Reporte de Producto">
                                    Generar Reporte
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-download" viewBox="0 0 16 16">
                                    <path d="M.5 9.9a.5.5 0 0 1 .5.5v2.5a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1v-2.5a.5.5 0 0 1 1 0v2.5a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2v-2.5a.5.5 0 0 1 .5-.5z"/>
                                    <path d="M7.646 11.854a.5.5 0 0 0 .708 0l3-3a.5.5 0 0 0-.708-.708L8.5 10.293V1.5a.5.5 0 0 0-1 0v8.793L5.354 8.146a.5.5 0 1 0-.708.708l3 3z"/>
                                    </svg>
                                </button>
                                <input type="hidden" value="10" name="opcion">
                            </form>
                        </div>
                        <label class="mt-3">Buscar</label><br>
                        <input type="text" onkeyup="doSearch()" class="form-control col-md-3"  id="buscar">
                    </div>
                    <div class="actualizarTBody" id="actualizarTBody">
                        <table id="datos" class="table text-center table-bordered border-dark table-hover table-responsive">

                            <tr class="table-dark">
                                <th>Id</th>
                                <th>Id Orden</th>
                                <th>Id Detalles<br> Producto</th>
                                <th>Cantidad</th>
                                <th>Acciones</th>
                            </tr>
                            <%
                                OrdenDetallesVO orddetllVO = new OrdenDetallesVO();
                                OrdenDetallesDAO orddetllDAO = new OrdenDetallesDAO();

                                ArrayList<OrdenDetallesVO> listaOrdenDetalles = orddetllDAO.Listar();
                                for (int i = 0; i < listaOrdenDetalles.size(); i++) {

                                    orddetllVO = listaOrdenDetalles.get(i);

                            %>
                            <tr>
                                <td><%=orddetllVO.getId_Orden_Detalles()%></td>
                                <td><%=orddetllVO.getId_Orden()%></td>
                                <td><%=orddetllVO.getId_Detalles_Producto()%></td>
                                <td><%=orddetllVO.getCantidadSolicitada()%></td>
                                <td>
                                    <div class="d-flex mx-auto justify-content-center" >
                                        <button data-id="<%=orddetllVO.getId_Orden_Detalles()%>" data-id2="<%=orddetllVO.getId_Orden()%>" data-id3="<%=orddetllVO.getId_Detalles_Producto()%>" data-id4="<%=orddetllVO.getCantidadSolicitada()%>"  class="btn boton mt-2  detalles">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-zoom-in" viewBox="0 0 16 16">
                                            <path fill-rule="evenodd" d="M6.5 12a5.5 5.5 0 1 0 0-11 5.5 5.5 0 0 0 0 11zM13 6.5a6.5 6.5 0 1 1-13 0 6.5 6.5 0 0 1 13 0z"/>
                                            <path d="M10.344 11.742c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1 6.538 6.538 0 0 1-1.398 1.4z"/>
                                            <path fill-rule="evenodd" d="M6.5 3a.5.5 0 0 1 .5.5V6h2.5a.5.5 0 0 1 0 1H7v2.5a.5.5 0 0 1-1 0V7H3.5a.5.5 0 0 1 0-1H6V3.5a.5.5 0 0 1 .5-.5z"/>
                                            </svg>
                                        </button>
                                        <button data-id5="<%=orddetllVO.getId_Orden_Detalles()%>" data-id6="<%=orddetllVO.getId_Orden()%>" data-id7="<%=orddetllVO.getId_Detalles_Producto()%>" data-id8="<%=orddetllVO.getCantidadSolicitada()%>"  class="btn boton ms-3 mt-2 eliminar">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash3" viewBox="0 0 16 16">
                                            <path d="M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5ZM11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H2.506a.58.58 0 0 0-.01 0H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1h-.995a.59.59 0 0 0-.01 0H11Zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5h9.916Zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47ZM8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5Z"/>
                                            </svg>
                                        </button>
                                    </div>
                                </td>
                            </tr>
                            <% }%>
                        </table>
                    </div>
                </div>
            </div>
        </div>

        <%--Modal Añadir una sola Orden--%>
        <div class="modal fade" id="modalAñadirOrden" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog ">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="staticBackdropLabel">Añadir Orden</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="col-md-8 mx-auto">
                            <form class="form-group">
                                <div class="d-flex ">
                                    <div class="col-md-5">
                                        <select name="txtIdOrden" id="txtIdOrden" class="form-select">
                                            <option>Id Orden </option>
                                            <%
                                                OrdenesDAO ordDAO1 = new OrdenesDAO();
                                                for (OrdenesVO ordVO1 : ordDAO1.listar()) {
                                            %>
                                            <option value="<%=ordVO1.getId_Orden()%>"><%=ordVO1.getId_Orden()%></option>
                                            <%}%>
                                        </select>
                                    </div>
                                    <div class="col-md-7 ms-1">
                                        <select name="txtIdDetallesProducto" id="txtIdDetallesProducto" class="form-select">
                                            <option>IdDetalles Producto</option>
                                            <%
                                                DetallesProductoDAO dpDAO1 = new DetallesProductoDAO();
                                                for (DetallesProductoVO dpVO1 : dpDAO1.listar()) {
                                            %>
                                            <option value="<%=dpVO1.getId_Detalles_Producto()%>"><%=dpVO1.getId_Detalles_Producto()%></option>
                                            <%}%>
                                        </select>
                                    </div>       
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control mt-2" name="txtcantidadSolicitada1" id="txtcantidadSolicitada" placeholder="Cantidad">
                                </div>
                                <input type="hidden" value="1" name="opcion" id="opcion">
                                <input type="button" id="submit" value="Guardar" class="btn boton mt-3">
                                <div id="respuesta"></div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <%--Ventana Modal Añadir varias Ordenes--%>
        <div class="modal fade" id="modalAñadirVariasOrdenes" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog modal-xl modal-dialog-scrollable">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="staticBackdropLabel">Añadir Varias Ordenes</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <div class="d-flex">
                                <div class="col-md-5 mx-auto">
                                    <form class="form-group">
                                        <div class="d-flex ">
                                            <div class="col-md-3">
                                                <select name="txtIdOrden" id="idOrdenLista" class="form-select">
                                                    <option>Id Orden </option>
                                                    <%
                                                        OrdenesDAO ordDAO3 = new OrdenesDAO();
                                                        for (OrdenesVO ordVO1 : ordDAO3.listar()) {
                                                    %>
                                                    <option value="<%=ordVO1.getId_Orden()%>"><%=ordVO1.getId_Orden()%></option>
                                                    <%}%>
                                                </select>
                                            </div>
                                            <div class="col-md-5 ms-1">
                                                <select name="txtIdDetallesProducto" id="detallesProductoLista" class="form-select">
                                                    <option>IdDetalles Producto</option>
                                                    <%
                                                        DetallesProductoDAO dpDAO12 = new DetallesProductoDAO();
                                                        for (DetallesProductoVO dpVO12 : dpDAO12.listar()) {
                                                    %>
                                                    <option value="<%=dpVO12.getId_Detalles_Producto()%>"><%=dpVO12.getId_Detalles_Producto()%></option>
                                                    <%}%>
                                                </select>
                                            </div>       
                                        </div>
                                        <div class="col-md-8">
                                            <input type="text" class="form-control mt-2" name="txtcantidadSolicitada" id="cantidadLista" placeholder="Cantidad">
                                        </div>
                                        <input type="hidden" value="5" name="opcionLista" id="opcionLista">
                                        <input type="button" id="submitVarios" value="Guardar" class="btn boton mt-3">
                                    </form>
                                    <div id="respuestaCargaLista"></div>
                                </div>
                                <div class="col-md-7 mx-auto">
                                    <form>
                                        <button class="btn boton" id="cargarLista">Cargar Lista</button>
                                        <input type="hidden" id="opcionCargarLista" value="12">
                                    </form>

                                    <div class="contenerdorLista" id="contenerdorLista">
                                        <table class="table text-center table-bordered border-dark table-hover table-responsive">
                                            <thead>
                                                <tr>
                                                    <th>Num.</th>
                                                    <th>Id Orden</th>
                                                    <th>Id Detalles<br> Producto</th>
                                                    <th>Cantidad</th>
                                                    <th>Acciones</th>
                                                </tr>
                                            </thead>
                                            <tbody id="tabla">
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%--Ventana Editar --%>
        <div class="modal fade" id="editarProductoModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header ">
                        <h5 class="modal-title" id="staticBackdropLabel">Editar Orden</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="col-md-8 mx-auto justify-content-center">

                            <form>
                                <label class="text-center">Id Orden</label>
                                <label id="idOrdenEdit"></label>
                                <div class="d-flex col-md-12">
                                    <div class="col-md-6">
                                        <select id="idDetallesProEdit" class="form-select">
                                            <option id="opcionDetallesProEdit"></option>
                                            <%
                                                DetallesProductoDAO dpDAOedit = new DetallesProductoDAO();
                                                for (DetallesProductoVO dpVOedit : dpDAOedit.listar()) {
                                            %>
                                            <option value="<%=dpVOedit.getId_Detalles_Producto()%>"><%=dpVOedit.getId_Detalles_Producto()%></option>
                                            <%}%>
                                        </select>
                                    </div>
                                    <div class="col-md-6">
                                        <select id="idOrdenesEdit" class="form-select">
                                            <option id="opcionOrdenEdit" ></option>
                                            <%
                                                OrdenesDAO ordDAOedit = new OrdenesDAO();
                                                for (OrdenesVO ordVOedit : ordDAOedit.listar()) {
                                            %>
                                            <option value="<%=ordVOedit.getId_Orden()%>"><%=ordVOedit.getId_Orden()%></option>
                                            <%}%>
                                        </select>
                                    </div>
                                </div>
                                <input type="hidden" value="2" name="opcion" id="opcionEdit">
                                <label>Cantidad</label><br>
                                <input id="cantidadEdit" type="text" required class="form-control">
                                <input type="button" id="submitEdit" value="Editar" class="btn boton d-inline-block mx-auto ms-5 justify-content-center mt-3"> 

                            </form>
                            <div id="respuestaEdit"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%--Ventana Eliminar --%>
        <div class="modal fade" id="eliminarProductoModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header ">
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="col-md-8 mx-auto">
                            <h5 class="text-center text-danger mb-5" id="staticBackdropLabel">¿Esta seguro que desea Eliminar este Producto?</h5>
                            <table class="table table-hover table-light table-responsive text-center">
                                <thead>
                                    <tr>
                                        <th>Id</th>
                                        <th>Id Orden</th>
                                        <th>Id Detalles<br> Producto</th>
                                        <th>Cantidad</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td id="idDel"></td>
                                        <td id="idOrdenDel"></td>
                                        <td id="idOrdenDetallesDel"></td>
                                        <td id="CantidadDel"></td>
                                    </tr>
                                </tbody>
                            </table>
                            <form>
                                <input type="hidden" value="3" id="opcioneDel">
                                <input type="button" id="submitDel" value="Eliminar" class="btn btn-danger d-inline-block mx-auto ms-5 justify-content-center mt-3"> 
                                <div id="respuestaDel"></div>
                            </form>
                        </div>
                        <div id="responseDel" class="col-md-12 mx-auto justify-content-center">
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script src="js/JS/ControladorOrdenes.js"></script>
    </body>
</html>
