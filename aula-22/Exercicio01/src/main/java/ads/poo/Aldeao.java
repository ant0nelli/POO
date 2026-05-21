package ads.poo;

public class Aldeao extends Personagem implements Guerreiro, Coletor {

    public Aldeao() {
        super(25, 1,0.8);
    }

    @Override
    public String mover(){
        return "Aldeão" + super.mover() + velocidade;
    }

    @Override
    public String atacar(){
        return "Aldeão atacando";
    }

    public String coletarOuro(){
        return "Aldeão coletando ouro";
    }

    public String coletarMadeira(){
        return "Aldeão coletando madeira";
    }


}
