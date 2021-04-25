/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudo;

/**
 *
 * @author JorUge
 */
public class Caneta {
   public String modelo;
   public String cor;
   private double ponta;
   protected int carga;
   protected boolean tampada;
    
    public void escrever(){
        System.out.println("Escrevendo...");
    };
    
    public void rabiscar(){
        System.out.println("Rabiscando...");
    };
    
    private void pintar() {
        System.out.println("estudo.Caneta.pintar()");
    }
    
    private void destampar() {
    
        System.out.println("estudo.Caneta.destampar()");
    
    }
    
}
