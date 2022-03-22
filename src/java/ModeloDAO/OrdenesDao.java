/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.OrdenesVo;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.Date;

/**
 *
 * @author Sena
 */
public class OrdenesDao implements Crud {

    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    // Declarar variables del modulo(VO)
    private String Id_Orden = "", Id_Usuarios = "", fecha_registro = "", fecha_entrega = "";

    //2. Crear metodo principal para recibir los datos del VO
    public OrdenesDao(OrdenesVo ordVO) {
        super();
        //3. Conectarse a la base de datos
        try {
            // 4. traer al DAO los datos del VO para hacer las operaciones.

            Id_Orden = ordVO.getId_Orden();
            Id_Usuarios = ordVO.getId_Usuarios();
            fecha_registro = ordVO.getFecha_registro();
            fecha_entrega = ordVO.getFecha_entrega();

        } catch (Exception e) {
            Logger.getLogger(OrdenesDao.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agregarRegistro() {
        try {
            //Armar sentencia
            sql = "insert into ordenes( Id_Orden, Id_Usuarios, fecha_registro, fecha_entrega) values (?,?,?,?)";

            // crear el camino por donde va la sentencia
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_Orden);
            puente.setString(2, Id_Usuarios);
            puente.setString(3, fecha_registro);
            puente.setString(4, fecha_entrega);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException ex) {
            Logger.getLogger(OrdenesDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {

            sql = "update ordenes set (Id_Orden = ?, Id_Usuarios = ?, fecha_registro = ?, fecha_entrega = ?) where Id_Orden = ? ";

            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id_Orden);
            puente.setString(2, Id_Usuarios);
            puente.setString(3, fecha_registro);
            puente.setString(4, fecha_entrega);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException ex) {
            Logger.getLogger(OrdenesDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {
         try {
            //Armar sentencia
            sql = "delete from ordenes where Id_Orden" + Id_Orden;
            puente = conexion.prepareStatement(sql);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        }  
        return operacion;
    }
}