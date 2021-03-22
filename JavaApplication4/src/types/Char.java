package types;

import java.time.Clock;
import operadores.*;

/**
 *
 * @author JorUge
 */
public class Char {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ref. https://web.fe.up.pt/~ee96100/projecto/Tabela%20ascii.htm
       
        char c = 'A';
        char c1 = 65;
        
        System.out.println("Variável c:  " + c);
        System.out.println("Variável c1: " + c1);
        System.out.printf("%c , %c\n", c, c1);
            
    }

}
