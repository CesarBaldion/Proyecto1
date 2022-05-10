<%-- 
    Document   : registrarProducto
    Created on : 9/03/2022, 09:28:13 AM
    Author     : Andrex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navegacion.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Producto</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/estilos.css">
    </head>
    <body class="">
        <div class="col-md-5 mx-auto justify-content-center border-5 border border-info mt-3 caja">
                <div class="col-md-11 mx-auto justify-content-center mt-5">
                    <form  class="form-group" method="get" action="Producto">
                        <div class="mx-auto justify-content-center">
                            <%if (request.getAttribute("error") != null) {%>
                            
                            <div class="container-fluid d-inline-block d-flex mx-auto">
                                
                                <img src="img/error.svg" height="100">
                                <p class="text-danger text-center fs-5 mt-5">${error}</p>
                            </div>
                            <%   } else {%>
                            <p class="text-success text-center fs-5">${Bien}</p>

                            <%}%>
            </div>
            <div class="col-md-10 mx-auto mt-4">
               
                    <input class="form-control" type="text" name="txtNombre" placeholder="Nombre" required="">
                    <br>
                    <div class="col-md-12 d-flex mt-2 mb-3">
                        <button class="btn boton"> Registrar </button>
                        <input type="hidden" value="1" name="opcion">
                    </div>
                        
                    </form>    
            </div>
        </div>
            
             

    </body>
</html>