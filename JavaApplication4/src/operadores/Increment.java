package operadores;

/**
 *
 * @author JorUge
 */
public class Increment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int preIncrement = 10, postIncrement = 10;
        
        System.out.println("Valor inicial da variável preIncrement: " + preIncrement);  
        System.out.println("Valor inicial da variável postIncrement: " + postIncrement);  
        

        System.out.println(++preIncrement);
        System.out.println(postIncrement++);
    }

}
