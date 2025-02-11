package org.example;

public class AnalistaPleno extends AnalistaSuporte {

    public AnalistaPleno(AnalistaSuporte proximo) {
        tiposSuportados.add(TipoChamadoIntermediario.getTipoChamadoIntermediario());
        setProximoAnalista(proximo);
    }

    public String getDescricaoAnalista() {
        return "Chamado resolvido pelo Analista Pleno";
    }
}
