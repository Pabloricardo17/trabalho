package com.model;

public class Produto {
    private String nome;
    private double valor;
    private int QuantidadeMaxima;
    private int codigo;

    public Produto(String nome, double valor, int quantidadeMaxima, int codigo) {
        this.nome = nome;
        this.valor = valor;
        QuantidadeMaxima = quantidadeMaxima;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeMaxima() {
        return QuantidadeMaxima;
    }

    public void setQuantidadeMaxima(int quantidadeMaxima) {
        QuantidadeMaxima = quantidadeMaxima;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", QuantidadeMaxima=" + QuantidadeMaxima +
                ", codigo=" + codigo +
                '}';
    }
}
