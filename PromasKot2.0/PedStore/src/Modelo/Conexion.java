package modelo;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    //Para Reg_Usuarios
    private final String base = "PETSDB"; //nombre base de datos
    private final String user = "roott";
    private final String password = "5572";
    private final String url = "jdbc:mysql://localhost:3306/petbd?useSSL=false";
    
     java.sql.Connection cn;//INVOCAR OBJETO
     
     public java.sql.Connection conexion(){
        try{//CREAR UN METODO
            Class.forName("com.mysql.jdbc.Driver"); //CUAL DRIVER PONER EN LIBRERIES
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PETSDB?useSSL=false","root","5572");
            System.out.println("Conectado");
            cn = DriverManager.getConnection(url,user, password);//Para Reg_Usuarios
        }catch(Exception e){
            System.out.println(e.getMessage());
        }return cn;
    }

    
    Statement createStatement(){//metodo ligado al catch
        throw new UnsupportedOperationException("No Conectado");
    }
    
    public void cierraConexion(){
        try{
            cn.close();
            System.out.println("Conexión cerrada");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


}

