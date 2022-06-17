<%-- 
    Document   : sesiones
    Created on : 29/03/2022, 09:38:22 PM
    Author     : Juan Pablo
--%>

<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.Usuario_rolVO"%>
<%@page import="ModeloDAO.UsuarioRolDAO"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-control", "no-cache, no-store, must-revalidate");
    response.setDateHeader("Expires", 0);
%>


<%
    HttpSession buscarSesion = (HttpSession) request.getSession();
    UsuarioVO usuVO1 = null;

    if (buscarSesion.getAttribute("datosUsuario") == null) {
        request.getRequestDispatcher("iniciarSesion.jsp").forward(request, response);
    } else {
        UsuarioRolDAO uRDAO = new UsuarioRolDAO();
        usuVO1 = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
        Usuario_rolVO uRVO2 = uRDAO.consultarRol(usuVO1.getIdUsuarios());
        RolVO rolVO = new RolVO();
        RolDAO rolDao = new RolDAO();
        rolVO = rolDao.consultarRol(uRVO2.getId_Rol());

        if (rolVO.getRoltipo().equals("Administrador")) {
        } else {
            request.getRequestDispatcher("errorPermisos.jsp").forward(request, response);
        }

    }

%>