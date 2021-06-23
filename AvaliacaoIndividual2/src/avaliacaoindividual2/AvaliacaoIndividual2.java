/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaoindividual2;

import classes.Carro;
import classes.MeioTransporte;

/**
 *
 * @author JorUge
 */
public class AvaliacaoIndividual2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MeioTransporte c1 = new Carro();
        
        c1.setPreco(25000.32);
        
        
        
        System.out.println(c1.getPreco());
        
        System.out.println(c1.valorDesconto());
    }
    
}
