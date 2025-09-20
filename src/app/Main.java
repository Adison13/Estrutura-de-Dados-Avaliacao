package app;

import estruturas.ListaEncadeada;
import estruturas.PilhaEncadeada;
import service.CadastroService;

public class Main {
    public static void main(String[] args) {
        CadastroService listaService = new CadastroService(new ListaEncadeada());
        CadastroService pilhaService = new CadastroService(new PilhaEncadeada());

        // Inserindo alunos
        listaService.cadastrarAluno(1, "João", "Engenharia");
        listaService.cadastrarAluno(2, "Maria", "Direito");

        pilhaService.cadastrarAluno(3, "Carlos", "Medicina");
        pilhaService.cadastrarAluno(4, "Ana", "Arquitetura");

        // Listando
        listaService.listarAlunos();
        pilhaService.listarAlunos();

        // Buscando
        listaService.buscarPorId(2);
        pilhaService.buscarPorNome("Ana");

        // Removendo
        listaService.removerAluno();
        pilhaService.removerAluno();

        // Listando novamente
        listaService.listarAlunos();
        pilhaService.listarAlunos();
    }
}

