<%-- 
    Document   : registrarLoteMateriaPrima
    Created on : 9/03/2022, 09:06:15 AM
    Author     : Sena
--%>
<%@page import="ModeloVO.MateriaPrimaVO"%>
<%@page import="ModeloDAO.MateriaPrimaDAO"%>
<%@page import="ModeloVO.loteMateriaPrimaVO"%>
<%@page import="ModeloDAO.loteMateriaPrimaDAO"%>
<%@include file="sesiones.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Lote Materia Prima</title>
        <link rel="stylesheet" href="Css/registrarLoteMateriaPrima.css">
        
    </head>
    <body>

        <form class="Formulario" method = "post" action = "loteMateriaPrima" > 
            <h1>Registrar Lote Materia Prima</h1>
            
            <select name="txtIdMateriaPrima">
                <option>Seleccione...</option>
                <%
                 MateriaPrimaDAO mpDAO = new MateriaPrimaDAO();
                 for (MateriaPrimaVO mpVO:mpDAO.Listar()){
                
                    
                    %>
                    <option value="<%=mpVO.getId_materia_Prima()%>"><%=mpVO.getNombre()%></option>
                    <%}%>   
            </select>
            <br>
            <input type="text" name="txtCantidad" placeholder="Cantidad" required="">
            <br>
            <label>Fecha de ingreso</label>
            <br>
            <input type="datetime-local" name="txtFechaIngreso" placeholder="Fecha de ingreso" required="">
            <br>
            <label>Fecha de salida</label>
            <br>
            <input type="datetime-local" name="txtFechaSalida" placeholder="Fecha de salida" required="">
            <br>
            <textarea name="txtObservaciones" placeholder="Observaciones"></textarea>
            
            
            <button id="Boton"> Registrar</button>
            <input type="hidden" value="1" name="opcion">
            
            <div class="mensaje">
                <%
                if (request.getAttribute("mensajeError") != null) {%>
                ${mensajeError}

                <%   } else {%>
                ${mensajeExito}

                <%}%>
            </div>
        </form>

    </body>
</html>

