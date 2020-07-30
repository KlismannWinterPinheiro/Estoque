/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;

/**
 *
 * @author klism
 */
public class Verificacao extends javax.swing.JFrame {

    ConexaoBD con = new ConexaoBD();
    public Verificacao() {
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

        jLabelInserir = new javax.swing.JLabel();
        jPasswordFieldCodigoVerificacao = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButtonVerificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelInserir.setFont(new java.awt.Font("Qanelas Medium", 0, 20)); // NOI18N
        jLabelInserir.setText("INSERIR CÓDIGO DE VERIFICAÇÃO");
        getContentPane().add(jLabelInserir);
        jLabelInserir.setBounds(40, 100, 578, 70);

        jPasswordFieldCodigoVerificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldCodigoVerificacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldCodigoVerificacao);
        jPasswordFieldCodigoVerificacao.setBounds(50, 190, 300, 40);

        jButton1.setText("CANCELAR");
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 260, 85, 23);

        jButtonVerificar.setText("VERIFICAR");
        jButtonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificar);
        jButtonVerificar.setBounds(60, 260, 90, 23);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarActionPerformed
         try {
            
           // con.executaSql("select * from usuarios where cod_usuario='"+jPasswordFieldCodigoVerificacao.getText()+"'");
            con.rs.first();
            if(con.rs.getString("cod_usuario").equals(jPasswordFieldCodigoVerificacao.getText())){
                TelaAdminMedicamentos tela = new TelaAdminMedicamentos();
                tela.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Senha ou usuário inválidos.");
            }
        
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Senha ou usuário inválidos."+ex);
        }
    }//GEN-LAST:event_jButtonVerificarActionPerformed

    private void jPasswordFieldCodigoVerificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldCodigoVerificacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldCodigoVerificacaoActionPerformed

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
            java.util.logging.Logger.getLogger(Verificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Verificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Verificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Verificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Verificacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonVerificar;
    private javax.swing.JLabel jLabelInserir;
    private javax.swing.JPasswordField jPasswordFieldCodigoVerificacao;
    // End of variables declaration//GEN-END:variables
}