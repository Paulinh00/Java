package fila;

public class Fila {
    private int capacidade,inicio,fim;
    private int[] dados;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.inicio = 0;
        this.fim = -1;
        this.dados = new int[capacidade];
    }

    public void insere(int elemento) {
        if (cheia()) {
            System.out.println("Fila cheia");
        } else {
            fim = (fim + 1) % capacidade;
            dados[fim] = elemento;
        }
    }

    public boolean cheia() {
        return (fim + 1) % capacidade == inicio && fim != -1;
    }

    public boolean vazia() {
        return fim == -1;
    }

    public int remove() {
        if (vazia()) {
            System.out.println("Fila vazia");
            return -1;
        } else {
            int elementoRemovido = dados[inicio];
            if (inicio == fim) {
                inicio = 0;
                fim = -1;
            } else {
                inicio = (inicio + 1) % capacidade;
            }
            return elementoRemovido;
        }
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("Fila vazia");
        } else {
            System.out.print("fila- ");
            int i = inicio;
            while (true) {
                System.out.print(dados[i] + " ");
                if (i == fim) {
                    break;
                }
                i = (i + 1) % capacidade;
            }
            System.out.println();
        }
    }
}