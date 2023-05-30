package com.lucas;

public class Diretor extends Aprovador {

    @Override
    public Orcamento isAprovador(Orcamento orcamento) {
        if (orcamento.getValor() <= 25000) {
            System.out.println("Aprovado pelo Diretor");
            orcamento.setAprovado(true);
            return orcamento;
        }

        return super.isAprovador(orcamento);
    }

}
