/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2021_04_07;

import com.sun.javafx.geom.Vec2d;

/**
 *
 * @author JorUge
 */
public class Aula_2021_04_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Veiculo mobilete = new Veiculo(2300.00);
        
        Veiculo moto = new Veiculo();
        
        Veiculo carro = new Veiculo();
        
        
        moto.cadastrar(30, 2, 12000.00);
        
        
        carro.entrada();
        
        
        System.out.println(mobilete.preco);
        
        mobilete.reajustarPreco(10);
        System.out.println(mobilete.preco);
                       
        
        moto.imprimir();
        
    }
    
}
