/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.LoteProduccionVO;
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
public class LoteProduccionDAO extends Conexion implements Crud{
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;
    
    private String id_Usuarios="", id_Lote_Produccion="",id_orden_Detalles="",fecha_Fabricacion="";
    private int cantidad;
    
    public LoteProduccionDAO(LoteProduccionVO loteVO) {
        super();

        //3. Conectarse a la base de datos
        try {

            conexion = this.obtenerConexion();
            // 4. traer al DAO los datos del VO para hacer las operaciones.

            id_Lote_Produccion = loteVO.getId_Lote_Produccion();
            cantidad = loteVO.getCantidad();
            id_orden_Detalles = loteVO.getId_orden_Detalles();
            id_Usuarios = loteVO.getId_Usuarios();
            fecha_Fabricacion = loteVO.getFecha_Fabricacion();
            
            

        } catch (Exception e) {
            Logger.getLogger(LoteProduccionDAO.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public boolean agregarRegistro() {
        try {
            //Armar sentencia
            sql = "insert into lote_produccion(  Id_Usuarios,Id_orden_detalles,Cantidad, Fecha_Fabricacion  ) values (?,?,?,?)";
            // crear el camino por donde va la sentencia
            puente = conexion.prepareStatement(sql);
            
            puente.setInt(3, cantidad);
            puente.setString(4, fecha_Fabricacion);
            puente.setString(2, id_orden_Detalles);
            puente.setString(1, id_Usuarios);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(LoteProduccionDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(LoteProduccionDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {
        try {
            //Armar sentencia
            sql = "delete from lote_produccion where Id_Lote_Produccion =" + id_Lote_Produccion;
            puente = conexion.prepareStatement(sql);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(LoteProduccionDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(LoteProduccionDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            sql = "update lote_produccion set Id_Usuarios = ?,Id_orden_detalles = ?, Cantidad = ?, Fecha_Fabricacion = ? where Id_Lote_Produccion = ? ";
            puente = conexion.prepareStatement(sql);
            puente.setInt(3, cantidad);
            puente.setString(4, fecha_Fabricacion);
            puente.setString(2, id_orden_Detalles);
            puente.setString(1, id_Usuarios);
            puente.setString(5, id_Lote_Produccion);
         
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(LoteProduccionDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(LoteProduccionDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }
     public LoteProduccionVO consultarIdLoteProduccion(String Id) {

        LoteProduccionVO ltProducVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from lote_produccion where id_Lote_Produccion = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                ltProducVO = new LoteProduccionVO(mensajero.getString(1),mensajero.getInt(2), mensajero.getString(3),
                        mensajero.getString(4),mensajero.getString(5));

            }

        } catch (SQLException e) {
            Logger.getLogger(LoteProduccionDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(LoteProduccionDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return ltProducVO;

    }

    public ArrayList<LoteProduccionVO> Listar() {

        ArrayList<LoteProduccionVO> listaLoteProduccion = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from lote_produccion";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

               LoteProduccionVO ltProducVO = new LoteProduccionVO(mensajero.getString(1),mensajero.getInt(2), mensajero.getString(3),
                        mensajero.getString(4),mensajero.getString(5));
               listaLoteProduccion.add(ltProducVO);

            }

        } catch (SQLException e) {
            Logger.getLogger(LoteProduccionDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(LoteProduccionDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return listaLoteProduccion;

    }
}
