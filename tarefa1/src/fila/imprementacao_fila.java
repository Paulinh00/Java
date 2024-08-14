package fila;

public class imprementacao_fila {
    public static void main(String[] args) {

        Fila fila = new Fila(5);

        fila.insere(1);
        fila.insere(2);
        fila.insere(3);
        fila.insere(4);
        fila.insere(5);
        fila.insere(6);

        fila.imprime();

        fila.remove();
        fila.imprime();

        fila.remove();
        fila.remove();
        fila.remove();
        fila.remove();
        fila.remove();

        fila.imprime();
    }
}

