/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author macami-3
 */
public class seting extends javax.swing.JFrame {

    /**
     * Creates new form seting
     */
    public seting() {
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

        jLabel3 = new javax.swing.JLabel();
        B3 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SETTING");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B3.setBackground(new java.awt.Color(51, 51, 51));
        B3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        B3.setForeground(new java.awt.Color(255, 255, 255));
        B3.setText("BACK");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        getContentPane().add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 110, 30));

        B1.setBackground(new java.awt.Color(51, 51, 51));
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setText("CONTROL");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 140, -1));

        B2.setBackground(new java.awt.Color(51, 51, 51));
        B2.setForeground(new java.awt.Color(255, 255, 255));
        B2.setText("AOUDI");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 140, -1));

        B4.setBackground(new java.awt.Color(51, 51, 51));
        B4.setForeground(new java.awt.Color(255, 255, 255));
        B4.setText("VEDIO");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        getContentPane().add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/macami-3/NetBeansProjects/slarmy/halo4.gif")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        home h= new home();
        h.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
contol h=new contol();
h.setVisible(true);
this.dispose();// TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
adio H =new adio();
     H.setVisible(true);
     this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
VEDIO H= new VEDIO();  
H.setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

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
            java.util.logging.Logger.getLogger(seting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
