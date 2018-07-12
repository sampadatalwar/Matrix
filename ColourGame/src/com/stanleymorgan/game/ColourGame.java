/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stanleymorgan.game;

import com.sun.prism.paint.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author test
 */
public class ColourGame extends javax.swing.JFrame {

    /**
     * Creates new form ColourGame
     */
    
    public ColourGame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jdScore = new javax.swing.JDialog();
        lblWord = new javax.swing.JLabel();
        radBlue = new javax.swing.JRadioButton();
        radRed = new javax.swing.JRadioButton();
        radGreen = new javax.swing.JRadioButton();
        radYellow = new javax.swing.JRadioButton();
        lblTitle = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        btnScore = new javax.swing.JButton();

        javax.swing.GroupLayout jdScoreLayout = new javax.swing.GroupLayout(jdScore.getContentPane());
        jdScore.getContentPane().setLayout(jdScoreLayout);
        jdScoreLayout.setHorizontalGroup(
            jdScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jdScoreLayout.setVerticalGroup(
            jdScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGroup.add(radBlue);
        radBlue.setForeground(new java.awt.Color(14, 14, 146));
        radBlue.setText("Blue");
        radBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBlueActionPerformed(evt);
            }
        });

        btnGroup.add(radRed);
        radRed.setForeground(new java.awt.Color(238, 13, 13));
        radRed.setText("Red");
        radRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radRedActionPerformed(evt);
            }
        });

        btnGroup.add(radGreen);
        radGreen.setForeground(new java.awt.Color(105, 174, 74));
        radGreen.setText("Green");
        radGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radGreenActionPerformed(evt);
            }
        });

        btnGroup.add(radYellow);
        radYellow.setForeground(new java.awt.Color(224, 233, 48));
        radYellow.setText("Yellow");
        radYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radYellowActionPerformed(evt);
            }
        });

        lblTitle.setText("Choose The Correct Colour");

        btnNext.setText("Start");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblResult.setText("Result");

        btnScore.setText("View Score");
        btnScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnScore)
                .addGap(80, 80, 80)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radRed)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(225, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(radGreen)
                        .addGap(47, 47, 47)
                        .addComponent(radYellow)
                        .addGap(43, 43, 43)
                        .addComponent(radBlue)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(lblWord, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(lblTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblWord, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radRed)
                    .addComponent(radGreen)
                    .addComponent(radYellow)
                    .addComponent(radBlue))
                .addGap(28, 28, 28)
                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnExit)
                    .addComponent(btnScore))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int sc=0;
    private void radRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radRedActionPerformed
        if(lblWord.getText().equals("RED"))
        {
            lblResult.setText("Correct Answer");
            sc++;
        }
        
        else
        {
           lblResult.setText("Wrong Answer"); 
        }
    }//GEN-LAST:event_radRedActionPerformed

    private void radBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBlueActionPerformed
        if(lblWord.getText().equals("BLUE"))
        {
            lblResult.setText("Correct Answer");
            sc++;
        }
        
        else
        {
           lblResult.setText("Wrong Answer"); 
        }
    }//GEN-LAST:event_radBlueActionPerformed

    private void radYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radYellowActionPerformed
        if(lblWord.getText().equals("YELLOW"))
        {
            lblResult.setText("Correct Answer");
            sc++;
        }
        
        else
        {
           lblResult.setText("Wrong Answer"); 
        }
    }//GEN-LAST:event_radYellowActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed
    int i=0;
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        btnNext.setText("Next");   
        String w[]={"RED","YELLOW","BLUE","GREEN"};
           
            
            switch(i)
            {
                case 0: lblWord.setText(w[i]);
                        lblWord.setForeground(java.awt.Color.blue);
                        break;
                        
                case 1: lblWord.setText(w[i]);
                        lblWord.setForeground(java.awt.Color.green);
                        break;
                        
                case 2: lblWord.setText(w[i]);
                        lblWord.setForeground(java.awt.Color.red);
                        break;
                      
                case 3: lblWord.setText(w[i]);
                        lblWord.setForeground(java.awt.Color.yellow);
                        break;  
                        
                default: i=0;       
            }
            
            i++;
    }//GEN-LAST:event_btnNextActionPerformed

    private void radGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radGreenActionPerformed
        if(lblWord.getText().equals("GREEN"))
        {
            lblResult.setText("Correct Answer");
            sc++;
        }
        
        else
        {
           lblResult.setText("Wrong Answer"); 
        }
    }//GEN-LAST:event_radGreenActionPerformed

    private void btnScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoreActionPerformed
        JOptionPane.showMessageDialog(null, "Your score is: "+sc);
    }//GEN-LAST:event_btnScoreActionPerformed

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
            java.util.logging.Logger.getLogger(ColourGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColourGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColourGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColourGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColourGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnScore;
    private javax.swing.JDialog jdScore;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWord;
    private javax.swing.JRadioButton radBlue;
    private javax.swing.JRadioButton radGreen;
    private javax.swing.JRadioButton radRed;
    private javax.swing.JRadioButton radYellow;
    // End of variables declaration//GEN-END:variables
}