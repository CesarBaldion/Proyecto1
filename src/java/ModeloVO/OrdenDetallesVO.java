/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author Sena
 */
public class OrdenDetallesVO {

    String id_Ordenes, id_Usuarios, id_Detalles_Producto, cantidadSolicitada, fecha_registro, fecha_entrega,
            Estado, nombreUsuario, infoProducto;

    public OrdenDetallesVO(String id_Ordenes, String id_Usuarios, String id_Detalles_Producto, String cantidadSolicitada,
            String fecha_registro, String fecha_entrega, String Estado, String nombreUsuario, String infoProducto) {

        this.id_Ordenes = id_Ordenes;
        this.id_Usuarios = id_Usuarios;
        this.id_Detalles_Producto = id_Detalles_Producto;
        this.cantidadSolicitada = cantidadSolicitada;
        this.fecha_registro = fecha_registro;
        this.fecha_entrega = fecha_entrega;
        this.Estado = Estado;
        this.nombreUsuario=nombreUsuario;
    }

    public OrdenDetallesVO(String id_Ordenes, String id_Usuarios, String id_Detalles_Producto, String cantidadSolicitada, String fecha_registro, String fecha_entrega, String Estado) {
        this.id_Ordenes = id_Ordenes;
        this.id_Usuarios = id_Usuarios;
        this.id_Detalles_Producto = id_Detalles_Producto;
        this.cantidadSolicitada = cantidadSolicitada;
        this.fecha_registro = fecha_registro;
        this.fecha_entrega = fecha_entrega;
        this.Estado = Estado;
    }

    public OrdenDetallesVO() {
    }

    public String getId_Ordenes() {
        return id_Ordenes;
    }

    public void setId_Ordenes(String id_Ordenes) {
        this.id_Ordenes = id_Ordenes;
    }

    public String getId_Usuarios() {
        return id_Usuarios;
    }

    public void setId_Usuarios(String id_Usuarios) {
        this.id_Usuarios = id_Usuarios;
    }

    public String getId_Detalles_Producto() {
        return id_Detalles_Producto;
    }

    public void setId_Detalles_Producto(String id_Detalles_Producto) {
        this.id_Detalles_Producto = id_Detalles_Producto;
    }

    public String getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void setCantidadSolicitada(String cantidadSolicitada) {
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getInfoProducto() {
        return infoProducto;
    }

    public void setInfoProducto(String infoProducto) {
        this.infoProducto = infoProducto;
    }

}
