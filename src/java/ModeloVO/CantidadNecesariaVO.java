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
    
    private String Id_MateriaPrima,Id_DetallesProducto,cantidadNecesaria;

    public CantidadNecesariaVO() {
    }

    public CantidadNecesariaVO(String Id_MateriaPrima, String Id_DetallesProducto, String cantidadNecesaria) {
        this.Id_MateriaPrima = Id_MateriaPrima;
        this.Id_DetallesProducto = Id_DetallesProducto;
        this.cantidadNecesaria = cantidadNecesaria;
    }

    public String getId_MateriaPrima() {
        return Id_MateriaPrima;
    }

    public void setId_MateriaPrima(String Id_MateriaPrima) {
        this.Id_MateriaPrima = Id_MateriaPrima;
    }

    public String getId_DetallesProducto() {
        return Id_DetallesProducto;
    }

    public void setId_DetallesProducto(String Id_DetallesProducto) {
        this.Id_DetallesProducto = Id_DetallesProducto;
    }

    public String getCantidadNecesaria() {
        return cantidadNecesaria;
    }

    public void setCantidadNecesaria(String cantidadNecesaria) {
        this.cantidadNecesaria = cantidadNecesaria;
    }
     
}
