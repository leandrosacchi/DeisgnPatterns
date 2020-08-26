package chainOfResponsibility;

public class DescontoPorVendaCasada implements Desconto {

    private Desconto proximo;

    @Override
    public double calcula(Orcamento orcamento) {
        if (orcamento.contemItemDeNome("CANETA") && orcamento.contemItemDeNome("LAPIS"))
                    return 0.05 * orcamento.getValor();
        return proximo.calcula(orcamento);
    }

    @Override
    public void setDesconto(Desconto proximo){
        this.proximo = proximo;
    }
}
