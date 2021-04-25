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
public class Ave extends Animal {
    
    String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }    
    

    @Override
    public void emitirSom() {
        System.out.println("som de Ave");
    };
    
    
    @Override
    public void alimentar() {
        System.out.println("Comento frutas");
    };
    
    public void locomover() {
        System.out.println("Voando");
    }; 

    public void fazerNinho() {
        System.out.println("Construindo um ninho");
    };

}
