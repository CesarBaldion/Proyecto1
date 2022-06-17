//accionar Ventana Registrar
$("#registrarRol").click(function (e) {
    document.getElementById("respuestaReg").innerText = "";
    $("#registrarRolModal").modal("show");
});

//Envio de Datos Por Ajax para Registrar
$('#submitReg').click(function (event) {
    event.preventDefault();
    var idUsuarioVar = $('#idUsuarioReg').val();
    var idRolVar = $('#idRolReg').val();
    var opcionRegVar = $('#opcioneReg').val();
    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('UsuarioRol', {
        txtIdUsu: idUsuarioVar,
        txtIdRol: idRolVar,
        opcion: opcionRegVar
    }, function (responseText) {
        $('#respuestaReg').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});

//Accionar ventana Editar
$(".actualizarTBody").on("click", ".detalles", function (e) {
    document.getElementById("respuestaEdit").innerText = "";
    document.getElementById("titleIdUsuario").innerText = this.dataset.nombreusu +"("+this.dataset.documentusu+")";
    document.getElementById("opcionIdRolEdit").innerText = this.dataset.nombrerol;
    document.getElementById("opcionIdRolEdit").value = this.dataset.nombrerol;
    document.getElementById("IdUsuarioEdit").value = this.dataset.idusu;
    $("#editarUsuarioRol").modal("show");
});

//Envio de Datos Por Ajax para Editar
$('#submitEdit').click(function (event) {
    var idUsuarioEditVar = $('#IdUsuarioEdit').val();
    var idRolEditVar = $('#idRolEdit').val();
    var opcionEditVar = $('#opcioneEdit').val();

    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('UsuarioRol', {
        txtIdUsu: idUsuarioEditVar,
        txtIdRol: idRolEditVar,
        opcion: opcionEditVar
    }, function (responseText) {
        $('#respuestaEdit').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});

//Accionar Ventana Eliminar
$(".actualizarTBody").on("click", ".eliminar", function (e) {
    document.getElementById("nombreRolDel").innerText = this.dataset.nombrerol2;
    document.getElementById("UsuarioDel").innerText = this.dataset.nombreusu2+this.dataset.documentusu2;
    document.getElementById("idUsuarioDel").value = this.dataset.idusu2;
    document.getElementById("idRolDel").value = this.dataset.idrol2;
    $("#eliminarUsuarioRolModal").modal("show");
});

//Envio de Datos por Ajax para Eliminar
$('#submitDel').click(function (event) {
    alert("messirve");
    var idUsuarioEditVar = $('#idUsuarioDel').val();
    var opcionDelVar = $('#opcioneDel').val();

    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
    $.post('UsuarioRol', {
        txtIdUsu: idUsuarioEditVar,
        opcion: opcionDelVar
    }, function (responseText) {
        $('#respuestaDel').html(responseText);
        $("#actualizarTBody").load(" #actualizarTBody");
    });
});