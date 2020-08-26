package state;

import java.util.Collections;

public class Orcamento {

    protected double valor;
    protected EstadoDeUmOrcamento estadoAtual;

    public Orcamento(double valor){
        this.valor = valor;
        this.estadoAtual = new EmAprovacao();
    }

    public void aplicarDescontoExtra(){
        estadoAtual.aplicarDescontoExtra(this);
    }

    public void aprovar(){
        estadoAtual.aprova(this);
    }

    public void reprovar(){
        estadoAtual.reprova(this);
    }

    public void finalizar(){
        estadoAtual.finaliza(this);
    }
}
