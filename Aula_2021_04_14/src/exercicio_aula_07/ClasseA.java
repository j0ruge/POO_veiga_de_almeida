/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_aula_07;

/**
 *
 * @author jorge.ferrari
 */
public class ClasseA extends SuperClasse{
    
    // Atributos
    double atr3;    
    
    // Construtores
    public ClasseA(){       
    };
    
    public ClasseA(String a, double b) {
        super(a, b);
    };
    
    public ClasseA(double d, String s) {
        super(d, s);
    };
    
    public ClasseA(String a, double b, double c){ 
        super(a, b);       
        setAtr3(c);
        
    };        
    
    public void setAtr3(double atr3) {
        this.atr3 = atr3;
    }

    public double getAtr3() {
        return atr3;
    }
    
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Atributo 3 : " + getAtr3());
    }
    
    
    
    
}
