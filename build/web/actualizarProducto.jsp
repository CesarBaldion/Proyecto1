<%-- 
    Document   : actualizarProducto
<<<<<<< Updated upstream
    Created on : 23/03/2022, 08:20:51 AM
=======
    Created on : 30/03/2022, 11:12:53 AM
>>>>>>> Stashed changes
    Author     : Sena
--%>

<%@page import="ModeloVO.ProductoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<<<<<<< Updated upstream
    <!-- No funcionando por el momento-->
    <!--<body>
=======
    <body>
>>>>>>> Stashed changes
        
        <%
            ProductoVO prodVo = (ProductoVO) request.getAttribute("productoConsultado");
            if (prodVo != null) {

        %>
        <h1>Actualizar producto</h1>
        <form action="action">
            <table>
                <tr>
                    <th>
                        <input type="text" placeholder="Nombre" name="txtNombre" value="<%=prodVo.getNombre()%>"> <br>
                        <select name="txtEstado">
                            <option>Seleccionar...</option>
                            <option value="<%=prodVo.getEstado()%>">Activo</option>
                            <option value="<%=prodVo.getEstado()%>">Inactivo</option>
                        </select>
<<<<<<< Updated upstream
                        <br>
=======
                        
                        <br>
                        
>>>>>>> Stashed changes
                        <button id="Boton"> Registrar </button>
                        <input type="hidden" value="2" name="opcion">
                        <a href="index.jsp">Iniciar Sesion</a><br>

                        <div class="mensaje">
                            <%
                    if (request.getAttribute("mensajeError") != null) {%>
                            ${mensajeError}

                            <%   } else {%>
                            ${mensajeExito}

                            <%}%>
                        </div>
                    </th>
                </tr>
            </table>
        </form>
        <%}%>

<<<<<<< Updated upstream
    </body> -->
</html>
=======
    </body> 
</html>
>>>>>>> Stashed changes
