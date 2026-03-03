package ads.poo;


public class Main {

    public static void main(String[] args) {

        int dimensao = Integer.parseInt(args[1]);
        System.out.println(dimensao);


        if(args[0].equals("triangulo")){
            for (int i = 1; i < dimensao ; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (args[0].equals("losango")) {
            System.out.print("*");
            for (int i = 1; i < dimensao; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print("*");
                }
            System.out.println();
            }

        } else if (args[0].equals("retangulo")) {

            
        }

    }
}
