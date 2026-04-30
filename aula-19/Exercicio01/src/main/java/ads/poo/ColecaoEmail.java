package ads.poo;

import java.util.HashMap;

public class ColecaoEmail {
    private HashMap<String, String> dados = new HashMap<>();

    public boolean add(String rotulo, String valor) {

        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

        if (valor.matches(eR) && !dados.containsKey(rotulo)) {
            dados.put(rotulo, valor);
            return true;
        } else
            return false;
    }

    public boolean remove(String rotulo) {
        if (dados.containsKey(rotulo)) {
            dados.remove(rotulo);
            return true;
        } else
            return false;
    }

    public boolean update(String rotulo, String valor) {
        if (dados.containsKey(rotulo)) {
            dados.put(rotulo, valor);
            return true;
        } else
            return false;
    }

    public String toString() {
        String resultado = "";
        for (String rotulo : dados.keySet()) {
            String email = dados.get(rotulo);

            resultado += "Rotulo: " + rotulo + " Email: " + email + "\n";
        }
        return resultado;
    }

}
