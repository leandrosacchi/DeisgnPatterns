package state;

public class Aprovado implements EstadoDeUmOrcamento {

    private boolean descontoJaFoiAplicado = false;

    @Override
    public double aplicarDescontoExtra(Orcamento orcamento) {
        if(descontoJaFoiAplicado){
            throw new RuntimeException("Desconto já foi aplicado");
        }
        descontoJaFoiAplicado = true;
        return orcamento.valor -= orcamento.valor*0.02;
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Estado já está aprovado");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Estado Aprovado não pode ser reprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }
}
