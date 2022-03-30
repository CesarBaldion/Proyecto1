<%-- 
    Document   : registrarMateriasPrimas
    Created on : 30/03/2022, 11:50:44 AM
    Author     : Sena
--%>
<%@include file="sesiones.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Materia Prima</title>
    </head>
    <center>
        <body>
            <form method ="post" action="MateriaPrima"> 
                <h1>Registrar Materia Prima</h1>
                Nombre<br>
                <input type="text" name="txtNombre">
                <br><br>
                <select name="txtEstado">
                <option>Estado</option>
                    <option value="1">
                        Activo
                    </option>
                    <option value="0">
                        Inactivo
                    </option>
                </select><br>
                <br>
                <button id="Boton"> Registrar </button>
                <input type="hidden" value="1" name="opcion">

                <div class="mensaje" style="color: red;">
                    <%
                    if (request.getAttribute("mensajeError") != null) {%>
                    ${mensajeError}

                    <%   } else {%>
                    ${mensajeExito}

                    <%}%>
                </div>
            </form>
        </body>
    </center>
</html>
