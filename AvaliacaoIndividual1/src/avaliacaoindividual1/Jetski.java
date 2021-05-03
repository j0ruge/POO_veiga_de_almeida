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
public class Jetski extends EmbarcacaoPequenoPorte {

    private boolean reboque;

    // Construtores
    // 1/10 - Construtor vazio.
    public Jetski() {
    }

    // 2/10 - Atributos do tipo Texto
    public Jetski(String marca, String modelo, String cor, String identificacao) {
        super(marca, modelo, cor, identificacao, modelo);
    }

    // 3/10 - Atributos do tipo inteiro
    public Jetski(int numeroPassageiros, int velocidadeMaxima, int potenciaMotor) {
        super(numeroPassageiros, velocidadeMaxima, potenciaMotor);
    }

    // 4/10 - Atributos do tipo real  
    public Jetski(double preco, double alturaCalado) {

        super(preco, alturaCalado);
    }

    // 5/10 - Todos atributos 
    public Jetski(
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
            boolean reboque
    ) {
        super(marca, modelo, cor, numeroPassageiros, preco, velocidadeMaxima, alturaCalado, identificacao, potenciaMotor, tipoCasco);
        this.reboque = reboque;
    }

    // 6/10 - Atributos Físicos/Técnicos 
    public Jetski(
            String cor,
            int numeroPassageiros,
            int velocidadeMaxima,
            double alturaCalado,
            int potenciaMotor,
            String tipoCasco,
            boolean reboque
    ) {
        super(cor, numeroPassageiros, velocidadeMaxima, alturaCalado, potenciaMotor, tipoCasco);
        this.reboque = reboque;
    }

    // 7/10 - Atributos administrivos e comerciais 
    public Jetski(
            String marca,
            String modelo,
            int numeroPassageiros,
            double preco,
            int velocidadeMaxima,
            double alturaCalado,
            String identificacao,
            int potenciaMotor,
            String tipoCasco,
            boolean reboque
    ) {
        super(marca, modelo, numeroPassageiros, preco, velocidadeMaxima, alturaCalado, identificacao, potenciaMotor, tipoCasco);
        this.reboque = reboque;

    }
    
    
    // 8/10 - Atributos comerciais
    
    public Jetski(
            String marca, 
                    String modelo,     
                    int numeroPassageiros,
                    double preco,
                    int velocidadeMaxima, 
                    double alturaCalado,
                    int potenciaMotor,
                    String tipoCasco,
                    boolean reboque
    ){
        super(marca, modelo, numeroPassageiros, preco, velocidadeMaxima, alturaCalado, potenciaMotor, tipoCasco);
        this.reboque = reboque;
    }
    
    
    // 9/10 - Atributos operacionais
    
    public Jetski(
            int numeroPassageiros, 
            int velocidadeMaxima, 
            double alturaCalado,
            String identificacao,
            int potenciaMotor,
            boolean reboque
    ) {
        super(numeroPassageiros, velocidadeMaxima, alturaCalado, identificacao, potenciaMotor);
        this.reboque = reboque;
    }
    
    // // 10/10 - Atributos numéricos
    
    public Jetski(
            int numeroPassageiros, 
            double preco,
            int velocidadeMaxima,             
            double alturaCalado,
            int potenciaMotor
    ) {
        super(numeroPassageiros, preco, velocidadeMaxima, alturaCalado, potenciaMotor);
        
    }
    

    // Métodos de Acesso 
    public void setReboque(boolean reboque) {
        this.reboque = reboque;
    }

    public boolean getReboque() {
        return reboque;
    }

    @Override
    protected double valorDesconto() {
        this.setPorcentagemDesconto(15.0);
        return (this.getPorcentagemDesconto() / 100) * this.getPreco();
    }

}
