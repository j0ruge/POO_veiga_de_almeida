/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2021_04_14;

import exercicio_aula_07.ClasseA;

/**
 *
 * @author jorge.ferrari
 */
public class Aula_2021_04_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Classe c1 = new Classe();
        Classe c2 = new Classe();
        Classe c3 = new Classe();
        
        c1.a=4;
        c1.b=5;
        c2.a=6;
        c2.b=7;
        c3.a=8;
        c3.b=9;
        
        System.out.println("C1.a = " + c1.a + " C1.b = " + c1.b);
        System.out.println("C2.a = " + c2.a + " C2.b = " + c2.b);
        System.out.println("C3.a = " + c3.a + " C3.b = " + c3.b);
        */
        
        Acoes a1 = new Acoes();
        Acoes a2 = new Acoes();
        Acoes a3 = new Acoes();
        
        a1.dolar=5.65;
        a1.valor=100;
        a1.quantidade=10;
        
        a2.dolar=5.65;
        a2.valor=200;
        a2.quantidade=5;
        
        a3.dolar=5.66;
        a3.valor=500;
        a3.quantidade=15;
        
        
        
        System.out.println("A1 Valor  " + a1.valor + " A1 quantidade " + a1.quantidade + "A1 dolar " + a1.dolar + " Total= " + a1.dolar*a1.quantidade*a1.valor );
        
        
        
        ClasseA teste = new ClasseA("GabirU", 23.4, 34.8);
        
        //teste.entrada();
        
        teste.imprimir();
        
        
    }
    
}
