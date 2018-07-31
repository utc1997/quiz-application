/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp.pojo;

/**
 *
 * @author MANAN
 */
public class Exam {

    public Exam(String examId, String language, int total_Question) {
        this.examId = examId;
        this.language = language;
        this.total_Question = total_Question;
    }
    
    
    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

       
      public int getTotal_Question() {
        return total_Question;
    }

    public void setTotal_Question(int total_Question) {
        this.total_Question = total_Question;
    }
    
    
    public String examId;
    public String language;
    public int total_Question;
 
}
