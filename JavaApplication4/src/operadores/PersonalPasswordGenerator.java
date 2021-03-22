package operadores;

/**
 *
 * @author JorUge
 */
public class PersonalPasswordGenerator {

   public static void main(String[] args) {
       
       
       byte l = 65, s = 45 , r, w = (byte) Integer.parseInt("A");  // ASCII (54) : A
       
       r = (byte) (l ^ s); // ASCII: -
   
//       Encrypter hash = new Encrypter();
//       
//       
//       hash.setInitVector("jrcbrasil.com");
//       
//       hash.setKey("2j0r1U5ge");
//       
//       hash.encrypt("00112233445566778899aabbccddeeff");
//       
       
       
               System.out.println(w);
       
       
        System.out.println(r);
        
        l = (byte) (r ^ s);
        
        System.out.println(l);
    }
 

}
