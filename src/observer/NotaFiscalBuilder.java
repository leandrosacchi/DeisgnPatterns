package observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

    private String cnpj;
    private String razaoSocial;
    private List<ItemDaNota> todosItens = new ArrayList<>();
    private double valorBruto;
    private double impostos;
    private String observacoes;
    private Calendar data;
    private List<AcaoAposGerarNota> acoes = new ArrayList<>();

    public void addAcao(AcaoAposGerarNota acao){
        this.acoes.add(acao);
    }

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }
    
    public NotaFiscalBuilder comItens(ItemDaNota item){
        todosItens.add(item);
        valorBruto += item.getValor();
        impostos += item.getValor()*0.05;
        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscalBuilder naDataAtual() {
        this.data = Calendar.getInstance();
        return this;
    }

    public NotaFiscalBuilder naData(Calendar data) {
        this.data = data;
        return this;
    }

    public NotaFiscal build(){
        NotaFiscal nf = new NotaFiscal(razaoSocial,cnpj,data,valorBruto,impostos,todosItens,observacoes);

        for (AcaoAposGerarNota acao : acoes) {
            acao.executa();
        }

        return nf;
    }
}
