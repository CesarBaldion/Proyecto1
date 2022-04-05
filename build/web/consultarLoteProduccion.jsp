<%-- 
    Document   : consultarLoteProduccion
    Created on : 24/03/2022, 08:25:13 AM
    Author     : Daniel
--%>
<%@include file="sesiones.jsp" %>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.LoteProduccionVO"%>
<%@page import="ModeloDAO.LoteProduccionDAO"%>
<%@page import="ModeloVO.LoteProduccionVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/">
        <title>JSP Page</title>
    </head>
    <body>
         <div class="col-md-6 ">
            <nav class="navbar navbar-expand-lg navbar-light col-md-12 ">
                <div class="mx-auto mt-3" id="navbarNav">

                    <ul class="navbar-nav mx-auto">
                        <li class="nav-item active me-4">
                            <a class="navbar-brand text-dark " href="menu.jsp">Inicio</a>
                        </li>
                        <li class="nav-item dropdown font-dark">
                            <a class="navbar-brand dark-link dropdown-toggle " href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Registrar
                            </a>
                            <ul class="dropdown-menu " >
                                <li><a class="dropdown-item font-dark" href="registrarMateriasPrimas.jsp">Materia Prima</a></li>
                                <li><a class="dropdown-item font-dark" href="registrarProducto.jsp">Producto</a></li>
                                <li><a class="dropdown-item font-dark" href="registrarLoteMateriaPrima.jsp">Lote Materia Prima</a></li>
                                <li><a class="dropdown-item font-dark"  href="registrarLoteProduccion.jsp">Lote Produccion</a></li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown font-dark">
                            <a class="navbar-brand dropdown-toggle " href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Consultar
                            </a>
                            <ul class="dropdown-menu " >
                                <li><a class="dropdown-item font-dark" href="consultarMateriaPrima.jsp">Materia Prima</a></li>
                                <li><a class="dropdown-item font-dark" href="consultarProducto.jsp">Producto</a></li>
                                <li><a class="dropdown-item font-dark" href="consultarMateriaPrima.jsp">Lote Materia Prima</a></li>
                                <li><a class="dropdown-item font-dark"  href="consultarLoteProduccion.jsp">Lote Produccion</a></li>
                            </ul>
                        </li>
                </div>
            </nav>
        </div>
         <h1>Lote Produccion</h1>

        <form method="post" action="LoteProduccion">

            Id
            <input type="text" name="txtid_loteProduccion">
            <br>
            <input type="hidden" value="4" name="opcion">
            <button>Consultar</button>

        </form>
        <div class="mensaje">
            <%
                if (request.getAttribute("mensajeError") != null) {%>
            ${mensajeError}

            <%}%>
        </div>
        <br>
        <br>

        <form>

            <table border="1">

                <tr>
                    <th>Id</th>
                    <th>Cantidad</th>
                    <th>Fecha Fabricacion</th>
                    <th>Id orden Detalles</th>
                    <th>Id Usuarios</th>
                </tr>
                <%
                    LoteProduccionVO ltProducVO = new LoteProduccionVO();
                    LoteProduccionDAO ltProducDAO = new LoteProduccionDAO(ltProducVO);

                    ArrayList<LoteProduccionVO> listaLoteProduccion = ltProducDAO.Listar();

                    for (int i = 0; i < listaLoteProduccion.size(); i++) {
                        
                        ltProducVO = listaLoteProduccion.get(i);

                %>
                <tr>
                    <td><%=ltProducVO.getId_Lote_Produccion()%></td>
                    <td><%=ltProducVO.getCantidad()%></td>
                    <td><%=ltProducVO.getFecha_Fabricacion()%></td>
                    <td><%=ltProducVO.getId_orden_Detalles()%></td>
                    <td><%=ltProducVO.getId_Usuarios()%></td>
 
                </tr>
                
                <% } %>

            </table>

        </form>
    </body>
</html>
