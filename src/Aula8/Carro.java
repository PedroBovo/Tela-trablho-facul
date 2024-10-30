package Aula8;

public class Carro {

    private String modelo;
    private double valor;
    private int ano;

    Carro(){}


    public Carro(String modelo, double valor, int ano) {
           this.modelo = modelo;
        this.valor = valor;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}