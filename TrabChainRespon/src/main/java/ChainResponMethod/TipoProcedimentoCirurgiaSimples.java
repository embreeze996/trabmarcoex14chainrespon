package ChainResponMethod;

public class TipoProcedimentoCirurgiaSimples implements TipoProcedimento {

    private static TipoProcedimentoCirurgiaSimples tipoProcedimentoCirurgiaSimples = new TipoProcedimentoCirurgiaSimples();

    private TipoProcedimentoCirurgiaSimples() {};

    public static TipoProcedimentoCirurgiaSimples getTipoProcedimentoCirurgiaSimples() {
        return tipoProcedimentoCirurgiaSimples;
    }

}