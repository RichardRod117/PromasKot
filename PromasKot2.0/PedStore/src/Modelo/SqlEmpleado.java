package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.empleado;
import java.sql.ResultSet;
import java.util.regex.Pattern;

public class SqlEmpleado extends Conexion{
    
    public boolean registrar(empleado usr){
      PreparedStatement ps = null;  
      Connection con = conexion();
      
      String sql = "INSERT INTO empleado (nom_empleado, ape_empleado, Fechanac_empleado, email_empleado, telefono_empleado, tipoempleado_id, fechaing_empleado, estatus_empleado, contra_empleado) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, usr.getNombre());
            ps.setString(2, usr.getApellidos());
            ps.setString(3, usr.getFechaNacimiento());
            ps.setString(4, usr.getCorreo());
            ps.setString(5, usr.getTelefono());
            ps.setString(6, usr.getTipoEmpleado());
            ps.setString(7, usr.getFechaIngreso());
            ps.setString(8, usr.getEstatus());
            ps.setString(9, usr.getContraseña());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public int existeEmpleado(String empleado_id){//tal ves se tenga que borrar, si colocamos el autocolocado sql
      PreparedStatement ps = null;  
      ResultSet rs = null;
      Connection con = conexion();
      
      String sql ="SELECT count(empleado_id) FROM empleado WHERE empleado_id = ?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, empleado_id);
            ps.executeQuery();

            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    } 
    
}
