/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2021_04_07;

import java.util.Scanner;

/**
 *
 * @author JorUge
 */
public class Aluno extends Pessoa {
    
    
    
    public Aluno(String matricula, String nome, String cpf) {
        setMatricula(matricula);
        setNome(nome);
        setCpf(cpf);
    }
    
    
    public void entrada() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Matrícula  :");
        setMatricula(ent.nextLine());
        System.out.println("aula_2021_04_07.Aluno.entrada()");
    }
}
