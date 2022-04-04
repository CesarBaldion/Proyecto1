<%-- 
    Document   : sesiones
    Created on : 29/03/2022, 09:38:22 PM
    Author     : Juan Pablo
--%>

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
    String nombre = "";
    if (buscarSesion.getAttribute("datosUsuario") == null) {

        request.getRequestDispatcher("iniciarSesion.jsp").forward(request, response);

    } else {
        UsuarioVO usuVO = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
        
        nombre = usuVO.getNombre();

    }


%>

<%--<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
                <h1> Bienvenido: <%=nombre%></h1>
                <form method="post" action="Sesiones">
                    <input type="submit" value="Cerrar Sesion">
                </form>
            </div> <br>
            <br>
            <div></div><br><br>
            <div></div> <br><br>
    </body>
</html>--%>

