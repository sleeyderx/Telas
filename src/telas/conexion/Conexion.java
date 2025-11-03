package telas.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {
    Connection con;
    
    public Conexion(){
        
        try {
            //Class.forName("con.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/telas", "root", "");
            System.out.println("La conexion con la base de datos se realizo exitosamente.");
        }catch (Exception e){
            System.err.println("NO se pudo establecer la coneccion con la base de datos. error: " + e);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
}
