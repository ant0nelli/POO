package ads.poo;

public class Conta {
    //Atributos
    private String numeroConta;
    private String titular;
    private double saldo;


    // Construtor

    public Conta(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = (saldo > 0) ? saldo : 0;
    }

    //getters
    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //depositar
    public void depositar(double valor){
        this.saldo += (valor > 0) ? valor : 0;
    }

    //sacar
    public void sacar(double valor){
        this.saldo += (valor > saldo) ? 0 : (valor>0) ? valor : 0;
    }

    //toString
    public String toString(){
        return String.format(""" 
                Conta: %s
                Titular: %s
                Saldo: %.2f
                """, numeroConta, titular, saldo);
    }


}
