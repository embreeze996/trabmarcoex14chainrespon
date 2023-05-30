package ChainResponMethod;

public class MedicoEstagiario extends Medico {

    public MedicoEstagiario(Medico superior) {
        listaProcedimentos.add(TipoProcedimentoAmbulatorial.getTipoProcedimentoAmbulatorial());
        setMedicoSuperior(superior);
    }

    public String getStatusProcedimento() {
        return "A ser realizado por estagiário";
    }
}