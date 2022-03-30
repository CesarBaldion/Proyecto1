/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.DetallesProductoVO;
import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sena
 */
public class DetallesProductoDAO extends Conexion implements Crud {
    
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
    private boolean operacion = false;
    private String sql;
    
    String Id_Detalles_Producto = "", Id_Producto = "", Descripcion = "", Talla = "";
    
    public DetallesProductoDAO(DetallesProductoVO detProVO) {
        
        super();

        //3. Conectarse a la base de datos
        try {
            
            conexion = this.obtenerConexion();
            // 4. traer al DAO los datos del VO para hacer las operaciones.

            Id_Detalles_Producto = detProVO.getId_Detalles_Producto();
            Id_Producto = detProVO.getId_Producto();
            Descripcion = detProVO.getDescripcion();
            Talla = detProVO.getTalla();
            
        } catch (Exception e) {
            Logger.getLogger(LoteProduccionDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }

    public DetallesProductoDAO() {
    }
    
    @Override
    public boolean agregarRegistro() {
        try {
            sql = "inset into detlles_producto(Id_Produccion, Descripcion, Talla) values (?,?,?)";
            
            puente = conexion.prepareStatement(sql);
            
            puente.setString(1, Id_Producto);
            puente.setString(2, Descripcion);
            puente.setString(3, Talla);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) {
            Logger.getLogger(DetallesProductoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
                
            } catch (SQLException e) {
                Logger.getLogger(DetallesProductoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }
    
    @Override
    public boolean actualizarRegistro() {
        try {
            sql = "update detalles_producto set Id_Producto = ?, Descripcion = ?,Talla = ? where Id_Detalles_Producto = ? ";
            puente = conexion.prepareStatement(sql);
            
            puente.setString(1, Id_Producto);
            puente.setString(2, Descripcion);
            puente.setString(3, Talla);
            
            puente.executeUpdate();
            operacion = true;
            
        } catch (SQLException e) {
            Logger.getLogger(DetallesProductoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            
            try {
                this.cerrarConexion();
                
            } catch (SQLException e) {
                Logger.getLogger(DetallesProductoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
       
    }
    
    @Override
    public boolean eliminarRegistro() {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public DetallesProductoVO consultarDetallesProducto(String DetallesProd) {
        
        DetallesProductoVO detProVO = null;
        
        try {
            
            conexion = this.obtenerConexion();
            sql = "select * from detalles_producto where Id_Producto = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_Producto);
            mensajero = puente.executeQuery();
            
            while (mensajero.next()) {
                detProVO = new DetallesProductoVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4));
                
            }
        } catch (Exception e) {
            Logger.getLogger(DetallesProductoDAO.class.getName()).log(Level.SEVERE, null, e);
            
        } finally {
            
            try {
                this.cerrarConexion();
                
            } catch (SQLException e) {
                Logger.getLogger(DetallesProductoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return detProVO;
    }
    
    public ArrayList<DetallesProductoVO> listar() {
        
        ArrayList<DetallesProductoVO> listarDetallesProducto = new ArrayList<>();
        try {
            
            sql = "select * from detalles_producto";
            conexion = this.obtenerConexion();
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while (mensajero.next()) {
                DetallesProductoVO detProVO = new DetallesProductoVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4));
                
                listarDetallesProducto.add(detProVO);
            }
        } catch (Exception e) {
            
            Logger.getLogger(DetallesProductoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            
            try {
                this.cerrarConexion();
                
            } catch (SQLException e) {
                Logger.getLogger(DetallesProductoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        return listarDetallesProducto;
        
    }    
}