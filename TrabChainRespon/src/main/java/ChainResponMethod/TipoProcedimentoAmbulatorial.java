package ChainResponMethod;

public class TipoProcedimentoAmbulatorial implements TipoProcedimento {

    private static TipoProcedimentoAmbulatorial tipoProcedimentoAmbulatorial = new TipoProcedimentoAmbulatorial();

    private TipoProcedimentoAmbulatorial() {};

    public static TipoProcedimentoAmbulatorial getTipoProcedimentoAmbulatorial() {
        return tipoProcedimentoAmbulatorial;
    }

}