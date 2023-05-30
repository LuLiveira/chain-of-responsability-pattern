package com.lucas;

public class CEO extends Aprovador {
    @Override
    public Orcamento isAprovador(Orcamento orcamento) {
        if (orcamento.getValor() <= 50000) {
            System.out.println("Aprovado pelo CEO");
            orcamento.setAprovado(true);
            return orcamento;
        }

        return super.isAprovador(orcamento);
    }
}
