package observer;

public class Impressora implements AcaoAposGerarNota {
    @Override
    public void executa() {
        System.out.println("Nota impressa");
    }
}
