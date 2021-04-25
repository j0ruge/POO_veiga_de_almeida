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
public class AvaliacaoIndividual1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Iate i1 = new Iate();
        
        
        // i1.entrada();
        
        
        i1.imprimir();
        
        i1.setPreco(1000.0);
        
        System.out.println("Valor Desconto :" + i1.valorDesconto());;
    }
    
}
