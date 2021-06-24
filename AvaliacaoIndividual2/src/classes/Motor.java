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
    
    
    // Construtores
    // 1/5 - Construtor vazio.
    public Motor() {
    };
    
        
    // 2/5 - Atributos do tipo Texto
    public Motor(String tipo) {
        this.tipo = tipo;        

    };

    // 3/5 - Atributos do tipo real
    public Motor(double peso, double preco) {
        this.peso = peso;
        this.preco = preco;
    };
    
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
    };
    
    
    // 5/5 - Atributos comerciais
    public Motor(double preco) {
        this.preco = preco;
    };    
    
    
    // Métodos de Acesso 
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        
        
         if (peso <= 0) {
            throw new IllegalArgumentException("O peso deve ser positivo!");
        } else {
            this.peso = peso;
        }       
        
        
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        
         if (rpm <= 0) {
            throw new IllegalArgumentException("O RPM deve ser positivo!");
        } else {
            this.rpm = rpm;
        }  
        
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        
        if (velocidade <= 0) {
            throw new IllegalArgumentException("O RPM deve ser positivo!");
        } else {
            this.velocidade = velocidade;
        }  
        
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {        
        
        
        if (tipo.isEmpty()) {

            throw new IllegalArgumentException("Preechimento obrigatório do tipo!");
        } else {
            this.tipo = tipo;

        }     
        
        
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
    
    
    // Métodos extras
    
    public void Cadastrar(
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
    };
    
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
                System.out.println("INSIRA OS DADOS SOLICITADOS:");

                System.out.print("Peso         : ");
                setPeso(Double.parseDouble(input.nextLine()));

                System.out.print("RPM          : ");
                setRpm(Integer.parseInt(input.nextLine()));

                System.out.print("Velocidade   : ");
                setVelocidade(Integer.parseInt(input.nextLine()));

                System.out.print("Tipo         : ");
                setTipo(input.nextLine());                

                System.out.print("Preço        : ");
                setPreco(Double.parseDouble(input.nextLine()));

                continua = false;

            } catch (InputMismatchException inputMismatchException) {
                
                System.err.printf("\nException: %s\n", inputMismatchException);
                System.out.println("Deve - se entrar com numeros reais. Tente de novo.\n");
                
            } catch (NumberFormatException numberFormatException) {
                
                System.out.println("Dados inválidos, somente números são aceitos!");
                System.out.println(numberFormatException.getMessage());

            } catch (Exception e) {
                
                System.out.println("Erro de operação, dados invalidados!");
                System.out.println(e.getMessage());
            }

        } while (continua);
    }
    
    
    
    
    
}
