package com.lucas;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Orcamento orcamento = new Orcamento(24001);

        Aprovador aprovador = new Cliente();

        aprovador
                .setAprovador(new Gerente())
                .setAprovador(new Diretor())
                .setAprovador(new CEO());

        aprovador.isAprovador(orcamento);

    }
}
