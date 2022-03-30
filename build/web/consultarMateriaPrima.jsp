<%-- 
    Document   : consultarMateriaPrima
    Created on : 30/03/2022, 11:51:35 AM
    Author     : Sena
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.MateriaPrimaDAO"%>
<%@page import="ModeloVO.MateriaPrimaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar materias primas</title>
    </head>
    <body>
    <center>
        <h1>Materias Primas</h1>
        <form  method="post" action="MateriaPrima"> 
            <table>
                <tr>
                    <th>
                        Materia Prima
                        <input type="text" name="txtIdMateriaPrima" ><br>
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
                    <th>Id Materia Prima</th>
                    <th>Nombre</th>
                    <th>Actualizacion</th>
                    <th>Estado</th>
                </tr>
                
                <%
                MateriaPrimaVO matPriVO = new MateriaPrimaVO();
                MateriaPrimaDAO matPriDAO = new MateriaPrimaDAO();
                ArrayList<MateriaPrimaVO> listaMateriaPrima = matPriDAO.Listar();
                for (int i = 0; i < listaMateriaPrima.size(); i++){
                
                    matPriVO = listaMateriaPrima.get(i);
                
                %>
                
                
                <tr>
                    <td><%=matPriVO.getId_materia_Prima()%></td>
                    <td><%=matPriVO.getNombre()%></td>
                    <td><%=matPriVO.getActualizacion()%></td>
                    <td><%=matPriVO.getEstado()%></td>
                </tr>
                
                <% }%>
            
            </table>
            
        </form>
            
    </center>
</body>
</html>
