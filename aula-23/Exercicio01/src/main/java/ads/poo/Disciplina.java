package ads.poo;

import java.util.Arrays;

public class Disciplina {
    private  String sigla;
    private DiaDaSemana[] aulas;

    public Disciplina(String sigla, DiaDaSemana[] aulas) {
        this.sigla = sigla;
        this.aulas = aulas;
    }

    @Override
    public String toString() {
        return "Sigla: " + this.sigla + "\nDias com aulas: " + Arrays.toString(aulas);
    }



}
