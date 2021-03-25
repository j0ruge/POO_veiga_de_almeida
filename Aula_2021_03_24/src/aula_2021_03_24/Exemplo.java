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
public class Exemplo {
    
    int a, b;

    public void setA(int v) {
        a = v;
    }
    
    public int getA() {
        return a;
    }
    
    public void setB(int v) {
        b = v;
    }
    
    public int getB() {
        return b;
    }
    
    public int somar() {
        return a + b;
    }
    
    public int somar(int v1, int v2) {
        return v1 + v2;
    }
    
    public double somar(int v1, double v2) {
        return v1 + v2;
    }
    
}
