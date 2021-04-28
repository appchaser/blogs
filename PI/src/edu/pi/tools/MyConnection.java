/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pi.tools;
import java.sql.Connection;
import java.sql.*;
//import com.sun.jdi.connect.spi.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class MyConnection {
    public String url="jdbc:mysql://localhost:3306/db_pi";
    public String user="root";
    public String pwd="";
    public static MyConnection instance ;
   private Connection cnx;
   
   private  MyConnection(){
           
        try {
            cnx = DriverManager.getConnection(url, user, pwd);
            System.out.println("connection eablie !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
    }

    public static MyConnection getInstance() {
        if (instance==null){
            instance= new MyConnection ();
        }
        return instance;
    }

    public Connection getCnx() {
        
        return cnx;
    }
    
}
