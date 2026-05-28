package ads.poo;

public enum DiaDaSemana {
    DOMINGO(1, "Domingo"),
    SEGUNDA(2, "Segunda-Feira"),
    TERCA(3, "Terça-Feira"),
    QUARTA(4, "Quarta-Feira"),
    QUINTA(5, "Quinta-Feira"),
    SEXTA(6, "Sexta-Feira"),
    SABADO(7, "Sábado");

    public final int codigo;
    public final String extenso;

    DiaDaSemana(int codigo, String extenso) {
        this.codigo = codigo;
        this.extenso = extenso;
    }

    public static DiaDaSemana getByCodigo(int codigo){
        for (DiaDaSemana dia : DiaDaSemana.values()){
            if (dia.codigo == codigo){
                return dia;
            }
        }
        throw new IllegalArgumentException("Código Inválido");
    }

    @Override
    public String toString() {
        return extenso;
    }
}
