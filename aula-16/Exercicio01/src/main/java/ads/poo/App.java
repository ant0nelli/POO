package ads.poo;

import java.util.HashMap;

public class App {
    HashMap<String, Livro> livros = new HashMap<>();

    void adicionar(){
        String isbn = IO.readln("ISBN: ");
        String titulo = IO.readln("Título: ");
        String autor = IO.readln("Autor: ");
        int ano = Integer.parseInt(IO.readln("Ano de lançamento: "));

        livros.put(isbn, new Livro(isbn, titulo, autor, ano));
    }

    void listar(){
        livros.forEach((isbn, Livro)->IO.println(Livro));
    }
    void listarPorAno(){
        int ano = Integer.parseInt(IO.readln("Ano desejado: "));
        livros.forEach((isbn, Livro)->{
            if(){
                IO.println();
            }
        });
    }
    void alterarDados(){
        String isbn = IO.readln("ISBN: ");
        Livro l = livros.get(isbn);
        if (l != null){
            String titulo = IO.readln("Título novo: ");
            String autor = IO.readln("Autor novo: ");
            int ano = Integer.parseInt(IO.readln("Ano de lançamento novo: "));

            livros.put(isbn, new Livro(isbn, titulo, autor, ano));
        }


    }

    void menu(){
    }
}
