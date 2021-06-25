/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;

/**
 * Lancha para Atividade Avaliativa 2 User: j0ruge Date: 2020/06/24
 *
 * @author JorUge
 * @link https://github.com/j0ruge/POO_veiga_de_almeida/tree/main/AvaliacaoIndividual2
 */
public class Lancha extends MeioTransporte {

    protected String nome;
    Motor motor1;
    Motor motor2;

    // <editor-fold defaultstate="collapsed" desc=" Construtores  ">
    // 1/5 - Construtor vazio.
    public Lancha( ) {
        motor1 = new Motor();
        motor2 = new Motor();
    }

    // 2/5 - Atributos do tipo Texto
    public Lancha(String marca, String modelo, String cor, String nome) {
        super(marca, modelo, cor);
        this.nome = nome;
    }

    // 3/5 - Atributos do tipo real 
    public Lancha(double comprimento, double largura, double preco) {
        super(comprimento, largura, preco);
    }

    // 4/5 - Todos atributos
    public Lancha(
            String marca,
            String modelo,
            String cor,
            String nome,
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
        this.nome = nome;
        motor1 = new Motor(motorPeso, motorRPM, motorVelocidade, motorTipo, motorPreco);
        motor2 = new Motor(motorPeso, motorRPM, motorVelocidade, motorTipo, motorPreco);
    }

    // 5/5 - Atributos comerciais
    public Lancha(double preco) {
        super(preco);

    }

    // </editor-fold>    
    // <editor-fold defaultstate="collapsed" desc=" Métodos de Acesso  ">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nome.isEmpty()) {

            throw new IllegalArgumentException("Preechimento obrigatório de um Nome!");
        } else {
            this.nome = nome;

        }

    }

    // </editor-fold>     
    // <editor-fold defaultstate="collapsed" desc=" Métodos extras  ">
    @Override
    public double valorDesconto() {
        double desconto = (0.1 * this.getPreco());

        return this.getPreco() - desconto;
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.println("Nome          : " + getNome());
        motor1.imprimir();
        motor2.imprimir();

    }

    public void cadastrar(
            String marca,
            String modelo,
            String cor,
            String nome,
            double comprimento,
            double largura,
            double preco,
            double motor1Peso,
            int motor1RPM,
            int motor1Velocidade,
            String motor1Tipo,
            double motor1Preco,
            double motor2Peso,
            int motor2RPM,
            int motor2Velocidade,
            String motor2Tipo,
            double motor2Preco
    ) {

        super.cadastrar(marca, modelo, cor, comprimento, largura, preco);
        setNome(nome);
        motor1 = new Motor(motor1Peso, motor1RPM, motor1Velocidade, motor1Tipo, motor1Preco);
        motor2 = new Motor(motor2Peso, motor2RPM, motor2Velocidade, motor2Tipo, motor2Preco);

    }

    
    @Override
    public void entradaDados() {
        motor1 = new Motor();
        motor2 = new Motor();
        
        Scanner input = new Scanner(System.in);
        boolean continua = true;

        super.entradaDados();

        do {

            try {
                System.out.print("Nome         : ");
                setNome(input.nextLine());               

                continua = false;

            } catch (Exception exception) {
                System.err.println("Erro de operação, dado de Nome invalidado!");
                System.out.println("Detalhes do Erro: " + exception.getMessage());
            }

        } while (continua);
        
       motor1.entradaDados();
       motor2.entradaDados();

    }
    
    // </editor-fold>    
}
