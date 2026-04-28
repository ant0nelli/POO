package ads.poo;

import javax.swing.text.MaskFormatter;

import java.text.ParseException;
import java.util.HashMap;

public class Telefone {
    private HashMap<String,String> dados = new HashMap<>();

    public boolean add(String rotulo, String valor){
        if ((rotulo.equals("pessoal") || rotulo.equals("comercial")) && verificarTelefone(valor) ){
            dados.put(rotulo, valor);
            return true;
        }else return false;
    }

    public boolean remove(String rotulo){
        if (dados.containsKey(rotulo)){
            dados.remove(rotulo);
            return true;
        }else return false;
    }


    public boolean update(String rotulo, String valor){
        if (dados.containsKey(rotulo)){
            dados.put(rotulo, valor);
            return true;
        }else return false;

    }


    private boolean verificarTelefone(String valor){
        String eR = "^[0-9]+$";
        if (valor.matches(eR)) return true;
        else return false;
        
    }

    public String toString(){
        MaskFormatter mask = null;
        String resultado = "";

        try{
            mask = new MaskFormatter("(##) ####-####");
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('-');
            resultado = mask.valueToString(dados.get(rotulo));
        } catch (ParseException e){
            e.printStackTrace();
        }
        return resultado;
    }

}
