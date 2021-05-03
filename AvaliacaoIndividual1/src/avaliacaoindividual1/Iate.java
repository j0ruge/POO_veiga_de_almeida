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
public class Iate extends Embarcacao{      
      
    private int numeroTripulantes;
    private double peso;
    private int numeroCabines;
    private boolean piscina;
    
    
    
    
    // Construtores
    
    // 1/10 - Construtor vazio.
    public Iate(){  }
    
    
    // 2/10 - Atributos do tipo Texto
    public Iate(String marca, String modelo, String cor, String identificacao){
    super(marca, modelo, cor, identificacao);
    }
    
    
    
    // Métodos de Acesso 

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getNumeroCabines() {
        return numeroCabines;
    }

    public void setNumeroCabines(int numeroCabines) {
        this.numeroCabines = numeroCabines;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }
    
    
        
}
    
    
    

