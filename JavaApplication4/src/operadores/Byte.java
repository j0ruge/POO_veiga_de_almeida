package operadores;

/**
 *
 * @author JorUge
 */
public class Byte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
        byte a = 45, b = 70, c = 0;
        
        c = (byte) (a & b);  // converte ambos valores para binário e faz a comparação bit a bit usando "E" 
     
        System.out.println("a & c = " + c);
        
        c = (byte) (a | b);  // converte ambos valores para binário e faz a comparação bit a bit usando "OU"
        
        System.out.println("a | c = " + c);
        
        c = (byte) (a ^ b);  // converte ambos valores para binário e faz a comparação bit a bit usando "OU EXCLUSIVO"
        
        System.out.println("a ^ c = " + c); // OU exclusivo, somente um pode ser TRUE
    }

}
