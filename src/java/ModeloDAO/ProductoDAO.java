/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.ProductoVO;
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
 * @author Andrex
 */
public class ProductoDAO extends Conexion implements Crud{
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;
    
    //Traer variables del modulo VO
    private String Id_Producto = "", Nombre ="", Estado="";
    
    //Metodo para recibir  los datos del vo
    public ProductoDAO(ProductoVO prodVO){
        super();
        
        //Conexion a bd
        try {
            
            conexion = this.obtenerConexion();
            //Traer datos para operar
            
            Id_Producto = prodVO.getIdProducto();
            Nombre = prodVO.getNombre();
            Estado = prodVO.getEstado();
        } catch (Exception e) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agregarRegistro() {
        try {
            sql = "insert into Producto(Nombre , Estado) values (?,?)";
            //Sentencia
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Nombre);
            puente.setString(2, Estado);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
            try {
            
            sql="update usuario set Nombre=?, Estado=? where usuario Id_Producto=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Nombre);
            puente.setString(2, Estado);
            puente.setString(3, Id_Producto);
            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            try{
                this.cerrarConexion();
            }catch (Exception e){
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {
            try {
            
            sql="update usuario set Estado=0 where usuario usuId=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Estado);
            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            try{
                this.cerrarConexion();
            }catch (Exception e){
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return operacion;
    }
}
