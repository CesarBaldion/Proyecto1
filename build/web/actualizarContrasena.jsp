<%-- 
    Document   : actualizarContrasena
    Created on : 30-abr-2022, 23:46:58
    Author     : 1Usuario
--%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%HttpSession buscarSesion = (HttpSession) request.getSession();
    UsuarioVO usuVO1 = null;
    if (buscarSesion.getAttribute("datosUsuarioRecuperarContrasena") == null) {

        request.getRequestDispatcher("iniciarSesion.jsp").forward(request, response);
    } else {
        usuVO1 = (UsuarioVO) buscarSesion.getAttribute("datosUsuarioRecuperarContrasena");
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
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/estilos.css">
    </head>
    <body>

        <div class="modal fade" id="modalActualizarContrasena" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                    </div>
                    <div class="modal-body">
                        <div class="col-md-12 mx-auto justify-content-center  ">
                            <div class="col-md-8 mx-auto justify-content-center mt-5">
                                <form   class="form-group" action="Usuarios" method="post" enctype="multipart/form-data"> 
                                    <h3 class="text-center"><label><%=usuVO1.getNombre()%></label></h3>
                                    <h4 class="text-center fs-4 mb-4">Actualice la Contrase??a</h4>
                                    <div class="mx-auto justify-content-center">
                                        <%if (request.getAttribute("mensaje") != null) {%>
                                        <div class="container-fluid d-inline-block d-flex mx-auto">
                                            <img src="img/error.svg" height="100">
                                            <p class="text-danger text-center fs-5 mt-5">${mensaje}</p>
                                        </div>
                                        <%   } else {%>
                                        <p class="text-success text-center fs-5">${Bien}</p>
                                        <%}%>
                                    </div>
                                    <div class="input-group mt-2 mb-3">
                                        <input name="txtContrasena" id="txtPassword" type="password" class="form-control"  placeholder="Contrase??a" required=""   >
                                        <button class="btn boton" type="button" id="botonOn" onclick="mostrarPassword()">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-eye-slash-fill" viewBox="0 0 16 16"><path d="m10.79 12.912-1.614-1.615a3.5 3.5 0 0 1-4.474-4.474l-2.06-2.06C.938 6.278 0 8 0 8s3 5.5 8 5.5a7.029 7.029 0 0 0 2.79-.588zM5.21 3.088A7.028 7.028 0 0 1 8 2.5c5 0 8 5.5 8 5.5s-.939 1.721-2.641 3.238l-2.062-2.062a3.5 3.5 0 0 0-4.474-4.474L5.21 3.089z"/><path d="M5.525 7.646a2.5 2.5 0 0 0 2.829 2.829l-2.83-2.829zm4.95.708-2.829-2.83a2.5 2.5 0 0 1 2.829 2.829zm3.171 6-12-12 .708-.708 12 12-.708.708z"/></svg>                        </button>
                                    </div>
                                    <div class="input-group mt-2 mb-3">
                                        <input name="txtContrasena2" id="txtPassword2" type="password" class="form-control"  placeholder="Confirme Contrase??a" required="" aria-label="Recipient's username"
                                               aria-describedby="button-addon2">
                                        <button class="btn boton" type="button" id="botonOn2" onclick="mostrarPassword2()">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-eye-slash-fill" viewBox="0 0 16 16"><path d="m10.79 12.912-1.614-1.615a3.5 3.5 0 0 1-4.474-4.474l-2.06-2.06C.938 6.278 0 8 0 8s3 5.5 8 5.5a7.029 7.029 0 0 0 2.79-.588zM5.21 3.088A7.028 7.028 0 0 1 8 2.5c5 0 8 5.5 8 5.5s-.939 1.721-2.641 3.238l-2.062-2.062a3.5 3.5 0 0 0-4.474-4.474L5.21 3.089z"/><path d="M5.525 7.646a2.5 2.5 0 0 0 2.829 2.829l-2.83-2.829zm4.95.708-2.829-2.83a2.5 2.5 0 0 1 2.829 2.829zm3.171 6-12-12 .708-.708 12 12-.708.708z"/></svg>                        </button>
                                    </div>
                                    <div class="d-flex mt-4 mb-3">
                                        <button class="btn boton" >Registrar</button><br>
                                        <input type="hidden" value="<%=usuVO1.getDocumento()%>" name="txtDocumento">
                                        <input type="hidden" value="8" name="opcion">
                                        <a href="iniciarSesion.jsp" class="nav-link text-center">??Ya tiene una cuenta?</a>
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
                                                $("#modalActualizarContrasena").modal("show");
                                            };
                                            function mostrarPassword() {
                                                var cambio = document.getElementById("txtPassword");
                                                var uno = document.getElementById('botonOn');
                                                if (cambio.type == "password") {
                                                    cambio.type = "text";
                                                    uno.innerHTML = '<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-eye-fill" viewBox="0 0 16 16"><path d="M10.5 8a2.5 2.5 0 1 1-5 0 2.5 2.5 0 0 1 5 0z"/><path d="M0 8s3-5.5 8-5.5S16 8 16 8s-3 5.5-8 5.5S0 8 0 8zm8 3.5a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7z"/></svg>';
                                                } else {
                                                    cambio.type = "password";
                                                    uno.innerHTML = '<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-eye-slash-fill" viewBox="0 0 16 16"><path d="m10.79 12.912-1.614-1.615a3.5 3.5 0 0 1-4.474-4.474l-2.06-2.06C.938 6.278 0 8 0 8s3 5.5 8 5.5a7.029 7.029 0 0 0 2.79-.588zM5.21 3.088A7.028 7.028 0 0 1 8 2.5c5 0 8 5.5 8 5.5s-.939 1.721-2.641 3.238l-2.062-2.062a3.5 3.5 0 0 0-4.474-4.474L5.21 3.089z"/><path d="M5.525 7.646a2.5 2.5 0 0 0 2.829 2.829l-2.83-2.829zm4.95.708-2.829-2.83a2.5 2.5 0 0 1 2.829 2.829zm3.171 6-12-12 .708-.708 12 12-.708.708z"/></svg>';

                                                }
                                            }
                                            ;
                                            function mostrarPassword2() {
                                                var cambio = document.getElementById("txtPassword2");
                                                var uno = document.getElementById('botonOn2');
                                                if (cambio.type == "password") {
                                                    cambio.type = "text";
                                                    uno.innerHTML = '<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-eye-fill" viewBox="0 0 16 16"><path d="M10.5 8a2.5 2.5 0 1 1-5 0 2.5 2.5 0 0 1 5 0z"/><path d="M0 8s3-5.5 8-5.5S16 8 16 8s-3 5.5-8 5.5S0 8 0 8zm8 3.5a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7z"/></svg>';
                                                } else {
                                                    cambio.type = "password";
                                                    uno.innerHTML = '<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-eye-slash-fill" viewBox="0 0 16 16"><path d="m10.79 12.912-1.614-1.615a3.5 3.5 0 0 1-4.474-4.474l-2.06-2.06C.938 6.278 0 8 0 8s3 5.5 8 5.5a7.029 7.029 0 0 0 2.79-.588zM5.21 3.088A7.028 7.028 0 0 1 8 2.5c5 0 8 5.5 8 5.5s-.939 1.721-2.641 3.238l-2.062-2.062a3.5 3.5 0 0 0-4.474-4.474L5.21 3.089z"/><path d="M5.525 7.646a2.5 2.5 0 0 0 2.829 2.829l-2.83-2.829zm4.95.708-2.829-2.83a2.5 2.5 0 0 1 2.829 2.829zm3.171 6-12-12 .708-.708 12 12-.708.708z"/></svg>';

                                                }
                                            }
                                            ;
        </script>
    </body>
</html>