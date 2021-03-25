/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2021_03_24;

import java.util.Scanner;

/**
 *
 * @author JorUge
 */
public class Telefone {

    String numero, marca, cor;
    double preco, peso;
    int capacidade;
    
    public void setNumero(String numero) {
        this.numero = numero;
    }    
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getCor() {
        return cor;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public int getCapacidade() {
        return capacidade;
    }
    
    public void imprimir() {
        System.out.println("=================================");
        System.out.println("Numero     : " + getNumero());
        System.out.println("Marca      : " + getMarca());
        System.out.println("Cor        : " + getCor());
        System.out.println("Preco      : " + getPreco());
        System.out.println("Peso       : " + getPeso());
        System.out.println("Capacidade : " + getCapacidade());
        System.out.println("=================================");
    }
    
    public void cadastrar(String numero, String marca, String cor, double preco, double peso, int capacidade) {
        
        setNumero(numero);
        setMarca(marca);
        setCor(cor);
        setPreco(preco);
        setPeso(peso);
        setCapacidade(capacidade);        
        
    }
    
    public void entrada() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira:");
        System.out.println("O número do telefone com DDD :");
        numero = input.nextLine();
        setNumero(numero);
        
        
        System.out.println("O fabricante do aparelho :");
        marca = input.nextLine();
        setMarca(marca);
        
        cor = input.nextLine();
        preco = Double.parseDouble(input.nextLine());
        peso = Double.parseDouble(input.nextLine());
        capacidade = Integer.parseInt(input.nextLine());
               
        
        
        
    }
    
}
