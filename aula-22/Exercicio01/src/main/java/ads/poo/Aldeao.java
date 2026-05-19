package ads.poo;

public class Aldeao extends Personagem{

    public Aldeao() {
        super(25, 1,0.8);
    }

    @Override
    public String mover(){
        return "Aldeão" + super.mover() + velocidade;
    }

    @Override
    public String atacar(){
        return "Aldeão" + super.atacar() + ataque;
    }



}
