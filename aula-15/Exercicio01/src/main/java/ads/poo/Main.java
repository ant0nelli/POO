package ads.poo;

import java.util.ArrayList;

public class Main {

    public static void main(){

        //String s = "Maria";
        //var outra = "Juca"; //Inferência de tipos (Quando compilar o java escolhe o tipo)

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Juca");
        lista.add("Maria");
        lista.add("Pedro");

        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals("Maria")){
                System.out.println(lista.get(i));
            }
        }

        //Melhor utilizar esse para Arrays (For each)
        for (var elemento: lista){
            if(elemento.equals("Maria")){
                System.out.println(elemento);
            }
        }

        //Usando lambda
        lista.forEach(elemento -> {
            if(elemento.equals("Maria")){
                System.out.println(elemento);
            }
        });

        //Method reference - passar o método por referência, com o operador ::
        lista.forEach(System.out::println);



        //Remover todas as Strings Maria
        lista.removeIf(e -> e.equals("Maria"));

        ArrayList<Conta> contas = new ArrayList<>();






    }
}
