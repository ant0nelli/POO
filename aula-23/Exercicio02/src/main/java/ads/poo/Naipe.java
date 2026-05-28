package ads.poo;

public enum Naipe {
    OURO(1, "Ouro"),
    ESPADA(2, "Espada"),
    COPAS(3, "Copas"),
    PAUS(4, "Paus");

    public final int codigo;
    public final String extenso;

    Naipe(int codigo, String extenso) {
        this.codigo = codigo;
        this.extenso = extenso;
    }
}
