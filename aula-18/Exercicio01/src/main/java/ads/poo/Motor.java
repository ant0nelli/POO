package ads.poo;

public class Motor {
    private String tipoMotor;
    private boolean ligado;

    Motor(String tipoMotor){
        this.tipoMotor = tipoMotor;
        this.ligado = false;
    }

    public void ligarDesligar(){
        ligado = !ligado;
    }
}
