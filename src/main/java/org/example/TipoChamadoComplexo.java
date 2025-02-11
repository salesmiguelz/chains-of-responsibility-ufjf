package org.example;

public class TipoChamadoComplexo implements TipoChamado {

    private static TipoChamadoComplexo tipoChamadoComplexo = new TipoChamadoComplexo();

    private TipoChamadoComplexo() {};

    public static TipoChamadoComplexo getTipoChamadoComplexo() {
        return tipoChamadoComplexo;
    }
}