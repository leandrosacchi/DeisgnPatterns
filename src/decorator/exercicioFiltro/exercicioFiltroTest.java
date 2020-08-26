package decorator.exercicioFiltro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercicioFiltroTest {
    public static void main(String[] args) {
        Conta conta = new Conta(50,"08");
        Conta conta2 = new Conta(600000,"10");
        Conta conta3 = new Conta(10,"08");
        List<Conta> contas = new ArrayList<>();

        contas.addAll(Arrays.asList(conta, conta3));

        Filtro f1 = new SaldoMenorQue100(new DataDeAberturaNesseMes());

        System.out.println(f1.filtra(contas));

    }
}
