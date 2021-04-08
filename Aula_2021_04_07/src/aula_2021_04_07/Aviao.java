/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2021_04_07;

/**
 *
 * @author JorUge
 */
public class Aviao extends Veiculo{

    String prefixo;
    
    String dataRevisao;

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }
    

    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    public String getPrefixo() {
        return prefixo;
    }    

    public String getDataRevisao() {
        return dataRevisao;
    }

}
