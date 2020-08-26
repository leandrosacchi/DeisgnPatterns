package state;

public class Reprovado implements EstadoDeUmOrcamento{

    @Override
    public double aplicarDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Estado reprovado não recebe desconto extra");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Estado Reprovado não pode ser aprovado");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Estado já está reprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }
}
