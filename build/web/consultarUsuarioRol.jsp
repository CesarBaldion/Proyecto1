<%-- 
    Document   : consultarUsuarioRol
    Created on : 01-may-2022, 16:37:37
    Author     : 1Usuario
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.UsuarioRolDAO"%>
<%@page import="ModeloVO.Usuario_rolVO"%>
<%@include file="navegacion.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="col-md-4 justify-content-center mx-auto mt-4">
            <h1 class="text-center">UsuarioRol</h1>
            <div class="col-md-6 mx-auto ">
                <form method="post" action="UsuarioRol" class="form-group">
                    <input type="text" name="txtIdRol" placeholder="Rol" class="form-control">
                    <input type="hidden" value="4" name="opcion">
                    <button class="btn">Consultar</button>
                </form>
                <div class="mensaje">
                    <%
                        if (request.getAttribute("mensajeError") != null) {%>
                    ${mensajeError}
                    <%}%>
                </div>
            </div>
        </div>
        <div class="col-md-9 mx-auto justify-content-center mt-4">
            <div class="col-md-7 mx-auto justify-content-center">
                <table class="table table-light table-hover table-striped text-center">
                    <tr>
                        <th>Rol</th>
                        <th>Usuario</th>
                        <th>Estado</th>
                    </tr>
                    <%
                        Usuario_rolVO uRVO = new Usuario_rolVO();
                        UsuarioRolDAO uRDAO = new UsuarioRolDAO(uRVO);

                        ArrayList<Usuario_rolVO> listaRol = uRDAO.listar();

                        for (int i = 0; i < listaRol.size(); i++) {

                            uRVO = listaRol.get(i);
                    %>
                    <tr>
                        <td><%=uRVO.getId_Rol()%></td>
                        <td><%=uRVO.getId_Usuarios()%></td>
                        <td><%=uRVO.getEstado()%></td>
                    </tr>
                    <% }%>
                </table>

            </div>

        </div>
    </body>
</html>


