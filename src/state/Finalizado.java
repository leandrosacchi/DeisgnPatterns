package state;

public class Finalizado implements EstadoDeUmOrcamento{

    @Override
    public double aplicarDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Estado finalizado não recebe desconto extra");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Estado Finalizado não pode ser aprovado");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Estado Finalizado não pode ser reprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Estado já está finalizado");
    }
}
