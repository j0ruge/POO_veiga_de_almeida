/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaoindividual1;

/**
 *
 * @author JorUge
 */
public class AvaliacaoIndividual1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lachas
        
        Lancha l1 = new Lancha(130000.00, 0.49); // ref. Lancha Fishing 265cc
        Lancha l2 = new Lancha(10, 36, 240); // ref. Focker 265 
        Lancha l3 = new Lancha("Intermarine", "380 Full", "branca", "9V6191", "fibra de vidro"); //ref. Lancha Intermarine 380 Full
        Lancha l4 = new Lancha(4, 180000.00, 23, 0.5, 320); //ref. Lancha Triton 280 
        Lancha l5 = new Lancha("branca", 5, 34, 0.9, 520, "fibra de vidro"); // ref. Lancha Portofino Fly 42

        
        // Jetskis
        
        Jetski j1 = new Jetski(58000.00, 0.1); // ref. Jet Ski Sea Doo Spark Trixx
        Jetski j2 = new Jetski(3, 70, 215); // ref. Jet Ski Wake Pro 215
        Jetski j3 = new Jetski(3, 79, 0.1, "GTX215", 1494, true); //ref. Seadoo GTX 215
        Jetski j4 = new Jetski("Yamaha", "VX 1100", "vermelho", "Leone"); // ref. Jet Ski VX 1100
        Jetski j5 = new Jetski("azul/branco", 3, 65, 0.2, 0, "fibra", true);
        
        // Iates
        
        Iate i1 = new Iate(6, 2); // ref. Lancha REAL TOP 415
        Iate i2 = new Iate(5, 46, 2, 2); // ref. Portofino Fly 42
        Iate i3 = new Iate("INACE", "82 YACHT", "branca", "POQTY"); // INACE 82 YACHT
        Iate i4 = new Iate();
        Iate i5 = new Iate();
        
        
        
        l1.imprimir();
        l2.imprimir();
        l3.imprimir();
        l4.imprimir();
        l5.imprimir();
        
        j1.imprimir();
        j2.imprimir();
        j3.imprimir();
        j4.imprimir();
        j5.imprimir();
        
        i1.imprimir();
        
        System.out.println("Sugestão de " + i1.pessoasPorCabine() + " pessoas por cabine");
        
    }

}
