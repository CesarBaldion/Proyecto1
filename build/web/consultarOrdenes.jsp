<%-- 
    Document   : consultarOrdenes
    Created on : 23/03/2022, 08:38:26 AM
    Author     : Sena
--%>
<%@include file="sesiones.jsp" %>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.OrdenesDao"%>
<%@page import="ModeloVO.OrdenesVo"%>
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
                        <button>Consultar</button>
                        <input type="hidden" value="4" name="opcion">
                        
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
                OrdenesVo ordVo = new OrdenesVo();
                OrdenesDao ordDao = new OrdenesDao();
                ArrayList<OrdenesVo> listaOrdenes = ordDao.listar();
                for (int i = 0; i < listaOrdenes.size(); i++){
                
                    ordVo = listaOrdenes.get(i);
                
                %>
                
                
                <tr>
                    <td><%=ordVo.getId_Orden()%></td>
                    <td><%=ordVo.getId_Usuarios()%></td>
                    <td><%=ordVo.getFecha_registro()%></td>
                    <td><%=ordVo.getFecha_entrega()%></td>
                </tr>
                
                <% }%>
            
            </table>
            
        </form>
            
    </center>
</body>
</html>
