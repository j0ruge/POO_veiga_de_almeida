/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaoindividual2;

import classes.*;

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
        Carro c2 = new Carro();
        
        c1.setPreco(25000.32);
        
        Motor m1 = new Motor();
        
        //m1.entradaDados();
        
        m1.Cadastrar(23.300, 150, 234, "Gasolina", 3456.34);
        
        //c2.setPreco(0);
        
        //c2.entradaDados();
        
        System.out.println(c1.getPreco());
        
        System.out.println(c1.valorDesconto());
        
        m1.imprimir();
        
        //c2.imprimir();
    }
    
}
