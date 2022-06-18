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

$(".modal").on("click", ".botonCerrar", function (e) {
    $("#CargarVistas").load("CantidadNecesaria.jsp");
});


$('#btnAñadir').click(function () {
    $("#respuestaRegistrar").text(" ");
    $("#registrarCantidaNec").modal("show");
});
$('#registrarCantNec').click(function (event) {
    event.preventDefault();
    alert("messirve")
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
    });
});




$(".actualizarTBody").on("click", ".eliminar", function (e) {
    document.getElementById("respuestaDel").innerText = " ";
    document.getElementById("idcantNec").value = this.dataset.idcantnec2;
    document.getElementById("idMtDel").innerText = this.dataset.idmatpri2;
    document.getElementById("nameMtDel").innerText = this.dataset.matnombre2;
    document.getElementById("idDetProDel").innerText = this.dataset.iddetproduc2;
    document.getElementById("nameProDel").innerText = this.dataset.pronombre2;
    document.getElementById("idTallDel").innerText = this.dataset.talla2;
    document.getElementById("idDescrDel").innerText = this.dataset.descrip2;
    document.getElementById("mtEnProDel").innerText = this.dataset.matenpro2;
    $("#eliminarCantidadNecModal").modal("show");
});

$(".actualizarTBody").on("click", ".detalles", function (e) {
    document.getElementById("respuestaDel").innerText = " ";
    document.getElementById("cantNecEdit").innerText = this.dataset.idcantnec;
    document.getElementById("opcionIdMateriaPrimaEdit").value = this.dataset.idmatpri;
    document.getElementById("opcionIdMateriaPrimaEdit").innerText = this.dataset.matnombre;
    document.getElementById("opcionidDetProdEdit").value = this.dataset.iddetproduc;
    document.getElementById("opcionidDetProdEdit").innerText = this.dataset.pronombre +" talla-"+this.dataset.talla+ "id-"+this.dataset.iddetproduc;
    document.getElementById("materiaprimaenproductoEdit").value = this.dataset.matenpro;
    $("#editarCantidaNecModal").modal("show");
});

$('#editarCantNec').click(function (event) {
    event.preventDefault();
    alert("messirve")
    var cantNecEditVar = $('#cantNecEdit').text();
    var IdMateriaPrimaRegVar = $('#IdMateriaPrimaEdit').val();
    var idDetProdRegVar = $('#idDetProdEdit').val();
    var materiaprimaenproductoRegVar = $('#materiaprimaenproductoEdit').val();
    var opcionRegVar = $('#opcionedit').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('CantidadNecesaria', {
        txtIdCantidadNec: cantNecEditVar,
        Id_Materia_Prima: IdMateriaPrimaRegVar,
        Id_Detalles_Producto: idDetProdRegVar,
        materiaprimaenproducto: materiaprimaenproductoRegVar,
        opcion: opcionRegVar
    }, function (responseText) {
        $('#respuestaEdit').html(responseText);
    });
});



$('#EliCanNec').click(function (event) {
    event.preventDefault();
    var idcantNecVar = $('#idcantNec').val();
    alert(idcantNecVar);
    var opcionDelVar = $('#opcionDel').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('CantidadNecesaria', {
        txtIdCantidadNec:idcantNecVar,
        opcion: opcionDelVar
    }, function (responseText) {
        $('#respuestaDel').html(responseText);
    });
});
