package ads.poo;

public class Carro {

    //Atributos
    private String modelo;
    private int velocidadeAtual;
    private int velocidadeMax;

    private static final int VEL_MAX_MODELOS = 300;
    private static final int VEL_MIN_MODELOS = 0; //acessado pela classe: Carro.VEL_MINIMA_MODELOS



    //Construtores
    public Carro(String modelo, int velocidadeMax) {
        this.modelo = modelo;
        this.velocidadeMax = velocidadeMax;
    }

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    //Métodos
    public void acelerar(int a){
        if(velocidadeAtual + a <= velocidadeMax){
            velocidadeAtual += a;
        }
    }

    public void freiar(int b){
        if(velocidadeAtual - b >= VEL_MIN_MODELOS){
            velocidadeAtual -= b;
        }
    }

    public int getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public String getModelo() {
        return modelo;
    }

}
