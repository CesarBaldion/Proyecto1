
$("#actualizarTabla").click(function (e) {
    $("#actualizarTBody").load(" #actualizarTBody");
});
$(".detalles").click(function (e) {
    e.preventDefault();
    document.getElementById('txtIdProductoEdit').value = this.dataset.id;
    document.getElementById('txtTallaEdit').value = this.dataset.id2;
    document.getElementById('txtDescripcionEdit').value = this.dataset.id3;
    document.getElementById('txtIdDetallesProductoEdit').value = this.dataset.id4;



    $("#editarProductoModal").modal("show");

});
$(".eliminar").click(function (e) {
    e.preventDefault();
    document.getElementById('responseDel').innerText = "";
    document.getElementById('txtIdProductoDel').value = this.dataset.id5;
    document.getElementById('txtTallaDel').value = this.dataset.id6;
    document.getElementById('txtDescripcionDel').value = this.dataset.id7;
    document.getElementById('txtIdDetallesProductoDel').value = this.dataset.id8;
    $("#eliminarDetallesProductoModal").modal("show");

});

$('#submit').click(function (event) {
    var productoVar = $('#txtIdProducto').val();
    var tallaVar = $('#txtTalla').val();
    var descripcionVar = $('#txtDescripcion').val();
    var opcionVar = $('#opcion').val();
    var idDetallesProductoVar = $('#txtIdDetallesProducto').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('DetallesProducto', {
        txtIdProducto: productoVar,
        txtTalla: tallaVar,
        txtDescripcion: descripcionVar,
        opcion: opcionVar,
        txtIdDetallesProducto: idDetallesProductoVar,
    }, function (responseText) {
        $('#response').html(responseText);
    });
});

$('#submitEdit').click(function (event) {
    var productoVar = $('#txtIdProductoEdit').val();
    var tallaVar = $('#txtTallaEdit').val();
    var descripcionVar = $('#txtDescripcionEdit').val();
    var opcionVar = $('#opcionedit').val();
    var idDetallesProductoVar = $('#txtIdDetallesProductoEdit').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('DetallesProducto', {
        txtIdProducto: productoVar,
        txtTalla: tallaVar,
        txtDescripcion: descripcionVar,
        opcion: opcionVar,
        txtIdDetallesProducto: idDetallesProductoVar,
    }, function (responseText) {
        $('#responseEdit').html(responseText);
    });
});

$('#submitDel').click(function (event) {
    var productoVar = $('#txtIdProductoDel').val();
    var tallaVar = $('#txtTallaDel').val();
    var descripcionVar = $('#txtDescripcionDel').val();
    var opcionVar = $('#opcioneDel').val();
    var idDetallesProductoVar = $('#txtIdDetallesProductoDel').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('DetallesProducto', {
        txtIdProducto: productoVar,
        txtTalla: tallaVar,
        txtDescripcion: descripcionVar,
        opcion: opcionVar,
        txtIdDetallesProducto: idDetallesProductoVar, }, function (responseText) {
        $('#responseDel').html(responseText);
    });
});

