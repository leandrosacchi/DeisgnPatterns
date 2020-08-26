package decorator.exercicioFiltro;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conta {

    private double saldo;
    private String mesDeAbertura;

    SimpleDateFormat sdf = new SimpleDateFormat("MM");

    public Conta(double saldo, String mesDeAbertura) {
        this.saldo = saldo;
        this.mesDeAbertura = mesDeAbertura;
    }

    public String getMesDeAbertura() {
        return mesDeAbertura;
    }

    public void setMesDeAbertura(Date mesDeAbertura) {
        this.mesDeAbertura = sdf.format(mesDeAbertura);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", mesDeAbertura='" + mesDeAbertura + '\'' +
                '}';
    }
}
