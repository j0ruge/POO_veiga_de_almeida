/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2021_03_24;

/**
 *
 * @author JorUge
 */
public class Humano {
    // Atributos
    private String nome, sexo;
    private int idade;
    private double peso, altura;
    // Métodos extras
    public void imprimir() {
        System.out.println("Nome   : " + getNome());
        System.out.println("Sexo   : " + getSexo());
        System.out.println("Idade  : " + getIdade());
        System.out.println("Peso   : " + getPeso());
        System.out.println("Altura : " + getAltura());
    }
    
    
    
    // Métodos de Acesso

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }
    
    
    
    
    
    
    
}
