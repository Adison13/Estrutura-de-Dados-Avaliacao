package estruturas;

import model.Aluno;

public class PilhaEncadeada implements Estrutura<Aluno> {

    private static class No {
        Aluno aluno;
        No prox;
        No(Aluno aluno) { this.aluno = aluno; }
    }

    private No topo;

    @Override
    public void inserir(Aluno aluno) {
        No novo = new No(aluno);
        novo.prox = topo;
        topo = novo;
    }

    @Override
    public Aluno remover() {
        if (topo == null) return null;
        Aluno removido = topo.aluno;
        topo = topo.prox;
        return removido;
    }

    @Override
    public Aluno buscarPorId(int id) {
        long inicioTempo = System.nanoTime();
        No temp = topo;
        while (temp != null) {
            if (temp.aluno.getId() == id) {
                long fimTempo = System.nanoTime();
                System.out.println("Busca Pilha (ID): " + (fimTempo - inicioTempo) + " ns");
                return temp.aluno;
            }
            temp = temp.prox;
        }
        long fimTempo = System.nanoTime();
        System.out.println("Busca Pilha (ID): " + (fimTempo - inicioTempo) + " ns");
        return null;
    }

    @Override
    public Aluno buscarPorNome(String nome) {
        long inicioTempo = System.nanoTime();
        No temp = topo;
        while (temp != null) {
            if (temp.aluno.getNome().equalsIgnoreCase(nome)) {
                long fimTempo = System.nanoTime();
                System.out.println("Busca Pilha (Nome): " + (fimTempo - inicioTempo) + " ns");
                return temp.aluno;
            }
            temp = temp.prox;
        }
        long fimTempo = System.nanoTime();
        System.out.println("Busca Pilha (Nome): " + (fimTempo - inicioTempo) + " ns");
        return null;
    }

    @Override
    public void listarTodos() {
        No temp = topo;
        System.out.println("=== Pilha Encadeada ===");
        while (temp != null) {
            System.out.println(temp.aluno);
            temp = temp.prox;
        }
    }
}

