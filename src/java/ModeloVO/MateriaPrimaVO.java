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
public class MateriaPrimaVO {
    
    String Id_materia_Prima, Nombre, Estado;
    
    
    public MateriaPrimaVO() {
    }

    public MateriaPrimaVO(String Id_materia_Prima, String Nombre, String Estado) {
        this.Id_materia_Prima = Id_materia_Prima;
        this.Nombre = Nombre;
        this.Estado = Estado;
    }

    public String getId_materia_Prima() {
        return Id_materia_Prima;
    }

    public void setId_materia_Prima(String Id_materia_Prima) {
        this.Id_materia_Prima = Id_materia_Prima;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
}
