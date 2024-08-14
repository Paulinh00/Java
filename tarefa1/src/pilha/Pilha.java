package pilha;
public class Pilha {
    private int capacidade,topo;
    private int[] dados;


    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.topo = -1;
        this.dados = new int[capacidade];
    }


    public void insere(int elemento) {
        if (cheia()) {
            System.out.println("Pilha cheia");
        } else {
            dados[++topo] = elemento;
        }
    }


    public boolean cheia() {
        return topo == capacidade - 1;
    }


    public boolean vazia() {
        return topo == -1;
    }


    public int remove() {
        if (vazia()) {
            System.out.println("Pilha vazia");
            return -1;
        } else {
            return dados[topo--];
        }
    }


    public void imprime() {
        if (vazia()) {
            System.out.println("Pilha vazia.");
        } else {
            System.out.print("pilha- ");
            for (int i = 0; i <= topo; i++) {
                System.out.print(dados[i] + " ");
            }
            System.out.println();
        }
    }}