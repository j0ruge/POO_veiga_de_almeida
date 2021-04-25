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
abstract class  Animal {
    
    protected double peso;
    protected int idade;
    protected int membros;

    public int getIdade() {
        return idade;
    }

    public int getMembros() {
        return membros;
    }

    public double getPeso() {
        return peso;
    }  

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }   
    
    
    public abstract void locomover();
    
    public abstract void alimentar();
    
    public abstract void emitirSom();
    
    
}
