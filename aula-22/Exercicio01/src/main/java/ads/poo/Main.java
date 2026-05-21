package ads.poo;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        Aldeao a = new Aldeao();


        ArrayList<Personagem> personagens = new ArrayList<>();

        personagens.add(new Aldeao());
        personagens.add(new Cavaleiro());
        personagens.add(new Arqueiro());

        for(Personagem p: personagens){
            IO.println(p.mover()); //polimorifsmo (Execeutado de vaŕias maneiras diferentes)
        }

    }
}
