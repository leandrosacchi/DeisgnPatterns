package decorator.exercicioFiltro;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

    protected Filtro outroFiltro;

    public Filtro(Filtro outroFiltro){
        this.outroFiltro = outroFiltro;
    }

    public Filtro(){
    }

    public abstract List<Conta> filtra (List<Conta> contas);

    public List<Conta> filtraProximo (List<Conta> contas){
        if (outroFiltro==null) return new ArrayList<Conta>();
            return outroFiltro.filtra(contas);
    }
}
