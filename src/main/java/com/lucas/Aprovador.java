package com.lucas;

public abstract class Aprovador {

    private Aprovador aprovador;

    public Aprovador setAprovador(Aprovador aprovador) {
        this.aprovador = aprovador;
        return aprovador;
    }

    public Orcamento isAprovador(Orcamento orcamento) {
        return this.aprovador != null ? this.aprovador.isAprovador(orcamento) : orcamento;
    }




}
