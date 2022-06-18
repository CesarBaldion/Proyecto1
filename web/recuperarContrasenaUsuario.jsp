<%-- 
    Document   : recuperarContrasenaUsuario
    Created on : 30-abr-2022, 23:20:41
    Author     : 1Usuario
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilos.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
        <title>Recuperar Contraseña</title>
    </head>
    <body>
        <div class="modal fade" id="modalRecuperarContrasena" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                    </div>
                    <div class="modal-body">
                        <div class="col-md-10 justify-content-center mx-auto ">
                            <h1 class="text-center fs-4 mt-2">Ingrese su Documento de Identidad</h1>
                            <%if (request.getAttribute("mensaje") != null) {%>
                            <div class="mx-auto">
                                <p class="text-danger text-center fs-5 mt-5">${mensaje}</p>
                            </div>
                            <% }%>
                            <div class="col-md-10 mx-auto mt-4">
                                <form  id="formReg"  class="form-group" action="Usuarios" method="post" enctype="multipart/form-data"> 
                                    <div class=" col-md-12 mx-auto ">
                                        <input type="text" id="txtDocumento"  name= "txtDocumento" placeholder="Documento de Identidad" required="" class="form-control ms-1 mt-2">
                                        <div class="d-flex d-inline-block mt-4 mb-2">
                                            <button id="submitPaso1" class="btn boton" >Verificar</button><br>
                                            <input type="hidden" value="6" id="opcion" name="opcion">
                                            <a href="index.jsp" class="nav-link text-center">Volver</a>
                                        </div>
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
                $("#modalRecuperarContrasena").modal("show");
            };
        </script>
    </body>
</html>
