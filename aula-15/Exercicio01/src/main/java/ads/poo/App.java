package ads.poo;

import java.util.ArrayList;

public class App {

    private ArrayList<Conta> contas;

    public App(){
        this.contas = new ArrayList<>();
    }

    void cadastrar(){
        var numeroConta = IO.readln("Número da conta: ");
        var titular = IO.readln("Titular da conta: ");
        var saldo = Integer.parseInt(IO.readln("Saldo inicial: "));

        Conta novaConta = new Conta(numeroConta, titular, saldo);

        this.contas.add(novaConta);
    }


    void listar(){
        contas.forEach(IO::println);
    }

    void depositar(){
        boolean encontrou = false;
        String numeroConta = IO.readln("Número da conta: ");
        for (Conta e : contas){
            if(e.getNumeroConta().equals(numeroConta)){
                encontrou = true;
                double valor = Double.parseDouble(IO.readln("Valor do deposito: "));
                e.depositar(valor);
                System.out.println("Novo saldo: " + e.getSaldo());
                break;
            }
        }if(!encontrou){
            System.out.println("Essa conta não existe.");
        }
    }

    void sacar(){
        boolean encontrou = false;
        String numeroConta = IO.readln("Número da conta: ");

        for (Conta e: contas){
            if(e.getNumeroConta().equals(numeroConta)){
                encontrou = true;
                double valor = Double.parseDouble(IO.readln("Valor do saque: "));
                e.sacar(valor);
                System.out.println("Novo saldo: " + e.getSaldo());
                break;
            }
        }if (!encontrou){
            System.out.println("Essa conta não existe");
        }
    }

    //MostarMenu



    void menu(){
        int opcao = 0;
        while(opcao != 5){

            IO.println("""
                ..:: Menu ::..
                1 - Cadastrar conta
                2 - Listar todas as contas
                3 - Depositar em uma conta
                4 - Sacar de uma conta
                5 - Sair""");
            opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));

            switch (opcao){
                case 1 -> {
                    cadastrar();
                }
                case 2 -> {
                    listar();
                }
                case 3 -> {
                    depositar();
                }
                case 4 -> {
                    sacar();
                }
                case 5->{
                    break;
                }

            }
        }

    }


    static void main() {
        App app = new App();
        app.menu();


    }
}
