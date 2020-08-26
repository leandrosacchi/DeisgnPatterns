package exercicioInvestimentos;

public class TestaInvestimentos {
    public static void main(String[] args) {
        TipoDeInvestimento conservador = new Conservador();
        TipoDeInvestimento moderado = new Moderado();

        Saldo saldo = new Saldo(100.0);

        RealizadorDeInvestimentos investimento2 = new RealizadorDeInvestimentos(saldo,moderado);
        RealizadorDeInvestimentos investimento1 = new RealizadorDeInvestimentos(saldo,moderado);
        RealizadorDeInvestimentos investimento3 = new RealizadorDeInvestimentos(saldo,moderado);
        RealizadorDeInvestimentos investimento4 = new RealizadorDeInvestimentos(saldo,moderado);
        RealizadorDeInvestimentos investimento5 = new RealizadorDeInvestimentos(saldo,moderado);
        RealizadorDeInvestimentos investimento6 = new RealizadorDeInvestimentos(saldo,moderado);

    }
}
