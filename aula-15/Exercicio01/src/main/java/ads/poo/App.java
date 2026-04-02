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

        var novaConta = new Conta(numeroConta, titular, saldo);

        this.contas.add(novaConta);
    }


    void listar(){
        contas.forEach(System.out::println);
    }

    void depositar(){

    }

    void sacar(){

    }

    //MostarMenu



    void menu(int opcao){


        while(opcao != 5){

            String.format("""
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

                }
                case 4 -> {

                }


            }
        }

    }







    static void main() {
        App app = new App();


        int opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));
        app.menu(opcao);

    }
}
