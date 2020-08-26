package chainOfResponsibility;

import java.util.Collections;
import java.util.List;

public class Orcamento {

    private final double valor;
    private List<Item> itens;

    public Orcamento(double valor){
        this.valor = valor;
    }

    public Orcamento(double valor, List<Item> itens){
        this.valor = valor;
        this.itens = itens;
    }

    public double getValor() {
        return valor;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public boolean contemItemDeNome(String nome){
        for (Item item:itens){
            if (item.getNome().toUpperCase().equals(nome)) return true;
        }
        return false;
    }
}
