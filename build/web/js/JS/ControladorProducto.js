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

$(".modal").on("click", ".botonCerrar", function (e) {
    $("#CargarVistas").load("Producto.jsp");
});

//Accionar Ventana Modal para Editar
$(".actualizarTBody").on("click", ".detalles", function (e) {
    document.getElementById('txtNombreEdit').value = this.dataset.id;
    document.getElementById('txtIdEdit').value = this.dataset.id2;
    $("#editarProductoModal").modal("show");
})

//Accionar ventana modal para Eliminar
$(".actualizarTBody").on("click", ".eliminar", function (e) {
    e.preventDefault();
    document.getElementById('responseDel').innerText = "";
    document.getElementById('txtNombreDel').innerText = this.dataset.id3;
    document.getElementById('txtIdDel').innerText = this.dataset.id4;
    $("#eliminarProductoModal").modal("show");
})


//Envio de Datos Por AJAX para Insertar
$('#submit').click(function (event) {
    var nombreVar = $('#txtNombre').val();
    var opcionVar = $('#opcion').val();
    var idVar = $('#txtId').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('Producto', {
        txtNombre: nombreVar,
        opcion: opcionVar,
        txtId: idVar,
    }, function (responseText) {
        $('#response').html(responseText);

    });
});

//Envio de Datos Por AJAX para Editar
$('#submitEdit').click(function (event) {
    var nombreVar = $('#txtNombreEdit').val();
    var opcionVar = $('#opcionedit').val();
    var idVar = $('#txtIdEdit').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('Producto', {
        txtNombre: nombreVar,
        opcion: opcionVar,
        txtId: idVar,
    }, function (responseText) {
        $('#responseEdit').html(responseText);
    });
});

//Envio de Datos Por AJAX para eliminar 
$('#submitDel').click(function (event) {
    var nombreVar = $('#txtNombreDel').text();
    var opcionVar = $('#opcioneDel').val();
    var idVar = $('#txtIdDel').text();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('Producto', {
        txtNombre: nombreVar,
        opcion: opcionVar,
        txtId: idVar,
    }, function (responseText) {
        $('#responseDel').html(responseText);
    });
});

//Envio de Archivo por AJAX
$("#formCargaMasiva").on("submit", function (e) {
    e.preventDefault();
    var formData = new FormData(document.getElementById("formCargaMasiva"));
    //formData.append(f.attr("name"), $(this)[0].files[0]);
    $.ajax({
        url: "Producto",
        type: "post",
        dataType: "html",
        data: formData,
        cache: false,
        contentType: false,
        processData: false
    }).done(function (res) {
        $("#mensaje").html("Respuesta: " + res);
    });
});



