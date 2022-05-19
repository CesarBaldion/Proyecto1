<%-- 
    Document   : Prueba
    Created on : 31/03/2022, 08:21:52 AM
    Author     : Sena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles/style.css" rel="stylesheet" type="text/css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="css/iniciarSesion.css" />
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@500&display=swap" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Login y registro</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        
    </head>
    <body>
        <div class="main">
            <div class="container a-container" id="a-container">
                <form class="form" id="a-form" method="" action="">
                    <h2 class="form_title title col-md-8">Registrar Cuenta</h2>
                    <div class="col-md-11 d-flex d-inline-block ">
                        <input class="form__input_c ms-1 mt-2"  type="text" placeholder="Nombre completo">
                    </div>
                    <div class="col-md-11 d-flex d-inline-block ">
                        <select class="form__input ms-1 mt-2">
                            <option value="">Tipo de documento</option>
                            <option>Cedula de ciudadania</option>
                            <option>Tarjeta de identidad</option>
                            <option>Pasaporte</option>
                        </select>
                        <input class="form__input ms-3 mt-2" type="text" placeholder="Número de documento">
                    </div>
                    <div class="col-md-11 d-flex d-inline-block ">
                        <input class="form__input_c ms-1 mt-2"  type="text" placeholder="Dirección">
                    </div>
                    <div class="col-md-11 d-flex d-inline-block ">
                        <input id="txtPassword"  class="form__input ms-1 mt-2"  type="text" placeholder="Ciudad">
                        <input id="txtPassword"  class="form__input ms-1 mt-2"  type="text" placeholder="Teléfono">
                    </div>
                    <div class="col-md-11 d-flex d-inline-block ">
                        <input id="txtPassword"  class="form__input ms-1 mt-2"  type="text" placeholder="Correo">
                        <input id="txtPassword"  class="form__input ms-1 mt-2"  type="text" placeholder="Confirme correo">
                    </div>
                    <div class="col-md-11 d-flex d-inline-block">
                        <input id="txtPassword"  type="password" class="form__input_c ms-1 mt-2"  type="text" placeholder="Contraseña"  aria-label="Recipient's username"
                               aria-describedby="button-addon2">

                    </div>
                    <div class="col-md-11 d-flex d-inline-block ">
                        <input class="form__input_c ms-1 mt-2"  type="text" placeholder="Confirme Contraseña">
                    </div>  
                    <div class="col-md-11 d-flex mb-5 ">
                        <button class="form__button button submit ">Registrar</button>

                    </div>          

                </form>
            </div>
            <div class="container b-container col-md-8" id="b-container">
                <form class="form" id="b-form" method="" action="">
                    <div class="container_img"><img src="img/logoLogin.svg" alt=""></div>
                    <h2 class="form_title title">Iniciar Sesión</h2>
                    <input class="form__input" name="txtDocumento" type="text" placeholder="Documento de Identidad">
                    <input class="form__input" ID="txtContrasena" name="txtContrasena" type="password" placeholder="Contraseña">
                    <a class="form__link">¿Olvidó su contraseña?</a><button class="form__button button submit">Ingresar</button>
                </form>
            </div>
            <div class="switch" id="switch-cnt">
                <div class="switch__circle"></div>
                <div class="switch__circle switch__circle--t"></div>
                <div class="switch__container" id="switch-c1">
                    <h2 class="switch__title title">¡Bienvenido!</h2>
                    <p class="switch__description description">Para ingresar, inicia sesión a continuación</p><button class="switch__button button switch-btn">INICIAR SESIÓN</button>
                </div>
                <div class="switch__container is-hidden" id="switch-c2">
                    <h2 class="switch__title title">¿Nuevo usuario?</h2>
                    <p class="switch__description description">Si es un nuevo usuario puede crear una cuenta a continuación</p>
                    <button class="switch__button button switch-btn">REGISTRARSE</button>
                </div>
            </div>
        </div>
        <script src="iniciarSesionRegistro.js"></script>
        <script type="text/javascript">
            function mostrarPassword() {
                var cambio = document.getElementById("txtContrasena");
                if (cambio.type == "password") {
                    cambio.type = "text";

                } else {
                    cambio.type = "password";

                }
            }
        </script>
    </body>
</html>
