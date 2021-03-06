/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

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
 * @author Andrex
 */
public class ProductoDAO extends Conexion implements Crud {

    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    //Traer variables del modulo VO
    private String Id_Producto = "", Nombre = "", Estado = "";

    //Metodo para recibir  los datos del vo
    public ProductoDAO(ProductoVO prodVO) {
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

    public ProductoDAO() {
    }

    @Override
    public boolean agregarRegistro() {
        try {
            sql = "insert into Producto(Nombre)values(?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Nombre);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

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
            sql = "update producto set Nombre = ?, Estado=1 where Id_Producto = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Nombre);
            puente.setString(2, Id_Producto);
            
            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {
        try {

            sql = "UPDATE `producto` SET `Estado`= 0 WHERE Id_producto = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_Producto);
            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    public ProductoVO consultarProducto(String id) {
        ProductoVO prodVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from producto where id_producto=? and estado = 1";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                prodVO = new ProductoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3));
            }
        } catch (Exception e) {
            Logger.getLogger(ProductoVO.class.getName()).log(Level.SEVERE, null, e);
        } 
        return prodVO;
    }

    public ArrayList<ProductoVO> listar() {

        ArrayList<ProductoVO> listaProductos = new ArrayList();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from producto where estado = 1";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                ProductoVO prodVO = new ProductoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3));

                listaProductos.add(prodVO);
            }
        } catch (Exception e) {
            Logger.getLogger(ProductoVO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(ProductoVO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaProductos;
    }

    public boolean verificarProducto(String Nombre) {

        ProductoVO proVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from producto where Nombre = ? and estado = 1";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Nombre);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                proVO = new ProductoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3));
            }
            if (proVO == null) {
                operacion = true;
            } else {
                operacion = false;
            }

        } catch (SQLException e) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, e);

        }

        return operacion;

    }
    public ArrayList<ProductoVO> listarDos() {

        ArrayList<ProductoVO> listaProductos = new ArrayList();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from productoview2";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                ProductoVO prodVO = new ProductoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3));

                listaProductos.add(prodVO);
            }
        } catch (Exception e) {
            Logger.getLogger(ProductoVO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(ProductoVO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaProductos;
    }
    public boolean ActivarRegistro() {
        try {

            sql = "UPDATE `producto` SET `Estado`= 1 WHERE Id_producto = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_Producto);
            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }
    
    public boolean EliminarRegistroTotal() {
        try {

            sql = "DELETE FROM `producto` WHERE id_producto = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_Producto);
            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }
    
    public boolean cargarProductos(String rutaAbsoluta) throws IOException, SQLException{
        boolean accion = false;
        try {
            
            sql = "insert into Producto(Nombre,Estado)values(?,?)";
            conexion = obtenerConexion();
            FileInputStream file = new FileInputStream(new File(rutaAbsoluta));

            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            DataFormatter dataFormater = new DataFormatter();
            int numFilas = sheet.getLastRowNum();
            
            for (int a = 1; a <= numFilas; a++) {
                Row fila = sheet.getRow(a);
                puente = conexion.prepareStatement(sql);
                puente.setString(1, dataFormater.formatCellValue(fila.getCell(0)));
                puente.setString(2,"1");
                puente.executeUpdate();
            }
            accion = true;
            
            File Archivo = new File(rutaAbsoluta);
            Archivo.delete();
            conexion = cerrarConexion();
            
            
        } catch (FileNotFoundException ex ) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return accion;
    }
    
    


}
