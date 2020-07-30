
package ModeloBeans;

import java.sql.Date;
import java.sql.Time;

public class ModeloBeansBaixasMedicamentos {

   private int cod_medicamento_baixa;
   private String medicamento;
   private Date data_medicamento_baixa;
   private Time hora_medicamento_baixa;
   private int cod_baixa_medicamento;
   
    public int getCod_medicamento_baixa() {
        return cod_medicamento_baixa;
    }

    /**
     * @param cod_medicamento_baixa the cod_medicamento_baixa to set
     */
    public void setCod_medicamento_baixa(int cod_medicamento_baixa) {
        this.cod_medicamento_baixa = cod_medicamento_baixa;
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
     * @return the data_medicamento_baixa
     */
    public Date getData_medicamento_baixa() {
        return data_medicamento_baixa;
    }

    /**
     * @param data_medicamento_baixa the data_medicamento_baixa to set
     */
    public void setData_medicamento_baixa(Date data_medicamento_baixa) {
        this.data_medicamento_baixa = data_medicamento_baixa;
    }

    /**
     * @return the hora_medicamento_baixa
     */
    public Time getHora_medicamento_baixa() {
        return hora_medicamento_baixa;
    }

    /**
     * @param hora_medicamento_baixa the hora_medicamento_baixa to set
     */
    public void setHora_medicamento_baixa(Time hora_medicamento_baixa) {
        this.hora_medicamento_baixa = hora_medicamento_baixa;
    }

    /**
     * @return the quantidade_medicamento_baixa
     */
    

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
    
   
   
    
}
