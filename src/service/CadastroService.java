package service;

import estruturas.Estrutura;
import model.Aluno;

public class CadastroService {
    private Estrutura<Aluno> estrutura;

    public CadastroService(Estrutura<Aluno> estrutura) {
        this.estrutura = estrutura;
    }

    public void cadastrarAluno(int id, String nome, String curso) {
        Aluno aluno = new Aluno(id, nome, curso);
        estrutura.inserir(aluno);
    }

    public void listarAlunos() {
        estrutura.listarTodos();
    }

    public void buscarPorId(int id) {
        Aluno aluno = estrutura.buscarPorId(id);
        System.out.println(aluno != null ? aluno : "Aluno não encontrado");
    }

    public void buscarPorNome(String nome) {
        Aluno aluno = estrutura.buscarPorNome(nome);
        System.out.println(aluno != null ? aluno : "Aluno não encontrado");
    }

    public void removerAluno() {
        Aluno removido = estrutura.remover();
        System.out.println(removido != null ? "Removido: " + removido : "Nenhum aluno para remover");
    }
}

