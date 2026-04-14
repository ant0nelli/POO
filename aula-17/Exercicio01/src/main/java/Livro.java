import java.util.ArrayList;

public class Livro {
    private String titulo;
    private Pessoa autor;
    private ArrayList<Capitulo> capitulos;

    public Livro(String t, Pessoa a){
        titulo = t;
        autor = a;
        this.capitulos = new ArrayList<>();
    }

    public void adicionaCapitulo(String t){
        Capitulo novoCapitulo = new Capitulo(t);
        capitulos.add(novoCapitulo);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        this.capitulos.forEach(sb::append);

        return String.format("""
                Livro: %s
                Autor: %n%s
                Capítulos: %n%s
                """, titulo, autor, sb.toString());
    }
}
