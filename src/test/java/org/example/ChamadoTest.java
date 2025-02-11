package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChamadoTest {

    AnalistaSenior senior;
    AnalistaPleno pleno;
    AnalistaJunior junior;

    @BeforeEach
    void setUp() {

        senior = new AnalistaSenior(null);
        pleno = new AnalistaPleno(senior);
        junior = new AnalistaJunior(pleno);
    }

    @Test
    public void deveRetornarJuniorParaChamadoSimples() {
        assertEquals("Chamado resolvido pelo Analista Júnior", junior.processarChamado(new Chamado(TipoChamadoSimples.getTipoChamadoSimples())));
    }

    @Test
    public void deveRetornarPlenoParaChamadoIntermediario() {
        assertEquals("Chamado resolvido pelo Analista Pleno", junior.processarChamado(new Chamado(TipoChamadoIntermediario.getTipoChamadoIntermediario())));
    }

    @Test
    public void deveRetornarSeniorParaChamadoComplexo() {
        assertEquals("Chamado resolvido pelo Analista Sênior", junior.processarChamado(new Chamado(TipoChamadoComplexo.getTipoChamadoComplexo())));
    }

    @Test
    public void deveRetornarNaoResolvidoParaChamadoDesconhecido() {
        TipoChamado tipoChamadoDesconhecido = new TipoChamado() {}; // Tipo de chamado não reconhecido
        assertEquals("Chamado não resolvido", junior.processarChamado(new Chamado(tipoChamadoDesconhecido)));
    }
}
