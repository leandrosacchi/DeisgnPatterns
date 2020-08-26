package decorator.exercicioFiltro;

import java.util.ArrayList;
import java.util.List;

public class SaldoMaiorQue500Mil extends Filtro{

    public SaldoMaiorQue500Mil(Filtro outroFilto){
        super(outroFilto);
    }

    public SaldoMaiorQue500Mil(){}

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> novaLista = new ArrayList<>();
        for (Conta conta : contas) {
            if(conta.getSaldo()>500000.0){
                novaLista.add(conta);
            }
        }
        novaLista.addAll(filtraProximo(contas));
        return novaLista;
    }
}
