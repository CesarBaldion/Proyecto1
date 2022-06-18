

$('#btnMateriaPrimaPorOrden').click(function () {
    event.preventDefault();
    document.getElementById("CargarVistas").innerText = " ";
    $("#CargarVistas").load("MateriaPrimaPorOrden.jsp");
});


$(".modal").on("click", ".botonCerrar", function (e) {
    $("#CargarVistas").load("Ordenes.jsp");
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
    document.getElementById("respuestaEdit").innerText = " ";
    document.getElementById("opciontxtIdDetallesProductoedit").value = this.dataset.iddetallesproducto;
    document.getElementById("opciontxtIdDetallesProductoedit").innerText = this.dataset.nombreproducto + " talla-" + this.dataset.protalla;
    document.getElementById("txtcantidadSolicitadaEdit").value = this.dataset.canrsolic;
    document.getElementById("txtFechaEntregaEdit").value = this.dataset.fecent;
    document.getElementById("IdOrdenEdit").innerText = this.dataset.orden;
    $("#editarOrdenModal").modal("show");
});

//Accionar ventana modal para Eliminar
$(".actualizarTBody").on("click", ".eliminar", function (e) {
    document.getElementById("respuestaDel").innerText = " ";
    document.getElementById("idOrdenDel").innerText = this.dataset.orden2;
    document.getElementById("IdUsuarioDel").innerText = this.dataset.unombre2;
    document.getElementById("IdDetProDel").innerText = this.dataset.nombreproducto2 + " talla-" + this.dataset.protalla2;
    document.getElementById("cantidadDel").innerText = this.dataset.canrsolic2;
    document.getElementById("fechaRegistroDel").innerText = this.dataset.fecreg2;
    document.getElementById("fechaEntregaDel").innerText = this.dataset.fecent2;
    $("#eliminarOrdenModal").modal("show");
});



//Envio de Datos Por AJAX para Añadir Orden
$('#submitReg').click(function (event) {
    var date = new Date();
    var txtIdUsuarioRegVar = $('#txtIdUsuarioReg').val();
    var txtIdDetallesProductoRegVar = $('#txtIdDetallesProductoReg').val();
    var txtcantidadSolicitadaRegVar = $('#txtcantidadSolicitadaReg').val();
    var txtFechaRegistroRegVar = `${date.getFullYear()}-${date.getMonth() + 1}-${date.getDate()}`;
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
    });
});

//Envio de Datos Por AJAX para Añadir Datos a la Lista
$('#submitVarios').click(function (event) {
    event.preventDefault();

    var date = new Date();
    var txtIdUsuariolistVar = $('#txtIdUsuariolist').val();
    var nombresesionVar = $('#txtnombreUsuariolist').val();
    var txtIdDetallesProductoVar = $('#detallesProductolist').val();
    var infoProductoVar = $('#detallesProductolist').text();
    var txtcantidadSolicitadaVar = $('#txtcantidadSolicitadalist').val();
    var txtFechaRegistrolistaVar = `${date.getFullYear()}-${date.getMonth() + 1}-${date.getDate()}`;
    var txtFechaEntregalistVar = $('#txtFechaEntregalist').val();
    var opcionVar = $('#opcionLista').val();

    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('OrdenDetalles', {
        txtIdUsuario: txtIdUsuariolistVar,
        txtIdDetallesProducto: txtIdDetallesProductoVar,
        infoProducto: infoProductoVar,
        txtcantidadSolicitada: txtcantidadSolicitadaVar,
        txtFechaRegistro: txtFechaRegistrolistaVar,
        txtFechaEntrega: txtFechaEntregalistVar,
        nombreUsuario: nombresesionVar,
        opcion: opcionVar
    }, function (responseText) {
        $('#tabla').html(responseText);
    });
});

//Cargar los Datos de la Lista
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
    var idOrdenDelVar = $('#idOrdenDel').text();
    var opcioneDelVar = $('#opcioneDel').val();

    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('OrdenDetalles', {
        txtIdOrdenes: idOrdenDelVar,
        opcion: opcioneDelVar
    }, function (responseText) {
        $('#respuestaDel').html(responseText);
    });
});


//Envio de Datos Por Ajax para Editar
$('#submitedit').click(function (event) {
    var IdOrdenEditVar = $('#IdOrdenEdit').text();
    var txtFechaEntregaEditVar = $('#txtFechaEntregaEdit').val();
    var txtIdDetallesProductoVar = $('#txtIdDetallesProductoedit').val();
    var txtcantidadSolicitadaVar = $('#txtcantidadSolicitadaEdit').val();
    var txtIdUsuarioeditVar = $('#txtIdUsuarioedit').val();
    var opcionVar = $('#opcionedit').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('OrdenDetalles', {
        txtIdOrdenes: IdOrdenEditVar,
        txtIdDetallesProducto: txtIdDetallesProductoVar,
        txtcantidadSolicitada: txtcantidadSolicitadaVar,
        txtFechaEntrega: txtFechaEntregaEditVar,
        txtIdUsuario: txtIdUsuarioeditVar,
        opcion: opcionVar,
    }, function (responseText) {
        $('#respuestaEdit').html(responseText);
    });
});

