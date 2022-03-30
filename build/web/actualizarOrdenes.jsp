<%-- 
    Document   : actualizarOrdenes
    Created on : 23/03/2022, 08:48:09 AM
    Author     : Sena
--%>
<%@include file="sesiones.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Ordenes</title>
    </head>
    <body>
    <center>
        <h1>Actualizar Ordenes</h1>
        <form  method="post" action="Ordenes"> 
            <table>
                <tr>
                    <th>
                        Fecha Registro
                    
                        Fecha Entrega
                    
                        <input type="hidden" value="2" name="opcion">
                        <button>Actualizar</button>
                    </th>
                </tr>
            </table><br><br>
        </form>
    </center>
</body>
</html>
