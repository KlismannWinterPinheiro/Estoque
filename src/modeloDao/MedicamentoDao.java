/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import ModeloBeans.ModeloBeansMedicamento;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;

public class MedicamentoDao {

    ConexaoBD conex = new ConexaoBD();
    ModeloBeansMedicamento mod = new ModeloBeansMedicamento();

    public void Salvar(ModeloBeansMedicamento mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into medicamentos (cod_barras_medicamento, nome_medicamento, quantidade_medicamento) values(?,?,?)");
            pst.setString(1, mod.getCodigo_barras());
            pst.setString(2, mod.getNome());
            pst.setInt(3, mod.getQuantidade());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Medicamento cadastrado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar medicamento. \n Erro: " + ex.getMessage());
        }
        conex.desconecta();
    }

    public void Editar(ModeloBeansMedicamento mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update medicamentos set nome_medicamento=?, quantidade_medicamento=? where cod_barras_medicamento=?");

            
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getQuantidade());
            pst.setString(3, mod.getCodigo_barras());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro editado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar cadastro xr6tt. \n Erro: " + ex.getMessage());
        }

        conex.desconecta();
    }

    public void Excluir(ModeloBeansMedicamento mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from medicamentos where cod_barras_medicamento=?");
            pst.setString(1, mod.getCodigo_barras());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Medicamento excluído com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir medicamento. \n Erro: " + ex.getMessage());
        }

        conex.desconecta();
    }

    public ModeloBeansMedicamento buscaMedicamento(ModeloBeansMedicamento mod) {
        conex.conexao();
        //conex.executaSql("select * from medicamentos where nome_medicamento like'%" + mod.getPesquisa() + "%'");
        conex.executaSql("select * from medicamentos where cod_barras_medicamento like'%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setCodigo_barras(conex.rs.getString("cod_barras_medicamento"));
            mod.setNome(conex.rs.getString("nome_medicamento"));
            mod.setQuantidade(conex.rs.getInt("quantidade_medicamento"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar medicamento. \n Erro: " + ex.getMessage());
        }

        conex.desconecta();
        return mod;
    }
}
