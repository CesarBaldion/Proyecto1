<%-- 
    Document   : consultarOrdenes
    Created on : 23/03/2022, 08:38:26 AM
    Author     : Sena
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.OrdenesDAO"%>
<%@page import="ModeloVO.OrdenesVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Ordenes</title>
    </head>
      <body>
    <center>
        <h1>Ordenes</h1>
        <form  method="post" action="Ordenes"> 
            <table>
                <tr>
                    <th>
                        Orden
                        <input type="text" name="txtIdOrden" ><br>
                        <input type="hidden" value="4" name="opcion">
                        <button>Consultar</button>
                    </th>
                </tr>
            </table><br><br>
        </form>
        <div style="color: red;">
            <%
                if (request.getAttribute("mensajeError") != null) {%>
            ${mensajeError}

            <%   } else {%>
            ${mensajeExito}

            <%}%>
        </div><br><br>


        <form>

            <table border="1">

                <tr>
                    <th>Orden</th>
                    <th>Usuario</th>
                    <th>Fecha Registro</th>
                    <th>Fecha Entrega</th>
                </tr>
                
                <%
                OrdenesVO ordVO = new OrdenesVO();
                OrdenesDAO ordDAO = new OrdenesDAO();
                ArrayList<OrdenesVO> listaOrdenes = ordDAO.listar();
                for (int i = 0; i < listaOrdenes.size(); i++){
                
                    ordVO = listaOrdenes.get(i);
                
                %>
                
                
                <tr>
                    <td><%=ordVO.getId_Orden()%></td>
                    <td><%=ordVO.getId_Usuarios()%></td>
                    <td><%=ordVO.getFecha_registro()%></td>
                    <td><%=ordVO.getFecha_entrega()%></td>
                </tr>
                
                <% }%>
            
            </table>
            
        </form>
            
    </center>
</body>
</html>
