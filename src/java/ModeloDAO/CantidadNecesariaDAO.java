/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.CantidadNecesariaVO;
import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ESCOBAR
 */
public class CantidadNecesariaDAO extends Conexion implements Crud {
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;
    
    private String Id_MateriaPrima="", Id_DetallesProducto="", cantidadNecesaria="";
    
    public CantidadNecesariaDAO(CantidadNecesariaVO catNedVO){
        super();
        
        //Conexion a bd
        try {
            
            conexion = this.obtenerConexion();
            //Traer datos para operar
            
            Id_MateriaPrima = catNedVO.getId_MateriaPrima();
            Id_DetallesProducto=catNedVO.getId_DetallesProducto();
            cantidadNecesaria=catNedVO.getCantidadNecesaria();
           
        } catch (Exception e) {
            Logger.getLogger(CantidadNecesariaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public CantidadNecesariaDAO() {
    }
    
    
    @Override
    public boolean agregarRegistro() {
        try {
            sql = "insert into cantidadnecesaria(Id_MateriaPrima , Id_DetallesProducto, cantidadNecesaria) values (?,?,?)";
            //Sentencia
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_MateriaPrima);
            puente.setString(2, Id_DetallesProducto);
            puente.setString(3, cantidadNecesaria);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) {
            Logger.getLogger(CantidadNecesariaDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(CantidadNecesariaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
