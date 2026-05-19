package ads.poo;

public class Cavaleiro extends Personagem{

    public Cavaleiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }


    public String mover(){
        return "Cavaleiro" + super.mover() + velocidade;
    }


    public String atacar(){
        return "Cavaleiro" + super.atacar() + ataque;
    }



}
