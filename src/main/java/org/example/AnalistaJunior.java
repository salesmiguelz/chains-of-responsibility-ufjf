package org.example;

public class AnalistaJunior extends AnalistaSuporte {

    public AnalistaJunior(AnalistaSuporte proximo) {
        tiposSuportados.add(TipoChamadoSimples.getTipoChamadoSimples());
        setProximoAnalista(proximo);
    }

    public String getDescricaoAnalista() {
        return "Chamado resolvido pelo Analista Júnior";
    }
}

