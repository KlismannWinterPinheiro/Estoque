
package ModeloBeans;

import java.sql.Date;
import java.sql.Time;

public class ModeloBeansBaixaMedicamento {
    
   private int cod_baixa_medicamento;
   private String medicamento;
   private Date data_baixa_medicamento;
   private Time hora_baixa_medicamento;
   private int quantidade_baixa_medicamento;

    /**
     * @return the cod_baixa_medicamento
     */
    public int getCod_baixa_medicamento() {
        return cod_baixa_medicamento;
    }

    /**
     * @param cod_baixa_medicamento the cod_baixa_medicamento to set
     */
    public void setCod_baixa_medicamento(int cod_baixa_medicamento) {
        this.cod_baixa_medicamento = cod_baixa_medicamento;
    }

    /**
     * @return the medicamento
     */
    public String getMedicamento() {
        return medicamento;
    }

    /**
     * @param medicamento the medicamento to set
     */
    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    /**
     * @return the data_baixa_medicamento
     */
    public Date getData_baixa_medicamento() {
        return data_baixa_medicamento;
    }

    /**
     * @param data_baixa_medicamento the data_baixa_medicamento to set
     */
    public void setData_baixa_medicamento(Date data_baixa_medicamento) {
        this.data_baixa_medicamento = data_baixa_medicamento;
    }

    /**
     * @return the hora_baixa_medicamento
     */
    public Time getHora_baixa_medicamento() {
        return hora_baixa_medicamento;
    }

    /**
     * @param hora_baixa_medicamento the hora_baixa_medicamento to set
     */
    public void setHora_baixa_medicamento(Time hora_baixa_medicamento) {
        this.hora_baixa_medicamento = hora_baixa_medicamento;
    }

    /**
     * @return the quantidade_baixa_medicamento
     */
    public int getQuantidade_baixa_medicamento() {
        return quantidade_baixa_medicamento;
    }

    /**
     * @param quantidade_baixa_medicamento the quantidade_baixa_medicamento to set
     */
    public void setQuantidade_baixa_medicamento(int quantidade_baixa_medicamento) {
        this.quantidade_baixa_medicamento = quantidade_baixa_medicamento;
    }
    

   
   
}
