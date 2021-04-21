/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_aula_07;

import java.util.Scanner;

/**
 *
 * @author jorge.ferrari
 */
public class SuperClasse {
      // Atributos
    String art1;
    double atr2;
    
    //Construtores
    public SuperClasse(){};  
    
    public SuperClasse(String s){
        setArt1(s);
    };
    
    public SuperClasse(double d){
        setAtr2(d);
    }
    
    public SuperClasse(String s, double d){
        setArt1(s);
        setAtr2(d);
    }; 
    
    public SuperClasse(double d, String s ){
        setArt1(s);
        setAtr2(d);
    }; 
    
    // Métodos de Acesso
    public void setArt1(String art1) {
        this.art1 = art1;
    }    

    public void setAtr2(double atr2) {
        this.atr2 = atr2;
    }        
    
    public String getArt1() {
        return art1;
    }

    public double getAtr2() {
        return atr2;
    }        
    
    // métodos extras
    public void entrada() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Atributo 1: ");
        setArt1(ent.nextLine());
        System.out.println("Atributo 2: ");
        setAtr2(Double.parseDouble(ent.nextLine()));
    }    
    
    public void imprimir(){
        System.out.println("Atributo 1  : " + getArt1());
        System.out.println("Atributo 2  : " + getAtr2());
    }
    
    public void cadastrar(String a, double b) {
        setArt1(a);
        setAtr2(b);
    }
    
    
}
