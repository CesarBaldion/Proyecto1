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
        <h1 class="text-center mb-5 mt-3">Usuarios</h1>
        <div class="col-md-4 justify-content-center mx-auto mt-5 d-flex">
            <div class="col-md-5 me-3 ">
                <label>Buscar</label>
                <label class="" for="buscar">
                    <i class="zmdi zmdi-search"></i>
                </label>
                <input type="text" onkeyup="doSearch()" class="form-control"  id="buscar">
                <label class=""></label>
                <%if (request.getAttribute("mensajeError") != null) {%>
                <p class="text-danger text-center fs-5">${mensajeError}</p>
                <%   } else {%>
                <p class="text-success text-center fs-5">${mensajeExito}</p>
                <%}%>
            </div>
        </div>   
        <div class="col-md-11 mx-auto justify-content-center mt-4">
            <div class="col-md-7 mx-auto justify-content-center">
                <table number-per-page="10" class="table table-light table-hover table-striped text-center">
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

                        ArrayList<UsuarioVO> ListaUsuarios = usuDAO.ListarDos();

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
                            <form action="Usuarios" method="post" enctype="multipart/form-data">
                                <input type="hidden" name="txtEstado" value="01">
                                <input type="hidden" name="txtId" value="<%=usuVO.getIdUsuarios()%>">
                                <button class="btn boton">Activar</button>
                                <input type="hidden" value="12" name="opcion">
                            </form>
                        </td>
                        
                        <td>
                            <form action="Usuarios" method="post" enctype="multipart/form-data">
                                <input type="hidden" name="txtId" value="<%=usuVO.getIdUsuarios()%>">
                                <button class="btn boton">Eliminar</button>
                                <input type="hidden" value="13" name="opcion">
                            </form>
                        </td>
                    </tr>
                    <% }%>

                </table>

            </div> 
        </div>
      
        
    </body>
</html>
