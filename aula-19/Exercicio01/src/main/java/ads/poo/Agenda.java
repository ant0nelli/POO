package ads.poo;

import java.util.ArrayList;

public class Agenda {
    //Atributos
    private ArrayList<Contato> contatos;


    //Métodos
    public Agenda(){
        contatos = new ArrayList<>();
    }


    public boolean addContato(Contato c){
        return contatos.add(c);
    }

    public ArrayList<Contato> findContato(String nome, String sobrenome){
        ArrayList<Contato> resultado = new ArrayList<>();
        for(Contato c : contatos){
            if(c.getNome().equals(nome) && c.getSobrenome().equals(sobrenome)){
                resultado.add(c);
            }
        }
        return resultado;
    }

    public boolean removeContato(int indiceNaLista){
        if(contatos.get(indiceNaLista) != null){
            contatos.remove(indiceNaLista);
            return true;
        }else return false;
        
    }

    public boolean addTelefone(String rotulo, String valor, int indiceNaLista){
        Contato c = contatos.get(indiceNaLista);
        return c.addTelefone(rotulo, valor);
    }

    public boolean addEmail(String rotulo, String valor, int indiceNaLista){
        Contato c = contatos.get(indiceNaLista);
        return c.addEmail(rotulo, valor);
    }

    public boolean updateTelefone(String rotulo, String valor, int indiceNaLista){
        Contato c = contatos.get(indiceNaLista);
        return c.updateTelefone(rotulo, valor);
    }

    public boolean updateEmail(String rotulo, String valor, int indiceNaLista){
        Contato c = contatos.get(indiceNaLista);
        return c.updateEmail(rotulo, valor);
    }

    public boolean removeTelefone(String rotulo, int indiceNaLista){
        Contato c = contatos.get(indiceNaLista);
        return c.removeTelefone(rotulo);
    }

    public boolean removeEmail(String rotulo, int indiceNaLista){
        Contato c = contatos.get(indiceNaLista);
        return c.removeEmail(rotulo);
    }

    public String toString(){
        int i = 1;
        String resultado = "";
        for( Contato c : contatos){
            resultado += "Contato " + i + ": " + c.toString() + "\n";
            i++;
        } 
        return resultado;
    }


}
