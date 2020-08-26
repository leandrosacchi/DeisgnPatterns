package exercicioInvestimentos;

public class Conservador implements TipoDeInvestimento{

    @Override
    public double calculoRendimento(Saldo saldo) {
        return 0.008*saldo.getValor();
    }
}
