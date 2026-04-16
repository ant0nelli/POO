package ads.poo;

import java.util.ArrayList;

public class Aviao {
    private int maxTripulantes;
    private int maxPassageiros;
    private int maxCombustivel;
    private ArrayList<Motor> motores;

    Aviao(int maxTripulantes, int maxPassageiros, int maxCombustivel, int qntMotores, String tipoMotor){
        this.maxTripulantes = maxTripulantes;
        this.maxPassageiros = maxPassageiros;
        this.maxCombustivel = maxCombustivel;
        this.motores = new ArrayList<>();
        if (qntMotores <= 8 && qntMotores > 0){
            for (int i = 0; i < qntMotores; i++) {
                this.motores.add(new Motor(tipoMotor));
            }
        } else{
            this.motores.add(new Motor("hélice"));
        }

    }

    public void ligarDesligar(){
        for (Motor m : motores){
            m.ligarDesligar();
        }
    }

}
