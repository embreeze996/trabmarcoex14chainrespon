package ChainResponMethod;

public class TipoProcedimentoTransplanteCerebral implements TipoProcedimento {

    private static TipoProcedimentoTransplanteCerebral tipoProcedimentoTransplanteCerebral = new TipoProcedimentoTransplanteCerebral();

    private TipoProcedimentoTransplanteCerebral() {};

    public static TipoProcedimentoTransplanteCerebral getTipoProcedimentoTransplanteCerebral() {
        return tipoProcedimentoTransplanteCerebral;
    }
}
