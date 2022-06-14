<%-- 
    Document   : consultarCantidadNecesaria
    Created on : 5/04/2022, 07:17:55 AM
    Author     : ESCOBAR
--%>
<%@page import="ModeloVO.DetallesProductoVO"%>
<%@page import="ModeloDAO.DetallesProductoDAO"%>
<%@page import="ModeloVO.MateriaPrimaVO"%>
<%@page import="ModeloDAO.MateriaPrimaDAO"%>
<%@page import="ModeloDAO.CantidadNecesariaDAO"%>
<%@page import="ModeloVO.CantidadNecesariaVO"%>
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
                            <button id="btnAñadir"  type="button" class="btn boton mt-3 me-3" data-bs-toggle="modal" data-bs-target="#modalAñadirOrden" >Registrar
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-circle" viewBox="0 0 16 16">
                                <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
                                <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
                                </svg>
                            </button>
                        </div>
                        <label class="mt-3">Buscar</label><br>
                        <input type="text" onkeyup="doSearch()" class="form-control col-md-3"  id="buscar">
                    </div>
                </div>
            </div>
        </div>
        <%--Modal Registrar--%>
        <div class="modal fade" id="registrarCantidaNec" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header ">
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div>
                            <form method="post" action="CantidadNecesaria" >
                                <select name="Id_Materia_Prima">
                                    <option>Seleccione</option>
                                    <%
                                        MateriaPrimaDAO mtDAOedit = new MateriaPrimaDAO();
                                        for (MateriaPrimaVO mtVO : mtDAOedit.Listar()) {
                                    %>
                                    <option value="<%=mtVO.getId_materia_Prima()%>"><%=mtVO.getNombre()%></option>
                                    <% }%>
                                </select>
                                <select name="Id_Detalles_Producto">
                                    <option>Seleccione</option>
                                    <%
                                        DetallesProductoDAO detallProDAO = new DetallesProductoDAO();
                                        for(DetallesProductoVO detallProVO: detallProDAO.listar()){
                                    %>
                                    <option value="<%=detallProVO.getId_Detalles_Producto()%>"><%=detallProVO.getId_Producto()%></option>
                                    <% }%>
                                </select>
                                <input type="text" name="materiaprimaenproducto" required>
                                <input type="hidden" name="opcion" value="1">
                                <button>Enviar</button>
                            </form>
                        </div>
                        <div id="respuestaRegistrar">
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script src="js/JS/ControladorCantidadNecesaria.js"></script>
    </body>
</html>
