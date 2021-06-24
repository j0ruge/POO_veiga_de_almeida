/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaoindividual2;

import classes.*;
import java.util.Locale;

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
        
        Lancha l1 = new Lancha();
        
        Lancha lancha[] = new Lancha[1];
        Carro carro[] = new Carro[1];
        Aviao aviao[] = new Aviao[1];
        
                
        
        
       for(int i=0; i<lancha.length; i++){
           
            System.out.println("");
            System.out.println("==> INSIRA DADOS PARA LANCHA "+ (i+1) + " <==" );
            lancha[i] = new Lancha();       
            lancha[i].entradaDados();
        }
       
       for(int i=0; i<lancha.length; i++){
           
            System.out.println("");
            System.out.println("==> DADOS REGISTRADOS PARA LANCHA "+ (i+1) + " <==" );
                  
            lancha[i].imprimir();
            
            System.out.println("");
            System.out.println("::::INFORMAÇÕES ADICIONAIS::::");
            
            System.out.println(
                "Valor com máximo desconto permitido: R$ " +  String.format( Locale.GERMAN,"%,.2f", lancha[i].valorDesconto() )
        );
            
        }
       
        //m1.cadastrar(23, 233, 232, "Biflex", 23);
        //l1.cadastrar("Toyota", "XPTO", "Branca", "GabirU do Mar", 3.10, 2.20, 23456, 23.300, 150, 234, "Diesel", 3456.34, 23.300, 150, 234, "Diesel", 3456.34);
        //l1.imprimir();
//        Carro c3 = new Carro(
//                            "Toyota",
//                            "Corola",
//                            "Prata",
//                            "XPR-9087",
//                            3.10,
//                            2.20,
//                            23456,
//                            234.56,
//                            150,
//                            240,
//                            "Gasolina",
//                            3456
//                       );
        //m1.entradaDados();
        //m1.cadastrar(23.300, 150, 234, "Gasolina", 3456.34);
        //c2.setPreco(0);
        //c2.entradaDados();
        //System.out.println(c1.getPreco());
        //System.out.println(c1.valorDesconto());
        //m1.imprimir();
        //c2.imprimir();
//        c3.imprimir();
    }
    
}
