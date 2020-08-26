package state;

public class EmAprovacao implements EstadoDeUmOrcamento {

    private boolean descontoJaFoiAplicado = false;

    @Override
    public double aplicarDescontoExtra(Orcamento orcamento) {
        if(descontoJaFoiAplicado){
            throw new RuntimeException("Desconto já foi aplicado");
        }
        descontoJaFoiAplicado = true;
        return orcamento.valor -= orcamento.valor*0.05;
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Aprovado();
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Reprovado();
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Estado Em Aprovação não pode ser finalizado");
    }
}
