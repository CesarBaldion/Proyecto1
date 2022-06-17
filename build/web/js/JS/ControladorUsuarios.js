/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */      $(".modal").on("click", ".botonCerrar", function (e) {
    $("#CargarVistas").load("Usuarios.jsp");
});
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

//Accionar ventana modal para Eliminar
$(".actualizarTBody").on("click", ".eliminar", function (e) {
    document.getElementById('responseDel').innerText = "";
    document.getElementById('idUsuarioDel').innerText = this.dataset.id;
    document.getElementById('nombreUsuarioDel').innerText = this.dataset.id2;
    document.getElementById('tipoDocumentoDel').innerText = this.dataset.id3;
    document.getElementById('DocumentoDel').innerText = this.dataset.id4;
    document.getElementById('emailDel').innerText = this.dataset.id5;

    $("#eliminarUsuarioModal").modal("show");
});

//Envio de Datos Por AJAX para eliminar 
$('#submitDel').click(function (event) {
    var idUsuarioDelVar = $('#idUsuarioDel').text();
    var opcionVar = $('#opcioneDel').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('Usuarios', {
        txtId: idUsuarioDelVar,
        opcion: opcionVar
    }, function (responseText) {
        $('#responseDel').html(responseText);
    });
});

//Accionar ventana modal para Editar
$(".actualizarTBody").on("click", ".detalles", function (e) {
    document.getElementById('respuestaEdit').innerText = "";
    document.getElementById("idUsuarioEdit").innerText = this.dataset.id5;
    document.getElementById("nombreUsuarioEdit").value = this.dataset.id6;
    document.getElementById("OpciontipoDocumentoEdit").innerText = this.dataset.id7;
    document.getElementById("OpciontipoDocumentoEdit").value = this.dataset.id7;
    document.getElementById("documentoEdit").value = this.dataset.id8;
    document.getElementById("direccionEdit").value = this.dataset.id9;
    document.getElementById("ciudadEdit").value = this.dataset.id10;
    document.getElementById("telefonoEdit").value = this.dataset.id11;
    document.getElementById("emailEdit").value = this.dataset.id12;
    $("#editarUsuarioModal").modal("show");
});

//Envio de Datos Por Ajax para Editar
$('#submitEdit').click(function (event) {
    var idUsuarioEditVar = $('#idUsuarioEdit').text();
    var nombreUsuarioEditVar = $('#nombreUsuarioEdit').val();
    var tipoDocumentoEditVar = $('#tipoDocumentoEdit').val();
    var documentoEditVar = $('#documentoEdit').val();
    var direccionEditVar = $('#direccionEdit').val();
    var ciudadEditVar = $('#ciudadEdit').val();
    var telefonoEditVar = $('#telefonoEdit').val();
    var emailEditVar = $('#emailEdit').val();
    var opcionEditVar = $('#opcionedit').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('Usuarios', {
        txtId: idUsuarioEditVar,
        txtNombre: nombreUsuarioEditVar,
        txtTipoDocumento: tipoDocumentoEditVar,
        txtDocumento: documentoEditVar,
        txtDireccion: direccionEditVar,
        txtCiudad: ciudadEditVar,
        txtTelefono: telefonoEditVar,
        txtEmail: emailEditVar,
        opcion: opcionEditVar

    }, function (responseText) {
        $('#respuestaEdit').html(responseText);
    });
});

//Envio de Archivo por AJAX
$("#formCargaMasiva").on("submit", function (e) {
    e.preventDefault();
    var formData = new FormData(document.getElementById("formCargaMasiva"));
    //formData.append(f.attr("name"), $(this)[0].files[0]);
    $.ajax({
        url: "Usuarios",
        type: "post",
        dataType: "html",
        data: formData,
        cache: false,
        contentType: false,
        processData: false
    }).done(function (res) {
        $("#repuestaCargaMasiva").html(res);
    });
});



