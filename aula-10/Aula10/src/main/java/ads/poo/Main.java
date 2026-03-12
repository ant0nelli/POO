package ads.poo;

public class Main {
    static void main() {
        //Contador
        Contador a = new Contador();
        System.out.println(a.getValorAtual());
        a.incrementarValorAtual();
        a.incrementarValorAtual();
        System.out.println(a.getValorAtual());
        a.setValorAtual(50);
        System.out.println(a.getValorAtual());
        System.out.println();

        //Personagem
        Personagem b = new Personagem();
        b.setAgilidade(90);
        b.setArma("Machado");
        b.setAltura(170);
        b.setForca(60);

        System.out.println(b.getAgilidade());
        System.out.println(b.getArma());
        System.out.println(b.getAltura());
         System.out.println(b.getForca());
        System.out.println();

        //Batedeira
        Batedeira c = new Batedeira();
        System.out.println(c.isLigada());
        c.ligarDesligar();
        System.out.println(c.isLigada());
        c.setVelocidade(3);
        System.out.println(c.getVelocidadeAtual());
        c.setPonta("Gancho");
        System.out.println(c.getPonta());
        System.out.println();

        //Disciplina
        Disciplina poo = new Disciplina();
        poo.setAlunosAtuais(21);
        poo.setConteudos("Revisão Java, IDEs, Programação Orientada a Objetos");
        poo.setDependencias("ALG");
        poo.setHorario("35N 12");
        poo.setProfessor("Mello");

        System.out.println(poo.getAlunosAtuais());
        System.out.println(poo.getConteudos());
        System.out.println(poo.getDependencias());
        System.out.println(poo.getHorario());
        System.out.println(poo.getProfessor());

    }
}
