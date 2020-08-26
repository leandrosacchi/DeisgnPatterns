package strategy;

public class CalculadorDeImposto {

    public void realizaCalculoImposto(Orcamento orcamento, Imposto imposto){
            double resultado = imposto.calcula(orcamento);
            System.out.println(resultado);
    }
}
