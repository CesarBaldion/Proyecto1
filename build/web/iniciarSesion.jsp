<%-- 
    Document   : Prueba
    Created on : 31/03/2022, 08:21:52 AM
    Author     : Sena
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles/style.css" rel="stylesheet" type="text/css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/iniciarSesion.css">
        <link rel="stylesheet" href="css/estilos.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@500&display=swap" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Login y registro</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    </head>
    <body>
        <div class="main">
            <div class="container a-container" id="a-container">
                <!-- REGISTRAR NUEVO USUARIO -->
                <form id="formularioUsuario" class="form"  method="post" action="Usuarios" enctype="multipart/form-data">
                    <h2 class="form_title title col-md-8">Registrar Cuenta</h2>
                    <div class="col-md-11">
                        
                        <%if(request.getAttribute("ListaMensajes")!=null){
                            ArrayList mensajes = (ArrayList)request.getAttribute("ListaMensajes"); 
                            for(int i = 0;i<mensajes.size();i++){ %>
                                <p class="text-danger fs-5"><%=mensajes.get(i)%>
                                <% }%>
                            <% }%> 
                    </div>
                    <div class="col-md-11  ">
                        <input name="txtNombre" class="form__input_c ms-1 mt-2" type="text" placeholder="Nombre completo"
                               required>
                        <div id="respuestaNombre">
                        </div>
                    </div>
                    <div class="col-md-11 d-flex  ">
                        <div>
                            <select name="txtTipoDocumento" id="txtTipoDocumento" class="form__input ms-1 mt-2">
                                <option value="">Tipo de documento</option>
                                <option value="CC">Cedula de ciudadania</option>
                                <option value="TI">Tarjeta de identidad</option>
                                <option value="PA">Pasaporte</option>
                            </select>
                            <div id="RespuestaTipoDocumento">
                            </div>
                        </div>
                        <div>
                            <input name="txtDocumento" class="form__input ms-3 mt-2" type="text"
                                   placeholder="N??mero de documento" required>
                            <div id="respuestaDocumento">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-11  ">
                        <input name="txtDireccion" class="form__input_c ms-1 mt-2" type="text" placeholder="Direcci??n"
                               required>
                        <div id="respuestaDireccion">
                        </div>
                    </div>
                    <div class="col-md-11 d-flex  ">
                        <div>
                            <input id="txtCiudad" name="txtCiudad" class="form__input ms-1 mt-2" type="text"
                                   placeholder="Ciudad" required>
                            <div id="respuestaCiudad">
                            </div>
                        </div>
                        <div>
                            <input id="txtTelefono" name="txtTelefono" class="form__input ms-1 mt-2" type="text"
                                   placeholder="Tel??fono" required>
                            <div id="respuestaTelefono">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-11 d-flex  ">
                        <div>
                            <input name="txtEmail" id="txtEmail" class="form__input ms-1 mt-2" type="text"
                                   placeholder="Correo" required>
                            <div id="respuestaEmail">
                            </div>
                        </div>
                        <div>
                            <input name="txtEmail2" id="txtEmail2" class="form__input ms-1 mt-2" type="text"
                                   placeholder="Confirme correo" required>
                            <div id="respuestaEmail2">
                            </div>
                        </div>
                    </div>
                    <div class="input-group mx-auto ms-5">
                        <input name="txtContrasena" id="txtPassword" type="password" class="form__input_c col-md-6"
                                placeholder="Contrase??a" aria-label="Recipient's username"
                               aria-describedby="button-addon2" required>
                        <button class="btn boton " type="button" onclick="mostrarPassword()" id="botonOn">
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                 class="bi bi-eye-fill" viewBox="0 0 16 16">
                            <path d="M10.5 8a2.5 2.5 0 1 1-5 0 2.5 2.5 0 0 1 5 0z" />
                            <path
                                d="M0 8s3-5.5 8-5.5S16 8 16 8s-3 5.5-8 5.5S0 8 0 8zm8 3.5a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7z" />
                            </svg>
                        </button>
                    </div>
                    <div id="respuestaPassword" class="col-md-11">
                    </div>
                    <div class="input-group mx-auto ms-5">
                        <input name="txtContrasena2" id="txtPassword2" type="password" class="form__input_c col-md-6"
                                placeholder="Contrase??a" aria-label="Recipient's username"
                               aria-describedby="button-addon2" required>
                        <button class="btn boton " type="button" onclick="mostrarPassword2()" id="botonOn2">
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                 class="bi bi-eye-fill" viewBox="0 0 16 16">
                            <path d="M10.5 8a2.5 2.5 0 1 1-5 0 2.5 2.5 0 0 1 5 0z" />
                            <path
                                d="M0 8s3-5.5 8-5.5S16 8 16 8s-3 5.5-8 5.5S0 8 0 8zm8 3.5a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7z" />
                            </svg>
                        </button>
                    </div>
                    <div id="respuestaPassword2" class="col-md-11">
                    </div>
                    <div class="col-md-11 d-flex mb-5 ">
                        <button class="form__button button">Registrar</button>
                        <input type="hidden" value="1" name="opcion">
                    </div>          
                </form>
            </div>

            <!-- INICIAR SESION-->
            <div class="container b-container col-md-8" id="b-container">
                <form class="form" id="b-form" method="post" action="Usuarios" enctype="multipart/form-data">
                    <div class="container_img"><img src="img/LogoFinal.svg" alt=""></div>
                    <h2 class="form_title title">Iniciar Sesi??n</h2>
                    <div>
                        <input class="form__input" name="txtDocumento" type="text" placeholder="Documento de Identidad">
                    </div>
                    <div class="input-group justify-content-center ms-5">
                        <input id="txtPassword3" name="txtContrasena"  type="password" class="form__input_c col-md-5"  placeholder="Contrase??a"  aria-label="Recipient's username"
                               aria-describedby="button-addon2" required>
                        <button class="btn boton " type="button" onclick="mostrarPassword3()"  id="botonOn3">
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-eye-fill" viewBox="0 0 16 16">
                            <path d="M10.5 8a2.5 2.5 0 1 1-5 0 2.5 2.5 0 0 1 5 0z"/>
                            <path d="M0 8s3-5.5 8-5.5S16 8 16 8s-3 5.5-8 5.5S0 8 0 8zm8 3.5a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7z"/>
                            </svg>
                        </button>
                    </div>
                    <a class="form__link" href="recuperarContrasenaUsuario.jsp">??Olvid?? su contrase??a?</a>
                    <button class="form__button button">Ingresar</button>
                    <input type="hidden" value="4" name="opcion">
                </form>
            </div>
            <div class="switch" id="switch-cnt">
                <div class="switch__circle"></div>
                <div class="switch__circle switch__circle--t"></div>
                <div class="switch__container" id="switch-c1">
                    <h2 class="switch__title title">??Bienvenido!</h2>
                    <p class="switch__description description">Para ingresar, inicia sesi??n a continuaci??n</p><button class="switch__button button switch-btn">INICIAR SESI??N</button>
                </div>
                <div class="switch__container is-hidden" id="switch-c2">
                    <h2 class="switch__title title">??Nuevo usuario?</h2>
                    <p class="switch__description description">Si es un nuevo usuario puede crear una cuenta a continuaci??n</p>
                    <button class="switch__button button switch-btn">REGISTRARSE</button>
                </div>
            </div>
        </div>
        <script src="js/ScriptsIniciarSesion/iniciarSesionRegistro.js"></script>
    </body>
</html>
