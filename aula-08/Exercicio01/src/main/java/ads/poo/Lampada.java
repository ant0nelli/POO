package ads.poo;

public class Lampada {

    // Atributos
    private boolean ligada;

    // Métodos
    public boolean ligarDesligar(){
        ligada = !ligada;
        return ligada;
    }

    public boolean isLigada(){
        return ligada;
    }


}
