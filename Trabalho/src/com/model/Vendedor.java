package com.model;

import java.time.LocalDate;

public class Vendedor extends Pessoa {
    private String matricula;
    private  Double percentualComissao;
    private LocalDate dtAdmissao;

    public Vendedor() {

    }

    public Vendedor(String nome, String cpf, String matricula, Double percentualComissao, LocalDate dtAdmissao) {
        super(nome, cpf);
        this.matricula = matricula;
        this.percentualComissao = percentualComissao;
        this.dtAdmissao = dtAdmissao;
    }
}
