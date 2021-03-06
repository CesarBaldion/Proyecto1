<%--  
    Document   : VerificacionCodigo
    Created on : 30-abr-2022, 23:43:53
    Author     : 1Usuario
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%HttpSession buscarSesion = (HttpSession) request.getSession();
    UsuarioVO usuVO1 = null;
    if (buscarSesion.getAttribute("datosUsuarioRecuperarContrasena") == null) {
        request.getRequestDispatcher("iniciarSesion.jsp").forward(request, response);
    } else {

    }%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilos.css">
        <title>Verificacion de Codigo</title>
    </head>
    <body>
        <div class="modal fade" id="modalVerificarCodigo" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                    </div>
                    <div class="modal-body">
                        <div class="col-md-10 mx-auto justify-content-center">
                            <div class="col-md-8 mx-auto justify-content-center mt-5">
                                <%if (request.getAttribute("mensaje") != null) {%>
                                <div class="mx-auto">
                                    ${mensaje}
                                </div>
                                <%   }%>
                                <form  class="form-group" action="Usuarios" method="post" enctype="multipart/form-data"> 
                                    <h1 class="text-center fs-4 mb-4">Ingrese el Codigo</h1>
                                    <div class="col-md-12">
                                        <input type="text"  name= "txtcodigo" placeholder="Codigo" required="" class="form-control ms-1 mt-2">   
                                    </div> 
                                    <div class="d-flex mt-4 mb-3">
                                        <button class="btn boton" >Verificar</button><br>
                                        <input type="hidden" value="7" name="opcion">
                                        <a href="index.jsp" class="nav-link text-center">Volver</a>
                                    </div>
                                </form>
                            </div>  
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script>
            window.onload = function () {
                $("#modalVerificarCodigo").modal("show");
            };
        </script>
    </body>
</html>
