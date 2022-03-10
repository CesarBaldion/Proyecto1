<%-- 
    Document   : Registrar
    Created on : 10/03/2022, 08:21:00 AM
    Author     : Sena
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <form class="Formulario" method = "post" action ="LoteProduccion"> 
            <h1>Registrar Usuario</h1>
            
            <input type="int" name="txtCantidad" placeholder="Cantidad" required="">
            <br>
            <input type="date" name="txtfecha_Fabricacion" placeholder="Fecha_Fabricacion" required="">
            <br>
            <input type="int" name="txt_id_orden_detalles" placeholder="txt_id_orden_produccion" required="">
            <br>
            <%--  <% 
                         ArrayList<UsuarioVO> listaUsuarios = (ArrayList<UsuarioVO>) request.getAttribute("listaU");
                        %>
                        <select class="in form-select text-light" name="txt_Id_orden_detalles">
                            <option selected>Despliega las opciones</option>
                        /*<select class="in form-select text-light" name="usuarioId">
                            <option selected>Despliega las opciones</option>*
                            <%
                              for(UsuarioVO u : listaUsuarios){ %>
                              
                              <option value="<%= u.getIdUsuarios()%>"><%= u.getNombre() %></option>
                              <%
                              }      
                            
                            %>  --%>
            <br>
            <input type="text" name="txtId_Usuarios" placeholder="Id_Usuarios" required="">
            <br>
            
          
            <button id="Boton"> Registrar </button>
            <input type="hidden" value="1" name="opcion">
        </form>
        
    </body>
</html>
