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
import java.util.ArrayList;
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

    private String IdCantidadNecesaria,Id_Materia_Prima, Id_Detalles_Producto, materiaprimaenproducto;

    public CantidadNecesariaDAO(CantidadNecesariaVO cantNecVO) {
        super();
        try {
            conexion = this.obtenerConexion();
            //Traer datos para operar
            Id_Materia_Prima = cantNecVO.getId_Materia_Prima();
            Id_Detalles_Producto = cantNecVO.getId_Detalles_Producto();
            materiaprimaenproducto = cantNecVO.getMateriaprimaenproducto();
            IdCantidadNecesaria = cantNecVO.getIdCantidadNecesaria();
        } catch (Exception e) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public CantidadNecesariaDAO() {
    }

    @Override
    public boolean agregarRegistro() {
        try {
            sql = "INSERT INTO `cantidad_necesaria` (`Id_CantidadNecesaria`, `Id_detalles_producto`, `Id_materia_Prima`, `materiaPrimaEnProducto`) VALUES (NULL,?, ?, ?);";

            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_Detalles_Producto);
            puente.setString(2, Id_Materia_Prima);
            puente.setString(3, materiaprimaenproducto);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) {
            Logger.getLogger(CantidadNecesariaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
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
        try {
            sql = "update cantidad_necesaria set  materiaPrimaEnProducto= ? where Id_CantidadNecesaria=?";

            puente = conexion.prepareStatement(sql);
            puente.setString(1, materiaprimaenproducto);
            puente.setString(2, IdCantidadNecesaria);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) {
            Logger.getLogger(CantidadNecesariaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(CantidadNecesariaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {

        try {
            sql = "delete from cantidad_necesaria where Id_CantidadNecesaria=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1,IdCantidadNecesaria );
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

    public CantidadNecesariaVO consultarCantidadNecesaria(String Id) {
        CantidadNecesariaVO cantNecVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from cantidadnecesaria where Id_Materia_Prima=? ";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_Materia_Prima);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                cantNecVO = new CantidadNecesariaVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4));
            }
        } catch (Exception e) {
            Logger.getLogger(CantidadNecesariaVO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(CantidadNecesariaVO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return cantNecVO;
    }

    public ArrayList<CantidadNecesariaVO> listar() {

        ArrayList<CantidadNecesariaVO> listaCantidadNecesaria = new ArrayList();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from cantidad_necesaria";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                CantidadNecesariaVO cantNecVO = new CantidadNecesariaVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4));

                listaCantidadNecesaria.add(cantNecVO);
            }
        } catch (Exception e) {
            Logger.getLogger(CantidadNecesariaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(CantidadNecesariaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaCantidadNecesaria;
    }

    public boolean verificarCantidadNec() {

        CantidadNecesariaVO cantNecVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from cantidad_necesaria where Id_materia_Prima = ? and Id_detalles_producto= ? ";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_Materia_Prima);
            puente.setString(2, Id_Detalles_Producto);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                cantNecVO = new CantidadNecesariaVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4));
            }
            if (cantNecVO == null) {
                operacion = true;
            } else {
                operacion = false;
            }

        } catch (SQLException e) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, e);

        }

        return operacion;

    }
}
