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
        // TODO code application logic here

        //EmbarcacaoPequenoPorte g1 = new EmbarcacaoPequenoPorte();
        Lancha l1 = new Lancha();
        Jetski j1 = new Jetski();

        l1.setPreco(100.00);
        j1.setPreco(200.00);

        System.out.println(l1.valorDesconto());
        //System.out.println(j1.valorDesconto());

        Iate i1 = new Iate(10, 3);

        //i1.entrada();
        //i1.imprimir();
        i1.setPreco(1000.0);

        System.out.println("Valor Desconto     : " + i1.valorDesconto());
        System.out.println("Tem Piscina        : " + i1.isPiscina());
        System.out.println("Pessoas por Cabine : " + i1.pessoasPorCabine());
    }

}
