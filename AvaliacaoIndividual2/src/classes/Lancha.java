/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 * Carro para Atividade Avaliativa 2 
 * User: j0ruge 
 * Date: 2020/06/24
 *
 * @author JorUge
 * @link https://github.com/j0ruge/POO_veiga_de_almeida/tree/main/AvaliacaoIndividual2
 */
public class Lancha extends MeioTransporte{
    
    
     protected String nome;
     Motor motor1;
     Motor motor2;     
    
    
    // <editor-fold defaultstate="collapsed" desc=" Construtores  ">

	

    // </editor-fold>    
    
    
    // <editor-fold defaultstate="collapsed" desc=" Métodos de Acesso  ">

	

    // </editor-fold>     
    
    // <editor-fold defaultstate="collapsed" desc=" Métodos extras  ">

    @Override
    public double valorDesconto() {
         double desconto = (0.1 * this.getPreco());

        return this.getPreco() - desconto;
    }

    // </editor-fold>    
    

    
    
}
