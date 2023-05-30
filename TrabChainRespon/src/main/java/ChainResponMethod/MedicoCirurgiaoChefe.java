package ChainResponMethod;

public class MedicoCirurgiaoChefe extends Medico {

    public MedicoCirurgiaoChefe(Medico superior) {
        listaProcedimentos.add(TipoProcedimentoCirurgiaComplexa.getTipoProcedimentoCirurgiaComplexa());
        setMedicoSuperior(superior);
    }

    public String getStatusProcedimento() {
        return "A ser realizado por Cirurgião Chefe";
    }

}