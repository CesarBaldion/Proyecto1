/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



$('#UsuariosView').click(function (event) {
    event.preventDefault();
    document.getElementById("CargarVistas").innerText = " ";
    $("#CargarVistas").load("Usuarios.jsp");
});

$('#OrdenesView').click(function (event) {
    event.preventDefault();
    document.getElementById("CargarVistas").innerText = " ";
    $("#CargarVistas").load("Ordenes.jsp");
});

$('#RolesView').click(function (event) {
    event.preventDefault();
    document.getElementById("CargarVistas").innerText = " ";
    $("#CargarVistas").load("Roles.jsp");
});

$('#ProductoView').click(function (event) {
    event.preventDefault();
    document.getElementById("CargarVistas").innerText = " ";
    $("#CargarVistas").load("Producto.jsp");
});

$('#DetallesProductoView').click(function (event) {
    event.preventDefault();
    document.getElementById("CargarVistas").innerText = " ";
    $("#CargarVistas").load("DetallesProducto.jsp");
});

$('#RolesView').click(function (event) {
    event.preventDefault();
    document.getElementById("CargarVistas").innerText = " ";
    $("#CargarVistas").load("Roles.jsp");
});

$('#MateriaPrimaView').click(function (event) {
    event.preventDefault();
    document.getElementById("CargarVistas").innerText = " ";
    $("#CargarVistas").load("MateriaPrima.jsp");
});

$('#LoteMateriaPrimaView').click(function (event) {
    event.preventDefault();
    document.getElementById("CargarVistas").innerText = " ";
    $("#CargarVistas").load("LoteMateriaPrima.jsp");
});

$('#ExistenciasView').click(function (event) {
    event.preventDefault();
    document.getElementById("CargarVistas").innerText = " ";
    $("#CargarVistas").load("Existencias.jsp");
});

