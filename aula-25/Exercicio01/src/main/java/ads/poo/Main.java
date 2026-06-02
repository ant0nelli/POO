package ads.poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner ler = new Scanner(System.in);
        int a,b;

        try{
            System.out.print("Entre com um número: ");
            a = ler.nextInt();
            System.out.print("Entre com o número: ");
            b = ler.nextInt();

            int res = a/b;

            System.out.println(a + " dividido por " + b +" = " + res);
        }catch (InputMismatchException e){
            System.err.println("Só é perimitido números inteiros");
            ler.nextLine();
        }catch (ArithmeticException e){
            System.err.println("Não é possível dividir por zero");
            ler.nextLine();
        }catch (Exception e){
            System.err.println("Comportamento inesperado");
            ler.nextLine();
        }
        System.out.println("Fim do programa");

    }
}
