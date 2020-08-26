package templateMethod;

public class IKCV extends TemplateCalculoImposto {

    private boolean temItemSuperiorA100(Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getValor() > 100) return true;
        }
        return false;
    }

    @Override
    protected boolean condicaoParaMaximo(Orcamento orcamento) {
        return orcamento.getValor()>500.0 && temItemSuperiorA100(orcamento);
    }

    @Override
    protected double taxaMaxima(Orcamento orcamento) {
        return orcamento.getValor()*0.1;
    }

    @Override
    protected double taxaMinima(Orcamento orcamento) {
        return orcamento.getValor()*0.06;
    }
}
