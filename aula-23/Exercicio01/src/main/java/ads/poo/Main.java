package ads.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        String sigla = IO.readln("Entre com a sigla: ");
        int dia = Integer.parseInt(IO.readln("Entre com o dia: "));

        DiaDaSemana primeiro = DiaDaSemana.getByCodigo(dia);

        int dia2 = Integer.parseInt(IO.readln("Entre com o dia 2: "));

        DiaDaSemana segundo = DiaDaSemana.getByCodigo(dia2);

        Disciplina poo = new Disciplina(sigla, new DiaDaSemana[]{primeiro, segundo});
        IO.println(poo);



        IO.println(Planetas.getPlaneta(5));
    }
}
