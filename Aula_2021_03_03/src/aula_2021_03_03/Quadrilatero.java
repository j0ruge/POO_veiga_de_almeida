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

public class Quadrilatero {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double largura, altura, profundidade, area, volume;
System.out.println("Entre com a Largura..............: ");
largura = (Double.parseDouble(sc.nextLine()));
System.out.println("Entre com a Altura...............: ");
altura = (Double.parseDouble(sc.nextLine()));
System.out.println("Entre com a Profundidade.........: ");
profundidade = (Double.parseDouble(sc.nextLine()));
area = largura * altura;
volume = area * profundidade;
System.out.println("Área: " + area + "Volume: " + volume);
}
}