package org.example;

public class TipoChamadoIntermediario implements TipoChamado {

    private static TipoChamadoIntermediario tipoChamadoIntermediario = new TipoChamadoIntermediario();

    private TipoChamadoIntermediario() {};

    public static TipoChamadoIntermediario getTipoChamadoIntermediario() {
        return tipoChamadoIntermediario;
    }
}
