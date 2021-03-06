/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.MateriaPrimaVO;
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
public class MateriaPrimaDAO extends Conexion implements Crud {

    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String Id_materia_Prima = "", Nombre = "", Actualizacion = "", Estado = "";

    public MateriaPrimaDAO(MateriaPrimaVO matPriVO) {
        super();

        //3. Conectarse a la base de datos
        try {

            conexion = this.obtenerConexion();
            // 4. traer al DAO los datos del VO para hacer las operaciones.

            Id_materia_Prima = matPriVO.getId_materia_Prima();
            Nombre = matPriVO.getNombre();
            Actualizacion = matPriVO.getActualizacion();
            Estado = matPriVO.getEstado();

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
            sql = "insert into materia_prima(Nombre,Actualizacion)values (?,?)";
            // crear el camino por donde va la sentencia
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Nombre);
            puente.setString(2,"0");
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
            sql = "update materia_prima set Nombre = ? where Id_materia_Prima = ? ";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Nombre);
            puente.setString(2, Id_materia_Prima);

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
        try {
            sql = "UPDATE materia_prima SET Estado = 0 WHERE Id_materia_Prima = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_materia_Prima);
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
                        mensajero.getString(3),mensajero.getString(4));

            }

        } catch (SQLException e) {
            Logger.getLogger(MateriaPrimaDAO.class.getName()).log(Level.SEVERE, null, e);

        } 

        return matPriVO;

    }

    public ArrayList<MateriaPrimaVO> ListarCalculo() {

        ArrayList<MateriaPrimaVO> listaMateriaPrima = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from cantidadfinal";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                MateriaPrimaVO matPriVO = new MateriaPrimaVO(mensajero.getString(1),
                        mensajero.getString(2));
                listaMateriaPrima.add(matPriVO);

            }

        } catch (SQLException e) {
            Logger.getLogger(MateriaPrimaDAO.class.getName()).log(Level.SEVERE, null, e);

        }

        return listaMateriaPrima;

    }

    public ArrayList<MateriaPrimaVO> Listar() {

        ArrayList<MateriaPrimaVO> listaMateriaPrima = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from materia_prima where Estado = 1";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                MateriaPrimaVO matPriVO = new MateriaPrimaVO(mensajero.getString(1),
                        mensajero.getString(2), mensajero.getString(3),mensajero.getString(4));
                listaMateriaPrima.add(matPriVO);

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

    public boolean verificarMateriaPrima(String Nombre) {

        MateriaPrimaVO mpVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from materia_prima where Nombre = ? and Estado = 1";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Nombre);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                mpVO = new MateriaPrimaVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3),mensajero.getString(4));
            }
            if (mpVO == null) {
                operacion = true;
            } else {
                operacion = false;
            }

        } catch (SQLException e) {
            Logger.getLogger(MateriaPrimaDAO.class.getName()).log(Level.SEVERE, null, e);

        }

        return operacion;

    }

    public ArrayList<MateriaPrimaVO> ListarDos() {

        ArrayList<MateriaPrimaVO> listaMateriaPrima = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from materiaprimaview2";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                MateriaPrimaVO matPriVO = new MateriaPrimaVO(mensajero.getString(1),
                        mensajero.getString(2), mensajero.getString(3),mensajero.getString(4));
                listaMateriaPrima.add(matPriVO);

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

    public boolean ActivarRegistro() {
        try {
            sql = "UPDATE `materia_prima` SET `Estado`= 1 WHERE Id_materia_Prima = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_materia_Prima);
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

    public boolean EliminarRegistroTotal() {
        try {
            sql = "DELETE FROM `materia_prima` WHERE id_materia_prima = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_materia_Prima);
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

    public boolean cargarMateriasPrimas(String rutaAbsoluta) throws SQLException, IOException {
        boolean accion = false;
        try {
            sql = "insert into materia_prima(Nombre,Actualizacion)values (?,?)";
            conexion = this.obtenerConexion();
            FileInputStream file = new FileInputStream(new File(rutaAbsoluta));

            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            DataFormatter dataFormater = new DataFormatter();
            int numFilas = sheet.getLastRowNum();

            for (int a = 1; a <= numFilas; a++) {
                Row fila = sheet.getRow(a);
                puente = conexion.prepareStatement(sql);
                puente.setString(1, dataFormater.formatCellValue(fila.getCell(0)));
                puente.setString(2,"0");
                puente.executeUpdate();
            }
            accion = true;
            File Archivo = new File(rutaAbsoluta);
            Archivo.delete();
            this.cerrarConexion();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(MateriaPrimaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accion;
    }

}
