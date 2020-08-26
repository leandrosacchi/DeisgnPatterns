package chainOfResponsibility;

public class DescontoParaMaisDeCincoItens implements Desconto {

    private Desconto proximo;

    @Override
    public double calcula(Orcamento orcamento) {
        if (orcamento.getItens().size() > 5) return 0.1*orcamento.getValor();
        return proximo.calcula(orcamento);
    }

    @Override
    public void setDesconto(Desconto proximo) {
        this.proximo = proximo;
    }
}
