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
public class Performance {
    
   public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getExamId() {
        return ExamId;
    }

    public void setExamId(String ExamId) {
        this.ExamId = ExamId;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public int getUnattempted() {
        return unattempted;
    }

    public void setUnattempted(int unattempted) {
        this.unattempted = unattempted;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }
   
    private String UserId,ExamId,Language;
    private int right,wrong,unattempted;
    private double per;

    public Performance(String UserId, String ExamId, String Language, int right, int wrong, int unattempted, double per) {
        this.UserId = UserId;
        this.ExamId = ExamId;
        this.Language = Language;
        this.right = right;
        this.wrong = wrong;
        this.unattempted = unattempted;
        this.per = per;
    }
   
   
}
