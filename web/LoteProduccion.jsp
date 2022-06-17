<%-- 
    Document   : LoteProduccion
    Created on : 10-jun-2022, 14:30:36
    Author     : 1Usuario
--%>

<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloVO.OrdenDetallesVO"%>
<%@page import="ModeloDAO.OrdenDetallesDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.LoteProduccionDAO"%>
<%@page import="ModeloVO.LoteProduccionVO"%>
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
            <div class="col-md-12 d-flex mt-5 mx-auto">
                <div class="col-md-12 ms-4">
                    <div class="col-md-12">
                        <div class="col-md-12 d-flex  "> 
                            <button id="btnAñadirOrden"  type="button" class="boton btn mt-5" data-bs-toggle="modal" data-bs-target="#registrarLoteProduccionModal" >Registrar
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-circle" viewBox="0 0 16 16">
                                <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
                                <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
                                </svg>
                            </button>
                            <form action="LoteProduccion" method="post" class="form-group">
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
                            <thead class="table-dark">
                                <tr>
                                    <th>Id</th>
                                    <th>Nombre Usuario</th>
                                    <th>Orden Produccion</th>
                                    <th>Cantidad</th>
                                    <th>Fecha Fabricacion</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    UsuarioVO usuVOlistar = new UsuarioVO();
                                    UsuarioDAO usuDAO = new UsuarioDAO(usuVOlistar);

                                    LoteProduccionVO ltProduccVO = new LoteProduccionVO();
                                    LoteProduccionDAO ltProduccDAO = new LoteProduccionDAO(ltProduccVO);

                                    ArrayList<LoteProduccionVO> listaLoteProduccion = ltProduccDAO.Listar();
                                    for (int i = 0; i < listaLoteProduccion.size(); i++) {
                                        ltProduccVO = listaLoteProduccion.get(i);
                                        usuVOlistar = usuDAO.consultaruSUARIO(ltProduccVO.getId_Usuarios());

                                %>
                                <tr>
                                    <td><%=ltProduccVO.getId_Lote_Produccion()%></td>
                                    <td><%=usuVOlistar.getNombre()%></td>
                                    <td><%=ltProduccVO.getId_orden_Detalles()%></td>
                                    <td><%=ltProduccVO.getCantidad()%></td>
                                    <td><%=ltProduccVO.getFecha_Fabricacion()%></td>
                                    <td>
                                        <div class="d-flex mx-auto justify-content-center" >
                                            <button data-id="<%=ltProduccVO.getId_Lote_Produccion()%>" data-id2="<%=ltProduccVO.getId_Usuarios()%>"
                                                    data-id3="<%=ltProduccVO.getId_orden_Detalles()%>" data-id4="<%=ltProduccVO.getCantidad()%>"
                                                    data-id5="<%=ltProduccVO.getFecha_Fabricacion()%>" class="btn boton mt-2  detalles">
                                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-zoom-in" viewBox="0 0 16 16">
                                                <path fill-rule="evenodd" d="M6.5 12a5.5 5.5 0 1 0 0-11 5.5 5.5 0 0 0 0 11zM13 6.5a6.5 6.5 0 1 1-13 0 6.5 6.5 0 0 1 13 0z"/>
                                                <path d="M10.344 11.742c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1 6.538 6.538 0 0 1-1.398 1.4z"/>
                                                <path fill-rule="evenodd" d="M6.5 3a.5.5 0 0 1 .5.5V6h2.5a.5.5 0 0 1 0 1H7v2.5a.5.5 0 0 1-1 0V7H3.5a.5.5 0 0 1 0-1H6V3.5a.5.5 0 0 1 .5-.5z"/>
                                                </svg>
                                            </button>
                                            <button data-id6="<%=ltProduccVO.getId_Lote_Produccion()%>" data-id7="<%=ltProduccVO.getId_Usuarios()%>"
                                                    data-id8="<%=ltProduccVO.getId_orden_Detalles()%>" data-id9="<%=ltProduccVO.getCantidad()%>"
                                                    data-id10="<%=ltProduccVO.getFecha_Fabricacion()%>" class="btn boton ms-3 mt-2 eliminar">
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

        <%--Ventana Editar --%>
        <div class="modal fade" id="editarLoteProduccion" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header ">
                        <h5 class="modal-title" id="staticBackdropLabel">Editar Lote Produccion N.<label id="idLoteProduccionEdit"></label></h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form>
                            <div class="row">
                                <div class="col-md-12">
                                    <input type="hidden" value="" id="idUsuarioEdit">
                                    <div class="col-md-12 d-flex"> 
                                        <div class="col-md-6">
                                            <label>Cantidad</label>
                                            <input type="text" id="cantidadEdit" placeholder="Cantidad" class="form-control mt-2">
                                        </div>
                                        <div class="col-md-6 ms-1">
                                            <label>Id Orden Detalles</label>
                                            <select id="idOrDetallesIdEdit" class="form-select mt-2">
                                                <option id="opcionOrdenDetEdit">Seleccione Id orden detalles...</option>
                                                <%
                                                    OrdenDetallesDAO odDAO = new OrdenDetallesDAO();
                                                    for (OrdenDetallesVO odVO : odDAO.Listar()) {

                                                %>
                                                <option value="<%=odVO.getId_Ordenes()%>"><%=odVO.getId_Ordenes()%></option>
                                                <%}%>
                                            </select>
                                        </div>
                                    </div>
                                    <input type="hidden" value="2" id="opcionedit">
                                    <input type="button" id="submitEdit" value="Guardar" class="btn boton mt-3"> 
                                </div>
                            </div>
                        </form>
                        <div class="col-md-8 mx-auto justify-content-center">
                            <div id="respuestaEdit"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <%--Ventana Eliminar --%>
        <div class="modal fade" id="eliminarLoteProduccion" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header ">
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="col-md-10 mx-auto">
                            <h5 class="text-center text-danger mb-5" id="staticBackdropLabel">¿Esta seguro que desea Eliminar este Lote de Produccion?</h5>
                            <table class="table table-hover table-light table-responsive text-center">
                                <thead>
                                    <tr>
                                        <th>Id</th>
                                        <th>Id Usuarios</th>
                                        <th>Id orden Detalles</th>
                                        <th>Cantidad</th>
                                        <th>Fecha Fabricacion</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td id="idLoteProduccionDel"></td>
                                        <td id="idUsuarioDel"></td>
                                        <td id="opcionOrdenDetDel"></td>
                                        <td id="cantidadDel"></td>
                                        <td id="fechaFrabicacionDel"></td>
                                    </tr>
                                </tbody>
                            </table>
                            <form>
                                <input type="hidden" value="3" id="opcioneDel">
                                <input type="button" id="submitDel" value="Eliminar" class="btn btn-danger d-inline-block mx-auto ms-5 justify-content-center mt-3"> 
                                <div id="respuestaDel"></div>
                            </form>
                        </div>
                        <div id="respuestaDel" class="col-md-5 mx-auto justify-content-center">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%--Ventana Modal Registrar --%>
        <div class="modal fade" id="registrarLoteProduccionModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header ">
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <h5 class="text-center mb-3" id="staticBackdropLabel">Registrar<br>Lote Produccion</h5>
                        <form>
                            <div class="row">
                                <div class="col-md-12">
                                    <input type="hidden" value="1" id="idUsuarioReg">
                                    <div class="col-md-12 d-flex mt-3"> 
                                        <div class="col-md-6">
                                            <input type="text" id="cantidadReg" placeholder="Cantidad" class="form-control ">
                                        </div>
                                        <div class="col-md-6 ms-1">
                                            <select id="idOrDetallesIdReg" class="form-select ">
                                                <option>Seleccione la Orden...</option>
                                                <%
                                                    OrdenDetallesDAO odDAOReg = new OrdenDetallesDAO();
                                                    for (OrdenDetallesVO odVOReg : odDAOReg.Listar()) {
                                                %>
                                                <option value="<%=odVOReg.getId_Ordenes()%>"><%=odVOReg.getId_Ordenes()%></option>
                                                <%}%>
                                            </select>
                                        </div>
                                    </div>
                                    <input type="hidden" value="1" id="opcioneReg">
                                    <input type="button" id="submitReg" value="Registrar" class="btn boton mt-3"> 
                                </div>
                            </div>
                        </form>
                        <div id="respuestaRegistrar">
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <script src="js/JS/ControladorLoteProduccion.js"></script>
    </body>
</html>
