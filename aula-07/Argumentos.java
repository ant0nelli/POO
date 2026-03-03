public class Argumentos{

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Não forneceu argumentos na linha de comando");
        }else{

            for (int i = 0; i < args.length; i++) {
                System.out.println(i +1 + "° argumento: " + args[i]);    
            }

            
        }

    }

}