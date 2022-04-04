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
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
        
    <body>
        <h1>Usuarios</h1>

        <form method="post" action="Usuarios">

            Id
            <input type="text" name="txtId">
            <br>
            <input type="hidden" value="5" name="opcion">
            <button>Consultar</button>

        </form>
        <div class="mensaje">
            <%
                if (request.getAttribute("mensajeError") != null) {%>
            ${mensajeError}

            <%}%>
        </div>
        <br>
        <br>

        <form>

            <table border="1">

                <tr>
                    <th>Id</th>
                    <th>Nombres</th>
                    <th>Documento</th>
                    <th>Telefono</th>
                    <th>Email</th>
                    <th>Direcciom</th>
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
                
                <% } %>

            </table>

        </form>
    </body>
</html>
