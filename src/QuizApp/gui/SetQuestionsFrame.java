/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp.gui;

import QuizApp.dao.ExamDAO;
import QuizApp.dao.QuestionsDAO;
import QuizApp.pojo.Exam;
import QuizApp.pojo.QuestionStore;
import QuizApp.pojo.Questions;
import QuizApp.pojo.UserProfile;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author MANAN
 */
public class SetQuestionsFrame extends javax.swing.JFrame {
    
    private Exam newExam;
    private QuestionStore qstore;
    private HashMap <String,String> options;
    private int qno;
    private String question,option1,option2,option3,option4,correctOption;


    /**
     * Creates new form SetQuestionsFrame
     */
    public SetQuestionsFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
        lblUsername.setText("Hello "+UserProfile.getUSername());
        qstore=new QuestionStore();
        options=new HashMap<>();
        options.put("option1","Answer1");
        options.put("option2","Answer2");
        options.put("option3","Answer3");
        options.put("option4","Answer4");
        qno=1;
        lblQno.setText(lblQno.getText()+qno);

    }
    
    
    
    public SetQuestionsFrame(Exam newExam){
        this();
        lblTitle.setText(newExam.getTotal_Question()+ " QUESTIONS REMAINING");
        this.newExam=newExam;

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblQno = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtOption1 = new javax.swing.JTextField();
        txtOption2 = new javax.swing.JTextField();
        txtOption3 = new javax.swing.JTextField();
        txtOption4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jcCorrectOption = new javax.swing.JComboBox();
        btnNext = new javax.swing.JButton();
        btnCancle = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        lblQno.setBackground(new java.awt.Color(0, 0, 0));
        lblQno.setForeground(new java.awt.Color(255, 51, 0));
        lblQno.setText("QUESTION NO. ");

        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        jScrollPane2.setViewportView(txtQuestion);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setForeground(new java.awt.Color(255, 51, 0));
        jLabel14.setText("OPTION 1");

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setForeground(new java.awt.Color(255, 51, 0));
        jLabel15.setText("OPTION 2");

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setForeground(new java.awt.Color(255, 51, 0));
        jLabel16.setText("OPTION 3");

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setForeground(new java.awt.Color(255, 51, 0));
        jLabel17.setText("OPTION 4");

        txtOption1.setBackground(new java.awt.Color(0, 0, 0));
        txtOption1.setForeground(new java.awt.Color(255, 51, 0));

        txtOption2.setBackground(new java.awt.Color(0, 0, 0));
        txtOption2.setForeground(new java.awt.Color(255, 51, 0));

        txtOption3.setBackground(new java.awt.Color(0, 0, 0));
        txtOption3.setForeground(new java.awt.Color(255, 51, 0));

        txtOption4.setBackground(new java.awt.Color(0, 0, 0));
        txtOption4.setForeground(new java.awt.Color(255, 51, 0));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setForeground(new java.awt.Color(255, 51, 0));
        jLabel18.setText("CORRECT ANSWER");

        jcCorrectOption.setForeground(new java.awt.Color(255, 51, 0));
        jcCorrectOption.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "option1", "option2", "option3", "option4" }));

        btnNext.setBackground(new java.awt.Color(0, 0, 0));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 51, 0));
        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnCancle.setBackground(new java.awt.Color(0, 0, 0));
        btnCancle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancle.setForeground(new java.awt.Color(255, 51, 0));
        btnCancle.setText("CANCEL");
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });

        btnDone.setBackground(new java.awt.Color(0, 0, 0));
        btnDone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDone.setForeground(new java.awt.Color(255, 51, 0));
        btnDone.setText("DONE");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setForeground(new java.awt.Color(255, 51, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizApp/gui/questionpaper4.jpg"))); // NOI18N

        lblTitle.setBackground(new java.awt.Color(51, 51, 51));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 51, 0));
        lblTitle.setText("2 QUESTION REMAINING");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17)))
                        .addGap(216, 216, 216))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnNext)
                                .addGap(90, 90, 90)
                                .addComponent(btnCancle)
                                .addGap(93, 93, 93)
                                .addComponent(btnDone)))
                        .addGap(0, 96, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtOption3)
                            .addComponent(txtOption1)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(308, 308, 308)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jcCorrectOption, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(118, 118, 118))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(lblTitle)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOption4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jcCorrectOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnDone)
                    .addComponent(btnCancle))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        lblUsername.setBackground(new java.awt.Color(51, 51, 51));
        lblUsername.setForeground(new java.awt.Color(255, 51, 0));

        lblLogout.setBackground(new java.awt.Color(51, 51, 51));
        lblLogout.setForeground(new java.awt.Color(255, 51, 0));
        lblLogout.setText("LOGOUT");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogout)
                        .addGap(21, 21, 21))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogout)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        LoginScreenFrame loginScreenFrame =new LoginScreenFrame();
        loginScreenFrame.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        // TODO add your handling code here:
        lblLogout.setForeground(Color.WHITE);
        Font f=new Font("Tahoma",Font.ITALIC,12);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        lblLogout.setForeground(new Color(255,153,0));
        Font f=new Font("Tahoma",Font.BOLD,12);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
               if(qno<=newExam.getTotal_Question()){
            int remainingQuestions=newExam.getTotal_Question()-qno+1;
            JOptionPane.showMessageDialog(null, "You still have "+remainingQuestions+" left","Cannot Add Exam!",JOptionPane.ERROR_MESSAGE);
            return;
       }
        try{
          ExamDAO.addExam(newExam);
          QuestionsDAO.addQuestions(qstore);
          JOptionPane.showMessageDialog(null, "Your question set has been successfully added to the database ","Exam Added!",JOptionPane.INFORMATION_MESSAGE);
          AdminScreenFrame adminScreenFrame=new AdminScreenFrame();
          adminScreenFrame.setVisible(true);
          this.dispose();
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE); 
           ex.printStackTrace();
       }

    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
                if(validateInput()==false)
        {
            JOptionPane.showMessageDialog(null, "Please fill all the input fields","Cannot Add Question!",JOptionPane.ERROR_MESSAGE);
            return;
        }
                
        
        String optionName=options.get(correctOption);
        System.out.println(optionName);
        Questions obj=new Questions(newExam.getExamId(),newExam.getLanguage(),
qno,question,option1,option2,option3,option4,optionName);
        System.out.println(obj);
        qstore.addQuestion(obj);
        clearAll();
        lblTitle.setText((newExam.getTotal_Question()-qno)+ " QUESTIONS REMAINING");
        qno++;
        if(qno>newExam.getTotal_Question())
        {
            disableAll();
            JOptionPane.showMessageDialog(null, "Your question set has been successfully created.\nPress the DONE button to add it to the database ","Exam Added!",JOptionPane.INFORMATION_MESSAGE);
        }
        else
            lblQno.setText("Question no:"+qno);
        

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        // TODO add your handling code here:
       SetPaperFrame paperFrame=new SetPaperFrame();
       paperFrame.setVisible(true);
       this.dispose();

    }//GEN-LAST:event_btnCancleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SetQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetQuestionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcCorrectOption;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtOption1;
    private javax.swing.JTextField txtOption2;
    private javax.swing.JTextField txtOption3;
    private javax.swing.JTextField txtOption4;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables

 public boolean validateInput(){    
        question=txtQuestion.getText().trim();
        option1=txtOption1.getText().trim();
        option2=txtOption2.getText().trim();
        option3=txtOption3.getText().trim();
        option4=txtOption4.getText().trim();
        correctOption=jcCorrectOption.getSelectedItem().toString();
        if(question.isEmpty()||option1.isEmpty()||option2.isEmpty()||option3.isEmpty()||option4.isEmpty()||correctOption.isEmpty())
            return false;
        else
            return true;
}      
public void clearAll(){
    txtQuestion.setText("");
    txtOption1.setText("");
    txtOption2.setText("");
    txtOption3.setText("");
    txtOption4.setText("");
    jcCorrectOption.setSelectedIndex(0);
}
public void disableAll(){
        txtQuestion.setEnabled(false);
        txtOption1.setEnabled(false);
        txtOption2.setEnabled(false);
        txtOption3.setEnabled(false);
        txtOption4.setEnabled(false);
        jcCorrectOption.setEnabled(false);
        btnNext.setEnabled(false);
    }




}