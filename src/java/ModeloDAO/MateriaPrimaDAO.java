/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.MateriaPrimaVO;
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
public class MateriaPrimaDAO extends Conexion implements Crud{
    
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String Id_materia_Prima = "", Nombre = "", Estado = "", Actualizacion = "";

    public MateriaPrimaDAO(MateriaPrimaVO matPriVO) {
        super();

        //3. Conectarse a la base de datos
        try {

            conexion = this.obtenerConexion();
            // 4. traer al DAO los datos del VO para hacer las operaciones.

            Id_materia_Prima = matPriVO.getId_materia_Prima();
            Nombre = matPriVO.getNombre();
            Estado = matPriVO.getEstado();
            Actualizacion = matPriVO.getActualizacion();

        } catch (Exception e) {
            Logger.getLogger(MateriaPrimaDAO.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public MateriaPrimaDAO() {
    }

    @Override
    public boolean agregarRegistro() {
        try {
            //Armar sentencia
            sql = "insert into materia_prima(Nombre, Estado) values (?,?)";
            // crear el camino por donde va la sentencia
            puente = conexion.prepareStatement(sql);

            puente.setString(1, Nombre);
            puente.setString(2, Estado);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(MateriaPrimaDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(MateriaPrimaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            sql = "update materia_prima set Nombre = ?, Estado = ? where Id_materia_Prima = ? ";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Nombre);
            puente.setString(2, Estado);
            puente.setString(3, Id_materia_Prima);

            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(MateriaPrimaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(MateriaPrimaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public MateriaPrimaVO consultarIdMateriaPrima(String Id) {

        MateriaPrimaVO matPriVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from materia_prima where Id_materia_Prima = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                matPriVO = new MateriaPrimaVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4));

            }

        } catch (SQLException e) {
            Logger.getLogger(MateriaPrimaDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(MateriaPrimaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return matPriVO;

    }

    public ArrayList<MateriaPrimaVO> Listar() {

        ArrayList<MateriaPrimaVO> listaMateriaPrima = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from materia_prima";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

               MateriaPrimaVO mpVO = new MateriaPrimaVO(mensajero.getString(1),
                       mensajero.getString(2), mensajero.getString(3), mensajero.getString(4));
                listaMateriaPrima.add(mpVO);

            }

        } catch (SQLException e) {
            Logger.getLogger(MateriaPrimaDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();

            } catch (SQLException e) {
                Logger.getLogger(MateriaPrimaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return listaMateriaPrima;

    }
}
