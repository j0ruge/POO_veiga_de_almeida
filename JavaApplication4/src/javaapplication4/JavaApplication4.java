/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import tools.RuleOfThree;

/**
 *
 * @author JorUge
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       RuleOfThree cabos = new RuleOfThree();
        
       cabos.inputData();
       
       //double resultado = 
       
       
        System.out.println( cabos.RuleOfThree( cabos.getX1(), (cabos.getX2()  - 54.0), cabos.getY1()) );
        
    }

}
