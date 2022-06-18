/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $('#table_id').DataTable({
        language: {
            "emptyTable": "No se encontro ningun resultado",
            "lengthMenu": "Mostar _MENU_ Registros",
            "info": "Muestra _START_ de _END_ de _TOTAL_ Registros",
            "infoEmpty": "Muestra 0 to 0 of 0 Registros",
            "search": "buscar:",
            "paginate": {
                "first": "Primero",
                "last": "Ultimo",
                "next": "Siguiente",
                "previous": "Anterior"
            },
        }}
    );
});

//Accionar ventana Editar
$(".actualizarTBody").on("click", ".detalles", function (e) {
    document.getElementById("respuestaEdit").innerText = "";
    document.getElementById("idLoteProduccionEdit").innerText = this.dataset.id;
    document.getElementById("opcionOrdenDetEdit").value = this.dataset.id3;
    document.getElementById("opcionOrdenDetEdit").text = this.dataset.id3;
    document.getElementById("cantidadEdit").value = this.dataset.id4;
    $("#editarLoteProduccion").modal("show");
});

//Envio de Datos Por Ajax para Editar
$('#submitEdit').click(function (event) {
    var idLoteProduccionVar = $('#idLoteProduccionEdit').text();
    var idUsuarioVar = $('#idUsuarioEdit').val();
    var idOrdenDetallesVar = $('#idOrDetallesIdEdit').val();
    var cantidadEditVar = $('#cantidadEdit').val();
    var opcioneditVar = $('#opcionedit').val();

    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('LoteProduccion', {
        txtid_loteProduccion: idLoteProduccionVar,
        txtId_Usuarios: idUsuarioVar,
        txtId_orden_detalles: idOrdenDetallesVar,
        txtcantidad: cantidadEditVar,
        opcion: opcioneditVar
    }, function (responseText) {
        $('#respuestaEdit').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});

//Accionar ventana Eliminar
$(".actualizarTBody").on("click", ".eliminar", function (e) {
    document.getElementById("respuestaDel").innerText = "";
    document.getElementById("idLoteProduccionDel").innerText = this.dataset.id6;
    document.getElementById("idUsuarioDel").innerText = this.dataset.id7;
    document.getElementById("opcionOrdenDetDel").innerText = this.dataset.id8;
    document.getElementById("cantidadDel").innerText = this.dataset.id9;
    document.getElementById("fechaFrabicacionDel").innerText = this.dataset.id10;
    $("#eliminarLoteProduccion").modal("show");
});

//Envio de Datos Por Ajax para Eliminar
$('#submitDel').click(function (event) {
    var idLoteProduccionDelVar = $('#idLoteProduccionDel').text();
    var opcionDelVar = $('#opcioneDel').val();

    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('LoteProduccion', {
        txtid_loteProduccion: idLoteProduccionDelVar,
        opcion: opcionDelVar
    }, function (responseText) {
        $('#respuestaDel').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});

//Envio de Datos Por Ajax para Registrar
$('#submitReg').click(function (event) {
    var date = new Date();
    var idUsuarioVar = $('#idUsuarioReg').val();
    var idOrdenDetallesVar = $('#idOrDetallesIdReg').val();
    var cantidadEditVar = $('#cantidadReg').val();
            var fechaFrabicacionEditVar = `${date.getFullYear()}-$
    {date.getMonth() + 1}-$
    {date.getDate()}`;
            var opcioneditVar = $('#opcioneReg').val();

    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('LoteProduccion', {
        txtId_Usuarios: idUsuarioVar,
        txtId_orden_detalles: idOrdenDetallesVar,
        txtcantidad: cantidadEditVar,
        txtfecha_Fabricacion: fechaFrabicacionEditVar,
        opcion: opcioneditVar
    }, function (responseText) {
        $('#respuestaRegistrar').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});






        