package ads.poo;

import javax.swing.text.MaskFormatter;
import java.util.HashMap;

public class Telefone {
    private HashMap<String,String> dados;

    public boolean add(){
        String rotulo;
        String valor;

    }

    private boolean verificarTelefone(int valor){
        MaskFormatter mask = null;
        String resultado = "";

        try{
            mask = new MaskFormatter("(##) ####-####");
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('-');
            resultado = mask.valueToString(valor);
        }

    }

}
