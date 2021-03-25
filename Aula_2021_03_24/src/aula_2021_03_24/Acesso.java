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
public class Acesso {
    
    
    private String usuario;
    private int senha; 
    private int token;

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public int getToken() {
        return token;
    }
    
    
    
    public void cadastrar(String user, int senha) {
        setUsuario(usuario);
        setSenha(senha);        
    }
    
    public void cadastrar(String user, int senha, int token) {
        setUsuario(usuario);
        setSenha(senha);
        setToken(token);
    }
    
    public void verificarSenha(){
        if (getUsuario().equals("carlos") && getSenha()==1234) {
            System.out.println("Bem vindo Carlos!");
        } else {
            System.out.println("Você não foi autenticado!");
        }
    }
    
    public void verificarSenha(int senha){
        if (getUsuario().equals("carlos") && getSenha()==1234 && getToken()==123456) {
            System.out.println("Bem vindo Carlos!");
        } else {
            System.out.println("Você não foi autenticado!");
        }
    }
    
    
}
