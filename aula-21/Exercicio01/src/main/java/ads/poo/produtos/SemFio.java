package ads.poo.produtos;

public class SemFio extends Telefone {
    private double frequencia;
    private int canais;
    private double distancia;

    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int canais, double distanciaOperacao) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distancia = distanciaOperacao;
    }

    @Override
    public String toString() {
        return "Telefone{" + super.toString() + "} SemFio{" +
                "frequencia=" + frequencia +
                ", canais=" + canais +
                ", distancia=" + distancia +
                '}';
    }


    public double getFrequencia() {
        return frequencia;
    }
}
