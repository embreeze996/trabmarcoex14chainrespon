package ChainResponMethod;

public class TipoProcedimentoSutura implements TipoProcedimento {

    private static TipoProcedimentoSutura tipoProcedimentoSutura = new TipoProcedimentoSutura();

    private TipoProcedimentoSutura() {};

    public static TipoProcedimentoSutura getTipoProcedimentoSutura() {
        return tipoProcedimentoSutura;
    }

}