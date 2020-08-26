package observer;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class ObserverPatternTest {


    public static void main(String[] args) {
        ItemDaNota itemDaNota1,itemDaNota2,itemDaNota3;

        ItemDaNotaBuilder itemDaNotaBuilder = new ItemDaNotaBuilder();
        itemDaNota1 = itemDaNotaBuilder.comNome("item 1").comValor(200.0).build();
        itemDaNota2 = itemDaNotaBuilder.comNome("item 2").comValor(400.0).build();
        itemDaNota3 = itemDaNotaBuilder.comNome("item 3").comValor(600.0).build();

        Calendar calendar = Calendar.getInstance();
        calendar.set(2020,7,10);

        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.addAcao(new EnviadorDeEmail());
        builder.addAcao(new EnviadorDeSms());
        builder.addAcao(new Impressora());

        NotaFiscal nota = builder.paraEmpresa("razao social")
                        .comCnpj("cnpj")
                        .comItens(itemDaNota1)
                        .comItens(itemDaNota2)
                        .comItens(itemDaNota3)
                        .comObservacoes("observacoes")
                        .naData(calendar)
                        .build();

        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(nota.getDataEmissao().getTime()));
    }


}
