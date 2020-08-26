package chainOfResponsibility;

import strategy.*;

public class CalculadorDeDesconto {

    public double calculaDesconto(Orcamento orcamento) {
        Desconto d1 = new DescontoParaMaisDeCincoItens();
        Desconto d2 = new DescontoParaOrcamentoMaiorQueQuinhetosReais();
        Desconto d3 = new DescontoPorVendaCasada();
        Desconto d4 = new SemDesconto();

        d1.setDesconto(d2);
        d2.setDesconto(d3);
        d3.setDesconto(d4);

        return d1.calcula(orcamento);
    }
}

