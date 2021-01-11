/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musicalbase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Omaiey
 */
public class DBConnection {
    static Connection con;
    
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/musicbase";
    private static final String DRIVER_URL = "com.mysql.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    static{
        try{
            Class.forName(DRIVER_URL);
            con =  DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        }catch(ClassNotFoundException | SQLException e){
            
        }
    }
    
    public static Connection getCon(){
        return con;
    }
    
}
