$(".actualizarTBody").on("click", ".detalles", function (e) {
    document.getElementById("respuestaEdit").innerText = " ";
    document.getElementById("ObservacionesEdit").value = " ";
    document.getElementById("IdLoteMateriaPrimaEdit").innerText = this.dataset.id;
    document.getElementById("opcionIdMateriaPrima").text = this.dataset.id2;
    document.getElementById("opcionIdMateriaPrima").value = this.dataset.id2;
    document.getElementById("CantidadEdit").value = this.dataset.id3;
    document.getElementById("ObservacionesEdit").value = this.dataset.id4;
    document.getElementById("FechaIngresoEdit").value = this.dataset.id5;
    document.getElementById("FechaSalidaEdit").value = this.dataset.id6;
    $("#editarLoteMateriaPrima").modal("show");
});

//Envio de Datos Por Ajax para Editar
$('#submitEdit').click(function (event) {
    event.preventDefault();
    var IdLoteMateriaPrimaEditVar = $('#IdLoteMateriaPrimaEdit').text();
    var IdMateriaPrimaEditVar = $('#IdMateriaPrimaEdit').val();
    var CantidadEditVar = $('#CantidadEdit').val();
    var ObservacionesEditVar = $('#ObservacionesEdit').val();
    var FechaIngresoEditVar = $('#FechaIngresoEdit').val();
    var FechaSalidaEditVar = $('#FechaSalidaEdit').val();
    var opcioneditVar = $('#opcionEdit').val();

    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('loteMateriaPrima', {
        txtIdLoteMateriaPrima: IdLoteMateriaPrimaEditVar,
        txtIdMateriaPrima: IdMateriaPrimaEditVar,
        txtCantidad: CantidadEditVar,
        txtObservaciones: ObservacionesEditVar,
        txtFechaIngreso: FechaIngresoEditVar,
        txtFechaSalida: FechaSalidaEditVar,
        opcion: opcioneditVar
    }, function (responseText) {
        $('#respuestaEdit').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});

$(".actualizarTBody").on("click", ".eliminar", function (e) {
    document.getElementById("respuestaDel").innerText = "";
    document.getElementById("idLoteMateriaPrimaDel").innerText = this.dataset.id7;
    document.getElementById("IdMateriaPrimaDel").innerText = this.dataset.id8;
    document.getElementById("CantidadDel").innerText = this.dataset.id9;
    document.getElementById("ObservacionesDel").innerText = this.dataset.id10;
    document.getElementById("FechaIngresoDel").innerText = this.dataset.id11;
    document.getElementById("FechaSalidaDel").innerText = this.dataset.id12;
    $("#eliminarLoteMateriaPrima").modal("show");
});


$('#modalRegistrar').click(function () {
    $("#respuestaRegistrar").text(" ");
    $("#regitrarLoteMateriaPrima").modal("show");
});
//Envio de Datos Por Ajax para Registrar
$('#submitReg').click(function (event) {
    event.preventDefault();
    var IdMateriaPrimaRegtVar = $('#IdMateriaPrimaReg').val();
    var CantidadRegVar = $('#CantidadReg').val();
    var ObservacionesRegVar = $('#ObservacionesReg').val();
    var FechaIngresoRegVar = $('#FechaIngresoReg').val();
    var FechaSalidaRegVar = $('#FechaSalidaReg').val();
    var opcionRegVar = $('#opcionReg').val();

    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('loteMateriaPrima', {
        txtIdMateriaPrima: IdMateriaPrimaRegtVar,
        txtCantidad: CantidadRegVar,
        txtObservaciones: ObservacionesRegVar,
        txtFechaIngreso: FechaIngresoRegVar,
        txtFechaSalida: FechaSalidaRegVar,
        opcion: opcionRegVar
    }, function (responseText) {
        $('#respuestaReg').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});

//Envio de Datos Por Ajax para Eliminar
$('#submitDel').click(function (event) {
    event.preventDefault();
    var IdLoteMateriaPrimaEditVar = $('#idLoteMateriaPrimaDel').text();
    var opcioneditVar = $('#opcioneDel').val();

    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('loteMateriaPrima', {
        txtIdLoteMateriaPrima: IdLoteMateriaPrimaEditVar,
        opcion: opcioneditVar
    }, function (responseText) {
        $('#respuestaDel').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});



