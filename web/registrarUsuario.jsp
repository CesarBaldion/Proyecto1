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

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link href="styles/style.css" rel="stylesheet" type="text/css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="css/registrarUsuario.css" />
        <title>Registrar Usuario</title>
    </head>
    <body>
        <form method = "post" action = "Usuarios" > 
            <h1>Registrese para empezar</h1><br>
            <h3>Ingrese sus datos</h3>
            <input type="text" name= "txtNombre" placeholder="Nombres">
            <input type="text" name= "txtDocumento" placeholder="Documento">
            <input type="text" name= "txtTelefono" placeholder="Telefono">
            <input type="email" name= "txtEmail" placeholder="Email">
            <input type="text" name= "txtDireccion" placeholder="Direccion">
            <input type="password" name= "txtContrasena" placeholder="Contrasena">
            <select name="txtEstado">
                <option>Estado</option>
                <option value="1">
                    Activo
                </option>
                <option value="0">
                    Inactivo
                </option>
            </select>
            <button> Registrarse</button><br>
            <input type="hidden" value="1" name="opcion"><br>
            <a href="iniciarSesion.jsp">¿Ya tiene una cuenta?</a><br>
            <div class="mensaje">
                <%
                    if (request.getAttribute("mensajeError") != null) {%>
                ${mensajeError}

                <%   } else {%>
                ${mensajeExito}

                <%}%>
            </div>
        </form>
    </body>
</html>
