package ads.poo;

public class Cavaleiro extends Personagem implements Guerreiro{

    public Cavaleiro() {
        super(50, 3, 2);
    }


    public String mover(){
        return "Cavaleiro" + super.mover() + velocidade;
    }


    public String atacar(){
        return "Cavaleiro atacando";
    }



}
