/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



public class Tank extends javax.swing.JFrame implements DefenceObserver{
    private int position;
    
    public Tank() {
        initComponents();
        setTitle("Tank");
        setVisible(true);
        jTextPane1.setEditable(false);
    }
    
    public void update(int position){
        this.position=position;
        updateButtons();
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jButton5 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSlider1.setMajorTickSpacing(20);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(100);
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 6, 54, 288));

        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 134, 361, 118));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 270, 270, -1));

        jButton4.setText("Send");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 270, 73, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Area Is Not Cleared");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 16, 274, -1));

        jButton1.setText("Shoot");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 56, 128, -1));

        jLabel2.setText("Soldiers");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 29, -1, -1));

        jButton2.setText("Radar");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 56, 128, -1));

        jLabel3.setText("Ammo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 65, -1, -1));

        jButton3.setText("Missile");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 98, 128, -1));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 26, 42, -1));
        getContentPane().add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 62, 42, -1));

        jButton5.setText("Rotate Shooting");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 98, 128, -1));

        jCheckBox1.setText("Position");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 99, 85, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("/home/macami-3/NetBeansProjects/slarmy/sub halo.gif")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            updateButtons();
        }else {
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton5.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String msg="Tank : "+jTextField1.getText();
        MainController.setDefenceMsg(msg);
    }//GEN-LAST:event_jButton4ActionPerformed

    public void areaClearLabel(boolean clearStatus) {
        if (clearStatus) {
            jLabel1.setText("Area Cleared");
        }else{
            jLabel1.setText("Area Is Not Cleared");
        }
    }
    
    public void getMsgMain(String msg) {
        try {
            javax.swing.text.Document doc = jTextPane1.getDocument();
            doc.insertString(doc.getLength(), msg + "\n", null);
            jTextPane1.setCaretPosition(doc.getLength());
        } catch (javax.swing.text.BadLocationException e) {
            e.printStackTrace();
        }
    }
    
    public void updateButtons(){
        if (jCheckBox1.isSelected()) {
            if (position>80) {
                jButton5.setEnabled(true);
                jButton3.setEnabled(true);
                jButton2.setEnabled(true);
                jButton1.setEnabled(true);
            }else if (position>60) {
                jButton3.setEnabled(true);
                jButton2.setEnabled(true);
                jButton1.setEnabled(true);
            }else if (position>40) {
                jButton2.setEnabled(true);
                jButton1.setEnabled(true);
            }else if (position>20) {
                jButton1.setEnabled(true);
            }
            
            if (position<20) {
                jButton5.setEnabled(false);
                jButton3.setEnabled(false);
                jButton2.setEnabled(false);
                jButton1.setEnabled(false);
            }else if (position<40) {
                jButton5.setEnabled(false);
                jButton3.setEnabled(false);
                jButton2.setEnabled(false);
            }else if (position<60) {
                jButton5.setEnabled(false);
                jButton3.setEnabled(false);
            }else if (position<80) {
                jButton5.setEnabled(false);
            }
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    
}
