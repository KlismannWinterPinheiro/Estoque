
package modeloDao;

import ModeloBeans.ModeloBeansBaixaMedicamento;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;

public class BaixaMedicamentosDAO {
    
    ConexaoBD conex = new ConexaoBD();
    ModeloBeansBaixaMedicamento mod = new ModeloBeansBaixaMedicamento();

    public void Salvar(ModeloBeansBaixaMedicamento mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into baixa_medicamentos (cod_barras_medicamento, data_baixa_medicamento, hora_baixa_medicamento, quantidade_baixa_medicamento) values(?,?,?)");
            pst.setString(1, mod.getMedicamento());
            pst.setDate(2, mod.getData_baixa_medicamento());
            pst.setTime(3, mod.getHora_baixa_medicamento());
            pst.setInt(4, mod.getQuantidade_baixa_medicamento());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Baixa realizada de medicamento com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao dar baixa em medicamento. \n Erro: " + ex.getMessage());
        }
        conex.desconecta();
    }
    
}
