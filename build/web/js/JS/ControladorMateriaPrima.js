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
    )
});

//Accionar Ventana Modal para Editar
$(".actualizarTBody").on("click", ".detalles", function (e) {
    document.getElementById('responseEdit').innerText = " ";
    document.getElementById('idMateriaPrimaEdit').value = this.dataset.id;
    document.getElementById('nombreMateriaPrimaEdit').value = this.dataset.id2;
    $("#editarMateriaPrimaModal").modal("show");
});

//Envio de Datos Por AJAX para Editar
$('#submitEdit').click(function (event) {
    event.preventDefault();
    var nombreMateriaPrimaEditVar = $('#nombreMateriaPrimaEdit').val();
    var opcioneditVar = $('#opcionedit').val();
    var idMateriaPrimaEditVar = $('#idMateriaPrimaEdit').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('MateriaPrima', {
        txtIdMateriaPrima: idMateriaPrimaEditVar,
        opcion: opcioneditVar,
        txtNombre: nombreMateriaPrimaEditVar,
    }, function (responseText) {
        $('#responseEdit').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});


//Accionar ventana modal para Eliminar
$(".actualizarTBody").on("click", ".eliminar", function (e) {
    e.preventDefault();
    document.getElementById('responseDel').innerText = "";
    document.getElementById('idMateriaPrimaDel').innerText = this.dataset.id3;
    document.getElementById('nombreMateriaPrimaDel').innerText = this.dataset.id4;
    $("#eliminarMateriaPrimaModal").modal("show");
});

//Envio de Datos Por AJAX para Eliminar
$('#submitDel').click(function (event) {
    event.preventDefault();
    var idMateriaPrimaDelVar = $('#idMateriaPrimaDel').text();
    var opcioneDelVar = $('#opcioneDel').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('MateriaPrima', {
        txtIdMateriaPrima: idMateriaPrimaDelVar,
        opcion: opcioneDelVar
    }, function (responseText) {
        $('#responseDel').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});

//Accionar ventana modal para Registrar
$('#modalRegistrar').click(function (event) {
    document.getElementById("respuestaReg").innerText = " ";
    $("#registrarMateriaPrimaModal").modal("show");

});
//Envio de Datos Por AJAX para Insertar
$('#submitReg').click(function (event) {
    var nombreMateriaPrimaRegVar = $('#nombreMateriaPrimaReg').val();
    var opcionRegVar = $('#opcionReg').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('MateriaPrima', {
        txtNombre: nombreMateriaPrimaRegVar,
        opcion: opcionRegVar
    }, function (responseText) {
        $('#respuestaReg').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");

    });
});

//Accionar Ventana Carga Masiva
$('#modalCargaMasiva').click(function (event) {
    document.getElementById("repuestaCargaMasiva").innerText = " ";
    $("#CargaMasivaModal").modal("show");

});

//Envio de Archivo por AJAX
$("#formCargaMasiva").on("submit", function (e) {
    e.preventDefault();
    alert("messirve");
    var formData = new FormData(document.getElementById("formCargaMasiva"));
    //formData.append(f.attr("name"), $(this)[0].files[0]);
    $.ajax({
        url: "MateriaPrima",
        type: "post",
        dataType: "html",
        data: formData,
        cache: false,
        contentType: false,
        processData: false
    }).done(function (res) {
        $("#repuestaCargaMasiva").html(res);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});