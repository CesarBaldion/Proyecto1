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
public class DetallesProductoVO {
    
    String Id_Detalles_Producto, Id_Producto, Descripcion, Talla;

    public DetallesProductoVO() {
    }

    public DetallesProductoVO(String Id_Detalles_Producto, String Id_Producto, String Descripcion, String Talla) {
        this.Id_Detalles_Producto = Id_Detalles_Producto;
        this.Id_Producto = Id_Producto;
        this.Descripcion = Descripcion;
        this.Talla = Talla;
    }

    public String getId_Detalles_Producto() {
        return Id_Detalles_Producto;
    }

    public void setId_Detalles_Producto(String Id_Detalles_Producto) {
        this.Id_Detalles_Producto = Id_Detalles_Producto;
    }

    public String getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(String Id_Producto) {
        this.Id_Producto = Id_Producto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }
    
    
}
