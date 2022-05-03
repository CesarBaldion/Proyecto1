<%-- 
    Document   : registrarUsuarioRol
    Created on : 01-may-2022, 16:37:18
    Author     : 1Usuario
--%>

<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloDAO.UsuarioRolDAO"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloVO.Usuario_rolVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navegacion.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilos.css">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            UsuarioVO usuVO = (UsuarioVO) request.getAttribute("uRoles");
            if (usuVO != null) {
        %>
        <div class="col-md-3 justify-content-center mx-auto caja border border-info mt-4">
            <h1 class="text-center fs-2 mt-2">Registrar Usuario Rol</h1>
            <div class="mx-auto justify-content-center">
                <%if (request.getAttribute("mensajeError") != null) {%>
                <p class="text-danger text-center fs-5">${mensajeError}</p>
                <%   } else {%>
                <p class="text-success text-center fs-5">${mensajeExito}</p>
                <%}%>
            </div>


            <div class="col-md-10  mt-4">
                <div class="mx-auto d-flex ">
                    <ul class="list-group ms-5">
                        <li class="list-group-item list-group-item list-group-item-primary">Id</li>
                        <li class="list-group-item list-group-item list-group-item-primary">Nombre</li>
                        <li class="list-group-item list-group-item list-group-item-primary">Documento</li>
                        <li class="list-group-item list-group-item list-group-item-primary">Telefono</li>
                        <li class="list-group-item list-group-item list-group-item-primary">Email</li>
                        <li class="list-group-item list-group-item list-group-item-primary">Direccion</li>
                        <li class="list-group-item list-group-item list-group-item-primary">Estado</li>
                    </ul>
                    <form action="UsuarioRol" method="post" class="form-group">
                        <ul class="list-group ">
                            <li class="list-group-item list-group-item list-group-item-primary"><label name="" class=""><%=usuVO.getIdUsuarios()%></label><br></li>
                            <li class="list-group-item list-group-item list-group-item-primary"><label name="txtNombre" value="<%=usuVO.getNombre()%> "><%=usuVO.getNombre()%></label></li>
                            <li class="list-group-item list-group-item list-group-item-primary"><label name="txtDocumento" value="<%=usuVO.getDocumento()%>"><%=usuVO.getDocumento()%></label></li>
                            <li class="list-group-item list-group-item list-group-item-primary"><label name="txtTelefono" value="<%=usuVO.getTelefono()%>"><%=usuVO.getTelefono()%></label></li>
                            <li class="list-group-item list-group-item list-group-item-primary"><label name="txtEmail" value="<%=usuVO.getEmail()%>"><%=usuVO.getEmail()%></label></li>
                            <li class="list-group-item list-group-item list-group-item-primary"><label name="txtDireccion" value="<%=usuVO.getDireccion()%>">Direccion<%=usuVO.getDireccion()%></label></li>
                            <li class="list-group-item list-group-item list-group-item-primary"><label name="" value=""><%=usuVO.getEstado()%></label></li>
                        </ul>
                        </ul>


                        <input type="hidden" value="<%=usuVO.getIdUsuarios()%>" name="txtIdUsu">
                        <input type="hidden" value="<%=usuVO.getNombre()%>"  name= "txtNombre" class="form-control ms-1  mt-2" >
                        <input type="hidden" value="<%=usuVO.getDocumento()%>" name= "txtDocumento"  class=" form-control  ms-3 mt-2" >
                        <input type="hidden" value="<%=usuVO.getTelefono()%>" name= "txtTelefono"  class="form-control  ms-1  mt-2">
                        <input type="hidden" value="<%=usuVO.getDireccion()%>" name= "txtDireccion"  class="form-control ms-3 mt-2">
                        <input type="hidden" value="<%=usuVO.getEmail()%>" name= "txtEmail"  class="form-control ms-1 mt-2">
                        <input type="hidden" value="<%=usuVO.getEstado()%>" name= "txtEstado"  class="form-control ms-1 mt-2">
                        <input type="hidden" value="<%=usuVO.getContrasena()%>" name= "txtEstado"  class="form-control ms-1 mt-2">
                        <select name="txtIdRol" class="form-select mt-2">
                            <option>Seleccione Rol</option>
                            <%
                                RolDAO rolDAO = new RolDAO();
                                for (RolVO rVO : rolDAO.listar()) {
                            %>
                            <option value="<%=rVO.getId_rol()%>"><%=rVO.getRoltipo()%></option>
                            <%}%>
                        </select>
                        <select  name="txtEstado" class="form-select mt-2">
                            <option>Estado</option>
                            <option value="1">
                                Activo
                            </option>
                            <option value="0">
                                Inactivo
                            </option>
                        </select>
                </div>

                <div class="d-flex mt-3 mb-2">
                    <button class="btn boton"> Guardar </button>
                    <input type="hidden" value="1" name="opcion">
                    <a href="consultarUsuarioRol.jsp" class="nav-item ms-3">Volver</a>
                </div>
                </form>
            </div>

            <% } else {
                    request.getRequestDispatcher("consultarRol.jsp").forward(request, response);

                }%>
        </div>
    </div>

</body>
</html>

