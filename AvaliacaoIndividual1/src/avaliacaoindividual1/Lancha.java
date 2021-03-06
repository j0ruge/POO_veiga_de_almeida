/*
 * class Lancha
 */
package avaliacaoindividual1;

import java.util.Scanner;

/**
 *
 * @author JorUge
 */
public class Lancha extends EmbarcacaoPequenoPorte {

    private boolean banheiro;

    // Construtores
    // 1/10 - Construtor vazio.
    public Lancha() {
    }

    // 2/10 - Atributos do tipo Texto
    public Lancha(String marca, String modelo, String cor, String identificacao, String tipoCasco) {
        super(marca, modelo, cor, identificacao, tipoCasco);
    }

    // 3/10 - Atributos do tipo inteiro
    public Lancha(int numeroPassageiros, int velocidadeMaxima, int potenciaMotor) {
        super(numeroPassageiros, velocidadeMaxima, potenciaMotor);
    }

    // 4/10 - Atributos do tipo real  
    public Lancha(double preco, double alturaCalado) {

        super(preco, alturaCalado);
    }

    // 5/10 - Todos atributos 
    public Lancha(
            String marca,
            String modelo,
            String cor,
            int numeroPassageiros,
            double preco,
            int velocidadeMaxima,
            double alturaCalado,
            String identificacao,
            int potenciaMotor,
            String tipoCasco,
            boolean banheiro
    ) {
        super(marca, modelo, cor, numeroPassageiros, preco, velocidadeMaxima, alturaCalado, identificacao, potenciaMotor, tipoCasco);
        this.banheiro = banheiro;
    }

    // 6/10 - Atributos Físicos/Técnicos 
    public Lancha(
            String cor,
            int numeroPassageiros,
            int velocidadeMaxima,
            double alturaCalado,
            int potenciaMotor,
            String tipoCasco
    ) {
        super(cor, numeroPassageiros, velocidadeMaxima, alturaCalado, potenciaMotor, tipoCasco);

    }

    // 7/10 - Atributos administrivos e comerciais 
    public Lancha(
            String marca,
            String modelo,
            int numeroPassageiros,
            double preco,
            int velocidadeMaxima,
            double alturaCalado,
            String identificacao,
            int potenciaMotor,
            String tipoCasco,
            boolean banheiro
    ) {
        super(marca, modelo, numeroPassageiros, preco, velocidadeMaxima, alturaCalado, identificacao, potenciaMotor, tipoCasco);
        this.banheiro = banheiro;

    }

    // 8/10 - Atributos comerciais
    public Lancha(
            String marca,
            String modelo,
            int numeroPassageiros,
            double preco,
            int velocidadeMaxima,
            double alturaCalado,
            int potenciaMotor,
            String tipoCasco,
            boolean banheiro
    ) {
        super(marca, modelo, numeroPassageiros, preco, velocidadeMaxima, alturaCalado, potenciaMotor, tipoCasco);
        this.banheiro = banheiro;
    }

    // 9/10 - Atributos operacionais
    public Lancha(
            int numeroPassageiros,
            int velocidadeMaxima,
            double alturaCalado,
            String identificacao,
            int potenciaMotor
    ) {
        super(numeroPassageiros, velocidadeMaxima, alturaCalado, identificacao, potenciaMotor);
    }

    // 10/10 - Atributos numéricos
    public Lancha(
            int numeroPassageiros,
            double preco,
            int velocidadeMaxima,
            double alturaCalado,
            int potenciaMotor
    ) {
        super(numeroPassageiros, preco, velocidadeMaxima, alturaCalado, potenciaMotor);

    }
    
    // 
    

    // Métodos de Acesso  
    public boolean isBanheiro() {
        return banheiro;
    }

    public void setBanheiro(boolean banheiro) {
        this.banheiro = banheiro;
    }

    // Métodos extras
    public void cadastrar(
            String marca,
            String modelo,
            String cor,
            int numeroPassageiros,
            double preco,
            int velocidadeMaxima,
            double alturaCalado,
            String identificacao,
            int potenciaMotor,
            String tipoCasco,
            boolean banheiro
    ) {
        super.cadastrar(marca, modelo, cor, numeroPassageiros, preco, velocidadeMaxima, alturaCalado, identificacao, potenciaMotor, tipoCasco);
        setBanheiro(banheiro);
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.println("Banheiro         : " + isBanheiro());
    }

    @Override
    public void entrada() {

        Scanner input = new Scanner(System.in);

        super.entrada();

        
        
        System.out.print("Banheiro? ( sim / não )     : ");

        String banheiroString = input.nextLine();

        if (banheiroString.equals("sim")) {
            setBanheiro(true);
        } else {
            setBanheiro(false);
        }

    }

    public double valorDesconto() {
        return super.valorDesconto(12.0);

    }

}
