package evaluationaverage;

import com.sun.jmx.snmp.internal.SnmpSubSystem;
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
       System.out.println("\n=========================================");
       System.out.println("\nMatrícula:  " + matricula);
       System.out.println("Nome:  " + nome + "\nNota 1: " + nota1);
       System.out.println("\nNota 2: " + nota2 + "\nIdade : " + idade);
       System.out.println("Media: " + (nota1 + nota2 )/2  );
       System.out.println("\n=========================================");
    }
}