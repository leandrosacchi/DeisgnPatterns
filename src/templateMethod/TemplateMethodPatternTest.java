package templateMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TemplateMethodPatternTest {
    public static void main(String[] args) {

        TemplateCalculoImposto icpp = new ICPP();
        TemplateCalculoImposto ikcv = new IKCV();
        TemplateCalculoImposto ihit = new IHIT();


        Item item1 = new Item("CANETA", 25.0);
        Item item2 = new Item("LAPIS", 25.0);
        Item item3 = new Item("LAPIS", 25.0);


        List<Item> itens = new ArrayList<>();
        itens.addAll(Arrays.asList(item2, item1, item3));

        Orcamento orcamento = new Orcamento(1000.0, itens);

        System.out.println(icpp.calcula(orcamento));
        System.out.println(ikcv.calcula(orcamento));
        System.out.println(ihit.calcula(orcamento));
    }
}
