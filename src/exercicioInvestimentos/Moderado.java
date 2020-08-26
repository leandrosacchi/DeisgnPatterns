package exercicioInvestimentos;

public class Moderado implements TipoDeInvestimento {

    @Override
    public double calculoRendimento(Saldo saldo) {
        if (new java.util.Random().nextDouble() > 0.5) return 0.025*saldo.getValor();
        else return 0.007*saldo.getValor();
    }
}
