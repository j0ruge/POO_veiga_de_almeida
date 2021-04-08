/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2021_04_07;

import java.util.Scanner;

/**
 *
 * @author JorUge
 */
public class Veiculo {
    
    int capacidadeTanque;
    int numeroPassageiros;
    double preco;

    
    
    //Construtores
    
    public Veiculo() {}
    
    public Veiculo( int capacidadeTanque, int numeroPassageiros, double preco ) {
        setCapacidadeTanque(capacidadeTanque);
        setNumeroPassageiros(numeroPassageiros);
        setPreco(preco);
    }
    
    public Veiculo( int capacidadeTanque ) {
        setCapacidadeTanque(capacidadeTanque);        
    }
    
    public Veiculo( double preco ) {
        setPreco(preco);       
    }
    
     public Veiculo( int capacidadeTanque, int numeroPassageiros ) {
        setCapacidadeTanque(capacidadeTanque);
        setNumeroPassageiros(numeroPassageiros);        
     }    
    
    
    // Métodos de Acesso
    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public double getPreco() {
        return preco;
    }
    
    public void cadastrar(int capacidadeTanque, int numeroPassageiros, double preco) {
        setCapacidadeTanque(capacidadeTanque);
        setNumeroPassageiros(numeroPassageiros);
        setPreco(preco);
    }
    
    public void imprimir() {    
        System.out.println("Capacidade do Tanque    : " + getCapacidadeTanque() + "L");
        System.out.println("Número de Passageiros   : " + getNumeroPassageiros());
        System.out.println("Preço                   : R$ " + getPreco() );
    }
    
    
    public void entrada() {
        Scanner entradaDados = new Scanner(System.in);
        
        System.out.println("Capacidade do Tanque    : ");
        setCapacidadeTanque( Integer.parseInt(entradaDados.nextLine()) );
        
        System.out.println("Número de Passageiros    :");
        setNumeroPassageiros( Integer.parseInt(entradaDados.nextLine()) );
        
        System.out.println("Preço                    :");
        setPreco(Double.parseDouble(entradaDados.nextLine()) );
        
    }
    
    
    public void reajustarPreco( double percentual ) {
        
        setPreco( this.preco *  ( 1 + (percentual / 100) ) );                
    }
    
    
}
