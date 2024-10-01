package com.model;

import java.util.List;

public class Loja {
private List<Cliente> clientes;
    private List<Pedido> pedidos ;
    private List<Produto> produtos;
    private List<Vendedor> vendedores;

    public Loja(List<Cliente> clientes, List<Pedido> pedidos, List<Produto> produtos, List<Vendedor> vendedores) {
        this.clientes = clientes;
        this.pedidos = pedidos;
        this.produtos = produtos;
        this.vendedores = vendedores;
    }

    public void cadastrarCliente(Cliente cliente){
        cliente.add(cliente);
    }

}
