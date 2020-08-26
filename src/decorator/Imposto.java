package decorator;

import com.sun.org.apache.xpath.internal.operations.Or;

public abstract class Imposto {

    private Imposto outroImposto;

    public Imposto(Imposto outroImposto){
        this.outroImposto = outroImposto;
    }

    public Imposto(){
    }

    public double calculaOutroImposto(Orcamento orcamento){
        if (outroImposto == null) return 0;
            return outroImposto.calcula(orcamento);
    }

    public abstract double calcula(Orcamento orcamento);
}
