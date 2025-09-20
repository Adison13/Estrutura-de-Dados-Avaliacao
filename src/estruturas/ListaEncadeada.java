package estruturas;

import model.Aluno;

public class ListaEncadeada implements Estrutura<Aluno> {

    private static class No {
        Aluno aluno;
        No prox;
        No(Aluno aluno) { this.aluno = aluno; }
    }

    private No inicio;

    @Override
    public void inserir(Aluno aluno) {
        No novo = new No(aluno);
        if (inicio == null) {
            inicio = novo;
        } else {
            No temp = inicio;
            while (temp.prox != null) {
                temp = temp.prox;
            }
            temp.prox = novo;
        }
    }

    @Override
    public Aluno remover() {
        if (inicio == null) return null;
        Aluno removido = inicio.aluno;
        inicio = inicio.prox;
        return removido;
    }

    @Override
    public Aluno buscarPorId(int id) {
        long inicioTempo = System.nanoTime();
        No temp = inicio;
        while (temp != null) {
            if (temp.aluno.getId() == id) {
                long fimTempo = System.nanoTime();
                System.out.println("Busca Lista (ID): " + (fimTempo - inicioTempo) + " ns");
                return temp.aluno;
            }
            temp = temp.prox;
        }
        long fimTempo = System.nanoTime();
        System.out.println("Busca Lista (ID): " + (fimTempo - inicioTempo) + " ns");
        return null;
    }

    @Override
    public Aluno buscarPorNome(String nome) {
        long inicioTempo = System.nanoTime();
        No temp = inicio;
        while (temp != null) {
            if (temp.aluno.getNome().equalsIgnoreCase(nome)) {
                long fimTempo = System.nanoTime();
                System.out.println("Busca Lista (Nome): " + (fimTempo - inicioTempo) + " ns");
                return temp.aluno;
            }
            temp = temp.prox;
        }
        long fimTempo = System.nanoTime();
        System.out.println("Busca Lista (Nome): " + (fimTempo - inicioTempo) + " ns");
        return null;
    }

    @Override
    public void listarTodos() {
        No temp = inicio;
        System.out.println("=== Lista Encadeada ===");
        while (temp != null) {
            System.out.println(temp.aluno);
            temp = temp.prox;
        }
    }
}

