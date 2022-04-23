<%-- 
    Document   : consultarUsuarios
    Created on : 22/03/2022, 08:37:29 AM
    Author     : Sena
--%>
<%@include file="sesiones.jsp" %>
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
        <div class="col-md-4 justify-content-center mx-auto mt-4">
            <h1 class="text-center">Usuarios</h1>
            <div class="col-md-6 mx-auto ">
                <form method="post" action="Usuarios" class="form-group">
                    <input type="text" name="txtId" class="form-control" placeholder="Id Usuarios">
                    <input type="hidden" value="5" name="opcion">
                    <button class="btn">Consultar</button>
                </form>
                <div class="mensaje">
                    <%                if (request.getAttribute("mensajeError") != null) {%>
                    ${mensajeError}

                    <%}%>
                </div>
            </div>
        </div>   
        <div class="col-md-11 mx-auto justify-content-center mt-4">
            <div class="col-md-7 mx-auto justify-content-center">
                <table class="table table-light table-hover table-striped text-center">

                    <tr>
                        <th>Id</th>
                        <th>Nombres</th>
                        <th>Documento</th>
                        <th>Telefono</th>
                        <th>Email</th>
                        <th>Direccion</th>
                        <th>Estado</th>
                        <th>Contraseña</th>

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
                        <td><%=usuVO.getEstado()%></td>
                        <td><%=usuVO.getContrasena()%></td>

                    </tr>

                    <% }%>

                </table>

            </div>
        </div>
    </body>
</html>
