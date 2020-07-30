/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author klism
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        jButtonMedicamentos = new javax.swing.JButton();
        jButtonManutenção = new javax.swing.JButton();
        jButtonMaterialLimpeza = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/medicamentos.png"))); // NOI18N
        jButtonMedicamentos.setText("MEDICAMENTOS");
        jButtonMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedicamentosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMedicamentos);
        jButtonMedicamentos.setBounds(40, 230, 150, 60);

        jButtonManutenção.setText("MANUTENÇÃO");
        getContentPane().add(jButtonManutenção);
        jButtonManutenção.setBounds(220, 230, 150, 60);

        jButtonMaterialLimpeza.setText("MATERIAL DE LIMPEZA");
        getContentPane().add(jButtonMaterialLimpeza);
        jButtonMaterialLimpeza.setBounds(430, 230, 150, 60);

        jLabel1.setFont(new java.awt.Font("Qanelas SemiBold", 0, 48)); // NOI18N
        jLabel1.setText("ESTOQUE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 70, 240, 60);

        jButtonAdmin.setText("ADMIN");
        jButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdminActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdmin);
        jButtonAdmin.setBounds(630, 230, 150, 60);

        setSize(new java.awt.Dimension(916, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedicamentosActionPerformed
        TelaUserMedicamento medicamentos = new TelaUserMedicamento();
        medicamentos.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonMedicamentosActionPerformed

    private void jButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdminActionPerformed
        Verificacao verificacao = new Verificacao();
        verificacao.setVisible(true);
    }//GEN-LAST:event_jButtonAdminActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdmin;
    private javax.swing.JButton jButtonManutenção;
    private javax.swing.JButton jButtonMaterialLimpeza;
    private javax.swing.JButton jButtonMedicamentos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
