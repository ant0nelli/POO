package ads.poo;

public class Arqueiro extends Personagem{

    public Arqueiro() {
        super(35,2, 1);
    }

    public String mover(){
        return "Arqueiro "+ super.mover() + velocidade;
    }

    public String atacar(){
        return "Arqueiro" + super.atacar() + ataque;
    }
}
