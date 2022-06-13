/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var formRegUsuario = document.getElementById("formularioUsuario");
var inputs = document.querySelectorAll("#formularioUsuario input");

var divCiudad = document.getElementById("respuestaCiudad");
var divNombre = document.getElementById("respuestaNombre");
var divTipoDocumento = document.getElementById("RespuestaTipoDocumento");
var divDocumento = document.getElementById("respuestaDocumento");
var divDireccion = document.getElementById("respuestaDireccion");
var divTelefono = document.getElementById("respuestaTelefono");
var divEmail = document.getElementById("respuestaEmail");
var divEmail2 = document.getElementById("respuestaEmail2");
var divPassword = document.getElementById("respuestaPassword");
var divPassword2 = document.getElementById("respuestaPassword2");
const campos = {
    txtNombre: false,
    txtTipoDocumento: false,
    txtDocumento: false,
    txtDireccion: false,
    txtCiudad: false,
    txtTelefono: false,
    txtEmail: false,
    txtEmail2: false,
    txtContrasena: false,
    txtContrasena2: false,
};

const expresiones = {
    nombre: /^[a-zA-ZÀ-ÿ\s]{5,40}$/, //Letras y espacios, pueden llevar acentos.
    password: /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])([A-Za-z\d$@$!%*?&]|[^ ]){8,15}$/,
    correo: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
    telefono: /^\d{10}$/, // 7 a 14 numeros.
    documento: /^\d{7,20}$/, // 7 a 14 numeros.
    direccion: /^[a-zA-ZÀ-ÿ\s#-_]{5,40}$/,
};



const validarFormulario = (e) => {
    switch (e.target.name) {
        case "txtNombre":
            if (validarCampo(expresiones.nombre, e.target, 'txtNombre') == true) {
                divNombre.innerHTML = ` `;
            } else {
                divNombre.innerHTML = `<label class="text-danger"><b>Ingrese un Nombre Valido</b></label>`
            };
            break;
        case "txtDocumento":
            if (validarCampo(expresiones.documento, e.target, 'txtDocumento')) {
                divDocumento.innerHTML = ` `;
            } else {
                divDocumento.innerHTML = `<label class="text-danger"><b>Ingrese un Documento Valido</b></label>`
            }
            ; break
        case "txtDireccion":
            if (validarCampo(expresiones.direccion, e.target, 'txtDireccion')) {
                divDireccion.innerHTML = ` `;
            } else {
                divDireccion.innerHTML = `<label class="text-danger"><b>Ingrese una Direccion Valida</b></label>`
            };
            break;
        case "txtCiudad":
            if (validarCampo(expresiones.nombre, e.target, 'txtCiudad')) {
                divCiudad.innerHTML = ` `;
            } else {
                divCiudad.innerHTML = `<label class="text-danger"><b>Ingrese una Ciudad Valida</b></label>`;
            };
            break;
        case "txtTelefono":
            if (validarCampo(expresiones.telefono, e.target, 'txtTelefono')) {
                divTelefono.innerHTML = ` `;
            } else {
                divTelefono.innerHTML = `<label class="text-danger"><b>Ingrese un telefono Valido</b></label>`
            };
            break;
        case "txtEmail":
            if (validarCampo(expresiones.correo, e.target, 'txtEmail')) {
                divEmail.innerHTML = ` `;
                validarEmail2();
            } else {
                divEmail.innerHTML = `<label class="text-danger"><b>Ingrese un Email Valido</b></label>`
            };
            break;
        case "txtEmail2":
            if (validarCampo(expresiones.correo, e.target, 'txtEmail')) {
                divEmail2.innerHTML = ` `;
                validarEmail2();
            } else {
                divEmail2.innerHTML = `<label class="text-danger"><b>Ingrese un Email Valido</b></label>`
            };
            break;
        case "txtContrasena":
            if (validarCampo(expresiones.password, e.target, 'txtContrasena')) {
                divPassword.innerHTML = ` `;
                validarPassword2();
            } else {
                divPassword.innerHTML = `<label class="text-danger"><b>Ingrese una Contraseña Valida minimo 8 caracteres  (1 min, 1 mayus, 1 num,<br> 1 CaracterEspecial($@$!%*?&))</b></label>`
            };
            break;
        case "txtContrasena2":
            if (validarCampo(expresiones.password, e.target, 'txtContrasena')) {
                divPassword2.innerHTML = ` `
                validarPassword2();
            } else {
                divPassword2.innerHTML = `<label class="text-danger"><b>Ingrese una Contraseña Valida minimo 8 caracteres (1 min, 1 mayus, 1 num,<br> 1 CaracterEspecial($@$!%*?&))</b></label>`
            };
            break;
    }
}
/*Debe contener: 8 a 15 caracteres, min 1 mayúscula, min 1 minuscula, min 1 numero,1 caracter especial sin espacios */


inputs.forEach((input) => {
    input.addEventListener("keyup", validarFormulario);
    input.addEventListener("blur", validarFormulario);
    input.addEventListener("click", validarFormulario);

});


var validarCampo = (expresion, input, campo) => {
    if (expresion.test(input.value)) {
        if (input.classList.contains("mal")) {
            input.classList.remove("mal");
            input.classList.add("bien");
        } else {
            input.classList.add("bien");
        }
        campos[campo] = true;
        return true;
    } else {
        if (input.classList.contains("bien")) {
            input.classList.remove("bien");
            input.classList.add("mal");
        } else {
            input.classList.add("mal");
        };
        campos[campo] = false;
        return false;

    }

}

const validarEmail2 = () => {
    const inputemail1 = document.getElementById('txtEmail');
    const inputemail2 = document.getElementById('txtEmail2');
    if (inputemail1.value !== inputemail2.value) {
        if (inputemail1.classList.contains("bien") | inputemail2.classList.contains("bien")) {
            inputemail1.classList.remove("bien");
            inputemail1.classList.add("mal");
            respuestaEmail.innerHTML = `<label class="text-danger"><b>Los Email no coinciden</b></label>`
            inputemail2.classList.remove("bien");
            inputemail2.classList.add("mal");
            respuestaEmail2.innerHTML = `<label class="text-danger"><b>Los Email no coinciden</b></label>`
        } else {
            inputemail1.classList.add("mal");
            inputemail2.classList.add("mal");
        };
        campos['txtEmail'] = false;
        campos['txtEmail2'] = false;
    } else {
        if (inputemail1.classList.contains("mal") | inputemail2.classList.contains("mal")) {
            inputemail1.classList.remove("mal");
            inputemail1.classList.add("bien");
            inputemail2.classList.remove("mal");
            inputemail2.classList.add("bien");
        } else {
            inputemail2.classList.add("bien");
            inputemail1.classList.add("bien");
        }
        campos['txtEmail'] = true;
        campos['txtEmail2'] = true;
    }
};

const validarPassword2 = () => {
    const inputPassword1 = document.getElementById('txtPassword');
    const inputPassword2 = document.getElementById('txtPassword2');
    if (inputPassword1.value !== inputPassword2.value) {
        if (inputPassword1.classList.contains("bien") | inputPassword2.classList.contains("bien")) {
            inputPassword1.classList.remove("bien");
            inputPassword1.classList.add("mal");
            divPassword.innerHTML = `<label class="text-danger"><b>Las Contraseñas no Coinciden</b></label>`
            inputPassword2.classList.remove("bien");
            inputPassword2.classList.add("mal");
            divPassword2.innerHTML = `<label class="text-danger"><b>Las Contraseñas no Coinciden</b></label>`
        } else {
            inputPassword2.classList.add("mal");
            inputPassword1.classList.add("mal");
        };
        campos['txtContrasena'] = false;
        campos['txtContrasena2'] = false;
    } else {
        if (inputPassword1.classList.contains("mal") | inputPassword1.classList.contains("mal")) {
            inputPassword1.classList.remove("mal");
            inputPassword1.classList.add("bien");
            inputPassword2.classList.remove("mal");
            inputPassword2.classList.add("bien");
        } else {
            inputPassword2.classList.add("bien");
            inputPassword1.classList.add("bien");
        }
        campos['txtContrasena'] = true;
        campos['txtContrasena2'] = true;
    }
}
var tipoDocumento = document.getElementById("txtTipoDocumento");
tipoDocumento.addEventListener("click", () => {
    if (tipoDocumento.value == "CC" | tipoDocumento.value == "TI" | tipoDocumento.value == "PA") {
        if (tipoDocumento.classList.contains("mal")) {
            tipoDocumento.classList.remove("mal");
            tipoDocumento.classList.add("bien");
            
        } else {
            tipoDocumento.classList.add("bien");
            tipoDocumento.classList.add("bien");
        }
        divTipoDocumento.innerHTML = ` `;

        campos['txtTipoDocumento'] = true;
    } else {
        if (tipoDocumento.classList.contains("bien")) {
            tipoDocumento.classList.remove("bien");
            tipoDocumento.classList.add("mal");
            
            tipoDocumento.classList.add("mal");
            tipoDocumento.classList.add("mal");
        };
        divTipoDocumento.innerHTML = `<label class="text-danger"><b>Elija un Tipo de Documento Valido</b></label>`;
        
        campos['txtTipoDocumento'] = false;
    }
});
    

formRegUsuario.addEventListener('submit', (e) => {
    e.preventDefault();
    console.log(campos);
    if (campos.txtCiudad && campos.txtContrasena &&
        campos.txtContrasena &&campos.txtContrasena2 
        && campos.txtEmail2 && campos.txtEmail &&
        campos.txtDocumento && campos.txtTelefono &&
        campos.txtNombre &&campos.txtTipoDocumento  ) {
        formRegUsuario.submit();
        
    } else {
        alert("Revise bien los datos perro hijue");
    }
});





/*--------------------------------------------------------------------------------------------------------------------*/
    function mostrarPassword() {
        var cambio = document.getElementById("txtPassword");
        var uno = document.getElementById('botonOn');
        if (cambio.type == "password") {
            cambio.type = "text";
            uno.innerHTML = '<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-eye-slash-fill" viewBox="0 0 16 16"><path d="m10.79 12.912-1.614-1.615a3.5 3.5 0 0 1-4.474-4.474l-2.06-2.06C.938 6.278 0 8 0 8s3 5.5 8 5.5a7.029 7.029 0 0 0 2.79-.588zM5.21 3.088A7.028 7.028 0 0 1 8 2.5c5 0 8 5.5 8 5.5s-.939 1.721-2.641 3.238l-2.062-2.062a3.5 3.5 0 0 0-4.474-4.474L5.21 3.089z"/><path d="M5.525 7.646a2.5 2.5 0 0 0 2.829 2.829l-2.83-2.829zm4.95.708-2.829-2.83a2.5 2.5 0 0 1 2.829 2.829zm3.171 6-12-12 .708-.708 12 12-.708.708z"/></svg>';

        } else {
            cambio.type = "password";
            uno.innerHTML = '<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-eye-fill" viewBox="0 0 16 16"><path d="M10.5 8a2.5 2.5 0 1 1-5 0 2.5 2.5 0 0 1 5 0z"/><path d="M0 8s3-5.5 8-5.5S16 8 16 8s-3 5.5-8 5.5S0 8 0 8zm8 3.5a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7z"/></svg>';

        }
    }
    function mostrarPassword2() {
        var cambio = document.getElementById("txtPassword2");
        var uno = document.getElementById('botonOn2');
        if (cambio.type == "password") {
            cambio.type = "text";
            uno.innerHTML = '<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-eye-slash-fill" viewBox="0 0 16 16"><path d="m10.79 12.912-1.614-1.615a3.5 3.5 0 0 1-4.474-4.474l-2.06-2.06C.938 6.278 0 8 0 8s3 5.5 8 5.5a7.029 7.029 0 0 0 2.79-.588zM5.21 3.088A7.028 7.028 0 0 1 8 2.5c5 0 8 5.5 8 5.5s-.939 1.721-2.641 3.238l-2.062-2.062a3.5 3.5 0 0 0-4.474-4.474L5.21 3.089z"/><path d="M5.525 7.646a2.5 2.5 0 0 0 2.829 2.829l-2.83-2.829zm4.95.708-2.829-2.83a2.5 2.5 0 0 1 2.829 2.829zm3.171 6-12-12 .708-.708 12 12-.708.708z"/></svg>';
        } else {
            cambio.type = "password";
            uno.innerHTML = '<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-eye-fill" viewBox="0 0 16 16"><path d="M10.5 8a2.5 2.5 0 1 1-5 0 2.5 2.5 0 0 1 5 0z"/><path d="M0 8s3-5.5 8-5.5S16 8 16 8s-3 5.5-8 5.5S0 8 0 8zm8 3.5a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7z"/></svg>';

        }
    }
    function mostrarPassword3() {
        var cambio = document.getElementById("txtPassword3");
        var uno = document.getElementById('botonOn3');
        if (cambio.type == "password") {
            cambio.type = "text";
            uno.innerHTML = '<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-eye-slash-fill" viewBox="0 0 16 16"><path d="m10.79 12.912-1.614-1.615a3.5 3.5 0 0 1-4.474-4.474l-2.06-2.06C.938 6.278 0 8 0 8s3 5.5 8 5.5a7.029 7.029 0 0 0 2.79-.588zM5.21 3.088A7.028 7.028 0 0 1 8 2.5c5 0 8 5.5 8 5.5s-.939 1.721-2.641 3.238l-2.062-2.062a3.5 3.5 0 0 0-4.474-4.474L5.21 3.089z"/><path d="M5.525 7.646a2.5 2.5 0 0 0 2.829 2.829l-2.83-2.829zm4.95.708-2.829-2.83a2.5 2.5 0 0 1 2.829 2.829zm3.171 6-12-12 .708-.708 12 12-.708.708z"/></svg>';
        } else {
            cambio.type = "password";
            uno.innerHTML = '<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-eye-fill" viewBox="0 0 16 16"><path d="M10.5 8a2.5 2.5 0 1 1-5 0 2.5 2.5 0 0 1 5 0z"/><path d="M0 8s3-5.5 8-5.5S16 8 16 8s-3 5.5-8 5.5S0 8 0 8zm8 3.5a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7z"/></svg>';

        }
    }

let switchCtn = document.querySelector("#switch-cnt");
let switchC1 = document.querySelector("#switch-c1");
let switchC2 = document.querySelector("#switch-c2");
let switchCircle = document.querySelectorAll(".switch__circle");
let switchBtn = document.querySelectorAll(".switch-btn");
let aContainer = document.querySelector("#a-container");
let bContainer = document.querySelector("#b-container");
let allButtons = document.querySelectorAll(".submit");

let getButtons = (e) => e.preventDefault()

let changeForm = (e) => {

    switchCtn.classList.add("is-gx");
    setTimeout(function(){
        switchCtn.classList.remove("is-gx");
    }, 1500)

    switchCtn.classList.toggle("is-txr");
    switchCircle[0].classList.toggle("is-txr");
    switchCircle[1].classList.toggle("is-txr");

    switchC1.classList.toggle("is-hidden");
    switchC2.classList.toggle("is-hidden");
    aContainer.classList.toggle("is-txl");
    bContainer.classList.toggle("is-txl");
    bContainer.classList.toggle("is-z200");
}

let mainF = (e) => {
    for (var i = 0; i < allButtons.length; i++)
        allButtons[i].addEventListener("click", getButtons );
    for (var i = 0; i < switchBtn.length; i++)
        switchBtn[i].addEventListener("click", changeForm)
}

window.addEventListener("load", mainF);

