/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp.dao;

import QuizApp.dbutil.DBConnection;
import QuizApp.pojo.Performance;
import QuizApp.pojo.StudentScore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author MANAN
 */
public class PerformanceDAO {
    public static ArrayList<String>getAllStudentId()throws SQLException{
        String qry="select distinct userid from performance";
        ArrayList<String>studentList=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
                ResultSet rs=st.executeQuery(qry);
                while(rs.next()){
                    String id=rs.getString(1);
                    studentList.add(id);
                }
        return studentList;
        
    }
public static ArrayList<String>getAllExamId(String studentid)throws SQLException{
    String qry="select exameid from performance where userid=?";
    ArrayList<String>examIdList=new ArrayList<>();
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    ps.setString(1,studentid);
    ResultSet rs=ps.executeQuery();
              while(rs.next()){
                    String id=rs.getString(1);
                   examIdList.add(id);
                }
        return examIdList;
}


    public static StudentScore getScore(String studentId,String examId )throws SQLException {
         String qry="select language,per from performance where userid=? and exameid=?";
        ArrayList<String>examIdList=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1, studentId);
        ps.setString(2, examId);
        ResultSet rs=ps.executeQuery(); 
        rs.next();
        StudentScore obj=new StudentScore();
        obj.setLanguage(rs.getString(1));
        obj.setPer(rs.getDouble(2));
        return obj;
    }

    
    public static ArrayList<Performance> getAllData()throws SQLException{
        
        String qry="select * from performance";
        ArrayList<Performance>performanceList=new ArrayList<Performance>();
        Connection conn=DBConnection.getConnection();
         Statement st=conn.createStatement();
                ResultSet rs=st.executeQuery(qry);
                while(rs.next()){
                    String userid=rs.getString(1);
                    String examid=rs.getString(2);
                    String language=rs.getString(7);
                    int right=rs.getInt(3);
                    int wrong=rs.getInt(4);
                    int unattempted=rs.getInt(5);
                    double per=rs.getDouble(6);
                    Performance p=new Performance(userid,examid,language,right,wrong,unattempted,per);
                performanceList.add(p);
                }
       
        return performanceList;
        
        
    }
  
    
 public static void addPreformance(Performance performance)throws SQLException{
     
     String qry="insert into performance values(?,?,?,?,?,?,?)";
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1, performance.getUserId());
        ps.setString(2, performance.getExamId());
        ps.setInt(3, performance.getRight());
        ps.setInt(4, performance.getWrong());
        ps.setInt(5, performance.getUnattempted());
        ps.setDouble(6, performance.getPer());
        ps.setString(7,performance.getLanguage() );
        ps.executeUpdate();
        
 } 
    
}
