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
public class Professor extends Pessoa {
    
    String titulacao;
    double salario;
    
    
    public void setSalario( double salario ) {
        this.salario = salario;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
        
    public double getSalario() {
        return salario;
    }

    public String getTitulacao() {
        return titulacao;
    }
    
    
}
