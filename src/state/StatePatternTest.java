package state;

public class StatePatternTest {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(100);

        orcamento.aplicarDescontoExtra();

        System.out.println(orcamento.valor);

        orcamento.aprovar();

        orcamento.aplicarDescontoExtra();

        System.out.println(orcamento.valor);

        orcamento.aplicarDescontoExtra();

        orcamento.reprovar();

        orcamento.aplicarDescontoExtra();

        System.out.println(orcamento.valor);
    }
}
