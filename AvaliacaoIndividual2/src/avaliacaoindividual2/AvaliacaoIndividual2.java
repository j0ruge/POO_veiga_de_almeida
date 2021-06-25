/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaoindividual2;

import classes.*;
import java.util.Locale;

/**
 *
 * @author JorUge
 */
public class AvaliacaoIndividual2 {

    /**
     * @param lancha
     * @param args the command line arguments
     */
    // <editor-fold defaultstate="collapsed" desc=" Métodos Auxiliares ">
    static void imprimirLanchas(Lancha lancha[]) {

        for (int i = 0; i < lancha.length; i++) {

            System.out.println("");
            System.out.println("==> DADOS REGISTRADOS PARA LANCHA " + (i + 1) + " <==");

            lancha[i].imprimir();

            System.out.println("");
            System.out.println("::::INFORMAÇÕES ADICIONAIS::::");

            System.out.println(
                    "Valor com máximo desconto permitido: R$ " + String.format(Locale.GERMAN, "%,.2f", lancha[i].valorDesconto())
            );
        }
    }

    static void imprimirAvioes(Aviao aviao[]) {

        for (int i = 0; i < aviao.length; i++) {

            System.out.println("");
            System.out.println("==> DADOS REGISTRADOS PARA AERONAVE " + (i + 1) + " <==");

            aviao[i].imprimir();

            System.out.println("");
            System.out.println("::::INFORMAÇÕES ADICIONAIS::::");

            System.out.println(
                    "Valor com máximo desconto permitido: R$ " + String.format(Locale.GERMAN, "%,.2f", aviao[i].valorDesconto())
            );
        }
    }
    
    
    static void imprimirCarros(Carro carro[]) {

        for (int i = 0; i < carro.length; i++) {

            System.out.println("");
            System.out.println("==> DADOS REGISTRADOS PARA O AUTOMÓVEL " + (i + 1) + " <==");

            carro[i].imprimir();

            System.out.println("");
            System.out.println("::::INFORMAÇÕES ADICIONAIS::::");

            System.out.println(
                    "Valor com máximo desconto permitido: R$ " + String.format(Locale.GERMAN, "%,.2f", carro[i].valorDesconto())
            );
        }
    }
    

    static void entradaLanchas(Lancha lancha[]) {

        for (int i = 0; i < lancha.length; i++) {

            System.out.println("");
            System.out.println("==> INSIRA DADOS PARA LANCHA " + (i + 1) + " <==");
            lancha[i] = new Lancha();
            lancha[i].entradaDados();
        }

    }

    // </editor-fold>
    public static void main(String[] args) {
        // TODO code application logic here

        Carro c1 = new Carro();
        
        c1.entradaDados();
        
        

        // <editor-fold defaultstate="collapsed" desc=" Carro ">
        Carro carro[] = new Carro[5];

        carro[0] = new Carro();
        carro[1] = new Carro();
        carro[2] = new Carro();
        carro[3] = new Carro();
        carro[4] = new Carro();

        carro[0].cadastrar("Toyota",
                "Corolla",
                "Prata",
                "XPR-9087",
                4.620,
                1.775,
                122990,
                335,
                6000,
                191,
                "Álcool",
                13000);
        carro[1].cadastrar(
                "BMW",
                "Z1 2.5",
                "Preta",
                "GAB-8721",
                3.921,
                1.69,
                247950,
                
                350,
                6000,
                225,
                "Gasolina",
                50000);
        carro[2].cadastrar(
                "Porsche",
                "912 E",
                "Prata",
                "IRU-5678",
                4.293,
                1.61,
                559567,
                
                250,
                4900,
                185,
                "Gasolina",
                50000);
        carro[3].cadastrar(
                "Lamborghini",
                "Miura P400SV",
                "Amarela",
                "JED-I586",
                4.359,
                1.76,
                (158625*5),
                
                300,
                5750,
                290,
                "Gasolina",
                30000);
        carro[4].cadastrar(
                "Jaguar ",
                "XJ220",
                "Vermelha",
                "SIT-8634",
                4.93,
                2.22,
                (300000*5),
                
                470,
                4500,
                343,
                "Gasolina",
                60000);

        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc=" Lancha ">
        Lancha lancha[] = new Lancha[5];

        lancha[0] = new Lancha();
        lancha[1] = new Lancha();
        lancha[2] = new Lancha();
        lancha[3] = new Lancha();
        lancha[4] = new Lancha();

        lancha[0].cadastrar("GabirU ", "280", "Branca", "Caipirinha II", 21, 3, 180000,
                456, 450, 89, "Diesel", 34000,
                456, 450, 89, "Diesel", 34000);
        lancha[1].cadastrar("GabirU ", "180", "Branca", "Bahia I", 22, 3, 140000,
                445, 430, 84, "Diesel", 32000,
                445, 430, 84, "Diesel", 32000);
        lancha[2].cadastrar("GabirU ", "9000", "Branca", "GabirU do Mar", 21, 3, 170000,
                489, 430, 84, "Diesel", 32000,
                489, 430, 84, "Diesel", 32000);
        lancha[3].cadastrar("GabirU ", "EX", "Preta", "GabirU do Rei", 23, 4, 200000,
                489, 430, 84, "Diesel", 32000,
                489, 430, 84, "Diesel", 32000);
        lancha[4].cadastrar("GabirU ", "Alpha", "Prata", "GabirU Nervoso", 22, 3, 230000,
                489, 430, 84, "Diesel", 32000,
                489, 430, 84, "Diesel", 32000);

        // </editor-fold>       
        // <editor-fold defaultstate="collapsed" desc=" Aviao ">
        Aviao aviao[] = new Aviao[5];

        aviao[0] = new Aviao();
        aviao[1] = new Aviao();
        aviao[2] = new Aviao();
        aviao[3] = new Aviao();

        aviao[4] = new Aviao();

        aviao[0].cadastrar(
                "Boeing ",
                "737-8EH",
                "Branca",
                "PP8Z7",
                28.6,
                28.3,
                (89100000 * 5),
                1450,
                2700,
                1000,
                "Turbofan",
                (20000000 * 5),
                1450,
                2700,
                1000,
                "Turbofan",
                (20000000 * 5),
                1450,
                2700,
                1000,
                "Turbofan",
                (20000000 * 5),
                1450,
                2700,
                1000,
                "Turbofan",
                (20000000 * 5)
        );

        aviao[1].cadastrar(
                "Boeing ",
                "737-400",
                "Branca",
                "PT47Z",
                35.5,
                28.9,
                (95100000 * 5),
                2366,
                2800,
                1100,
                "Turbofan",
                (23000000 * 5),
                2366,
                2800,
                1100,
                "Turbofan",
                (23000000 * 5),
                2366,
                2800,
                1100,
                "Turbofan",
                (23000000 * 5),
                2366,
                2800,
                1100,
                "Turbofan",
                (23000000 * 5)
        );

        aviao[2].cadastrar(
                "Boeing ",
                "737-600",
                "Branca",
                "QT4AZ",
                31.20,
                34.30,
                (85100000 * 5),
                2366,
                2800,
                1100,
                "Turbofan",
                (22000000 * 5),
                2366,
                2800,
                1100,
                "Turbofan",
                (22000000 * 5),
                2366,
                2800,
                1100,
                "Turbofan",
                (22000000 * 5),
                2366,
                2800,
                1100,
                "Turbofan",
                (22000000 * 5)
        );
        aviao[3].cadastrar(
                "Boeing ",
                "737-500 ",
                "Branca",
                "SW42Z",
                31.10,
                28.90,
                (95100000 * 5),
                2366,
                2800,
                1100,
                "Turbofan",
                (22000000 * 5),
                2366,
                2800,
                1100,
                "Turbofan",
                (22000000 * 5),
                2366,
                2800,
                1100,
                "Turbofan",
                (22000000 * 5),
                2366,
                2800,
                1100,
                "Turbofan",
                (22000000 * 5)
        );

        aviao[4].cadastrar(
                "Boeing",
                "737-800",
                "Branca",
                "XW42V",
                39.50,
                34.30,
                (99400000 * 5),
                2366,
                2800,
                1100,
                "Turbofan",
                (22000000 * 5),
                2366,
                2800,
                1100,
                "Turbofan",
                (22000000 * 5),
                2366,
                2800,
                1100,
                "Turbofan",
                (22000000 * 5),
                2366,
                2800,
                1100,
                "Turbofan",
                (22000000 * 5)
        );

        // </editor-fold>
        
        imprimirLanchas(lancha);
        imprimirAvioes(aviao);
        imprimirCarros(carro);
        c1.imprimir();

    }

}
