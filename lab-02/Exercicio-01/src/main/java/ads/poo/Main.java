package ads.poo;

public class Main {
    static void main() {
            int dia = Integer.parseInt( IO.readln("Digite o dia: "));
            String mes = IO.readln("Digite o mês: ");

            if(mes.equals("março") && dia >= 20 || mes.equals("abril") || mes.equals("maio") || mes.equals("junho") && dia <= 20){
                System.out.println("Outono");
            }else if(mes.equals("junho") && dia > 21 || mes.equals("julho") || mes.equals("agosto") || mes.equals("setembro") && dia <= 22){
                System.out.println("Inverno");
            }else if(mes.equals("setembro") && dia > 23 || mes.equals("outubro") || mes.equals("novembro") || mes.equals("dezembro") && dia <= 21){
                System.out.println("Primavera");
            }else System.out.println("Verão");


        }
    }

