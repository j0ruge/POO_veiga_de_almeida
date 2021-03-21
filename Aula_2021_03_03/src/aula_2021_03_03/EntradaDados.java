/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula_2021_03_03;

import java.util.Scanner;
public class EntradaDados {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String matricula, nome;
       double nota1, nota2;
       int idade; 
       System.out.println("Entre com a Matricula.......: ");
       matricula=(sc.nextLine());
       System.out.println("Entre com o Nome............: ");
       nome=(sc.nextLine());
       System.out.println("Entre com a Nota A1.........: ");
       nota1=(Double.parseDouble(sc.nextLine()));
       System.out.println("Entre com a Nota A2.........: ");
       nota2=(Double.parseDouble(sc.nextLine()));
       System.out.println("Entre com a Idade  .........: ");
       idade=(Integer.parseInt(sc.nextLine()));
       System.out.println("Matrícula:  " + matricula);
       // System.out.println("Nome:  " + nome + " Nota 1: " + nota1);
       System.out.printf("\nNome: %s  Nota 1: %.1f ", nome, nota1);
       System.out.println("Nota 2: " + nota2 + " Idade : " + idade);
       System.out.println("Media: " + (nota1 + nota2 )/2  );
    }
}