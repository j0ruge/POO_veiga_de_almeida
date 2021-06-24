package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

/**
 * MeioTransporte para Atividade Avaliativa 2 User: j0ruge Date: 2020/06/21
 *
 * @author JorUge
 * @link https://github.com/j0ruge/POO_veiga_de_almeida/tree/main/AvaliacaoIndividual2
 */
public abstract class MeioTransporte {

    protected String marca;
    protected String modelo;
    protected String cor;
    protected double comprimento;
    protected double largura;
    protected double preco;
    
    // <editor-fold defaultstate="collapsed" desc=" Construtores ">

    
    // 1/8 - Construtor vazio.
    protected MeioTransporte() {
    }    
        
    // 2/8 - Atributos do tipo Texto
    protected MeioTransporte(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;

    }

    // 3/8 - Atributos do tipo real
    protected MeioTransporte(double comprimento, double largura, double preco) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.preco = preco;
    }

    
    // 4/8 - Todos atributos
    protected MeioTransporte(
            String marca,
            String modelo,
            String cor,
            double comprimento,
            double largura,
            double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.comprimento = comprimento;
        this.largura = largura;
        this.preco = preco;

    }   
    
    
    // 5/8 - Atributos Marca e Modelo 
    protected MeioTransporte(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }   
    
    
    // 6/8 - Atributo estético 
    protected MeioTransporte(String cor) {
        this.cor = cor;
    }

    // 7/8 - Atributos de dimensão
    protected MeioTransporte(
            double comprimento,
            double largura
    ) {
        this.comprimento = comprimento;
        this.largura = largura;

    }

    // 8/8 - Atributos comerciais
    protected MeioTransporte(double preco) {
        this.preco = preco;

    }      

    // </editor-fold>    
    
    // <editor-fold defaultstate="collapsed" desc=" Métodos de Acesso ">

	public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        
        if (marca.isEmpty()) {

            throw new IllegalArgumentException("Preechimento obrigatório da marca!");
        } else {
            this.marca = marca;

        }   
        
       
    }

    public String getModelo() {
        return modelo;
        
    }

    public void setModelo(String modelo) {

        if (modelo.isEmpty()) {

            throw new IllegalArgumentException("Preechimento obrigatório do modelo!");
        } else {
            this.modelo = modelo;

        }

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {        
        
        if (cor.isEmpty()) {

            throw new IllegalArgumentException("Preechimento obrigatório da cor!");
        } else {
            this.cor = cor;

        }
        
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {

        if (preco <= 0) {
            throw new IllegalArgumentException("O preço deve ser positivo!");
        } else {
            this.preco = preco;
        }

    }

    // </editor-fold>   
            
    // <editor-fold defaultstate="collapsed" desc=" Métodos extras ">

    public abstract double valorDesconto();

    protected void entradaDados() {
        Scanner input = new Scanner(System.in);
        boolean continua = true;

        do {

            try {
                System.out.println("");
                System.out.println("INSIRA OS DADOS SOLICITADOS:");

                System.out.print("Marca        : ");
                setMarca(input.nextLine());

                System.out.print("Modelo       : ");
                setModelo(input.nextLine());

                System.out.print("Cor          : ");
                setCor(input.nextLine());

                System.out.print("Comprimento  : ");
                setComprimento(Double.parseDouble(input.nextLine()));

                System.out.print("Largura      : ");
                setLargura(Double.parseDouble(input.nextLine()));

                System.out.print("Preço        : ");
                setPreco(Double.parseDouble(input.nextLine()));

                continua = false;

            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("\nException: %s\n", inputMismatchException);
                System.out.println("Deve - se entrar com numeros reais. Tente de novo.\n");
            } catch (NumberFormatException numberFormatException) {
                System.err.printf("\nException: %s\n", numberFormatException);
                System.out.println("Somente números são aceitos!");

            } catch (Exception e) {
                System.err.println("Erro de operação, dados invalidados!");
                System.out.println(e.getMessage());
            }

        } while (continua);
    }

    public void imprimir() {

        System.out.println("");
        System.out.println("::::VALORES CADASTRADOS::::");
        System.out.println("Marca         : " + getMarca());
        System.out.println("Modelo        : " + getModelo());
        System.out.println("Cor           : " + getCor());
        System.out.println("Comprimento   : " + String.format(Locale.GERMAN, "%,.2f", getComprimento()) + " m");
        System.out.println("Largura       : " + String.format(Locale.GERMAN, "%,.2f", getLargura()) + " m");
        System.out.println("Preço         : R$ " + String.format(Locale.GERMAN, "%,.2f", getPreco()));

    }
    
    public void cadastrar(
                
            String marca,
            String modelo,
            String cor,
            double comprimento,
            double largura,
            double preco
    ){
            setMarca(marca);
            setModelo(modelo);
            setCor(cor);
            setComprimento(comprimento);
            setLargura(largura);
            setPreco(preco);
    }
	

    // </editor-fold>    
    
}