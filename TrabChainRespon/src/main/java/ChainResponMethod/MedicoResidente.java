package ChainResponMethod;

public class MedicoResidente extends Medico {

    public MedicoResidente(Medico superior) {
        listaProcedimentos.add(TipoProcedimentoCirurgiaSimples.getTipoProcedimentoCirurgiaSimples());
        setMedicoSuperior(superior);
    }

    public String  getStatusProcedimento() {
        return "A ser realizado por Médico Residente";
    }

}
