package templateMethod;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateCalculoImposto{
    @Override
    protected boolean condicaoParaMaximo(Orcamento orcamento) {
        return tem2ItensComMesmoNome(orcamento);
    }

    @Override
    protected double taxaMaxima(Orcamento orcamento) {
        return 0.13*orcamento.getValor()+100.0;
    }

    @Override
    protected double taxaMinima(Orcamento orcamento) {
        return 0.01*orcamento.getItens().size()*orcamento.getValor();
    }

    private boolean tem2ItensComMesmoNome(Orcamento orcamento){
        List<String> noOrcamento = new ArrayList<>();
        for (Item item: orcamento.getItens()) {
            if (noOrcamento.contains(item.getNome()))
                return true;
            else noOrcamento.add(item.getNome());
        }
        return false;
    }
}
