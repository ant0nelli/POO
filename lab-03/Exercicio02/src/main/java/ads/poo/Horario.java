package ads.poo;

public class Horario {
    //Atributos
    private int hora;
    private int minuto;
    private int segundo;

    //Métodos


    public Horario() {
    }

    public Horario(int hora) {
        if (hora < 24 && hora >= 0){
            this.hora = hora;
        }

    }

    public Horario(int hora, int minuto) {
        if (hora < 24 &&  hora >= 0 && minuto <60 && minuto >= 0){
            this.minuto = minuto;
            this.hora = hora;
        }
    }

    public Horario(int hora, int minuto, int segundo) {
        if(hora < 24 &&  hora >= 0 && minuto <60 && minuto >= 0 && segundo < 60 && segundo >= 0){
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
    }

    public boolean setHora(int hora) {
        if (hora < 24 && hora >= 0){
            this.hora = hora;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean setMinuto(int minuto) {

        if(minuto < 60 && minuto >= 0){
            this.minuto = minuto;
            return true;
        }else{
            return false;
        }
    }

    public boolean setSegundo(int segundo) {
        if(segundo < 60 && segundo >= 0){
            this.segundo = segundo;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
       // return hora + ":" + minuto + ":" + segundo;
    }

    private String converterParaExtenso(int valor){
        return switch (valor){
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "três";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";
            case 10 -> "dez";
            case 11 -> "onze";
            case 12 -> "doze";
            case 13 -> "treze";
            case 14 -> "quatorze";
            case 15 -> "quinze";
            case 16 -> "dezeseis";
            case 17 -> "dezesete";
            case 18 -> "dezoito";
            case 19 -> "dezenove";
            case 20 -> "vinte";
            case 30 -> "trinta";
            case 40 -> "quarenta";
            case 50 -> "cinquenta";
            default -> "";
        };
    }

    public String porExtenso(){
        if(hora >= 20){
            String hExD = converterParaExtenso(this.hora);
            int u = hora % 10;
            String hExU = converterParaExtenso(u);
            String hEx = hExD + " e " + hExU;
            return hEx;
        }

        return "";
    }

    public int segundos(){
        int total = hora * 3600;
        total += (minuto * 60);
        total += segundo;
        return total;
    }

    public int diferencaHorarios(Horario h){
        return this.segundos() - h.segundos();
    }

}
