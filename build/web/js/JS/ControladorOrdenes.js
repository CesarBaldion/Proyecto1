
//accionar ventana modal Ingresar Varias Ordenes
$('#btnAñadirVariasOrdenes').click(function () {
    $("#modalAñadirVariasOrdenes").modal("show");
})

//accionar ventana modal Ingresar Orden
$('#btnAñadirOrden').click(function () {
    $("#modalAñadirOrden").modal("show");
})

//Accionar ventana modal para Editar
$(".actualizarTBody").on("click", ".detalles", function (e) {
    document.getElementById("idOrdenEdit").innerText = this.dataset.id;
    document.getElementById("cantidadEdit").value = this.dataset.id4;
    document.getElementById("opcionDetallesProEdit").innerText = this.dataset.id3;
    document.getElementById("opcionDetallesProEdit").value = this.dataset.id3;
    document.getElementById("opcionOrdenEdit").innerText = this.dataset.id2;
    document.getElementById("opcionOrdenEdit").value = this.dataset.id2;
    $("#editarOrdenModal").modal("show");
});

//Accionar ventana modal para Eliminar
$(".actualizarTBody").on("click", ".eliminar", function (e) {
    e.preventDefault();
    document.getElementById('responseDel').innerText = "";
    document.getElementById('idDel').innerText = this.dataset.id5;
    document.getElementById('idOrdenDel').innerText = this.dataset.id6;
    document.getElementById('idOrdenDetallesDel').innerText = this.dataset.id7;
    document.getElementById('CantidadDel').innerText = this.dataset.id8;
    $("#eliminarOrdenModal").modal("show");
});

//Actualizar tabla
$("#actualizarData").click(function (e) {
    $("#actualizarTBody").load(" #actualizarTBody");
});

//Envio de Datos Por AJAX para Añadir Orden
$('#submitReg').click(function (event) {
    var date = new Date();
    var txtIdUsuarioRegVar = $('#txtIdUsuarioReg').val();
    var txtIdDetallesProductoRegVar = $('#txtIdDetallesProductoReg').val();
    var txtcantidadSolicitadaRegVar = $('#txtcantidadSolicitadaReg').val();
    var txtFechaRegistroRegVar = `${date.getFullYear()}-${date.getMonth()+1}-${date.getDate()} `;
    var txtFechaEntregaRegVar = $('#txtFechaEntregaReg').val();
    var opcionRegVar = $('#opcionReg').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('OrdenDetalles', {
        txtIdUsuario: txtIdUsuarioRegVar,
        txtIdDetallesProducto: txtIdDetallesProductoRegVar,
        txtcantidadSolicitada: txtcantidadSolicitadaRegVar,
        txtFechaRegistro: txtFechaRegistroRegVar,
        txtFechaEntrega: txtFechaEntregaRegVar,
        opcion: opcionRegVar
    }, function (responseText) {
        $('#respuesta').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});

//Envio de Datos Por AJAX para Añadir Datos a la Lista
$('#submitVarios').click(function (event) {
    var txtIdOrdenVar = $('#idOrdenLista').val();
    var opcionVar = $('#opcionLista').val();
    var txtIdDetallesProductoVar = $('#detallesProductoLista').val();
    var txtcantidadSolicitadaVar = $('#cantidadLista').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('OrdenDetalles', {
        txtIdOrden: txtIdOrdenVar,
        opcion: opcionVar,
        txtIdDetallesProducto: txtIdDetallesProductoVar,
        txtcantidadSolicitada: txtcantidadSolicitadaVar
    }, function (responseText) {
        $('#tabla').html(responseText);
    });
});
//Insertar los Datos de la Lista
$('#cargarLista').click(function (e) {
    e.preventDefault();
    var opcionVar = $('#opcionCargarLista').val();
    $.post('OrdenDetalles', {
        opcion: opcionVar
    }, function (responseText) {
        $('#respuestaCargaLista').html(responseText);
        $("#contenerdorLista").load(" #contenerdorLista");
    });
});

//Eliminar datos de la lista de Ordenes
$(".contenerdorLista").on("click", ".submitEliminarLista", function (event) {
    var itemListaVar = this.dataset.id9;
    var opcionVar = this.dataset.id10;
    $.post('OrdenDetalles', {
        itemEliminar: itemListaVar,
        opcion: opcionVar
    }, function (responseText) {
        $('#tabla').html(responseText);
    });
});
//Envio de Datos Por AJAX para eliminar 
$('#submitDel').click(function (event) {
    var idOrdenVar = $('#idDel').text();
    var opcionVar = $('#opcioneDel').val();

    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('OrdenDetalles', {
        txtIdOrdenDetalles: idOrdenVar,
        opcion: opcionVar
    }, function (responseText) {
        $('#responseDel').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});
//Envio de Datos Por Ajax para Editar
$('#submitEdit').click(function (event) {
    var txtIdOrdenDetalles = $('#idOrdenEdit').text();
    var txtIdOrdenVar = $('#idOrdenesEdit').val();
    var opcionVar = $('#opcionEdit').val();
    var txtIdDetallesProductoVar = $('#idDetallesProEdit').val();
    var txtcantidadSolicitadaVar = $('#cantidadEdit').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('OrdenDetalles', {
        txtIdOrden: txtIdOrdenVar,
        opcion: opcionVar,
        txtIdDetallesProducto: txtIdDetallesProductoVar,
        txtcantidadSolicitada: txtcantidadSolicitadaVar,
        txtIdOrdenDetalles: txtIdOrdenDetalles
    }, function (responseText) {
        $('#respuestaEdit').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});

