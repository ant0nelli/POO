package ads.poo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Contato arthur = new Contato("Arthur", "Antonelli", LocalDate.of(2006, 12, 5));
        arthur.addTelefone("pessoal", "48991045006");
        arthur.addEmail("pessoal","arthur.antonelli76@gmail.com");
        arthur.addEmail("faculdade","arthur.a12@aluno.ifsc.edu.br");
        // System.out.println(arthur.toString());
        

        Agenda a = new Agenda();
        a.addContato(arthur);
        a.updateEmail("pessoal", "yantonelli05@gmail.com", 0);

        Contato gabriel = new Contato("Gabriel", "Teixeira", LocalDate.of(2006, 06, 06));

        a.addContato(gabriel);
        a.addEmail("pessoal", "gabkteixeira@gmail.com", 1);
        
        System.out.println(a.toString());

    }
}
