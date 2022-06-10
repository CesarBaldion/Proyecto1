
$("#actualizarTabla").click(function (e) {
    $("#actualizarTBody").load(" #actualizarTBody");
});
$(".detalles").click(function (e) {
    e.preventDefault();
    document.getElementById('OpcionIdProductoEdit').innerText = this.dataset.id;
    document.getElementById('OpcionIdProductoEdit').value = this.dataset.id;
    document.getElementById('OpcionTallaEdit').innerText = this.dataset.id2;
    document.getElementById('OpcionTallaEdit').value = this.dataset.id2;
    document.getElementById('DescripcionEdit').value = this.dataset.id3;
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
    var productoVar = $('#txtIdProductoReg').val();
    var tallaVar = $('#txtTallaReg').val();
    var descripcionVar = $('#txtDescripcionReg').val();
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
    var productoVar = $('#txtIdProductoEdit').text()();
    var productoVar = $('#txtIdProductoEdit').val();
     var tallaVar = $('#txtTallaEdit').text()();
    var tallaVar = $('#txtTallaEdit').val();
    var descripcionVar = $('#DescripcionEdit').val();
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

