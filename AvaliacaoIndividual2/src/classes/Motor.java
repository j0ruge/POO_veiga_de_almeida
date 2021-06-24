/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jorge.ferrari
 */
public class Motor {

    private double peso;
    private int rpm;
    private int velocidade;
    private String tipo;
    private double preco;

    // <editor-fold defaultstate="collapsed" desc=" Construtores ">
    // 1/5 - Construtor vazio.
    public Motor() {
    }

    ;
    
        
    // 2/5 - Atributos do tipo Texto
    public Motor(String tipo) {
        this.tipo = tipo;

    }

    ;

    // 3/5 - Atributos do tipo real
    public Motor(double peso, double preco) {
        this.peso = peso;
        this.preco = preco;
    }

    ;
    
    // 4/5 - Todos atributos
    public Motor(
            double peso,
            int rpm,
            int velocidade,
            String tipo,
            double preco) {
        this.peso = peso;
        this.rpm = rpm;
        this.velocidade = velocidade;
        this.tipo = tipo;
        this.preco = preco;
    }

    ;
    
    
    // 5/5 - Atributos comerciais
    public Motor(double preco) {
        this.preco = preco;
    }

    ;    
    

    // </editor-fold>

    
    // <editor-fold defaultstate="collapsed" desc=" Métodos de Acesso ">
      
    
    // <editor-fold defaultstate="collapsed" desc=" Getters ">

public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {

        if (peso <= 0) {
            throw new IllegalArgumentException("O peso deve ser um valor positivo!");
        } else {
            this.peso = peso;
        }

    }
    
    public int getRpm() {
        return rpm;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    // </editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc=" Setters ">

    public void setRpm(int rpm) {

        if (rpm <= 0) {
            throw new IllegalArgumentException("O RPM deve ser positivo!");
        } else {
            this.rpm = rpm;
        }

    }

    public void setVelocidade(int velocidade) {

        if (velocidade <= 0) {
            throw new IllegalArgumentException("O RPM deve ser positivo!");
        } else {
            this.velocidade = velocidade;
        }

    }

    public void setTipo(String tipo) {

        if (tipo.isEmpty()) {

            throw new IllegalArgumentException("Preechimento obrigatório do tipo!");
        } else {
            this.tipo = tipo;

        }

    }

    public void setPreco(double preco) {

        if (preco <= 0) {
            throw new IllegalArgumentException("O preço deve ser positivo!");
        } else {
            this.preco = preco;
        }
    }
    
    // </editor-fold>
    
    
    // </editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc=" Métodos extras ">
    public void cadastrar(
            double peso,
            int rpm,
            int velocidade,
            String tipo,
            double preco) {
        setPeso(peso);
        setRpm(rpm);
        setVelocidade(velocidade);
        setTipo(tipo);
        setPreco(preco);
    }

    
    
    public void imprimir() {

        System.out.println("");
        System.out.println("::::MOTOR::::");
        System.out.println("Peso         : " + String.format(Locale.GERMAN, "%,.3f", getPeso()) + " kg");
        System.out.println("RPM          : " + getRpm());
        System.out.println("Velocidade   : " + getVelocidade() + " km/h");
        System.out.println("Tipo         : " + getTipo());
        System.out.println("Preço        : R$ " + String.format(Locale.GERMAN, "%,.2f", getPreco()));

    }

    public void entradaDados() {
        Scanner input = new Scanner(System.in);
        boolean continua = true;

        do {

            try {
                System.out.println("");
                System.out.println("INSIRA OS DADOS DO MOTOR:");

                System.out.print("Peso (Kg)          : ");
                setPeso(Double.parseDouble(input.nextLine()));

                System.out.print("RPM                : ");
                setRpm(Integer.parseInt(input.nextLine()));

                System.out.print("Velocidade (Km/h)  : ");
                setVelocidade(Integer.parseInt(input.nextLine()));

                System.out.print("Tipo (combustível) : ");
                setTipo(input.nextLine());

                System.out.print("Preço (BRL)        : ");
                setPreco(Double.parseDouble(input.nextLine()));

                continua = false;

            } catch (InputMismatchException inputMismatchException) {

                System.err.printf("\nException: %s\n", inputMismatchException);
                System.out.println("Deve - se entrar com numeros reais. Tente de novo.\n");

            } catch (NumberFormatException numberFormatException) {

                System.err.println("Dados invalidados, digite novamente");
                System.out.println("Somente números são aceitos!");
                System.out.println(numberFormatException.getMessage());

            } catch (Exception exception) {

                System.err.println("Erro de operação, dados invalidados!");
                System.out.println(exception.getMessage());
            }

        } while (continua);
    }

// </editor-fold>
}
