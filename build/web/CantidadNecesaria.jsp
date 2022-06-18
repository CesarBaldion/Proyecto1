<%-- 
    Document   : consultarCantidadNecesaria
    Created on : 5/04/2022, 07:17:55 AM
    Author     : ESCOBAR
--%>
<%@include file="Sesiones.jsp" %>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page import="ModeloVO.ProductoVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.DetallesProductoVO"%>
<%@page import="ModeloDAO.DetallesProductoDAO"%>
<%@page import="ModeloVO.MateriaPrimaVO"%>
<%@page import="ModeloDAO.MateriaPrimaDAO"%>
<%@page import="ModeloDAO.CantidadNecesariaDAO"%>
<%@page import="ModeloVO.CantidadNecesariaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html><html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.12.1/css/jquery.dataTables.css">

        <link rel="stylesheet" href="css/estilos.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="col-md-10 mx-auto ">
            <h1 class="text-center mb-5 ">Cantidad Necesaria</h1>
            <div class="d-flex"> 
                <div>
                    <button id="btnAñadir"  type="button" class="boton btn mt-5" >Registrar
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-circle" viewBox="0 0 16 16">
                        <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
                        <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
                        </svg>
                    </button>
                </div>
            </div>
            <div class="actualizarTBody" id="actualizarTBody">
                <table id="tableCantidadNec" class="table text-center border-dark ">
                    <thead class="table-dark">
                        <tr>
                            <th>Materia Prima</th>
                            <th>Producto</th>
                            <th>Talla</th>
                            <th>Descripcion</th>
                            <th>Cantidad Materia Prima en Producto</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%                            ProductoVO proVOll = new ProductoVO();
                            ProductoDAO proDAOll = new ProductoDAO();

                            MateriaPrimaVO mtVOll = new MateriaPrimaVO();
                            MateriaPrimaDAO mtDAOll = new MateriaPrimaDAO();

                            DetallesProductoDAO detallProDAOll = new DetallesProductoDAO();
                            DetallesProductoVO detallProVOll = new DetallesProductoVO();

                            CantidadNecesariaVO cantNecVOll = new CantidadNecesariaVO();
                            CantidadNecesariaDAO cantNecDAOll = new CantidadNecesariaDAO();
                            ArrayList<CantidadNecesariaVO> listaCantidadNecesariall = cantNecDAOll.listar();
                            for (int i = 0; i < listaCantidadNecesariall.size(); i++) {
                                cantNecVOll = listaCantidadNecesariall.get(i);

                                detallProVOll = detallProDAOll.consultarDetallesProducto(cantNecVOll.getId_Detalles_Producto());
                                mtVOll = mtDAOll.consultarIdMateriaPrima(cantNecVOll.getId_Materia_Prima());
                                proVOll = proDAOll.consultarProducto(detallProVOll.getId_Producto());
                        %>
                        <tr>
                            <td><%=mtVOll.getNombre()%></td>
                            <td><%=proVOll.getNombre()%></td>
                            <td><%=detallProVOll.getTalla()%></td>
                            <td><%=detallProVOll.getDescripcion()%></td>
                            <td><%=cantNecVOll.getMateriaprimaenproducto()%></td>
                            <td>
                                <div class="d-flex " >
                                    <div>
                                        <button data-idcantnec="<%=cantNecVOll.getIdCantidadNecesaria()%>"
                                                data-iddetproduc="<%=cantNecVOll.getId_Detalles_Producto()%>"
                                                data-idmatpri="<%=cantNecVOll.getId_Materia_Prima()%>"
                                                data-matnombre="<%=mtVOll.getNombre()%>"
                                                data-pronombre="<%=proVOll.getNombre()%>"
                                                data-talla="<%=detallProVOll.getTalla()%>"
                                                data-descrip="<%=detallProVOll.getDescripcion()%>"
                                                data-matenpro="<%=cantNecVOll.getMateriaprimaenproducto()%>"
                                                class="btn boton mt-2  detalles">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-zoom-in" viewBox="0 0 16 16">
                                            <path fill-rule="evenodd" d="M6.5 12a5.5 5.5 0 1 0 0-11 5.5 5.5 0 0 0 0 11zM13 6.5a6.5 6.5 0 1 1-13 0 6.5 6.5 0 0 1 13 0z"/>
                                            <path d="M10.344 11.742c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1 6.538 6.538 0 0 1-1.398 1.4z"/>
                                            <path fill-rule="evenodd" d="M6.5 3a.5.5 0 0 1 .5.5V6h2.5a.5.5 0 0 1 0 1H7v2.5a.5.5 0 0 1-1 0V7H3.5a.5.5 0 0 1 0-1H6V3.5a.5.5 0 0 1 .5-.5z"/>
                                            </svg>
                                        </button>
                                    </div>
                                    <div>
                                        <button data-idcantnec2="<%=cantNecVOll.getIdCantidadNecesaria()%>"
                                                data-iddetproduc2="<%=cantNecVOll.getId_Detalles_Producto()%>"
                                                data-idmatpri2="<%=cantNecVOll.getId_Materia_Prima()%>"
                                                data-matnombre2="<%=mtVOll.getNombre()%>"
                                                data-pronombre2="<%=proVOll.getNombre()%>"
                                                data-talla2="<%=detallProVOll.getTalla()%>"
                                                data-descrip2="<%=detallProVOll.getDescripcion()%>"
                                                data-matenpro2="<%=cantNecVOll.getMateriaprimaenproducto()%>"  class="btn boton ms-3 mt-2 eliminar">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash3" viewBox="0 0 16 16">
                                            <path d="M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5ZM11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H2.506a.58.58 0 0 0-.01 0H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1h-.995a.59.59 0 0 0-.01 0H11Zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5h9.916Zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47ZM8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5Z"/>
                                            </svg>
                                        </button>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <% }%>
                    </tbody>
                </table>
            </div>
        </div>



        <%--Modal Editar--%>
        <div class="modal fade cantNec" id="editarCantidaNecModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog ">
                <div class="modal-content">
                    <div class="modal-header ">
                        <button type="button" class="btn-close botonCerrar" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div>
                            <h5>Editar Cantidad Necesaria <label id="cantNecEdit"></label></h5>
                            <form method="post" action="CantidadNecesaria" >
                                <div class="col-md-10 mx-auto justify-content-center">
                                    <div class="d-flex d-inline-block input-group">
                                        <div class="mx-auto justify-content-center col-md-6">
                                            <label>Id Materia Prima</label>
                                            <select name="Id_Materia_Prima" id="IdMateriaPrimaEdit" class="form-select">
                                                <option id="opcionIdMateriaPrimaEdit"></option>
                                            </select>
                                        </div>
                                        <div class="mx-auto justify-content-center col-md-6 ">
                                            <label>Id detalles Producto</label>
                                            <select name="Id_Detalles_Producto" id="idDetProdEdit" class="form-select" >
                                                <option id="opcionidDetProdEdit"></option>
                                            </select>
                                        </div>
                                    </div>
                                    <label class="mt-2">Cantidad Necesaria de Materia Prima para el Producto</label>
                                    <input type="text" name="materiaprimaenproducto" id="materiaprimaenproductoEdit" required class="form-control" placeholder="Cantidad de Materia Prima">
                                    <input type="hidden" name="opcion" id="opcionedit" value="2">
                                    <button class="btn boton mt-3" id="editarCantNec">Registrar</button> 
                                </div>
                            </form>
                            <div id="respuestaEdit">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
                                            
        <%--Modal Registrar--%>
        <div class="modal fade cantNec" id="registrarCantidaNec" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog ">
                <div class="modal-content">
                    <div class="modal-header ">
                        <button type="button" class="btn-close botonCerrar" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div>
                            <form method="post" action="CantidadNecesaria" >
                                <div class="col-md-10 mx-auto justify-content-center">
                                    <div class="d-flex d-inline-block input-group">
                                        <div class="mx-auto justify-content-center col-md-6">
                                            <label>Id Materia Prima</label>
                                            <select name="Id_Materia_Prima" id="IdMateriaPrimaReg" class="form-select">
                                                <%
                                                    MateriaPrimaDAO mtDAOedit = new MateriaPrimaDAO();
                                                    for (MateriaPrimaVO mtVOedit : mtDAOedit.Listar()) {
                                                %>
                                                <option value="<%=mtVOedit.getId_materia_Prima()%>"><%=mtVOedit.getNombre()%></option>
                                                <% }%>
                                            </select>
                                        </div>
                                        <div class="mx-auto justify-content-center col-md-6">
                                            <label>Id detalles Producto</label>
                                            <select name="Id_Detalles_Producto" id="idDetProdReg" class="form-select">

                                                <%
                                                    ProductoVO proVOedit = new ProductoVO();
                                                    ProductoDAO proDAOedit = new ProductoDAO();

                                                    DetallesProductoDAO detallProDAOedit = new DetallesProductoDAO();
                                                    for (DetallesProductoVO detallProVOedit : detallProDAOedit.listar()) {
                                                        proVOedit = proDAOedit.consultarProducto(detallProVOedit.getId_Producto());
                                                %>
                                                <option value="<%=detallProVOedit.getId_Detalles_Producto()%>"><%=proVOedit.getNombre() + " talla-" + detallProVOedit.getTalla()%></option>
                                                <% }%>
                                            </select>
                                        </div>
                                    </div>
                                    <input type="text" name="materiaprimaenproducto" id="materiaprimaenproductoReg" required class="mt-3 form-control" placeholder="Cantidad de Materia Pri">
                                    <input type="hidden" name="opcion" id="opcionReg" value="1">
                                    <button class="btn boton mt-3" id="registrarCantNec">Registrar</button> 
                                </div>
                            </form>
                            <div id="respuestaRegistrar">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <%--Modal Eliminar--%>
        <div class="modal fade" id="eliminarCantidadNecModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header ">
                        <button type="button" class="btn-close botonCerrar" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="col-md-12 mx-auto">
                            <h5 class="text-center text-danger mb-5" id="staticBackdropLabel">¿Esta seguro que desea Eliminar esta Cantidad Necesaria?</h5>
                            <table class="table table-hover table-light table-responsive text-center">
                                <thead>
                                    <tr>
                                        <th>Materia Prima<br><b id="idMtDel"></b></th>
                                        <th>Producto <br><b id="idDetProDel"></b></th>
                                        <th>Talla</th>
                                        <th>Descripcion</th>
                                        <th>Cantidad Materia Prima en Producto</th>

                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td id="nameMtDel"></td>
                                        <td id="nameProDel"></td>
                                        <td id="idTallDel"></td>
                                        <td id="idDescrDel"></td>
                                        <td id="mtEnProDel"></td>
                                    </tr>
                                </tbody>
                            </table>
                            <button class="btn btn-danger d-inline-block mx-auto ms-5 justify-content-center mt-3" id="EliCanNec">Eliminar</button>
                            <input type="hidden" value="" id="idcantNec">
                            <input type="hidden" id="opcionDel" value="3">
                            <div id="respuestaDel">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="js/JS/ControladorCantidadNecesaria.js"></script>
    </body>
</html>
