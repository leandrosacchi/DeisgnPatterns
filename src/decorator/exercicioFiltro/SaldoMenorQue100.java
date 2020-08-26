package decorator.exercicioFiltro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SaldoMenorQue100 extends Filtro{

    public SaldoMenorQue100(Filtro outroFiltro){
        super(outroFiltro);
    }

    public SaldoMenorQue100(){}

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> novaLista = new ArrayList<>();
        for (Conta conta : contas) {
            if(conta.getSaldo()<100.0){
                novaLista.add(conta);
            }
        }
        novaLista.addAll(filtraProximo(contas));
        return novaLista;
    }
}
