/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2021_03_17;

import java.util.Scanner;

/**
 *
 * @author jorge.ferrari
 */
public class Aula_2021_03_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ent = new Scanner(System.in);
        
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        Caneta c3 = new Caneta();
        
        c1.setCor("Amarela");
        c1.setTipo("Marcadora");
        c1.setPreco(3.0);
        c1.setQuantidade(1);
        
        
        c2.setCor("Verde");
        c2.setTipo("Desenho");
        c2.setPreco(3.0);
        c2.setQuantidade(1);
        
        c3.setCor("Amarela");
        c3.setTipo("Marcadora");
        c3.setPreco(-5.0);
        c3.setQuantidade(-10);
        
        
        c1.exibir();
        c2.exibir();
        c3.exibir();
              
        
    }
    
}
