package com.lucas;

public class Orcamento {

    private long valor;
    private boolean aprovado;


    public Orcamento(long valor) {
        this.valor = valor;
    }

    public long getValor() {
        return valor;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
