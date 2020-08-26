package strategy;

public class ICCC implements Imposto {
    @Override
    public double calcula(Orcamento orcamento) {
        double valor = orcamento.getValor();

        if (valor <1000.0) return 0.05* valor;
        else if (valor <=3000) return valor *0.07;
        else return valor *0.08;
    }
}
