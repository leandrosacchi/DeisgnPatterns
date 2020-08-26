package decorator;

public class ICCC extends Imposto {

    public ICCC(Imposto outroImposto) {
        super(outroImposto);
    }

    public ICCC(){
    }

    @Override
    public double calcula(Orcamento orcamento) {
        double valor = orcamento.getValor();

        if (valor <1000.0) return 0.05* valor + calculaOutroImposto(orcamento);
        else if (valor <=3000) return valor *0.07 + calculaOutroImposto(orcamento);
        else return valor *0.08 + calculaOutroImposto(orcamento);
    }
}
