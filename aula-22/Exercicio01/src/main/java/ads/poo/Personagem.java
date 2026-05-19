package ads.poo;

public abstract class Personagem {
    protected int vida;
    protected int ataque;
    protected double velocidade;

    public Personagem(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String mover(){
        return " andando com velocidade ";
    }

    public String atacar(){
        return " atacando com força " ;
    }

}
