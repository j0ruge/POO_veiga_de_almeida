/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaoindividual1;

import java.util.Scanner;

/**
 *
 * @author JorUge
 */
public class Embarcacao {
    
    private String marca;
    private String modelo;
    private String cor;
    private int numeroPassageiros;
    private double preco;
    private int velocidadeMaxima;
    private double alturaCalado;
    private String identificacao;
    private double porcentagemDesconto;

    
    // Construtores

    public Embarcacao() {
        
    }
    
        
    
    // Métodos de Acesso    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getAlturaCalado() {
        return alturaCalado;
    }

    public void setAlturaCalado(double alturaCalado) {
        this.alturaCalado = alturaCalado;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public void setPorcentagemDesconto(double porcentagemDesconto) {
        this.porcentagemDesconto = porcentagemDesconto;
    }    
    
    public double getPorcentagemDesconto() {
        return porcentagemDesconto;
    }
    
    
    
    
    // Métodos extras
    
    public void entrada() {
        System.out.println("");
        System.out.println("INSIRA OS DADOS SOLICITADOS:");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Marca             : ");
        setMarca(input.nextLine());    
        
        System.out.print("Modelo            : ");
        setModelo(input.nextLine());
        
        System.out.print("Cor               : ");
        setCor(input.nextLine());
        
        System.out.print("Passageiros (qtd) : ");
        setNumeroPassageiros(Integer.parseInt(input.nextLine()));
        
        System.out.print("Preço             : ");
        setPreco(Double.parseDouble(input.nextLine()));
        
        System.out.print("Velocidade (max)  : ");
        setVelocidadeMaxima(Integer.parseInt(input.nextLine()));
        
        System.out.print("Calado (altura)    : ");
        setAlturaCalado(Double.parseDouble(input.nextLine()));
        
        System.out.print("Identificação      : ");
        setIdentificacao(input.nextLine());        
    
    }
    
    
    protected double nosEmQuiloetroHora(){
        return Math.round(
                (this.getVelocidadeMaxima() * (1.8519984)) * 100.0
        ) / 100.0;
    }
    
    public void imprimir(){
        
        System.out.println("");
        System.out.println("::::VALORES CADASTRADOS::::");
        System.out.println("Marca            : " + getMarca());
        System.out.println("Modelo           : " + getModelo());
        System.out.println("Cor              : " + getCor());
        System.out.println("Passageiros      : " + getNumeroPassageiros());
        System.out.println("Preço            : $" + getPreco());
        System.out.println("Velocidade (max) : " + getVelocidadeMaxima() + " Nós [kn, kt] -> equivalente a " + nosEmQuiloetroHora() + " [km/h]");
        System.out.println("Calado           : " + getAlturaCalado() + " metros");
        System.out.println("Identificação    : " + getIdentificacao());
        
    }  
    
    
    protected double valorDesconto(){
        this.setPorcentagemDesconto(10.0);
        return  (this.getPorcentagemDesconto()/100) * this.getPreco();    
    }
    
    
    
}
