package observer;

public class EnviadorDeSms implements AcaoAposGerarNota {
    @Override
    public void executa() {
        System.out.println("SMS enviado");
    }
}
