/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author ESCOBAR
 */
public class CantidadNecesariaVO {

    private String IdCantidadNecesaria, Id_Materia_Prima, Id_Detalles_Producto, materiaprimaenproducto;

    public CantidadNecesariaVO() {
    }

    public CantidadNecesariaVO(String IdCantidadNecesaria, String Id_Detalles_Producto, String Id_Materia_Prima, String materiaprimaenproducto) {
        this.Id_Materia_Prima = Id_Materia_Prima;
        this.Id_Detalles_Producto = Id_Detalles_Producto;
        this.materiaprimaenproducto = materiaprimaenproducto;
        this.IdCantidadNecesaria = IdCantidadNecesaria;
    }

    public String getIdCantidadNecesaria() {
        return IdCantidadNecesaria;
    }

    public void setIdCantidadNecesaria(String IdCantidadNecesaria) {
        this.IdCantidadNecesaria = IdCantidadNecesaria;
    }

    public String getId_Materia_Prima() {
        return Id_Materia_Prima;
    }

    public void setId_Materia_Prima(String Id_Materia_Prima) {
        this.Id_Materia_Prima = Id_Materia_Prima;
    }

    public String getId_Detalles_Producto() {
        return Id_Detalles_Producto;
    }

    public void setId_Detalles_Producto(String Id_Detalles_Producto) {
        this.Id_Detalles_Producto = Id_Detalles_Producto;
    }

    public String getMateriaprimaenproducto() {
        return materiaprimaenproducto;
    }

    public void setMateriaprimaenproducto(String materiaprimaenproducto) {
        this.materiaprimaenproducto = materiaprimaenproducto;
    }

}
