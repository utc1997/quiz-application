/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp.dao;

import QuizApp.dbutil.DBConnection;
import QuizApp.pojo.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MANAN
 */
public class UsersDAO {
    public static String str=null;
    //to check login
    public static boolean loginCheck(Users tq)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where userid=? and (password =? and usertype=?)");
        //System.out.println(tq.getUserid()+" "+tq.getPassword()+" "+tq.getUsertype());
        ps.setString(1,tq.getUserid());
        ps.setString(2,tq.getPassword());
        ps.setString(3,tq.getUsertype());
       // System.out.println(tq.getUserid()+" "+tq.getPassword()+" "+tq.getUsertype());
        ResultSet rs=ps.executeQuery();
       // System.out.println(tq.getUserid()+" "+tq.getPassword()+" "+tq.getUsertype());
        if(rs.next()==true){
            System.out.println(tq.getUserid());
            str=tq.getUserid();
            return true;
        }
        else{ 
           return false;
        }
    }
    
    public static String welcome(){
        return str;
    }
    
    public static boolean registerStudent(Users u)throws SQLException{
        
        boolean status=true;
        //String 
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where userid=?");
        ps.setString(1,u.getUserid());
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            status =false;
        }
        else{
        ps=conn.prepareStatement("insert into users values(?,?,?)");
        ps.setString(1,u.getUserid());
        ps.setString(2,u.getPassword());
        ps.setString(3,u.getUsertype());
        ps.executeUpdate();
       
        }
        return status;
               
        }
     public static boolean changeStudentPassword(Users u)throws SQLException{
        
        boolean status=true;
        //String 
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set password=?,usertype=? where userid=?");
        ps.setString(1,u.getPassword());
        ps.setString(2,u.getUsertype());
        ps.setString(3,u.getUserid());
        ps.executeUpdate();
       
        
        return status;
               
        }
        
    
    
    }
            

