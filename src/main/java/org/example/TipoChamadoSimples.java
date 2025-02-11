package org.example;

public class TipoChamadoSimples implements TipoChamado {

    private static TipoChamadoSimples tipoChamadoSimples = new TipoChamadoSimples();

    private TipoChamadoSimples() {};

    public static TipoChamadoSimples getTipoChamadoSimples() {
        return tipoChamadoSimples;
    }
}