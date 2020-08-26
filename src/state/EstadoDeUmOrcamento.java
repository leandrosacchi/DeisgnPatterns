package state;

public interface EstadoDeUmOrcamento {

    double aplicarDescontoExtra(Orcamento orcamento);

    void aprova(Orcamento orcamento);

    void reprova(Orcamento orcamento);

    void finaliza(Orcamento orcamento);
}
