/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaoindividual1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
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
    
    protected double porcentagemDesconto;

    
    // Construtores

    // 1/10 - Construtor vazio.
    public Embarcacao() {
        
    }
    
    // 2/10 - Atributos do tipo Texto
    public Embarcacao(String marca, String modelo, String cor, String identificacao){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.identificacao = identificacao;
    
    }
    
    // 3/10 - Atributos do tipo inteiro
    public Embarcacao(int numeroPassageiros, int velocidadeMaxima ) {
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
    };
    
    
    // 4/10 - Atributos do tipo real
    public Embarcacao(double preco, double alturaCalado){
        this.preco = preco;
        this.alturaCalado = alturaCalado;
    };
    
    // 5/10 - Todos atributos
    public Embarcacao(
            String marca, 
            String modelo, 
            String cor, 
            int numeroPassageiros,             
            double preco,  
            int velocidadeMaxima, 
            double alturaCalado,
            String identificacao ){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.identificacao = identificacao;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
        this.alturaCalado = alturaCalado;
        
    };
    
    
    // 6/10 - Atributos Físicos/Técnicos 
    public Embarcacao(
                        String cor, 
                        int numeroPassageiros, 
                        int velocidadeMaxima, 
                        double alturaCalado ){
        this.cor = cor;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.alturaCalado = alturaCalado;
    
    };
    
    
    // 7/10 - Atributos administrivos e comerciais 
    public Embarcacao(
                    String marca, 
                    String modelo,     
                    int numeroPassageiros,
                    double preco,
                    int velocidadeMaxima, 
                    double alturaCalado,
                    String identificacao
    ) {
        this.marca = marca;
        this.modelo = modelo;
        this.identificacao = identificacao;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
        this.alturaCalado = alturaCalado;
    }
    
    // 8/10 - Atributos comerciais
    public Embarcacao(
                    String marca, 
                    String modelo,     
                    int numeroPassageiros,
                    double preco,
                    int velocidadeMaxima, 
                    double alturaCalado
                    
    ) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
        this.alturaCalado = alturaCalado;
    }
    

    // 9/10 - Atributos operacionais
    public Embarcacao(
            int numeroPassageiros, 
            int velocidadeMaxima, 
            double alturaCalado,
            String identificacao ) {
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.alturaCalado = alturaCalado;
        this.identificacao = identificacao;  
        
    };  
    
    
    // 10/10 - Atributos numéricos
    
    public Embarcacao(
            int numeroPassageiros, 
            double preco,
            int velocidadeMaxima,             
            double alturaCalado
    ){
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
        this.velocidadeMaxima = velocidadeMaxima;
        this.alturaCalado = alturaCalado;
    
    }
    
    public Embarcacao(int numeroPassageiros){
    this.numeroPassageiros = numeroPassageiros;
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

    protected void setPorcentagemDesconto(double porcentagemDesconto) {
        this.porcentagemDesconto = porcentagemDesconto;
    }    
    
    protected double getPorcentagemDesconto() {
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
        System.out.println("Preço            : R$ " +  String.format(Locale.GERMAN,"%,.2f", getPreco() ));
        System.out.println("Velocidade (max) : " + getVelocidadeMaxima() + " Nós [kn, kt] -> equivalente a " + nosEmQuiloetroHora() + " [km/h]");
        System.out.println("Calado           : " + getAlturaCalado() + " metros");
        System.out.println("Identificação    : " + getIdentificacao());
        
    }  
    
    public void cadastrar(
            String marca, 
            String modelo, 
            String cor, 
            int numeroPassageiros,             
            double preco,  
            int velocidadeMaxima, 
            double alturaCalado,
            String identificacao
    
    )    
    {
        setMarca(marca);
        setModelo(modelo);
        setCor(cor);
        setNumeroPassageiros(numeroPassageiros);
        setPreco(preco);
        setVelocidadeMaxima(velocidadeMaxima);
        setAlturaCalado(alturaCalado);
        setIdentificacao(identificacao);
    
    };
    
            
    protected double valorDesconto(double porcentagemDesconto){        
        this.setPorcentagemDesconto(porcentagemDesconto);    
        return  (this.getPorcentagemDesconto()/100) * this.getPreco();        
    }
    
}
