package chainOfResponsibility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChainOfResponsibilityPatternTest {

    public static void main(String[] args) {
        Item item1 = new Item("CANETA", 250.0);
        Item item2 = new Item("LAPIS", 250.0);
        Item item3 = new Item("CANETA", 250.0);
        Item item4 = new Item("LAPIS", 250.0);
        Item item5 = new Item("CANETA", 250.0);
        Item item6 = new Item("LAPIS", 250.0);
        List<Item> itens = new ArrayList<>();
        itens.addAll(Arrays.asList(item1, item2));

        Orcamento orcamento = new Orcamento(500.0, itens);

        CalculadorDeDesconto calculador = new CalculadorDeDesconto();
        System.out.println(calculador.calculaDesconto(orcamento));
    }

}
