package aula_2021_03_17;

/**
 *
 * @author jorge.ferrari
 */
public class Caneta {

    private String cor, tipo;
    private double preco;
    private int quantidade;

    // Método de acesso
    // Setters
    public void setCor(String c) {
        cor = c;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public void setQuantidade(int q) {
        if (q > 0) {
            quantidade = q;
        }

    }

    public void setPreco(double p) {
        if (p > 0) {
            preco = p;
        }
    }

    // Getters
    public String getCor() {
        return cor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void exibir() {
        System.out.println("A cor da caneta  é        : " + getCor());
        System.out.println("O tipo da caneta  é       : " + getTipo());
        System.out.println("O preço da caneta  é      : " + getPreco());
        System.out.println("A quantidade da caneta  é : " + getQuantidade());
    }

}
