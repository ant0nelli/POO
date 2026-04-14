public class Motor{
    private int hp;
    private int giroAtual;
    private int cilindros;

     Motor(){
        int hp;
        int giroAtual;
        int cilindros;
    }
    public void acelerar(int v){
        giroAtual += v;
    }
}
