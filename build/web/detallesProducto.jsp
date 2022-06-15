<%-- 
    Document   : ProductoFinal
    Created on : 7/06/2022, 02:13:49 PM
    Author     : AdminSena
--%>

<%@page import="ModeloVO.ProductoVO"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page import="ModeloDAO.DetallesProductoDAO"%>
<%@page import="ModeloVO.DetallesProductoVO"%>
<%@page import="java.util.ArrayList"%>
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
                            <button id="bntRegistrar"  type="button" class="boton btn mt-5" >Registrar
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-circle" viewBox="0 0 16 16">
                                <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
                                <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
                                </svg>
                            </button>
                        </div>
                        <label class="mt-3">Buscar</label><br>
                        <input type="text" onkeyup="doSearch()" class="form-control col-md-3"  id="buscar">
                    </div>
                    <div class="actualizarTBody" id="actualizarTBody">
                        <table id="datos" class="table text-center table-bordered border-dark table-hover table-responsive">
                            <thead class="table-dark">
                                <tr>
                                    <th>Id</th>
                                    <th>Id Producto</th>
                                    <th>Talla</th>
                                    <th>Descripcion</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    DetallesProductoVO detProVO = new DetallesProductoVO();
                                    DetallesProductoDAO detProDAO = new DetallesProductoDAO();
                                    ArrayList<DetallesProductoVO> listaDetallesProducto = detProDAO.listar();
                                    for (int i = 0; i < listaDetallesProducto.size(); i++) {
                                        detProVO = listaDetallesProducto.get(i);
                                %>
                                <tr>
                                    <td><%=detProVO.getId_Detalles_Producto()%></td>
                                    <td><%=detProVO.getId_Producto()%></td>
                                    <td><%=detProVO.getTalla()%></td>
                                    <td><%=detProVO.getDescripcion()%></td>
                                    <td>
                                        <div class="d-flex mx-auto justify-content-center" >
                                            <button data-id="<%=detProVO.getId_Detalles_Producto()%>" data-id2="<%=detProVO.getId_Producto()%>" 
                                                    data-id3="<%=detProVO.getTalla()%>"  data-id4="<%=detProVO.getDescripcion()%>"  class="btn boton mt-2  detalles">
                                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-zoom-in" viewBox="0 0 16 16">
                                                <path fill-rule="evenodd" d="M6.5 12a5.5 5.5 0 1 0 0-11 5.5 5.5 0 0 0 0 11zM13 6.5a6.5 6.5 0 1 1-13 0 6.5 6.5 0 0 1 13 0z"/>
                                                <path d="M10.344 11.742c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1 6.538 6.538 0 0 1-1.398 1.4z"/>
                                                <path fill-rule="evenodd" d="M6.5 3a.5.5 0 0 1 .5.5V6h2.5a.5.5 0 0 1 0 1H7v2.5a.5.5 0 0 1-1 0V7H3.5a.5.5 0 0 1 0-1H6V3.5a.5.5 0 0 1 .5-.5z"/>
                                                </svg>
                                            </button>
                                            <button data-id5="<%=detProVO.getId_Detalles_Producto()%>" data-id6="<%=detProVO.getId_Producto()%>" 
                                                    data-id7="<%=detProVO.getTalla()%>"  data-id8="<%=detProVO.getDescripcion()%>" class="btn boton ms-3 mt-2 eliminar">
                                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash3" viewBox="0 0 16 16">
                                                <path d="M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5ZM11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H2.506a.58.58 0 0 0-.01 0H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1h-.995a.59.59 0 0 0-.01 0H11Zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5h9.916Zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47ZM8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5Z"/>
                                                </svg>
                                            </button>
                                        </div>
                                    </td>
                                </tr>
                                <% }%>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>        
        <%--Modal Registrar--%>
        <div class="modal fade" id="registrarDetProModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header ">
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <h4 class="text-center">Registrar Detalles de Producto</h4>
                        <div class="d-flex mt-4">
                            <select name="idProductoReg" id="idProductoReg" class="form-select">
                                <option>Id Producto</option>
                                <%
                                    ProductoDAO proDAO = new ProductoDAO();
                                    for (ProductoVO proVO : proDAO.listar()) {
                                %>
                                <option value="<%=proVO.getIdProducto()%>"><%=proVO.getNombre()%></option>
                                <%}%>
                            </select>
                            <select name="txtTalla" id="txtTallaReg" class="form-select">
                                <option>Seleccione Talla</option>
                                <option>M</option>
                                <option>L</option>
                                <option>S</option>
                                <option>XL</option>
                            </select>
                        </div>
                        <textarea name="txtDescripcion" id="txtDescripcionReg" placeholder="Descripcion" class="form-control mt-3"></textarea>
                        <button class="btn boton mt-3" id="registrarDetPro">Registrar</button>
                        <input type="hidden" id="opcionReg" value="1">
                        <div id="respuestaRegistrar">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%--Modal Editar--%>
        <div class="modal fade" id="editarDetProModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header ">
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">

                        <h4 class="text-center">Editar Detalles de Producto<label id="IdDetallesProdEdit"></label></h4>
                        <div class="d-flex mt-4">
                            <select name="idProductoEdit" id="idProductoEdit" class="form-select">
                                <option id="opcionidProductoEdit"></option>
                                <%
                                    ProductoDAO proDAOedit = new ProductoDAO();
                                    for (ProductoVO proVO : proDAOedit.listar()) {
                                %>
                                <option value="<%=proVO.getIdProducto()%>"><%=proVO.getNombre()%></option>
                                <%}%>
                            </select>
                            <select name="txtTalla" id="txtTallaEdit" class="form-select">
                                <option id="opciontxtTallaEdit"></option>
                                <option>M</option>
                                <option>L</option>
                                <option>S</option>
                                <option>XL</option>
                            </select>
                        </div>
                        <input type="text" name="txtDescripcion" id="txtDescripcionEdit" placeholder="Descripcion" class="form-control mt-3">
                        <button class="btn boton mt-3" id="editarDetPro">Registrar</button>
                        <input type="hidden" id="opcionedit" value="2">
                        <div id="respuestaEdit">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%--Modal Eliminar--%>
        <div class="modal fade" id="EliminarDetProModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header ">
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="col-md-8 mx-auto">
                            <h5 class="text-center text-danger mb-5" id="staticBackdropLabel">¿Esta seguro que desea Eliminar este Detalles Producto?</h5>
                            <table class="table table-hover table-light table-responsive text-center">
                                <thead>
                                    <tr>
                                        <th>Id</th>
                                        <th>Id Producto</th>
                                        <th>Talla</th>
                                        <th>Descripcion</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td id="idDel"></td>
                                        <td id="idProDel"></td>
                                        <td id="idTallDel"></td>
                                        <td id="idDescrDel"></td>
                                    </tr>
                                </tbody>
                            </table>
                            <button class="btn btn-danger d-inline-block mx-auto ms-5 justify-content-center mt-3" id="eliDetPro">Eliminar</button>
                            <input type="hidden" id="opcionDel" value="3">
                            <div id="respuestaDel">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
            <script src="http://code.jquery.com/jquery-latest.js"></script>
            <script src="js/JS/ControladorDetallesProducto.js"></script>
    </body>
</html>