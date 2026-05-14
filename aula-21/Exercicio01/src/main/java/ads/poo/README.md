# Exercício 01
 ```mermaid
 classDiagram
     direction LR
     class Pessoa{
         -nome
         -email
     }
     
     class Aluno{
         -matricula : String
     }
     class Professor{
         - salario : double
         
     }
     class Coordenador{
         -Curso : String
         
     }
     class Diretor{
         
     }
     class Funcionario
     Aluno --|> Pessoa
     Professor --|> Funcionario
     Coordenador --|> Professor
     Funcionario --|> Pessoa
     Diretor --|> Funcionario
```
# Exercício 02
```mermaid
classDiagram
    class Livro{
        -isbn
    }
    class Revista{
        -issn
    }
    class Jornal{
        
    }
    class Gibi{
        -ilustradores
    }
    
    class Obra{
        -id: int
        -titulo : String
        -pagina: int
    }
    Livro --|> Obra
    Revista --|> Obra
    Revista *-- Artigos
    Gibi --|> Revista
    Jornal --|> Obra
    
    
```