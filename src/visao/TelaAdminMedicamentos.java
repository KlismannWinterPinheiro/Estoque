package visao;

import ModeloBeans.ModeloBeansMedicamento;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloConection.ConexaoBD;
import modeloDao.MedicamentoDao;
import modeloDao.ModeloTabelaMedicamentos;

public class TelaAdminMedicamentos extends javax.swing.JFrame {

    ModeloBeansMedicamento mod = new ModeloBeansMedicamento();
    MedicamentoDao control = new MedicamentoDao();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;

    public TelaAdminMedicamentos() {
        initComponents();

        preencherTabela("select * from medicamentos order by nome_medicamento");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jLabelBuscar = new javax.swing.JLabel();
        jLabelCodigoDeBarras = new javax.swing.JLabel();
        jTextFieldCodigoDeBarras = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMedicamentos = new javax.swing.JTable();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelTitulo.setText("MEDICAMENTOS");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(270, 0, 480, 60);

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(680, 170, 90, 40);
        getContentPane().add(jTextFieldBuscar);
        jTextFieldBuscar.setBounds(40, 160, 280, 30);

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(330, 160, 90, 30);

        jLabelBuscar.setText("BUSCAR:");
        getContentPane().add(jLabelBuscar);
        jLabelBuscar.setBounds(40, 140, 60, 14);

        jLabelCodigoDeBarras.setText("CÓDIGO DE BARRAS");
        getContentPane().add(jLabelCodigoDeBarras);
        jLabelCodigoDeBarras.setBounds(40, 70, 160, 14);

        jTextFieldCodigoDeBarras.setEnabled(false);
        jTextFieldCodigoDeBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoDeBarrasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCodigoDeBarras);
        jTextFieldCodigoDeBarras.setBounds(40, 90, 200, 30);

        jLabelNome.setText("NOME");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(300, 70, 70, 14);

        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(300, 90, 210, 30);

        jLabel6.setText("QUANTIDADE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(580, 70, 110, 14);

        jTextFieldQuantidade.setEnabled(false);
        getContentPane().add(jTextFieldQuantidade);
        jTextFieldQuantidade.setBounds(580, 90, 60, 30);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(680, 220, 90, 40);

        jTableMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedicamentosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableMedicamentos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 210, 620, 360);

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar);
        jButtonEditar.setBounds(680, 270, 90, 40);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(680, 370, 90, 40);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir);
        jButtonExcluir.setBounds(680, 320, 90, 40);

        jButton1.setText("REPOSIÇÃO");
        getContentPane().add(jButton1);
        jButton1.setBounds(680, 420, 110, 40);

        setSize(new java.awt.Dimension(916, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoDeBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoDeBarrasActionPerformed

    }//GEN-LAST:event_jTextFieldCodigoDeBarrasActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed

        flag = 1;
        jButtonSalvar.setEnabled(true);
        jTableMedicamentos.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        jTextFieldBuscar.setEnabled(false);
        jTextFieldCodigoDeBarras.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldQuantidade.setEnabled(true);
        jButtonCadastrar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jTextFieldCodigoDeBarras.setText("");
        jTextFieldNome.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldBuscar.setText("");
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        
        flag = 2;
        jButtonSalvar.setEnabled(true);
        jTableMedicamentos.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        jTextFieldBuscar.setEnabled(false);
        //jTextFieldCodigoDeBarras.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldQuantidade.setEnabled(true);
        jButtonCadastrar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed

        mod.setPesquisa(jTextFieldBuscar.getText());
        //preencherTabela("select * from medicamentos where nome_medicamento like '%" + jTextFieldBuscar.getText() + "%' order by nome_medicamento");
        preencherTabela("select * from medicamentos where cod_barras_medicamento like '%" + jTextFieldBuscar.getText() + "%' order by nome_medicamento");

        ModeloBeansMedicamento model = control.buscaMedicamento(mod);
        //jTextFieldCodigo.setText(String.valueOf(model.getCodigo()));
        /*jTextFieldCodigoDeBarras.setText(String.valueOf(model.getCodigo_barras()));
        jTextFieldNome.setText(model.getNome());
        jTextFieldQuantidade.setText(String.valueOf(model.getQuantidade()));
        jButtonSalvar.setEnabled(false);
        jTableMedicamentos.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jTextFieldBuscar.setEnabled(true);
        jTextFieldCodigoDeBarras.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldQuantidade.setEnabled(false);
        jButtonCadastrar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);*/


    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed

    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        if (flag == 1) {
            if (jTextFieldCodigoDeBarras.getText().equals("") || jTextFieldNome.getText().equals("") || jTextFieldQuantidade.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            } else {
                mod.setCodigo_barras(jTextFieldCodigoDeBarras.getText());
                mod.setNome(jTextFieldNome.getText());
                mod.setQuantidade((Integer.parseInt(jTextFieldQuantidade.getText())));
                control.Salvar(mod);
                jTextFieldCodigoDeBarras.setText("");
                jTextFieldNome.setText("");
                jTextFieldQuantidade.setText("");
                jButtonSalvar.setEnabled(false);
                jTableMedicamentos.setEnabled(true);
                jButtonPesquisar.setEnabled(true);
                jTextFieldBuscar.setEnabled(true);
                jTextFieldCodigoDeBarras.setEnabled(false);
                jTextFieldNome.setEnabled(false);
                jTextFieldQuantidade.setEnabled(false);
                jButtonCadastrar.setEnabled(true);
                jButtonEditar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                jButtonCancelar.setEnabled(false);
            }
            preencherTabela("select * from medicamentos order by nome_medicamento");
        } else {

            if (jTextFieldCodigoDeBarras.getText().equals("") || jTextFieldNome.getText().equals("") || jTextFieldQuantidade.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");

            } else {
                //mod.setCodigo((Integer.parseInt(jTextFieldCodigo.getText())));
                mod.setCodigo_barras(jTextFieldCodigoDeBarras.getText());
                mod.setNome(jTextFieldNome.getText());
                mod.setQuantidade((Integer.parseInt(jTextFieldQuantidade.getText())));
                control.Editar(mod);
                jTextFieldCodigoDeBarras.setText("");
                jTextFieldNome.setText("");
                jTextFieldQuantidade.setText("");
                jTextFieldBuscar.setText("");
                jButtonSalvar.setEnabled(false);
                jTableMedicamentos.setEnabled(true);
                jButtonPesquisar.setEnabled(true);
                jTextFieldBuscar.setEnabled(true);
                jTextFieldCodigoDeBarras.setEnabled(false);
                jTextFieldNome.setEnabled(false);
                jTextFieldQuantidade.setEnabled(false);
                jButtonCadastrar.setEnabled(true);
                jButtonEditar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                preencherTabela("select * from medicamentos order by nome_medicamento");
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jButtonSalvar.setEnabled(false);
        jTableMedicamentos.setEnabled(false);
        jButtonPesquisar.setEnabled(true);
        jTextFieldBuscar.setEnabled(true);
        jTextFieldCodigoDeBarras.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldQuantidade.setEnabled(false);
        jButtonCadastrar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jTextFieldCodigoDeBarras.setText("");
        jTextFieldNome.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldBuscar.setText("");
        jButtonExcluir.setEnabled(false);

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Realmente deseja excluir?");
        if (resposta == JOptionPane.YES_OPTION) {
            // mod.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
            mod.setCodigo_barras(jTextFieldCodigoDeBarras.getText());
            // mod.setCodigo_barras(Integer.parseInt(jTextFieldCodigoDeBarras.getText()));
            control.Excluir(mod);
            //preencherTabela("select * from medicamentos order by nome_medicamento");
            preencherTabela("select * from medicamentos where nome_medicamento like '%" + jTextFieldBuscar.getText() + "%' order by nome_medicamento");

        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedicamentosMouseClicked
        String nome_medicamento = "" + jTableMedicamentos.getValueAt(jTableMedicamentos.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select * from medicamentos where nome_medicamento='" + nome_medicamento + "'");

        try {
            conex.rs.next();

            //jTextFieldCodigo.setText(String.valueOf(conex.rs.getString("cod_medicamento")));
            jTextFieldCodigoDeBarras.setText(String.valueOf(conex.rs.getString("cod_barras_medicamento")));
            jTextFieldNome.setText(conex.rs.getString("nome_medicamento"));
            jTextFieldQuantidade.setText(String.valueOf(conex.rs.getString("quantidade_medicamento")));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar medicamento. Erro: " + ex);
        }

        conex.desconecta();

        jButtonSalvar.setEnabled(false);
        jTableMedicamentos.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jTextFieldBuscar.setEnabled(true);
        jTextFieldCodigoDeBarras.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldQuantidade.setEnabled(false);
        jButtonCadastrar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);


    }//GEN-LAST:event_jTableMedicamentosMouseClicked

    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"CÓDIGO", "MEDICAMENTO", "QUANTIDADE"};
        conex.conexao();
        conex.executaSql(Sql);

        try {

            conex.rs.first();

            do {

                dados.add(new Object[]{conex.rs.getString("cod_barras_medicamento"), conex.rs.getString("nome_medicamento"), conex.rs.getString("quantidade_medicamento")});

            } while (conex.rs.next());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao listar medicamentos . Erro preencher tabela:" + ex);
        }
        ModeloTabelaMedicamentos modelo = new ModeloTabelaMedicamentos(dados, colunas);

        jTableMedicamentos.setModel(modelo);
        jTableMedicamentos.getColumnModel().getColumn(0).setPreferredWidth(150);
        jTableMedicamentos.getColumnModel().getColumn(0).setResizable(false);
        jTableMedicamentos.getColumnModel().getColumn(1).setPreferredWidth(350);
        jTableMedicamentos.getColumnModel().getColumn(1).setResizable(false);
        jTableMedicamentos.getColumnModel().getColumn(2).setPreferredWidth(114);
        jTableMedicamentos.getColumnModel().getColumn(2).setResizable(false);
        jTableMedicamentos.getTableHeader().setReorderingAllowed(false);
        jTableMedicamentos.setAutoResizeMode(jTableMedicamentos.AUTO_RESIZE_OFF);
        jTableMedicamentos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }

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
            java.util.logging.Logger.getLogger(TelaAdminMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdminMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdminMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdminMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdminMedicamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelCodigoDeBarras;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMedicamentos;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCodigoDeBarras;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldQuantidade;
    // End of variables declaration//GEN-END:variables
}
