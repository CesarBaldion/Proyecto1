/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.LoteProduccionVO;
import ModeloVO.UsuarioVO;
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
    
    private String id_Lote_Produccion="",id_orden_Detalles="",id_Usuarios="",fecha_Fabricacion="";
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
     public ArrayList<UsuarioVO> listarUsuarios(){
        ArrayList<UsuarioVO> Usuarios = new ArrayList<UsuarioVO>();
        String sql = "select * from usuarios";
        try{
             
             puente = conexion.prepareCall(sql);
             mensajero = puente.executeQuery();
             while(mensajero.next()){
                 UsuarioVO usuario = new UsuarioVO();
                 usuario.setIdUsuarios(mensajero.getString("Id_Usuarios"));
                 usuario.setNombre(mensajero.getString("Nombre"));
                 usuario.setDocumento(mensajero.getString("Documento"));
                 usuario.setTelefono(mensajero.getString("Telefono"));
                 usuario.setEmail(mensajero.getString("Email"));
                 usuario.setDireccion(mensajero.getString("Direccion"));
                 usuario.setContrasena(mensajero.getString("Contrasena"));
                 Usuarios.add(usuario);
             }
        }catch(Exception e){
           Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return Usuarios;
    };  
    
    @Override
    public boolean agregarRegistro() {
        try {
            //Armar sentencia
            sql = "insert into lote_produccion(  Cantidad, Fecha_Fabricacion, Id_orden_detalles, Id_Usuarios) values (?,?,?,?)";
            // crear el camino por donde va la sentencia
            puente = conexion.prepareStatement(sql);
            
            puente.setInt(1, cantidad);
            puente.setString(2, fecha_Fabricacion);
            puente.setString(3, id_orden_Detalles);
            puente.setString(4, id_Usuarios);
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
            sql = "update usuarios set ( Id_Lote_Produccion = ?, Cantidad = ?, Fecha_Fabricacion = ?,Id_orden_detalles = ?, Id_Usuarios = ?) where Id_Lote_Produccion = ? ";
            puente = conexion.prepareStatement(sql);
            puente.setInt(1, cantidad);
            puente.setString(2, fecha_Fabricacion);
            puente.setString(3, id_orden_Detalles);
            puente.setString(4, id_Usuarios);
         
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
}
