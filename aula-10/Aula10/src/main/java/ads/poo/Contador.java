package ads.poo;

public class Contador {

    private int valorAtual;

    public void setValorAtual(int s){
        valorAtual = s;
    }

    public int incrementarValorAtual(){
        return valorAtual++;
    }

    public int getValorAtual(){
        return valorAtual;
    }

}
