package templateMethod;

public abstract class TemplateCalculoImposto implements Imposto{

    public double calcula(Orcamento orcamento){
        if (condicaoParaMaximo(orcamento))
            return taxaMaxima(orcamento);
        return taxaMinima(orcamento);
    }

    protected abstract boolean condicaoParaMaximo(Orcamento orcamento);
    protected abstract double taxaMaxima(Orcamento orcamento);
    protected abstract double taxaMinima(Orcamento orcamento);




}
