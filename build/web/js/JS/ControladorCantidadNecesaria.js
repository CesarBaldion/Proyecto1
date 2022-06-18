/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    $('#tableCantidadNec').DataTable({
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


$('#btnAñadir').click(function () {
    $("#respuestaRegistrar").text(" ");
    $("#registrarCantidaNec").modal("show");
});
$('#registrarCantNec').click(function (event) {
    event.preventDefault();
    var IdMateriaPrimaRegVar = $('#IdMateriaPrimaReg').val();
    var idDetProdRegVar = $('#idDetProdReg').val();
    var materiaprimaenproductoRegVar = $('#materiaprimaenproductoReg').val();
    var opcionRegVar = $('#opcionReg').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('CantidadNecesaria', {
        Id_Materia_Prima: IdMateriaPrimaRegVar,
        Id_Detalles_Producto: idDetProdRegVar,
        materiaprimaenproducto: materiaprimaenproductoRegVar,
        opcion: opcionRegVar
    }, function (responseText) {
        $('#respuestaRegistrar').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});

$(".actualizarTBody").on("click", ".detalles", function (e) {
    document.getElementById("respuestaEdit").innerText = " ";
    document.getElementById("opcionidMateriaPrimaEdit").value = this.dataset.id;
    document.getElementById("opcionidMateriaPrimaEdit").innerText = this.dataset.id2;
    document.getElementById("opcionidDetProdEdit").value = this.dataset.id3;
    document.getElementById("opcionidDetProdEdit").innerText = this.dataset.id4+" talla-"+this.dataset.id5;
    document.getElementById("materiaprimaenproductoEdit").value = this.dataset.id7;
    $("#editarCantidadNecModal").modal("show");
});

$('#editarCantNec').click(function (event) {
    event.preventDefault();
    var IdMateriaPrimaEditVar = $('#IdMateriaPrimaEdit').val();
    var idDetProdEditVar = $('#idDetProdEdit').val();
    var materiaprimaenproductoEditVar = $('#materiaprimaenproductoEdit').val();
    var opcionEditVar = $('#opcionEdit').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('CantidadNecesaria', {
        Id_Materia_Prima: IdMateriaPrimaEditVar,
        Id_Detalles_Producto: idDetProdEditVar,
        materiaprimaenproducto: materiaprimaenproductoEditVar,
        opcion: opcionEditVar
    }, function (responseText) {
        $('#respuestaEdit').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});

$(".actualizarTBody").on("click", ".eliminar", function (e) {
    document.getElementById("respuestaDel").innerText = " ";
    document.getElementById("idMtDel").innerText = this.dataset.id8;
    document.getElementById("nameMtDel").innerText = this.dataset.id9;
    document.getElementById("idDetProDel").innerText = this.dataset.id10;
    document.getElementById("nameProDel").innerText = this.dataset.id11;
    document.getElementById("idTallDel").innerText = this.dataset.id12;
    document.getElementById("idDescrDel").innerText = this.dataset.id13;
    document.getElementById("mtEnProDel").innerText = this.dataset.id14;
    $("#eliminarCantidadNecModal").modal("show");
});

$('#EliCanNec').click(function (event) {
    event.preventDefault();
    var idCantNec = $('#idCantNec').val();
    var idDetProdEditVar = $('#idDetProdEdit').val();
    var materiaprimaenproductoEditVar = $('#materiaprimaenproductoEdit').val();
    var opcionEditVar = $('#opcionEdit').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('CantidadNecesaria', {
        Id_Materia_Prima: IdMateriaPrimaEditVar,
        Id_Detalles_Producto: idDetProdEditVar,
        materiaprimaenproducto: materiaprimaenproductoEditVar,
        opcion: opcionEditVar
    }, function (responseText) {
        $('#respuestaEdit').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});
