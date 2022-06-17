/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.DetallesProductoVO;
import ModeloVO.ProductoVO;
import Util.Conexion;
import Util.Crud;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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

    String Id_Detalles_Producto = "", Id_Producto = "", Talla = "", Descripcion = "";

    public DetallesProductoDAO(DetallesProductoVO detProVO) {

        super();

        //3. Conectarse a la base de datos
        try {

            conexion = this.obtenerConexion();
            // 4. traer al DAO los datos del VO para hacer las operaciones.

            Id_Detalles_Producto = detProVO.getId_Detalles_Producto();
            Id_Producto = detProVO.getId_Producto();
            Talla = detProVO.getTalla();
            Descripcion = detProVO.getDescripcion();

        } catch (Exception e) {
            Logger.getLogger(LoteProduccionDAO.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public DetallesProductoDAO() {
    }

    @Override
    public boolean agregarRegistro() {
        try {
            sql = "insert into detalles_producto(Id_Producto, talla, Descripcion)values(?,?,?)";

            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_Producto);
            puente.setString(2, Talla);
            puente.setString(3, Descripcion);
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
            sql = "update detalles_producto set Id_Producto = ?, Talla = ?,Descripcion = ? where Id_Detalles_Producto = ? ";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_Producto);
            puente.setString(2, Talla);
            puente.setString(3, Descripcion);
            puente.setString(4, Id_Detalles_Producto);

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
        try {
            sql = "UPDATE `detalles_producto` SET `Estado`= 0 WHERE Id_detalles_producto = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_Detalles_Producto);
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

    public DetallesProductoVO consultarDetallesProducto(String id) {

        DetallesProductoVO detProVO = null;

        try {

            conexion = this.obtenerConexion();
            sql = "select * from detalles_producto where Id_Detalles_Producto = ? and estado = 1";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                detProVO = new DetallesProductoVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5));

            }
        } catch (Exception e) {
            Logger.getLogger(DetallesProductoDAO.class.getName()).log(Level.SEVERE, null, e);

        }
        return detProVO;
    }

    public ArrayList<DetallesProductoVO> listar() {

        ArrayList<DetallesProductoVO> listarDetallesProducto = new ArrayList<>();
        try {
            sql = "select * from detalles_producto where estado = 1";
            conexion = this.obtenerConexion();
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                DetallesProductoVO detProVO = new DetallesProductoVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5));

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

    public boolean verificarDetallesProducto() {
        DetallesProductoVO detProVO = null;
        try {
            sql = "select * from `detalles_producto` where Id_Producto=? "
                    + "and talla=? and Descripcion=? and Estado=1";
            conexion = this.obtenerConexion();
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_Producto);
            puente.setString(2, Talla);
            puente.setString(3, Descripcion);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                detProVO = new DetallesProductoVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5));
            }
            if (detProVO == null) {
                operacion = true;
            } else {
                operacion = false;
            }
        } catch (Exception e) {
            Logger.getLogger(DetallesProductoDAO.class.getName()).log(Level.SEVERE, null, e);

        }
        return operacion;
    }

    /*    public ArrayList<DetallesProductoVO> listarDos() {

        ArrayList<DetallesProductoVO> listarDetallesProducto = new ArrayList<>();
        try {

            sql = "select * from DetallesProductoView2";
            conexion = this.obtenerConexion();
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                DetallesProductoVO detProVO = new DetallesProductoVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5));

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

    public boolean activarRegistro() {
        try {
            sql = "UPDATE `detalles_producto` SET `Estado`= 1 WHERE Id_detalles_producto = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_Detalles_Producto);
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

    public boolean eliminarRegistroTotal() {
        try {
            sql = "Delete from `detalles_producto` WHERE Id_detalles_producto = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_Detalles_Producto);
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
    }*/
}
