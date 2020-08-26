package observer;

public class EnviadorDeEmail implements AcaoAposGerarNota {
    @Override
    public void executa() {
        System.out.println("E-mail enviado");
    }
}
