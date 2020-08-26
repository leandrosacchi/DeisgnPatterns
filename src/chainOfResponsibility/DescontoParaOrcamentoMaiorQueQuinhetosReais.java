package chainOfResponsibility;

public class DescontoParaOrcamentoMaiorQueQuinhetosReais implements Desconto {

    private Desconto proximo;

    @Override
    public double calcula(Orcamento orcamento) {
        if (orcamento.getValor()>500) return 0.07*orcamento.getValor();
        return proximo.calcula(orcamento);
    }

    @Override
    public void setDesconto(Desconto proximo){
        this.proximo = proximo;
    }
}
