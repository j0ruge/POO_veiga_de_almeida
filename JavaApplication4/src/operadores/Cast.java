package operadores;

/**
 *
 * @author JorUge
 */
public class Cast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
        int intX =7, intY =3, intZ;
     
        intZ = intX / intY; // z valerá 2 -> 7 / 3 = 2 e resto 1
     
        System.out.println(intZ);
        
        float floatZ;
    
        floatZ = (float) intX / intY; // caso uso sem o float, retornaria erroneamente 2.0, ao invéz do correto que seria a dízima perióica 2.3333333
        
        System.out.println(floatZ);   
     
    }

}
