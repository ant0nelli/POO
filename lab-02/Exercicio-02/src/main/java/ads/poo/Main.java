package ads.poo;

import java.util.Random;

public class Main{

    static void main(){
        Random r = new Random();

        int i = r.nextInt(100);
        i++;
        int tentativa = 0;
        int tentativas = 1;



        while(tentativa != i){
            tentativa = Integer.parseInt(IO.readln("Entre com um número inteiro: "));
            if(tentativa == i){
                System.out.println("Parabéns, você acertou!");
                System.out.println("Foram necessárias " + tentativas + " tentativas");
            }else{
                if(tentativa > i){
                    System.out.println("O número sorteado é menor que o número informado");
                }else System.out.println("O número sorteado é maior que o número informado");
            }
            tentativas++;
        }

    }
}