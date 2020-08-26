package chainOfResponsibility;

public class SemDesconto implements Desconto {

    @Override
    public double calcula(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setDesconto(Desconto proximo) {
    }
}
