package ads.poo;

import java.time.LocalDate;

public class Contato {
    //Atributos
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ColecaoTelefone telefones;
    private ColecaoEmail emails;

    //Métodos
    public Contato(String nome, String sobrenome, LocalDate dataNasc){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.telefones = new ColecaoTelefone();
        this.emails = new ColecaoEmail();
    }

    public boolean addTelefone(String rotulo, String valor){
        return telefones.add(rotulo, valor);
    }

    public boolean addEmail(String rotulo, String valor){
        return emails.add(rotulo, valor);
    }

    public boolean removeTelefone(String rotulo){
        return telefones.remove(rotulo);
    }

    public boolean removeEmail(String rotulo){
        return emails.remove(rotulo);
    }

    public boolean updateTelefone(String rotulo, String valor){
        return telefones.update(rotulo, valor);
    }

    public boolean updateEmail(String rotulo, String valor){
        return emails.update(rotulo, valor);
    }

    public String toString(){
        String telefone = telefones.toString();
        String email = emails.toString();
        return "Telefone(s): " + telefone  + "Email(s): "+ email;
    }

    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

}
