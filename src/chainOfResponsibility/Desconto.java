package chainOfResponsibility;

public interface Desconto {

    double calcula(Orcamento orcamento);

    void setDesconto(Desconto proximo);
}
