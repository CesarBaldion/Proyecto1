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
public class loteMateriaPrimaVO {

    private String Id_loteMateria_Prima,cantidad, observaciones, fecha_ingreso, fecha_salida, Id_Materia_Prima;

    // Declarar constructor vacio para enviar datos.
    public loteMateriaPrimaVO() {
    }

    public loteMateriaPrimaVO(String IdloteMateriaPrima, String Cantidad, String Observaciones, String FechaIngreso, String FechaSalida,
            String IdMateriaPrima) {
        this.Id_loteMateria_Prima = IdloteMateriaPrima;
        this.cantidad = Cantidad;
        this.observaciones = Observaciones;
        this.fecha_ingreso = FechaIngreso;
        this.fecha_salida = FechaSalida;
        this.Id_Materia_Prima = IdMateriaPrima;
    }

    public String getId_loteMateria_Prima() {
        return Id_loteMateria_Prima;
    }

    public void setId_loteMateria_Prima(String Id_loteMateria_Prima) {
        this.Id_loteMateria_Prima = Id_loteMateria_Prima;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getId_Materia_Prima() {
        return Id_Materia_Prima;
    }

    public void setId_Materia_Prima(String Id_Materia_Prima) {
        this.Id_Materia_Prima = Id_Materia_Prima;
    }
    
}
