<%-- 
    Document   : registrarUsuario
    Created on : 3/03/2022, 08:29:39 PM
    Author     : Juan Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Registrar Usuario</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/registrarUsuario.css">
    </head>
    <body class="row">
        <div class="col-md-4 mx-auto justify-content-center  border border-info mt-5 caja">
            <div class="col-md-11 mx-auto justify-content-center mt-5">
                <form method = "post" action="Usuarios"  class="form-group"> 
                    <h1 class="text-center fs-2">Registrese para empezar</h1>
                    <h3 class="text-center fs-4">Ingrese sus datos</h3>
                    <div class="mx-auto justify-content-center">
                        <%if (request.getAttribute("mensajeError") != null) {%>
                        <p class="text-danger text-center fs-5">${mensajeError}</p>

                        <%   } else {%>
                        <p class="text-success text-center fs-5">${mensajeExito}</p>

                        <%}%>
                    </div>
                    <div class="mt-2">
                        <input type="text" name= "txtNombre" placeholder="Nombres" required="" class="form-control mt-2">
                        <input type="text" name= "txtDocumento" placeholder="Documento" required="" class="form-control  mt-2" >
                        <input type="text" name= "txtTelefono" placeholder="Telefono" required="" class="form-control  mt-2">
                        <input type="email" name= "txtEmail" placeholder="Email" required="" class="form-control  mt-2">
                        <input type="text" name= "txtDireccion" placeholder="Direccion" required="" class="form-control  mt-2">
                        <div class="form-floating">
                            <input type="password" name= "txtContrasena" id="floatingInput" placeholder="Contrasena" required="" class="form-control  mt-2">
                            <%
                                if (request.getAttribute("NoValida") != null) {%>
                            <label for="floatingInput" class="text-danger">${NoValida}</label>

                            <%   } else {%>
                            <label class="text-success">${Valida}</label>

                            <%}%>
                        </div>
                        <select name="txtEstado" class="form-select mt-2">
                            <option>Estado</option>
                            <option value="1">
                                Activo
                            </option>
                            <option value="0">
                                Inactivo
                            </option>
                        </select>
                        <div class="d-flex mt-2 mb-3">
                            <button class="btn boton"> Registrarse</button><br>
                            <input type="hidden" value="1" name="opcion"><br>
                            <a href="iniciarSesion.jsp" class="nav-link text-center">¿Ya tiene una cuenta?</a>
                        </div>
                    </div>
                </form>
            </div>  
            <div class="mx-auto justify-content-center">
                <%if (request.getAttribute("Verifique") != null) {%>
                <p class="text-danger text-center fs-5">${Verifique}</p>
                <%}%>
            </div>
        </div>





    </body>
</html>
