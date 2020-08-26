package decorator;

public class DecoratorPatternTest {

    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto issComIss = new ISS(new ICMS());
        Imposto icms = new ICMS();
        Imposto icmsComIccc = new ICMS(new ICCC());
        Imposto iccc = new ICCC();
        Imposto icccComAlto = new ICCC(new ImpostoMuitoAlto());

        Orcamento orcamento = new Orcamento(1500.0);

        System.out.println(iss.calcula(orcamento));
        System.out.println(issComIss.calcula(orcamento));
        System.out.println(icms.calcula(orcamento));
        System.out.println(icmsComIccc.calcula(orcamento));
        System.out.printf("%.1f", iccc.calcula(orcamento));
        System.out.println("\n"+icccComAlto.calcula(orcamento));

    }


}
