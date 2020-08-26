package exercicioInvestimentos;

public class RealizadorDeInvestimentos {

    public RealizadorDeInvestimentos(Saldo saldo, TipoDeInvestimento tipo){
        double total = tipo.calculoRendimento(saldo)*0.75+saldo.getValor();
        System.out.println("SALDO: " +total);
    }
}
