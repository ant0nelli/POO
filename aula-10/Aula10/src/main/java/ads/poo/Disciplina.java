package ads.poo;

public class Disciplina {

    private String conteudos;
    private String professor;
    private String horario;
    private String dependencias;
    private int alunosAtuais;

    public void setConteudos(String a){
        conteudos = a;
    }

    public void setProfessor(String b){
        professor = b;
    }

    public void setHorario(String c){
        horario = c;
    }

    public void setDependencias(String d){
        dependencias = d;
    }

    public void setAlunosAtuais(int e){
        alunosAtuais = e;
    }

    public String getConteudos(){
        return conteudos;
    }

    public String getHorario(){
        return horario;
    }

    public String getDependencias(){
        return dependencias;
    }

    public int getAlunosAtuais(){
        return alunosAtuais;
    }

    public String getProfessor(){
        return professor;
    }

}
