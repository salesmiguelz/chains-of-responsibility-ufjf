package org.example;

public class AnalistaSenior extends AnalistaSuporte {

    public AnalistaSenior(AnalistaSuporte proximo) {
        tiposSuportados.add(TipoChamadoComplexo.getTipoChamadoComplexo());
        setProximoAnalista(proximo);
    }

    public String getDescricaoAnalista() {
        return "Chamado resolvido pelo Analista Sênior";
    }
}
