/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Carro para Atividade Avaliativa 2 
 * User: j0ruge 
 * Date: 2020/06/22
 *
 * @author JorUge
 * @link https://github.com/j0ruge/POO_veiga_de_almeida/tree/main/AvaliacaoIndividual2
 */
public class Carro extends MeioTransporte {

    protected String placa;
    Motor motor; 
    
    // <editor-fold defaultstate="collapsed" desc=" Construtores ">

// 1/5 - Construtor vazio.
    public Carro() {
    }    
    
    // 2/5 - Atributos do tipo Texto
    public Carro(String marca, String modelo, String cor, String placa) {
        super(marca, modelo, cor);
        this.placa = placa;
    }

    
    
    // 3/5 - Atributos do tipo real 
    
    public Carro(double comprimento, double largura, double preco) {
        super(comprimento, largura, preco);
    }
     
    // 4/5 - Todos atributos
    
    public Carro(
            String marca,
            String modelo,
            String cor,
            String placa,
            double comprimento,
            double largura,
            double preco,
            double motorPeso,
            int motorRPM,
            int motorVelocidade,
            String motorTipo,
            double motorPreco
    ) {
        super(marca, modelo, cor, comprimento, largura, preco);
        this.placa = placa;
        motor = new Motor(motorPeso, motorRPM, motorVelocidade, motorTipo, motorPreco);
    }    
    
     // 5/5 - Atributos comerciais
    public Carro(double preco) {
        super(preco);

    }

    // </editor-fold>
            
    // <editor-fold defaultstate="collapsed" desc=" Métodos de Acesso ">
  
    
    public void setPlaca(String placa) {

        if (placa.isEmpty()) {

            throw new IllegalArgumentException("Preechimento obrigatório da Placa!");
        } else {
            this.placa = placa;

        }

    }

    public String getPlaca() {
        return placa;
    }
    

    // </editor-fold>
        
    // <editor-fold defaultstate="collapsed" desc=" Métodos extras ">

    @Override
    public double valorDesconto() {

        double desconto = (0.15 * this.getPreco());

        return this.getPreco() - desconto;
    }

    @Override
    public void entradaDados() {
        motor = new Motor();
        Scanner input = new Scanner(System.in);
        boolean continua = true;

        super.entradaDados();

        do {

            try {
                System.out.print("Placa        : ");
                setPlaca(input.nextLine());               

                continua = false;

            } catch (Exception exception) {
                System.err.println("Erro de operação, dado da Placa invalidado!");
                System.out.println("Detalhes do Erro: " + exception.getMessage());
            }

        } while (continua);
        
       motor.entradaDados();

    }

        
    @Override
    public void imprimir() {
        super.imprimir();

        System.out.println("Placa         : " + getPlaca());
        motor.imprimir();

    }

    // </editor-fold>  

}
