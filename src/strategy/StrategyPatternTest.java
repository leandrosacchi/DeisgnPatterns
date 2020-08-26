package strategy;

public class StrategyPatternTest {

    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto iccc = new ICCC();

        Orcamento orcamento = new Orcamento(500.0);

        CalculadorDeImposto calculador = new CalculadorDeImposto();

        calculador.realizaCalculoImposto(orcamento,iss);
        calculador.realizaCalculoImposto(orcamento,icms);
        calculador.realizaCalculoImposto(orcamento,iccc);

    }


}
