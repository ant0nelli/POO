package ads.poo;


public class Caneta {

    //Atributos
    private String cor; //Valor inicial => ""
    private double nivelTinta; // 0.0
    private boolean fechada; //false


    //Métodos
    public boolean abrirFechar(){
        fechada = !fechada;
        return fechada;
    }

    public void setColor(String c){
        cor = c;
    }

    public void setNivelTinta(double d){
        nivelTinta = d;
    }

    public String getCor(){
        return cor;
    }

    public double getNivelTinta(){
        return nivelTinta;
    }

    public String desenhar(int x1, int y1, int x2, int y2){
        if(fechada){
            return ("A caneta está fechada");
        }else{
            //calcular a distancia
            double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));
            if(nivelTinta - distancia/100 < 0){
                return ("Tinta insuficiente");
            }
            //debitar do nível de tinta
            nivelTinta -= distancia/100;

            //retornar a distancia percorrida
            //"Desenhei 1cm na cor azul
            return String.format(" Desenhei %.2f cm na cor %s", distancia, cor);
        }

    }



}
