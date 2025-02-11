package org.example;

import java.util.ArrayList;

public abstract class AnalistaSuporte {

    protected ArrayList<TipoChamado> tiposSuportados = new ArrayList<>();
    private AnalistaSuporte proximoAnalista;

    public AnalistaSuporte getProximoAnalista() {
        return proximoAnalista;
    }

    public void setProximoAnalista(AnalistaSuporte proximoAnalista) {
        this.proximoAnalista = proximoAnalista;
    }

    public abstract String getDescricaoAnalista();

    public String processarChamado(Chamado chamado) {
        if (tiposSuportados.contains(chamado.getTipoChamado())) {
            return getDescricaoAnalista();
        } else {
            if (proximoAnalista != null) {
                return proximoAnalista.processarChamado(chamado);
            } else {
                return "Chamado não resolvido";
            }
        }
    }
}

