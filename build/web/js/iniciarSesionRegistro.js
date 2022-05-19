/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

//let switchCtn = document.querySelector("#switch-cnt");
//let switchC1 = document.querySelector("#switch-c1");
//let switchC2 = document.querySelector("#switch-c2");
//let switchCircle = document.querySelectorAll(".switch__circle");
//let switchBtn = document.querySelectorAll(".switch-btn");
//let aContainer = document.querySelector("#a-container");
//let bContainer = document.querySelector("#b-container");
//let allButtons = document.querySelectorAll(".submit");
//
//let getButtons = (e) => e.preventDefault()
//
//let changeForm = (e) => {
//
//    switchCtn.classList.add("is-gx");
//    setTimeout(function(){
//        switchCtn.classList.remove("is-gx");
//    }, 1500)
//
//    switchCtn.classList.toggle("is-txr");
//    switchCircle[0].classList.toggle("is-txr");
//    switchCircle[1].classList.toggle("is-txr");
//
//    switchC1.classList.toggle("is-hidden");
//    switchC2.classList.toggle("is-hidden");
//    aContainer.classList.toggle("is-txl");
//    bContainer.classList.toggle("is-txl");
//    bContainer.classList.toggle("is-z200");
//}

//let mainF = (e) => {
//    for (var i = 0; i < allButtons.length; i++)
//        allButtons[i].addEventListener("click", getButtons );
//    for (var i = 0; i < switchBtn.length; i++)
//        switchBtn[i].addEventListener("click", changeForm)
//}

window.addEventListener("load", mainF);

