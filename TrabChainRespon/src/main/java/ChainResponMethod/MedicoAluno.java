package ChainResponMethod;

public class MedicoAluno extends Medico {

    public MedicoAluno(Medico superior) {
        listaProcedimentos.add(TipoProcedimentoSutura.getTipoProcedimentoSutura());
        setMedicoSuperior(superior);
    }

    public String getStatusProcedimento() {
        return "A ser realizado por aluno de medicina";
    }

}
