<%-- 
    Document   : registrarLoteMateriaPrima
    Created on : 9/03/2022, 09:06:15 AM
    Author     : Sena
--%>
<%@page import="ModeloVO.MateriaPrimaVO"%>
<%@page import="ModeloDAO.MateriaPrimaDAO"%>
<%@include file="sesiones.jsp" %>
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
        <title>Registrar Lote Materia Prima</title>
        <link rel="stylesheet" href="css/registrarLoteMateriaPrima.css">

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
        <form class="Formulario" method = "post" action = "loteMateriaPrima" > 
            <h1>Registrar Lote Materia Prima</h1>
            
            <select name="txtIdMateriaPrima">
                <option>Seleccione..</option>
            <%
                MateriaPrimaDAO matDAO = new MateriaPrimaDAO();
                for(MateriaPrimaVO matVO:matDAO.ListarDos()){
                
                %>
            
           
                <option value="<%=matVO.getId_materia_Prima()%>"><%=matVO.getNombre()%></option>
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
                <%                    if (request.getAttribute("mensajeError") != null) {%>
                ${mensajeError}

                <%   } else {%>
                ${mensajeExito}

                <%}%>
            </div>
        </form>

    </body>
</html>

