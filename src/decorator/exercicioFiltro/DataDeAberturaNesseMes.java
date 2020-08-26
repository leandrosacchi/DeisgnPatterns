package decorator.exercicioFiltro;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataDeAberturaNesseMes extends Filtro{

    public DataDeAberturaNesseMes(Filtro outroFiltro){
        super(outroFiltro);
    }

    public DataDeAberturaNesseMes(){}

    SimpleDateFormat sdf = new SimpleDateFormat("MM");
    String dataAtual = sdf.format(new Date());

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> novaLista = new ArrayList<>();
        for (Conta conta: contas){
            if (conta.getMesDeAbertura().equals(dataAtual)){
                novaLista.add(conta);
            }
        }
        novaLista.addAll(filtraProximo(contas));
        return novaLista;
    }
}
