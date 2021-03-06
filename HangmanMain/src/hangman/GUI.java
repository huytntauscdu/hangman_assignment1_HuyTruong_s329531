/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import javax.swing.JOptionPane;

/**
 *
 * @author huytruongngotruong
 */
public class GUI extends javax.swing.JFrame {

    Hangman hangman = new Hangman(); //variable hangman class
    
    public int index = hangman.indexWordBanks;      //variable index
    public int playerLife = 8;      //variable player life default
    public String compareWord;      //variable compare word
    public String guessString;      //variable guess string
    public String messageBox;    //variable atemp message
    public int count = 0;
  
   
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        buttonRestart.setVisible(false);
    }
    
    //set default value in GUI method
    public void defaultResult() 
    {
        playerLife = 8;
        jLabelGuess.setOpaque(true);
        jLabelGuess.setText("");
        jLabelGuess.setText(hangman.emptyBlankString);
        jLabelAtempt.setText(playerLife + "");
        
    }//End default value method

    //check play life method
    public int checkPlayerLife()
    {
        if(playerLife == 0)
        {
            guessButtonVisible();
            return 0;
        }
        return 1;
    }//End check player life method
    
    //Set guess button visible method
    public void guessButtonVisible()
    {
       ButtonA.setVisible(false);
       ButtonB.setVisible(false);
       ButtonC.setVisible(false);
       ButtonD.setVisible(false);
       ButtonE.setVisible(false);
       ButtonF.setVisible(false);
       ButtonG.setVisible(false);
       ButtonH.setVisible(false);
       ButtonI.setVisible(false);
       ButtonJ.setVisible(false);
       ButtonK.setVisible(false);
       ButtonL.setVisible(false);
       ButtonM.setVisible(false);
       ButtonN.setVisible(false);
       ButtonO.setVisible(false);
       ButtonP.setVisible(false);
       ButtonQ.setVisible(false);
       ButtonR.setVisible(false);
       ButtonS.setVisible(false);
       ButtonT.setVisible(false);
       ButtonU.setVisible(false);
       ButtonV.setVisible(false);
       ButtonW.setVisible(false);
       ButtonX.setVisible(false);
       ButtonY.setVisible(false);
       ButtonZ.setVisible(false);
    }//End gues buton visible method
    
    //set guess button invisible
    public void guessButtonInVisible()
    {
       ButtonA.setVisible(true);
       ButtonB.setVisible(true);
       ButtonC.setVisible(true);
       ButtonD.setVisible(true);
       ButtonE.setVisible(true);
       ButtonF.setVisible(true);
       ButtonG.setVisible(true);
       ButtonH.setVisible(true);
       ButtonI.setVisible(true);
       ButtonJ.setVisible(true);
       ButtonK.setVisible(true);
       ButtonL.setVisible(true);
       ButtonM.setVisible(true);
       ButtonN.setVisible(true);
       ButtonO.setVisible(true);
       ButtonP.setVisible(true);
       ButtonQ.setVisible(true);
       ButtonR.setVisible(true);
       ButtonS.setVisible(true);
       ButtonT.setVisible(true);
       ButtonU.setVisible(true);
       ButtonV.setVisible(true);
       ButtonW.setVisible(true);
       ButtonX.setVisible(true);
       ButtonY.setVisible(true);
       ButtonZ.setVisible(true);
    }//End set guess button invisible
    
    //compare word method
    public void compareWord(String guessWord) 
    {
        if(checkPlayerLife() == 1)
        {
            hangman.stringbuilder.setLength(0);
            hangman.stringbuilder = new StringBuilder();
            boolean flag = false;
            for (int i = 0; i < hangman.answerArray.length; i++) 
            {
                
                if (guessWord.equals(hangman.answerArray[i].toString())) 
                {
                    hangman.emptyArray[i] = guessWord;
                    flag = true;
                    count++;
                    System.out.println(count);
                }
                hangman.stringbuilder.append(hangman.emptyArray[i]);
            }
            if (!flag) {
                playerLife--;
            }
            hangman.emptyBlankString = hangman.stringbuilder.toString();
            guessString = hangman.emptyBlankString;
        }
        else
        {
            messageBox = "You lose, no more attempt!";
            JOptionPane.showMessageDialog(null, messageBox, "Information", JOptionPane.INFORMATION_MESSAGE);
            buttonRestart.setVisible(true);
            messageBox = "";
        }

    }//End compare word method
    
    //method check count when guess press one word is correct
    public void checkCountGuessSuccess()
    {
        if(count == hangman.answerArray.length)
        {
            messageBox = "Congratulation! You have the correct answer!";
            guessButtonVisible();
            JOptionPane.showMessageDialog(null, messageBox, "Information", JOptionPane.INFORMATION_MESSAGE);
            buttonRestart.setVisible(true);
        }
    }//End check count method

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ButtonA = new javax.swing.JButton();
        ButtonB = new javax.swing.JButton();
        ButtonC = new javax.swing.JButton();
        ButtonD = new javax.swing.JButton();
        ButtonE = new javax.swing.JButton();
        ButtonF = new javax.swing.JButton();
        ButtonG = new javax.swing.JButton();
        ButtonH = new javax.swing.JButton();
        ButtonI = new javax.swing.JButton();
        ButtonJ = new javax.swing.JButton();
        ButtonT = new javax.swing.JButton();
        ButtonN = new javax.swing.JButton();
        ButtonM = new javax.swing.JButton();
        ButtonY = new javax.swing.JButton();
        ButtonZ = new javax.swing.JButton();
        ButtonU = new javax.swing.JButton();
        ButtonV = new javax.swing.JButton();
        ButtonX = new javax.swing.JButton();
        ButtonO = new javax.swing.JButton();
        ButtonP = new javax.swing.JButton();
        ButtonQ = new javax.swing.JButton();
        ButtonR = new javax.swing.JButton();
        ButtonK = new javax.swing.JButton();
        ButtonS = new javax.swing.JButton();
        ButtonW = new javax.swing.JButton();
        ButtonL = new javax.swing.JButton();
        jLabelGuess = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelLives = new javax.swing.JLabel();
        jLabelAtempt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonRestart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Hangman");

        ButtonA.setText("A");
        ButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAActionPerformed(evt);
            }
        });

        ButtonB.setText("B");
        ButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBActionPerformed(evt);
            }
        });

        ButtonC.setLabel("C");
        ButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCActionPerformed(evt);
            }
        });

        ButtonD.setText("D");
        ButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDActionPerformed(evt);
            }
        });

        ButtonE.setText("E");
        ButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEActionPerformed(evt);
            }
        });

        ButtonF.setText("F");
        ButtonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFActionPerformed(evt);
            }
        });

        ButtonG.setText("G");
        ButtonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGActionPerformed(evt);
            }
        });

        ButtonH.setText("H");
        ButtonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHActionPerformed(evt);
            }
        });

        ButtonI.setText("I");
        ButtonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIActionPerformed(evt);
            }
        });

        ButtonJ.setText("J");
        ButtonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonJActionPerformed(evt);
            }
        });

        ButtonT.setText("T");
        ButtonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTActionPerformed(evt);
            }
        });

        ButtonN.setText("N");
        ButtonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNActionPerformed(evt);
            }
        });

        ButtonM.setText("M");
        ButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMActionPerformed(evt);
            }
        });

        ButtonY.setText("Y");
        ButtonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonYActionPerformed(evt);
            }
        });

        ButtonZ.setText("Z");
        ButtonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonZActionPerformed(evt);
            }
        });

        ButtonU.setText("U");
        ButtonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUActionPerformed(evt);
            }
        });

        ButtonV.setText("V");
        ButtonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVActionPerformed(evt);
            }
        });

        ButtonX.setText("X");
        ButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonXActionPerformed(evt);
            }
        });

        ButtonO.setText("O");
        ButtonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOActionPerformed(evt);
            }
        });

        ButtonP.setText("P");
        ButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPActionPerformed(evt);
            }
        });

        ButtonQ.setText("Q");
        ButtonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonQActionPerformed(evt);
            }
        });

        ButtonR.setText("R");
        ButtonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRActionPerformed(evt);
            }
        });

        ButtonK.setText("K");
        ButtonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKActionPerformed(evt);
            }
        });

        ButtonS.setText("S");
        ButtonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSActionPerformed(evt);
            }
        });

        ButtonW.setText("W");
        ButtonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonWActionPerformed(evt);
            }
        });

        ButtonL.setText("L");
        ButtonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(ButtonU, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonV, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonW, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonX, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonY, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ButtonK, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonL, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonM, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonN, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonO, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonR, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonS, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonT, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonA, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonB, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonG, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonI, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonA)
                    .addComponent(ButtonB)
                    .addComponent(ButtonC)
                    .addComponent(ButtonD)
                    .addComponent(ButtonE)
                    .addComponent(ButtonF)
                    .addComponent(ButtonG)
                    .addComponent(ButtonH)
                    .addComponent(ButtonI)
                    .addComponent(ButtonJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonK)
                    .addComponent(ButtonL)
                    .addComponent(ButtonM)
                    .addComponent(ButtonO)
                    .addComponent(ButtonP)
                    .addComponent(ButtonQ)
                    .addComponent(ButtonR)
                    .addComponent(ButtonS)
                    .addComponent(ButtonT)
                    .addComponent(ButtonN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonU)
                    .addComponent(ButtonV)
                    .addComponent(ButtonW)
                    .addComponent(ButtonY)
                    .addComponent(ButtonZ)
                    .addComponent(ButtonX)))
        );

        LabelLives.setText("lives");

        jLabel2.setText("Player's lifes: ");

        buttonRestart.setText("Restart");
        buttonRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonRestart)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAtempt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelLives)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelAtempt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonRestart))
                    .addComponent(LabelLives))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabelGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 187, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(jLabelGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonD.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonDActionPerformed

    private void ButtonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonH.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonHActionPerformed

    private void ButtonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonJActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonJ.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonJActionPerformed

    private void ButtonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonO.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonOActionPerformed

    private void ButtonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonS.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonSActionPerformed

    private void ButtonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonN.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonNActionPerformed

    private void ButtonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonK.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonKActionPerformed

    private void ButtonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonYActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonY.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonYActionPerformed

    private void ButtonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonU.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonUActionPerformed

    private void ButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonXActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonX.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonXActionPerformed

    private void buttonRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestartActionPerformed
        // TODO add your handling code here:
        hangman.randomWords();
        guessButtonInVisible();
        buttonRestart.equals(false);
        defaultResult();
    }//GEN-LAST:event_buttonRestartActionPerformed

    private void ButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonA.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
        
    }//GEN-LAST:event_ButtonAActionPerformed

    private void ButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonB.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonBActionPerformed

    private void ButtonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonZActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonZ.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonZActionPerformed

    private void ButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonC.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonCActionPerformed

    private void ButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonE.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonEActionPerformed

    private void ButtonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonF.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonFActionPerformed

    private void ButtonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonG.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonGActionPerformed

    private void ButtonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonI.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonIActionPerformed

    private void ButtonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonL.getText().toString());
        jLabelGuess.setText(guessString);
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonLActionPerformed

    private void ButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonM.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonMActionPerformed

    private void ButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonP.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonPActionPerformed

    private void ButtonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonQActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonQ.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonQActionPerformed

    private void ButtonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonR.getText().toString());
        jLabelGuess.setText(guessString);
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonRActionPerformed

    private void ButtonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonT.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonTActionPerformed

    private void ButtonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonV.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonVActionPerformed

    private void ButtonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonWActionPerformed
        // TODO add your handling code here:
        compareWord(ButtonW.getText().toString());
        jLabelGuess.setText(guessString);
        checkCountGuessSuccess();
        jLabelAtempt.setText(playerLife + " ");
    }//GEN-LAST:event_ButtonWActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Hangman hangman = new Hangman();
        //GUI gui = new GUI();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                new GUI().setVisible(true);
                
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ButtonA;
    public javax.swing.JButton ButtonB;
    public javax.swing.JButton ButtonC;
    public javax.swing.JButton ButtonD;
    public javax.swing.JButton ButtonE;
    public javax.swing.JButton ButtonF;
    public javax.swing.JButton ButtonG;
    public javax.swing.JButton ButtonH;
    public javax.swing.JButton ButtonI;
    public javax.swing.JButton ButtonJ;
    public javax.swing.JButton ButtonK;
    public javax.swing.JButton ButtonL;
    public javax.swing.JButton ButtonM;
    public javax.swing.JButton ButtonN;
    public javax.swing.JButton ButtonO;
    public javax.swing.JButton ButtonP;
    public javax.swing.JButton ButtonQ;
    public javax.swing.JButton ButtonR;
    public javax.swing.JButton ButtonS;
    public javax.swing.JButton ButtonT;
    public javax.swing.JButton ButtonU;
    public javax.swing.JButton ButtonV;
    public javax.swing.JButton ButtonW;
    public javax.swing.JButton ButtonX;
    public javax.swing.JButton ButtonY;
    public javax.swing.JButton ButtonZ;
    private javax.swing.JLabel LabelLives;
    private javax.swing.JButton buttonRestart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAtempt;
    private javax.swing.JLabel jLabelGuess;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
