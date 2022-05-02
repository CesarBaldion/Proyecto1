<%-- 
    Document   : registrarUsuarioRol
    Created on : 01-may-2022, 16:37:18
    Author     : 1Usuario
--%>

<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navegacion.jsp" %>
<%@include file="sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="css/estilos.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="col-md-3 justify-content-center mx-auto caja border border-info mt-4">
            <h1 class="text-center fs-2 mt-2">Registrar UsuarioRol</h1>
            <div class="mx-auto justify-content-center">
                <%if (request.getAttribute("mensajeError") != null) {%>
                <p class="text-danger text-center fs-5">${mensajeError}</p>
                <%   } else {%>
                <p class="text-success text-center fs-5">${mensajeExito}</p>
                <%}%>
            </div>
            <div class="col-md-10 mx-auto mt-4">
                <form method ="post" action="UsuarioRol" class="form-group mt-2"> 
                    <select name="txtIdRol" class="form-select mt-3">
                        <option>Seleccione el Rol</option>
                        <%
                            RolDAO rolDAO = new RolDAO();
                            for (RolVO rolVO : rolDAO.listar()) {
                        %>
                        <option value="<%=rolVO.getId_rol()%>"><%=rolVO.getRoltipo()%></option>
                        <%}%>
                    </select>
                    <select name="txtIdUsu" class="form-select mt-3">
                        <option>Seleccione el Usuario</option>
                        <%
                            UsuarioDAO usuDAO = new UsuarioDAO();
                            for (UsuarioVO usuVO : usuDAO.Listar()) {
                        %>
                        <option value="<%=usuVO.getIdUsuarios()%>"><%=usuVO.getNombre()%></option>
                        <%}%>
                    </select>
                    <select class="form-select mt-3" name="txtEstado">
                        <option selected>Seleccion el Estado</option>
                        <option value="1">Activo</option>
                        <option value="0">Inactivo</option>
                    </select>                    <div class="mt-2 mb-3">
                        <button class="btn boton"> Registrar </button>
                        <input type="hidden" value="1" name="opcion">     
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
