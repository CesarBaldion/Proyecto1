<%-- 
    Document   : consultarDetallesProducto
    Created on : 28/03/2022, 10:12:45 AM
    Author     : Sena
--%>
<%@include file="sesiones.jsp" %>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.DetallesProductoDAO"%>
<%@page import="ModeloVO.DetallesProductoVO"%>
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
        <title>Detalles Producto</title>
    </head>
    <body>
    <center>
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
                                <li><a class="dropdown-item font-dark"  href="registrarOrdenes.jsp.jsp">Ordenes</a></li>
                                <li><a class="dropdown-item font-dark"  href="consultarOrdenDetalles.jsp.jsp">Ordene Detalles</a></li>
                                <li><a class="dropdown-item font-dark"  href="registrarUsuario.jsp">Usuarios</a></li>
                                <li><a class="dropdown-item font-dark"  href="registrarDetallesProducto.jsp">Detalles Producto</a></li>
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
                                <li><a class="dropdown-item font-dark"  href="consultarOrdenes.jsp">Ordenes</a></li>
                                <li><a class="dropdown-item font-dark"  href="consultarOrdenDetalles.jsp.jsp">Orden Detalles</a></li>
                                <li><a class="dropdown-item font-dark"  href="consultarUsuarios.jsp">Usuarios</a></li>
                                <li><a class="dropdown-item font-dark"  href="consultarDetallesProducto.jsp">Detalles Producto</a></li>
                            </ul>
                        </li>
                </div>
            </nav>
        </div>
        <h1>Detalles Producto</h1>
        <form  method="post" action="DetallesProducto"> 
            <table>
                <tr>
                    <th>
                        Detalles Producto
                        <input type="text" name="txtIdProducto" ><br>
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
                    <th>IdProducto</th>
                    <th>Id Detalles Producto</th>
                    <th>Descripcion</th>
                    <th>Talla</th>
                </tr>
                
                <%
                DetallesProductoVO detProVO = new DetallesProductoVO();
                DetallesProductoDAO detProDAO = new DetallesProductoDAO();
                ArrayList<DetallesProductoVO> listarDetallesProducto = detProDAO.listar();
                for (int i = 0; i < listarDetallesProducto.size(); i++){
                
                    detProVO = listarDetallesProducto.get(i);
                
                %>
                
                
                <tr>
                    <td><%=detProVO.getId_Producto()%></td>
                    <td><%=detProVO.getId_Detalles_Producto()%></td>
                    <td><%=detProVO.getDescripcion()%></td>
                    <td><%=detProVO.getTalla()%></td>
                </tr>
                
                <% }%>
            
            </table>
            
        </form>
            
    </center>
</body>
</html>
