package ads.poo;

import ads.poo.produtos.Dimensao;
import ads.poo.produtos.SemFio;
import ads.poo.produtos.Telefone;

public class Main {
    static void main() {
        Dimensao d = new Dimensao(4,3,2);
        Telefone t = new Telefone(123, "a23", "Nokia", 300, d);
        SemFio sf = new SemFio(123, "a12", "Nokia", 234, d, 3.5, 12, 43);
        System.out.print(sf.toString());

        Telefone a = new SemFio(1234, "123", "Samsung", 334, d, 4.5, 13, 32);
        sf.getFrequencia();
        ((SemFio)a).getFrequencia();

        Telefone[] vetor = new Telefone[3];

        vetor[0] = t;
        vetor[1] = sf;
        vetor[2] = a;

        for(Telefone aux : vetor){

            if(aux instanceof SemFio novo){
                IO.println(novo.getFrequencia());
            }

        }
    }
}
