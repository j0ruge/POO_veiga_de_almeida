/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2021_04_07;

/**
 *
 * @author JorUge
 */
public class Pessoa {

    String matricula, cpf, nome;
    
    
    public Pessoa() {};
    public Pessoa(String nome, String cpf ) {
        setNome(nome);
        setCpf(cpf);
    }

    public void setMatricula(String matricula) {
        matricula = this.matricula;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }    
    
    public void cadastro(String matricula, String cpf, String nome) {
        setMatricula(matricula);
        setCpf(cpf);
        setNome(nome);
    }
    
    public void imprimir() {
        System.out.println("Matrícula : " + getMatricula());
        System.out.println("CPF       : " + getCpf());
        System.out.println("Nome      : " + getNome());
        
    }

}
