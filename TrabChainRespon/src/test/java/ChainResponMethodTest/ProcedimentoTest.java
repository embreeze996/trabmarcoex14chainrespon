package ChainResponMethodTest;

import ChainResponMethod.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProcedimentoTest {

    MedicoCirurgiaoChefe cirurgiaoChefe;
    MedicoResidente residente;
   MedicoEstagiario estagiario;
   MedicoAluno aluno;

    @BeforeEach
    void setUp() {
       cirurgiaoChefe = new MedicoCirurgiaoChefe(null);
        residente = new MedicoResidente(cirurgiaoChefe);
        estagiario = new MedicoEstagiario(residente);
        aluno= new MedicoAluno(estagiario);
    }

    @Test
    void deveRetornarAlunoParaRealizarProcedimentoSutura() {
        assertEquals("A ser realizado por aluno de medicina", aluno.realizarProcedimento(new Procedimento(TipoProcedimentoSutura.getTipoProcedimentoSutura())));
    }

    @Test
    void deveRetornarEstagiarioParaRealizarProcedimentoAmbulatorial() {
        assertEquals("A ser realizado por estagiário", estagiario.realizarProcedimento(new Procedimento(TipoProcedimentoAmbulatorial.getTipoProcedimentoAmbulatorial())));
    }

    @Test
    void deveRetornarResidenteParaRealizarProcedimentoCirurgiaSimples() {
        assertEquals("A ser realizado por Médico Residente", residente.realizarProcedimento(new Procedimento(TipoProcedimentoCirurgiaSimples.getTipoProcedimentoCirurgiaSimples())));
    }

    @Test
    void deveRetornarCirurgiaoChefeParaRealizarProcedimentoCirurgiaComplexa() {
        assertEquals("A ser realizado por Cirurgião Chefe", cirurgiaoChefe.realizarProcedimento(new Procedimento(TipoProcedimentoCirurgiaComplexa.getTipoProcedimentoCirurgiaComplexa())));
    }

    @Test
    void deveRetornarNaoRealizadoParaRealizarProcedimentoTransplanteCerebral() {
        assertEquals("Não Realizado", aluno.realizarProcedimento(new Procedimento(TipoProcedimentoTransplanteCerebral.getTipoProcedimentoTransplanteCerebral())));
    }

}