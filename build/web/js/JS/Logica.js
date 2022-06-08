
    $("#actualizarTabla").click(function (e) {
        $("#actualizarTBody").load(" #actualizarTBody");
    });
    $(".detalles").click(function (e) {
        e.preventDefault();
        document.getElementById('txtNombreEdit').value = this.dataset.id;
        document.getElementById('txtIdEdit').value = this.dataset.id2;
        $("#editarProductoModal").modal("show");

    });
    $(".eliminar").click(function (e) {
        e.preventDefault();
        document.getElementById('responseDel').innerText = "";
        document.getElementById('txtNombreDel').innerText = this.dataset.id3;
        document.getElementById('txtIdDel').innerText = this.dataset.id4;
        $("#eliminarProductoModal").modal("show");

    });

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

