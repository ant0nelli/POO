public class Vetor {
    public static void main(String[] args) {
        //int[] vetor = new int[5]; //Todas as posições começam com o valor zero

        //int tamanho = vetor.length;

        //vetor[0] = 10;
        //vetor[4] = 90;



        //int[] outra = (3,4,5,8); //new int[](2,4,5,7)

        //int[][] matriz = new int[3][2]; //linha, coluna
        //matriz[2][1] = 50;


        int[] vetor = new int[100];
        int impar = 3;
        for(int i =0; i<100;i++){
            vetor[i] = impar;
            impar = impar + 2;
            System.out.println(vetor[i]);
        }
        //ou
        int[] vetor2 = new int[100];
        vetor2[0] = 3;
        for (int i = 1; i < vetor2.length; i++) {
            vetor[i] = vetor[i-1] + 2;
        }
    }
}
