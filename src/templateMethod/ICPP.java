package templateMethod;

public class ICPP extends TemplateCalculoImposto{

    @Override
    protected boolean condicaoParaMaximo(Orcamento orcamento) {
        return orcamento.getValor()>=500.0;
    }

    @Override
    protected double taxaMaxima(Orcamento orcamento) {
        return orcamento.getValor()*0.07;
    }

    @Override
    protected double taxaMinima(Orcamento orcamento) {
        return orcamento.getValor()*0.05;
    }
}
