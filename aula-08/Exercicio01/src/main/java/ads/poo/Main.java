package ads.poo;

public class Main{

    static void main(String[] args){

//        Lampada a = new Lampada();
//        Lampada b = new Lampada();
//
//        a.ligarDesligar();
//
//
//        System.out.println(a.isLigada());
//        System.out.println(b.isLigada());
//
//        if(a.isLigada()){
//            System.out.println("Está ligada");
//        }else System.out.println("Está desligada");



        Caneta bic = new Caneta();

        bic.setColor("Azul");
        bic.setNivelTinta(0.01);

        bic.abrirFechar();

        System.out.println(bic.desenhar(1,1,1,2));
        bic.abrirFechar();

        System.out.println(bic.desenhar(1,1,1,2));
        System.out.println(bic.getNivelTinta());

        System.out.println(bic.desenhar(1,1,1,2));
        System.out.println(bic.getNivelTinta());







    }
}