package com.lucas;

public class Cliente extends Aprovador {

    @Override
    public Orcamento isAprovador(Orcamento orcamento) {
        if (orcamento.getValor() <= 1000) {
            System.out.println("Aprovado pelo Cliente");
            orcamento.setAprovado(true);
            return orcamento;
        }

        return super.isAprovador(orcamento);
    }

}
