package ChainResponMethod;

import java.util.ArrayList;
public abstract class Medico {

    protected ArrayList listaProcedimentos = new ArrayList();
    private Medico medicoSuperior;

    public Medico getMedicoSuperior() {
        return medicoSuperior;
    }

    public void setMedicoSuperior(Medico medicoSuperior) {
        this.medicoSuperior = medicoSuperior;
    }

    public abstract String getStatusProcedimento();

    public String realizarProcedimento(Procedimento procedimento) {
        if (listaProcedimentos.contains(procedimento.getTipoProcedimento())) {
            return getStatusProcedimento();
        }
        else {
            if (medicoSuperior != null) {
                return medicoSuperior.realizarProcedimento(procedimento);
            }
            else
            {
                return "Não Realizado";
            }
        }
    }
}
