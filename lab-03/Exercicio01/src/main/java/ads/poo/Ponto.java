package ads.poo;

public class Ponto {
    //Atributos
    private int x;
    private int y;

    //Métodos

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distancia(Ponto p){
        double d = Math.sqrt( Math.pow((x - p.x),2) + Math.pow((y - p.y),2));
        return d;
    }

}
