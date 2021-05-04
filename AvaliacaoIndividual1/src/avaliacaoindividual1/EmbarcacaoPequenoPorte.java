/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaoindividual1;

import java.util.Scanner;

/**
 *
 * @author JorUge
 */
public class EmbarcacaoPequenoPorte extends Embarcacao {

    private int potenciaMotor;
    private String tipoCasco;

    // Construtores
    
    // 1/10 - Construtor vazio.
    public EmbarcacaoPequenoPorte() {
    };
    
    // 2/10 - Atributos do tipo Texto
    public EmbarcacaoPequenoPorte(String marca, String modelo, String cor, String identificacao, String tipoCasco ) {
    super(marca, modelo, cor, identificacao);
    this.tipoCasco = tipoCasco;
    };
    
    // 3/10 - Atributos do tipo inteiro
    public EmbarcacaoPequenoPorte(int numeroPassageiros, int velocidadeMaxima, int potenciaMotor) {
        super(numeroPassageiros, velocidadeMaxima);
        this.potenciaMotor = potenciaMotor;
    };
    
    
    // 4/10 - Atributos do tipo real 
    
    public EmbarcacaoPequenoPorte(double preco, double alturaCalado) {
        super(preco, alturaCalado);
    }
    
    // 5/10 - Todos atributos 
    public EmbarcacaoPequenoPorte(
            String marca, 
            String modelo, 
            String cor, 
            int numeroPassageiros,             
            double preco,  
            int velocidadeMaxima, 
            double alturaCalado,
            String identificacao,
            int potenciaMotor,
            String tipoCasco
            ) {
        super(marca, modelo, cor, numeroPassageiros, preco, velocidadeMaxima, alturaCalado, identificacao);
        this.potenciaMotor = potenciaMotor;
        this.tipoCasco = tipoCasco;
    
    }
    
    // 6/10 - Atributos Físicos/Técnicos 
    public EmbarcacaoPequenoPorte( 
                        String cor, 
                        int numeroPassageiros, 
                        int velocidadeMaxima, 
                        double alturaCalado,
                        int potenciaMotor,
                        String tipoCasco    
    
    ) {
        super(cor, numeroPassageiros, velocidadeMaxima, alturaCalado);
        this.potenciaMotor = potenciaMotor;
        this.tipoCasco = tipoCasco;
    };
    
    // 7/10 - Atributos administrivos e comerciais 
    public EmbarcacaoPequenoPorte(
                    String marca, 
                    String modelo,     
                    int numeroPassageiros,
                    double preco,
                    int velocidadeMaxima, 
                    double alturaCalado,
                    String identificacao,
                    int potenciaMotor,
                    String tipoCasco
    ){
        super(marca, modelo, numeroPassageiros, preco, velocidadeMaxima, alturaCalado, identificacao);
        this.potenciaMotor = potenciaMotor;
        this.tipoCasco = tipoCasco;
    };
    
    // 8/10 - Atributos comerciais
    public EmbarcacaoPequenoPorte(
                    String marca, 
                    String modelo,     
                    int numeroPassageiros,
                    double preco,
                    int velocidadeMaxima, 
                    double alturaCalado,
                    int potenciaMotor,
                    String tipoCasco
    ){
        super(marca, modelo, numeroPassageiros, preco, velocidadeMaxima, alturaCalado);
        this.potenciaMotor = potenciaMotor;
        this.tipoCasco = tipoCasco;
    };
    
    // 9/10 - Atributos operacionais
    public EmbarcacaoPequenoPorte(
            int numeroPassageiros, 
            int velocidadeMaxima, 
            double alturaCalado,
            String identificacao,
            int potenciaMotor
    ){
        super(numeroPassageiros, velocidadeMaxima, alturaCalado, identificacao);
        this.potenciaMotor = potenciaMotor;
    
    };
    
    // 10/10 - Atributos numéricos
    
    public EmbarcacaoPequenoPorte(
            int numeroPassageiros, 
            double preco,
            int velocidadeMaxima,             
            double alturaCalado,
            int potenciaMotor
    ) {
            super(numeroPassageiros, preco, velocidadeMaxima, alturaCalado);
            this.potenciaMotor = potenciaMotor;

    }
    
    
    // Métodos de Acesso  

    public int getPotenciaMotor() {
        return potenciaMotor;
    };

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    };

    public String getTipoCasco() {
        return tipoCasco;
    };

    public void setTipoCasco(String tipoCasco) {
        this.tipoCasco = tipoCasco;
    };
        
    
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
            String tipoCasco
    ){
        super.cadastrar(marca, modelo, cor, numeroPassageiros, preco, velocidadeMaxima, alturaCalado, identificacao);
        setPotenciaMotor(potenciaMotor);
        setTipoCasco(tipoCasco);
    }
    
    @Override
    public void entrada(){
        
        Scanner input = new Scanner(System.in);
        
        super.entrada();
        
        System.out.print("Motor (potência) : ");
        setPotenciaMotor(Integer.parseInt(input.nextLine()));
        
        System.out.print("Casco (tipo)     : ");
        setTipoCasco(tipoCasco);        
        
    }
    
    
    @Override
    public void imprimir(){
        
        super.imprimir();
        
        System.out.println("Motor (Potência) : " + getPotenciaMotor() + "HP");
        System.out.println("Casco (tipo)     : " + getTipoCasco());   
    }      
    
    
   
    
}
