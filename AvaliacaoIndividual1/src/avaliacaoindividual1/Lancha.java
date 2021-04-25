/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaoindividual1;

/**
 *
 * @author JorUge
 */
public class Lancha extends EmbarcacaoPequenoPorte{
    
    
   @Override
   protected double valorDesconto(){
        this.setPorcentagemDesconto(12.0);
        return  (this.getPorcentagemDesconto()/100) * this.getPreco();    
    }
    
}
