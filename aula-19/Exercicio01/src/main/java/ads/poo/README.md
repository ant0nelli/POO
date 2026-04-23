# Agenda Telefônica

```mermaid
classDiagram
    
    class Agenda{
        
    }
    
    class Contato{
        
    }
    
    class Telefone{
        
    }
    
    class Email{
        
    }

    Contato *-- Telefone 
    Contato *-- Email
    Agenda *-- Contato
```
