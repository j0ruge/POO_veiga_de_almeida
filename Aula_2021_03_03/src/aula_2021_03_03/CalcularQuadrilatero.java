/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula_2021_03_03;

/**
 *
 * @author JorUge
 */

import java.util.Scanner;
public class CalcularQuadrilatero {
public static void main(String[] args) {
       Scanner handleInputData = new Scanner(System.in);
       double height, width, depth, area, volume;
       
       System.out.println("APLICAÇÃO PARA CÁLCULO DE QUADRILÁTEROS:");
       System.out.println("");
       System.out.println("Favor informar:");

       System.out.println("Largura: ");
       width=(Double.parseDouble( handleInputData.nextLine() ));

       System.out.println("Altura: ");
       height=(Double.parseDouble( handleInputData.nextLine() ));


       System.out.println("Profundidade: ");
       depth=(Double.parseDouble( handleInputData.nextLine() ));

       
       area = width * height;
       volume = area * depth;

       System.out.println("");   
       System.out.printf(":::::RESULTADOS:::::");
   
       System.out.printf("\nÁrea: %.1f ", area);
       System.out.printf("\nVolume: %.1f ", volume);
       System.out.println("");   
    }
}
