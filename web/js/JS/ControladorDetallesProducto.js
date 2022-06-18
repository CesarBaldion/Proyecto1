

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


$("#bntCantNec").click(function (e) {

    $("#ContenidoCantidadNecesaria").load("CantidadNecesaria.jsp");
    $("#vistaCantidadNecesaria").modal("show");
});

$("#bntRegistrar").click(function (e) {
    document.getElementById("respuestaRegistrar").innerText = "";
    $("#registrarDetProModal").modal("show");
});

$('#registrarDetPro').click(function (event) {
    var idProductoRegVar = $('#idProductoReg').val();
    var tallareg = $('#txtTallaReg').val();
    var descripcionregVar = $('#txtDescripcionReg').val();
    var opcionreg = $('#opcionReg').val();

    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('DetallesProducto', {
        txtIdProducto: idProductoRegVar,
        txtTalla: tallareg,
        txtDescripcion: descripcionregVar,
        opcion: opcionreg
    }, function (responseText) {
        $('#respuestaRegistrar').html(responseText);
    });
});

$(".actualizarTBody").on("click", ".detalles", function (e) {
    document.getElementById("respuestaEdit").innerText = " ";
    document.getElementById("IdDetallesProdEdit").innerText = this.dataset.id;
    document.getElementById("opcionidProductoEdit").value = this.dataset.id2;
    document.getElementById("opcionidProductoEdit").innerText = this.dataset.id2;
    document.getElementById("opciontxtTallaEdit").value = this.dataset.id3;
    document.getElementById("opciontxtTallaEdit").innerText = this.dataset.id3;
    document.getElementById("txtDescripcionEdit").value = this.dataset.id4;
    $("#editarDetProModal").modal("show");
});

$('#editarDetPro').click(function (event) {
    var IdDetallesProdEditVar = $('#IdDetallesProdEdit').text();
    var idProductoEdit = $('#idProductoEdit').val();
    var tallaedit = $('#txtTallaEdit').val();
    var descripcioneditVar = $('#txtDescripcionEdit').val();
    var opcionedit = $('#opcionedit').val();

    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('DetallesProducto', {
        txtIdDetallesProducto: IdDetallesProdEditVar,
        txtIdProducto: idProductoEdit,
        txtTalla: tallaedit,
        txtDescripcion: descripcioneditVar,
        opcion: opcionedit
    }, function (responseText) {
        $('#respuestaEdit').html(responseText);
    });
});

$(".actualizarTBody").on("click", ".eliminar", function (e) {
    document.getElementById("respuestaDel").innerText = " ";
    document.getElementById("idDel").innerText = this.dataset.id5;
    document.getElementById("idProDel").innerText = this.dataset.id6;
    document.getElementById("idTallDel").innerText = this.dataset.id7;
    document.getElementById("idDescrDel").innerText = this.dataset.id8;
    $("#EliminarDetProModal").modal("show");
});

$('#eliDetPro').click(function (event) {
    event.preventDefault();
    var idDetallesDelVar = $('#idDel').text();
    var opcionDelVar = $('#opcionDel').val();

    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('DetallesProducto', {
        txtIdDetallesProducto: idDetallesDelVar,
        opcion: opcionDelVar
    }, function (responseText) {
        $('#respuestaDel').html(responseText);
    });
});