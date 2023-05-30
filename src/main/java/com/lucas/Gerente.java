package com.lucas;

public class Gerente extends Aprovador {

    @Override
    public Orcamento isAprovador(Orcamento orcamento) {
        if (orcamento.getValor() <= 10000) {
            System.out.println("Aprovado pelo Gerente");
            orcamento.setAprovado(true);
            return orcamento;
        }

        return super.isAprovador(orcamento);
    }


}
