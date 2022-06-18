/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.OrdenDetallesVO;
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
public class OrdenDetallesDAO extends Conexion implements Crud {

    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    String id_Ordenes, id_Usuarios, id_Detalles_Producto, cantidadSolicitada, fecha_registro, fecha_entrega, Estado;

    public OrdenDetallesDAO(OrdenDetallesVO ordDetallVO) {

        super();

        //3. Conectarse a la base de datos
        try {

            conexion = this.obtenerConexion();
            // 4. traer al DAO los datos del VO para hacer las operaciones.
            id_Ordenes = ordDetallVO.getId_Ordenes();
            id_Usuarios = ordDetallVO.getId_Usuarios();
            id_Detalles_Producto = ordDetallVO.getId_Detalles_Producto();
            cantidadSolicitada = ordDetallVO.getCantidadSolicitada();
            fecha_registro = ordDetallVO.getFecha_registro();
            fecha_entrega = ordDetallVO.getFecha_entrega();
            Estado = ordDetallVO.getEstado();

        } catch (Exception e) {
            Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public OrdenDetallesDAO() {
    }

    @Override
    public boolean agregarRegistro() {
        try {
            //Armar sentencia
            sql = "insert into ordenes(Id_Usuarios,Id_Detalles_Producto,CantidadSolicitada,fecha_registro,fecha_entrega)"
                    + "values(?,?,?,?,?)";

            // crear el camino por donde va la sentencia
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id_Usuarios);
            puente.setString(2, id_Detalles_Producto);
            puente.setString(3, cantidadSolicitada);
            puente.setString(4, fecha_registro);
            puente.setString(5, fecha_entrega);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException ex) {
            Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            sql = "update ordenes set Id_Usuarios=?,Id_Detalles_Producto=?,"
                    + "CantidadSolicitada=?,fecha_entrega=? where Id_Ordenes = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id_Usuarios);
            puente.setString(2, id_Detalles_Producto);
            puente.setString(3, cantidadSolicitada);
            puente.setString(4, fecha_entrega);
            puente.setString(5, id_Ordenes);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {
        try {
            //Armar sentencia
            sql = "update ordenes set Estado=0 where Id_Ordenes=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id_Ordenes);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }
        return operacion;
    }

    public OrdenDetallesVO consultarIdOrden(String IdOrden) {

        OrdenDetallesVO OrdenDetallVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from ordenes where Id_Orden = ? and estado = 1";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, IdOrden);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                OrdenDetallVO = new OrdenDetallesVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7));

            }

        } catch (SQLException e) {
            Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return OrdenDetallVO;

    }

    public ArrayList<OrdenDetallesVO> Listar() {

        ArrayList<OrdenDetallesVO> listaOrdenDetalles = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from ordenes where estado = 1";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                OrdenDetallesVO OrdenDetallVO = new OrdenDetallesVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7));
                listaOrdenDetalles.add(OrdenDetallVO);

            }

        } catch (SQLException e) {
            Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return listaOrdenDetalles;

    }
    public ArrayList<OrdenDetallesVO> ListarMateriaPrimaEnProducto() {

        ArrayList<OrdenDetallesVO> listaOrdenDetalles = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from materiprimapororden";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                OrdenDetallesVO OrdenDetallVO = new OrdenDetallesVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6));
                listaOrdenDetalles.add(OrdenDetallVO);

            }

        } catch (SQLException e) {
            Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return listaOrdenDetalles;

    }
    

    /* public boolean ActivarRegistro() {
        try {
            //Armar sentencia
            sql = "UPDATE `orden_detalles` SET `Estado`= 1 WHERE Id_orden_detalles = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id_Orden_Detalles);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }
        return operacion;
    }

    public boolean eliminarRegistroTotal() {
        try {
            //Armar sentencia
            sql = "delete from `orden_detalles` WHERE Id_orden_detalles = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id_Orden_Detalles);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }*/
    public boolean cargarListaOrdenDetalles(ArrayList<OrdenDetallesVO> listaOrdenDetalles) {
        boolean accion = false;
        try {

            sql = "insert into ordenes(Id_Usuarios,Id_Detalles_Producto,CantidadSolicitada,fecha_registro,fecha_entrega)"
                    + "values(?,?,?,?,?)";
            conexion = obtenerConexion();

            for (int i = 0; i < listaOrdenDetalles.size(); i++) {
                OrdenDetallesVO ordetllVO2 = listaOrdenDetalles.get(i);
                puente = conexion.prepareStatement(sql);
                puente.setString(1, ordetllVO2.getId_Usuarios());
                puente.setString(2, ordetllVO2.getId_Detalles_Producto());
                puente.setString(3, ordetllVO2.getCantidadSolicitada());
                puente.setString(4, ordetllVO2.getFecha_registro());
                puente.setString(5, ordetllVO2.getFecha_entrega());
                puente.executeUpdate();
            }
            accion = true;
        } catch (SQLException ex) {
            Logger.getLogger(OrdenDetallesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accion;
    }

}
