package ads.poo;

public class Batedeira {

    private boolean ligada;
    private int velocidadeAtual;
    private String ponta;

    public boolean ligarDesligar(){
        ligada = !ligada;
        return ligada;
    }

    public boolean isLigada(){
        return ligada;
    }

    public void setVelocidade(int a){
        velocidadeAtual = a;
    }

    public int getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public void setPonta(String b){
        ponta = b;
    }

    public String getPonta(){
        return ponta;
    }


}
