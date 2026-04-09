package ads.poo;

public class Livro {
    //Atributos
    private final String ISBN;
    private String titulo;
    private String autor;
    private int ano;

    //Construtor
    public Livro(String ISBN, String titulo, String autor, int ano) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    //Get
    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    //Set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
