<%-- 
    Document   : consultarUsuarios
    Created on : 22/03/2022, 08:37:29 AM
    Author     : Sena
--%>

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
        <h1 class="text-center">Usuarios</h1>
        <div class="col-md-4 justify-content-center mx-auto mt-4 d-flex">
            <div class="col-md-6 me-3 ">
                <label>Consultar Por Id</label>
                <form method="post" action="Usuarios" class="form-group">
                    <input type="text" name="txtId" class="form-control" placeholder="Id Usuarios">
                    <input type="hidden" value="5" name="opcion">
                    <button class="btn boton mt-3">Consultar</button>
                </form>
                <div class="mensaje">
                    <%                if (request.getAttribute("mensajeError") != null) {%>
                    ${mensajeError}

                    <%}%>
                </div>
            </div>
            <div class="col-md-6">
                <label>Generar Reporte</label>
                <form action="Usuarios" method="post" class="form-group">
                    <select name="txtEstado" class="form-select">
                        <option selected>Escoja Una Opcion</option>
                        <option value="1">Usuarios Activos</option>
                        <option value="0">Usuarios Inactivos</option>
                    </select>
                    <button class="btn boton mt-3">Generar Reporte</button>
                    <input type="hidden" value="10" name="opcion">
                </form>
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

                        <td>
                            <form action="Usuarios" method="post">
                                <input type="hidden" value="<%=usuVO.getIdUsuarios()%>" name="txtId">
                                <input type="hidden" value="<%=usuVO.getNombre()%>"  name= "txtNombre" class="form-control ms-1  mt-2" >
                                <input type="hidden" value="<%=usuVO.getDocumento()%>" name= "txtDocumento"  class=" form-control  ms-3 mt-2" >
                                <input type="hidden" value="<%=usuVO.getTelefono()%>" name= "txtTelefono"  class="form-control  ms-1  mt-2">
                                <input type="hidden" value="<%=usuVO.getDireccion()%>" name= "txtDireccion"  class="form-control ms-3 mt-2">
                                <input type="hidden" value="<%=usuVO.getEmail()%>" name= "txtEmail"  class="form-control ms-1 mt-2">
                                <input type="hidden" value="<%=usuVO.getEstado()%>" name= "txtEstado"  class="form-control ms-1 mt-2">
                                <input type="hidden" value="<%=usuVO.getContrasena()%>" name= "txtEstado"  class="form-control ms-1 mt-2">
                                <button class="btn boton">Añadir Rol</button>
                                <input type="hidden" value="9" name="opcion">
                            </form>
                        </td>
                    </tr>
                    <% }%>

                </table>

            </div> 
        </div>
    </body>
</html>
