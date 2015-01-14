/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author intensiveporpoises
 */
public class DiceGameGUI extends javax.swing.JFrame {
    
    private boolean d1Bap;
    private boolean d2Bap;
    private boolean d3Bap;
    private boolean d4Bap;
    private boolean d5Bap;
    private boolean minusHit;
    private final boolean [] bapArray = {
        d1Bap, d2Bap, d3Bap, d4Bap, d5Bap
    };
    private String comboText = "";
    private Random rand = new Random();
    ArrayList<Integer> intTest = new ArrayList<Integer>(); 
    ArrayList<Character> charTest = new ArrayList<Character>();
    
    
    

    /**
     * Creates new form MathDiceGUI
     */
    public DiceGameGUI() {
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

        instructionsLabel = new javax.swing.JLabel();
        d1Button = new javax.swing.JButton();
        d2Button = new javax.swing.JButton();
        d3Button = new javax.swing.JButton();
        d4Button = new javax.swing.JButton();
        d5Button = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        rollButton = new javax.swing.JButton();
        enterButton = new javax.swing.JButton();
        comboLabel = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math Dice");

        instructionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instructionsLabel.setText("Click Roll to begin!");

        d1Button.setText("D1");
        d1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ButtonActionPerformed(evt);
            }
        });

        d2Button.setText("D2");
        d2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ButtonActionPerformed(evt);
            }
        });

        d3Button.setText("D3");
        d3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3ButtonActionPerformed(evt);
            }
        });

        d4Button.setText("D4");
        d4Button.setToolTipText("");
        d4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4ButtonActionPerformed(evt);
            }
        });

        d5Button.setText("D5");
        d5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d5ButtonActionPerformed(evt);
            }
        });

        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        minusButton.setText("-");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        rollButton.setText("Roll!");
        rollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollButtonActionPerformed(evt);
            }
        });

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        resultLabel.setText("Good job! That's correct");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(resultLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(plusButton)
                                .addGap(18, 18, 18)
                                .addComponent(minusButton)
                                .addGap(18, 18, 18)
                                .addComponent(clearButton)))
                        .addGap(18, 18, 18)
                        .addComponent(rollButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(instructionsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addComponent(comboLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(enterButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(d1Button)
                                    .addGap(18, 18, 18)
                                    .addComponent(d2Button)
                                    .addGap(18, 18, 18)
                                    .addComponent(d3Button)
                                    .addGap(18, 18, 18)
                                    .addComponent(d4Button)))
                            .addGap(18, 18, 18)
                            .addComponent(d5Button))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instructionsLabel)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d1Button)
                    .addComponent(d2Button)
                    .addComponent(d3Button)
                    .addComponent(d4Button)
                    .addComponent(d5Button))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plusButton)
                    .addComponent(minusButton)
                    .addComponent(clearButton)
                    .addComponent(rollButton))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterButton)
                    .addComponent(comboLabel))
                .addGap(35, 35, 35)
                .addComponent(resultLabel)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void d1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ButtonActionPerformed
        //check the text content of the d1Button
        comboText = comboLabel.getText();
        d1Bap = true;
        String d1Text = d1Button.getText();
        if(!d1Text.contentEquals("D1")) { 
            comboLabel.setText(comboText + d1Text);
        }
        //gray the button out once it's been selected, unless clear or roll
        //is clicked
        
        //convert d1Text string to an integer
        if(minusHit == false) {
        Integer d1Integer = Integer.valueOf(d1Text);
        intTest.add(d1Integer); //add the value to the Integer list array
        }
        else {
            Integer d1Integer = -Integer.valueOf(d1Text);
            intTest.add(d1Integer); 
        }
        
        plusButton.setEnabled(true);
        minusButton.setEnabled(true);
        enterButton.setEnabled(true);
        
        d1Button.setEnabled(false); 
        d2Button.setEnabled(false);
        d3Button.setEnabled(false);
        d4Button.setEnabled(false);
        d5Button.setEnabled(false);
        
    }//GEN-LAST:event_d1ButtonActionPerformed

    private void rollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollButtonActionPerformed
        
        
        
        // generate random ints between 1-6 for the five 6-sided dice
        for (int i = 1; i <= 5; i++){
            int randomInt = rand.nextInt(6) + 1; //nextInt(6) would normally 
            //go from 0-5 so adding 1 makes it go from 1 to 6
            
            
            switch(i) {
                case 1: String d1Text = Integer.toString(randomInt);
            d1Button.setText(d1Text);
                    break;
                case 2: String d2Text = Integer.toString(randomInt);
            d2Button.setText(d2Text);
                    break;
                case 3: String d3Text = Integer.toString(randomInt);
            d3Button.setText(d3Text);
                    break;
                case 4: String d4Text = Integer.toString(randomInt);
            d4Button.setText(d4Text);
                    break;
                case 5: String d5Text = Integer.toString(randomInt);
            d5Button.setText(d5Text);
                    break;
                    
            }
        }
        //generate random int for a 12-sided die
        int randomInt = rand.nextInt(12) + 1;
        String instr = "The target number is " +Integer.toString(randomInt);
        instructionsLabel.setText(instr);
        
        //clear out the entries every time roll is clicked
        comboLabel.setText("");
        //reset buttons
        plusButton.setEnabled(false);
        minusButton.setEnabled(false);
        enterButton.setEnabled(false);
        d1Button.setEnabled(true); 
        d2Button.setEnabled(true);
        d3Button.setEnabled(true);
        d4Button.setEnabled(true);
        d5Button.setEnabled(true);
        
        //baps become false
        /*for(boolean b: bapArray) {
            b = false;
        }*/
        d1Bap = false;
        d2Bap = false;
        d3Bap = false;
        d4Bap = false;
        d5Bap = false;
        minusHit = false;
        
        //clear out arrays
        intTest.clear();
        charTest.clear();
        
    }//GEN-LAST:event_rollButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        comboLabel.setText(""); //clear out the label if clear btn clicked
        //reset buttons
        plusButton.setEnabled(false);
        minusButton.setEnabled(false);
        enterButton.setEnabled(false);
        d1Button.setEnabled(true);
        d2Button.setEnabled(true);
        d3Button.setEnabled(true);
        d4Button.setEnabled(true);
        d5Button.setEnabled(true);
        
        //baps become false
        /*for(boolean b: bapArray) {
            b = false;
        } */
        d1Bap = false;
        d2Bap = false;
        d3Bap = false;
        d4Bap = false;
        d5Bap = false;
        minusHit = false;
        
        //clear out arrays
        intTest.clear();
        charTest.clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        comboText = comboLabel.getText();
        
        if(!comboText.contentEquals("") ) {
            comboLabel.setText(comboText + "+");
        }
        
        
        
        
        
        
        
        if (d1Bap == false)  { 
            
            d1Button.setEnabled(true);
            
        }
        
        if (d2Bap == false)  { 
            d2Button.setEnabled(true);
            
        }
        
        if (d3Bap == false)  { 
            d3Button.setEnabled(true);
            
        }
        
        if (d4Bap == false)  { 
            d4Button.setEnabled(true);
            
        }
        
        if (d5Bap == false)  { 
            d5Button.setEnabled(true);
            
        }
        //reset buttons
        plusButton.setEnabled(false);
        minusButton.setEnabled(false);
        minusHit = false;
        
        
        
        charTest.add('+');
        
    }//GEN-LAST:event_plusButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
         comboText = comboLabel.getText();
        
        if(!comboText.contentEquals("") ) {
            comboLabel.setText(comboText + "-");
        }
        
        
        
        if (d1Bap == false)  { //if d1button method wasn't called enable its btn
            d1Button.setEnabled(true);
            
        }
        
        //else it stays disabled from having just pressed a number btn
        
        if (d2Bap == false)  { 
            d2Button.setEnabled(true);
            
        }
        
        if (d3Bap == false)  { 
            d3Button.setEnabled(true);
            
        }
        
        if (d4Bap == false)  { 
            d4Button.setEnabled(true);
            
        }
        
        if (d5Bap == false)  { 
            d5Button.setEnabled(true);
            
        }
        
        plusButton.setEnabled(false);
        minusButton.setEnabled(false);
        minusHit = true;
        
        
        
        charTest.add('-');
        
    }//GEN-LAST:event_minusButtonActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        
        
        //add the elements in the intTest arraylist 
        if (intTest.size() == charTest.size()+1) {
        int total = 0;
        for(Integer i : intTest){
            total += i; //total = total + i;
        }
        comboLabel.setText(Integer.toString(total));
        }
            
	
        
        
        


        
        
    }//GEN-LAST:event_enterButtonActionPerformed

    private void d2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ButtonActionPerformed
        comboText = comboLabel.getText();
        d2Bap = true;
        String d2Text = d2Button.getText();
        if(!d2Text.contentEquals("D2")) { 
            comboLabel.setText(comboText + d2Text);
        }
        
        if(minusHit == false) {
        Integer d2Integer = Integer.valueOf(d2Text);
        intTest.add(d2Integer); //add the value to the Integer list array
        }
        else {
            Integer d2Integer = -Integer.valueOf(d2Text);
            intTest.add(d2Integer); 
        }
        
        
        
         
        
        plusButton.setEnabled(true);
        minusButton.setEnabled(true);
        enterButton.setEnabled(true);
        
        
        d1Button.setEnabled(false); 
        d2Button.setEnabled(false);
        d3Button.setEnabled(false);
        d4Button.setEnabled(false);
        d5Button.setEnabled(false);
    }//GEN-LAST:event_d2ButtonActionPerformed

    private void d3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3ButtonActionPerformed
        comboText = comboLabel.getText();
        d3Bap = true;
        String d3Text = d3Button.getText();
        if(!d3Text.contentEquals("D3")) { 
            comboLabel.setText(comboText + d3Text);
        }
        
        
        
        if(minusHit == false) {
        Integer d3Integer = Integer.valueOf(d3Text);
        intTest.add(d3Integer); //add the value to the Integer list array
        }
        else {
            Integer d3Integer = -Integer.valueOf(d3Text);
            intTest.add(d3Integer); 
        }
        
        plusButton.setEnabled(true);
        minusButton.setEnabled(true);
        enterButton.setEnabled(true);
        
        
        d1Button.setEnabled(false); 
        d2Button.setEnabled(false);
        d3Button.setEnabled(false);
        d4Button.setEnabled(false);
        d5Button.setEnabled(false);
    }//GEN-LAST:event_d3ButtonActionPerformed

    private void d4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4ButtonActionPerformed
        comboText = comboLabel.getText();
        d4Bap = true;
        String d4Text = d4Button.getText();
        if(!d4Text.contentEquals("D4")) { 
            comboLabel.setText(comboText + d4Text);
        }
        
        
        
        if(minusHit == false) {
        Integer d4Integer = Integer.valueOf(d4Text);
        intTest.add(d4Integer); //add the value to the Integer list array
        }
        else {
            Integer d4Integer = -Integer.valueOf(d4Text);
            intTest.add(d4Integer); 
        } 
        
        plusButton.setEnabled(true);
        minusButton.setEnabled(true);
        enterButton.setEnabled(true);
        
        
        d1Button.setEnabled(false); 
        d2Button.setEnabled(false);
        d3Button.setEnabled(false);
        d4Button.setEnabled(false);
        d5Button.setEnabled(false);
    }//GEN-LAST:event_d4ButtonActionPerformed

    private void d5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d5ButtonActionPerformed
        
        comboText = comboLabel.getText();
        d5Bap = true;
        String d5Text = d5Button.getText();
        if(!d5Text.contentEquals("D5")) { 
            comboLabel.setText(comboText + d5Text);
        }
        
        
        
        if(minusHit == false) {
        Integer d5Integer = Integer.valueOf(d5Text);
        intTest.add(d5Integer); //add the value to the Integer list array
        }
        else {
            Integer d5Integer = -Integer.valueOf(d5Text);
            intTest.add(d5Integer); 
        }
        
        plusButton.setEnabled(true);
        minusButton.setEnabled(true);
        enterButton.setEnabled(true);
        
        
        d1Button.setEnabled(false); 
        d2Button.setEnabled(false);
        d3Button.setEnabled(false);
        d4Button.setEnabled(false);
        d5Button.setEnabled(false);
    }//GEN-LAST:event_d5ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DiceGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiceGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiceGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiceGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiceGameGUI().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel comboLabel;
    private javax.swing.JButton d1Button;
    private javax.swing.JButton d2Button;
    private javax.swing.JButton d3Button;
    private javax.swing.JButton d4Button;
    private javax.swing.JButton d5Button;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel instructionsLabel;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JButton rollButton;
    // End of variables declaration//GEN-END:variables
}

