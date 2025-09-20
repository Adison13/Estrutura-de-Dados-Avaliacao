package model;

public class Aluno {
    private int id;
    private String nome;
    private String curso;

    public Aluno(int id, String nome, String curso) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCurso() { return curso; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Curso: " + curso;
    }
}

