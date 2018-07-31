/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp.dao;

import QuizApp.dbutil.DBConnection;
import QuizApp.pojo.Exam;
import QuizApp.pojo.Questions;
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
public class ExamDAO {
    
    public static void addExam (Exam newExam)throws SQLException{
        
        String qry="Insert into Exam values(?,?,?)";
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1, newExam.getExamId());
        ps.setString(2, newExam.getLanguage());
        ps.setInt(3,newExam.getTotal_Question());
        ps.executeUpdate();

        
    }

    public static ArrayList<String> getExamIdBySubject(String subject)throws SQLException{
        
        String qry="select examid from Exam where language=?";
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1, subject);
        ResultSet rs=ps.executeQuery();
        ArrayList<String> examList=new ArrayList<String>();
        while(rs.next()){
            examList.add(rs.getString(1));
        }
        
        return examList;   
    }
    
    public static int getQuestionCountByExam(String examId)throws SQLException{
        
         Connection conn=DBConnection.getConnection();
         String qry="select total_question from Exam where examid=?";
         PreparedStatement ps=conn.prepareStatement(qry);
         ps.setString(1,examId);
         ResultSet rs=ps.executeQuery();
         rs.next();
         int rowCount=rs.getInt(1);
         return rowCount;
        
    } 
    
    
    
    public static String getExamId() throws SQLException{
    
    String str="select count(*)as totalrows from exam ";
    Connection conn=DBConnection.getConnection();
    int rowCount=0;
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery(str);
    if(rs.next()){
        rowCount=rs.getInt("totalrows");
    }
        String newId="EX-"+(rowCount+1);
        return newId;
    
    }


}
