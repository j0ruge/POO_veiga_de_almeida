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
public class Peixe extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    };

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    };   
    
    
    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    };
    
    @Override
    public void emitirSom(){
        System.out.println("...");
    };
    
    @Override
    public void alimentar() {
        System.out.println("Comento substâncias");
    };
    
    public void locomover() {
        System.out.println("Nadando");
    };
    
    
}
