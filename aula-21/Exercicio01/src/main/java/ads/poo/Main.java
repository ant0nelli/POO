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
    }
}
