package com.model;

public class Pedido {

    private int itens;
    private Cliente cliente;
    private Vendedor vendedor;
    private double total;

    public Pedido(int itens, Cliente cliente, Vendedor vendedor, double total) {
        this.itens = itens;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.total = total;
    }

    public int getItens() {
        return itens;
    }

    public void setItens(int itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void adicionarItem(){

    }


    @Override
    public String toString() {
        return "Pedido{" +
                "itens=" + itens +
                ", cliente=" + cliente +
                ", vendedor=" + vendedor +
                ", total=" + total +
                '}';
    }
}
