package ChainResponMethod;

public class TipoProcedimentoCirurgiaComplexa implements TipoProcedimento {

    private static TipoProcedimentoCirurgiaComplexa tipoProcedimentoCirurgiaComplexa = new TipoProcedimentoCirurgiaComplexa();

    private TipoProcedimentoCirurgiaComplexa() {};

    public static TipoProcedimentoCirurgiaComplexa getTipoProcedimentoCirurgiaComplexa() {
        return tipoProcedimentoCirurgiaComplexa;
    }

}
