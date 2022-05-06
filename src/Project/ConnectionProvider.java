/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author Givondo
 */
//This code enables one to connect to mysql database
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/lms", "root", "Accessdenied1!"); // the name of the database here is lms and password is access...
            return con;
                
        }
        catch(Exception e){
            System.out.print(e);
            return null;
        }
    
}
}
