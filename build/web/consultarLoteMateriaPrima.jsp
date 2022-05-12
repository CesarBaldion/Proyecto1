<%-- 
    Document   : consultarLoteMateriaPrima
    Created on : 04-abr-2022, 20:52:14
    Author     : cesar
--%>
<%@include file="sesionesAlmacenista.jsp" %>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.loteMateriaPrimaDAO"%>
<%@page import="ModeloVO.loteMateriaPrimaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navegacion.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/">
        <title>Lote Materia Prima</title>
    </head>
    <body>
    
        <div class="col-md-4 justify-content-center mx-auto mt-4">
            <h1 class="text-center">Lote Materia Prima</h1>
            <div class="col-md-6 mx-auto "> 
                <form  method="post" action="loteMateriaPrima" class="form-group"> 
                    <input type="text" name="txtIdLoteMateriaPrima" class="form-control" placeholder="Lote Materia Prima"><br>
                    <input type="hidden" value="4" name="opcion">
                    <button class="btn">Consultar</button>
                </form>
                <div style="color: red;">
                    <%
                        if (request.getAttribute("mensajeError") != null) {%>
                    ${mensajeError}

                    <%   } else {%>
                    ${mensajeExito}

                    <%}%>
                </div>
            </div>
        </div>    
            <div class="col-md-9 mx-auto justify-content-center mt-3">
                <table  class="table table-light table-hover table-striped text-center ">

                    <tr>
                        <th>Id</th>
                        <th>Id Materia Prima</th>
                        <th>Cantidad</th>
                        <th>Observaciones</th>
                        <th>Fecha Ingreso</th>
                        <th>Fecha Salida</th>
                        
                    </tr>
                    <%
                        loteMateriaPrimaVO ltMatPriVO = new loteMateriaPrimaVO();
                        loteMateriaPrimaDAO ltMatPriDAO = new loteMateriaPrimaDAO(ltMatPriVO);

                        ArrayList<loteMateriaPrimaVO> listaLoteMateriaPrima = ltMatPriDAO.Listar();

                        for (int i = 0; i < listaLoteMateriaPrima.size(); i++) {

                            ltMatPriVO = listaLoteMateriaPrima.get(i);

                    %>
                    <tr>
                        <td><%=ltMatPriVO.getId_loteMateria_Prima()%></td>
                        <td><%=ltMatPriVO.getId_Materia_Prima()%></td>
                        <td><%=ltMatPriVO.getCantidad()%></td>
                        <td><%=ltMatPriVO.getObservaciones()%></td>
                        <td><%=ltMatPriVO.getFecha_ingreso()%></td>
                        <td><%=ltMatPriVO.getFecha_salida()%></td>
                        
                        
                        

                    </tr>

                    <% }%>

                </table>
            </div>
                

</body>
</html>