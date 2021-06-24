/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;

/**
 * Aviao para Atividade Avaliativa 2 
 * User: j0ruge 
 * Date: 2020/06/24
 *
 * @author JorUge
 * @link https://github.com/j0ruge/POO_veiga_de_almeida/tree/main/AvaliacaoIndividual2
 */
public class Aviao extends MeioTransporte {

    protected String identificacao;
    Motor motor1;
    Motor motor2;
    Motor motor3;
    Motor motor4;

    // <editor-fold defaultstate="collapsed" desc=" Construtores  ">
    // 1/5 - Construtor vazio.
    public Aviao() {
    }

    // 2/5 - Atributos do tipo Texto
    public Aviao(String marca, String modelo, String cor, String identificacao) {
        super(marca, modelo, cor);
        this.identificacao = identificacao;
    }

    // 3/5 - Atributos do tipo real 
    public Aviao(double comprimento, double largura, double preco) {
        super(comprimento, largura, preco);
    }

    // 4/5 - Todos atributos
    public Aviao(
            String marca,
            String modelo,
            String cor,
            String identificacao,
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
        this.identificacao = identificacao;
        motor1 = new Motor(motorPeso, motorRPM, motorVelocidade, motorTipo, motorPreco);
        motor2 = new Motor(motorPeso, motorRPM, motorVelocidade, motorTipo, motorPreco);
    }

    // 5/5 - Atributos comerciais
    public Aviao(double preco) {
        super(preco);

    }

    // </editor-fold>    
    // <editor-fold defaultstate="collapsed" desc=" Métodos de Acesso  ">
    public String getNome() {
        return identificacao;
    }

    public void setNome(String identificacao) {

        if (identificacao.isEmpty()) {

            throw new IllegalArgumentException("Preechimento obrigatório de um Nome!");
        } else {
            this.identificacao = identificacao;

        }

    }

    // </editor-fold>     
    // <editor-fold defaultstate="collapsed" desc=" Métodos extras  ">
    @Override
    public double valorDesconto() {
        double desconto = (0.08 * this.getPreco());

        return this.getPreco() - desconto;
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.println("Identificação : " + getNome());
        motor1.imprimir();
        motor2.imprimir();
        motor3.imprimir();
        motor3.imprimir();

    }

    public void cadastrar(
            String marca,
            String modelo,
            String cor,
            String identificacao,
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
            double motor2Preco,
            
            double motor3Peso,
            int motor3RPM,
            int motor3Velocidade,
            String motor3Tipo,
            double motor3Preco,
            
            double motor4Peso,
            int motor4RPM,
            int motor4Velocidade,
            String motor4Tipo,
            double motor4Preco
            
    ) {

        super.cadastrar(marca, modelo, cor, comprimento, largura, preco);
        setNome(identificacao);
        motor1 = new Motor(motor1Peso, motor1RPM, motor1Velocidade, motor1Tipo, motor1Preco);
        motor2 = new Motor(motor2Peso, motor2RPM, motor2Velocidade, motor2Tipo, motor2Preco);
        motor3 = new Motor(motor3Peso, motor3RPM, motor3Velocidade, motor3Tipo, motor3Preco);
        motor2 = new Motor(motor4Peso, motor4RPM, motor4Velocidade, motor4Tipo, motor4Preco);

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
       motor3.entradaDados();
       motor3.entradaDados();

    }
    
    // </editor-fold>    
}
