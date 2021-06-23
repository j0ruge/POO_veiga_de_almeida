/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 * Carro para Atividade Avaliativa 2
 * User: j0ruge
 * Date: 2020/06/22 
 * @author JorUge
 * @link https://github.com/j0ruge/POO_veiga_de_almeida/tree/main/AvaliacaoIndividual2
 */
public class Carro extends MeioTransporte{
    
    protected String placa;
    
    
    // Construtores
    
    // 1/5 - Construtor vazio.
    public Carro(){};
    
    // 2/5 - Atributos do tipo Texto
    public Carro(String marca, String modelo, String cor, String placa ){
        super(marca, modelo, cor);
        this.placa = placa;
    };
    
    // 3/5 - Atributos do tipo real 
    
    public Carro(double comprimento, double largura, double preco){
        super(comprimento, largura, preco);    
    };
    
    // 4/5 - Todos atributos
    
    public Carro(
            String marca,
            String modelo,
            String cor,
            String placa,
            double comprimento,
            double largura,
            double preco
    
    ){
    super(marca, modelo, cor, comprimento, largura, preco);
        this.placa = placa;    
    };
    
     // 5/5 - Atributos comerciais
    public Carro(double preco) {
        super(preco);
        
    };
    
    // Métodos de Acesso  
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }
            
    
    // Métodos extras
    
    @Override
    public double valorDesconto(){   
        
        double desconto = ( 0.15 * this.getPreco());
        
        return  this.getPreco() -  desconto;        
    }
    
    
}
