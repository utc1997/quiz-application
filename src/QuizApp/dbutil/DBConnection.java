/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MANAN
 */
public class DBConnection {
      private static Connection conn;
    static{
        try{
        Class.forName("oracle.jdbc.OracleDriver");
        conn=DriverManager.getConnection("jdbc:oracle:thin:@//utkarshchidar:1521/xe","project","java");
        JOptionPane.showMessageDialog(null,"connected succesfully to the databases","Succes!!",JOptionPane.INFORMATION_MESSAGE );
   
        }
        catch(ClassNotFoundException ex) {
        JOptionPane.showMessageDialog(null,"ERROR loading driver class:"+ex,"Error!!",JOptionPane.ERROR_MESSAGE );
    }
        catch(SQLException ex) {
        JOptionPane.showMessageDialog(null,"SQL error:"+ex,"error!!",JOptionPane.ERROR_MESSAGE );
    }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void connectionClose(){
        
        if(conn!=null){
        try{
            conn.close();
            JOptionPane.showMessageDialog(null,"Disconnected successfully to the Db","Succes!!",JOptionPane.INFORMATION_MESSAGE );
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"SQL error"+ex,"Error!!",JOptionPane.ERROR_MESSAGE );    
       
        }
        }
        
        
    }
    
}
