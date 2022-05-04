<%-- 
    Document   : registrarRol
    Created on : 28/04/2022, 12:53:12 PM
    Author     : Juan Pablo
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navegacion.jsp" %>
<%@include file="sesionesAdmin.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%

            UsuarioVO usuVO = (UsuarioVO) request.getAttribute("usuarioConsultado");
            if (usuVO != null) {

        %>
        <div class="col-md-3 justify-content-center mx-auto caja border border-info mt-4">
            <h1 class="text-center fs-2 mt-2">Registrar Rol</h1>
            <div class="mx-auto justify-content-center">
                <%if (request.getAttribute("mensajeError") != null) {%>
                <p class="text-danger text-center fs-5">${mensajeError}</p>

                <%   } else {%>
                <p class="text-success text-center fs-5">${mensajeExito}</p>

                <%}%>
            </div>
            <div class="col-md-10 mx-auto mt-4">
                <form method ="post" action="Rol" class="form-group mt-2"> 
                    <input type="text" name="txtroltipo" required="" placeholder="Tipo de rol" class="form-control mt-2">

                    <div class="mt-2 mb-3">
                        <button class="btn boton"> Registrar </button>
                        <input type="hidden" value="1" name="opcion">     
                    </div>
                </form>
            </div>
        </div>
        <% } else {
                request.getRequestDispatcher("consultarUsuarios.jsp").forward(request, response);

            }%>
    </body>

</html>
