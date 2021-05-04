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
public class Iate extends Embarcacao {

    private int numeroTripulantes;
    private double peso;
    private int numeroCabines;
    private boolean piscina;

    // Construtores
    // 1/10 - Construtor vazio.
    public Iate() {
    }

    // 2/10 - Atributos do tipo Texto
    public Iate(String marca, String modelo, String cor, String identificacao) {
        super(marca, modelo, cor, identificacao);
    }

    // 3/10 - Atributos do tipo inteiro
    public Iate(int numeroPassageiros, int velocidadeMaxima, int numeroTripulantes, int numeroCabines) {
        super(numeroPassageiros, velocidadeMaxima);
        this.numeroTripulantes = numeroTripulantes;
        this.numeroCabines = numeroCabines;

    }

    // 4/10 - Atributos do tipo real
    public Iate(double preco, double alturaCalado, double peso) {
        super(preco, alturaCalado);
        this.peso = peso;
    }

    // 5/10 - Todos atributos
    public Iate(
            String marca,
            String modelo,
            String cor,
            int numeroPassageiros,
            double preco,
            int velocidadeMaxima,
            double alturaCalado,
            String identificacao,
            int numeroTripulantes,
            double peso,
            int numeroCabines,
            boolean piscina
    ) {
        super(marca, modelo, cor, numeroPassageiros, preco, velocidadeMaxima, alturaCalado, identificacao);
        this.numeroCabines = numeroCabines;
        this.numeroTripulantes = numeroTripulantes;
        this.peso = peso;
        this.piscina = piscina;
    }

    // 6/10 - Atributos Físicos/Técnicos 
    public Iate(
            String cor,
            int numeroPassageiros,
            int velocidadeMaxima,
            double alturaCalado,
            int numeroTripulantes,
            double peso
    ) {
        super(cor, numeroPassageiros, velocidadeMaxima, alturaCalado);
        this.numeroTripulantes = numeroTripulantes;
        this.peso = peso;
    }

    // 7/10 - Atributos administrivos e comerciais 
    public Iate(
            String marca,
            String modelo,
            int numeroPassageiros,
            double preco,
            int velocidadeMaxima,
            double alturaCalado,
            String identificacao,
            int numeroTripulantes,
            double peso,
            int numeroCabines,
            boolean piscina
    ) {
        super(marca, modelo, numeroPassageiros, preco, velocidadeMaxima, alturaCalado, identificacao);
        this.numeroCabines = numeroCabines;
        this.numeroTripulantes = numeroTripulantes;
        this.peso = peso;
        this.piscina = piscina;
    }

    // 8/10 - Atributos comerciais
    public Iate(
            String marca,
            String modelo,
            int numeroPassageiros,
            double preco,
            int velocidadeMaxima,
            double alturaCalado,
            int numeroTripulantes,
            int numeroCabines,
            boolean piscina
    ) {
        super(marca, modelo, numeroPassageiros, preco, velocidadeMaxima, alturaCalado);
        this.numeroCabines = numeroCabines;
        this.numeroTripulantes = numeroTripulantes;
        this.piscina = piscina;
    }

    // 9/10 - Atributos operacionais
    public Iate(
            int numeroPassageiros,
            int velocidadeMaxima,
            double alturaCalado,
            String identificacao,
            int numeroTripulantes,
            double peso
    ) {
        super(numeroPassageiros, velocidadeMaxima, alturaCalado, identificacao);
        this.numeroTripulantes = numeroTripulantes;
        this.peso = peso;
    }

    // 10/10 - Atributos numéricos
    public Iate(
            int numeroPassageiros,
            double preco,
            int velocidadeMaxima,
            double alturaCalado,
            int numeroTripulantes,
            double peso,
            int numeroCabines
    ) {
        super(numeroPassageiros, preco, velocidadeMaxima, alturaCalado);
        this.numeroTripulantes = numeroTripulantes;
        this.peso = peso;
        this.numeroCabines = numeroCabines;

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
