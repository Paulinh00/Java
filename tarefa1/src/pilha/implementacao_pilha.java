package pilha;

public class implementacao_pilha {
        public static void main(String[] args) {

            Pilha pilha = new Pilha(5);

            pilha.insere(1);
            pilha.insere(2);
            pilha.insere(3);
            pilha.insere(4);
            pilha.insere(5);
            pilha.insere(6);

            pilha.imprime();

            pilha.remove();
            pilha.imprime();

            pilha.remove();
            pilha.remove();
            pilha.remove();
            pilha.remove();
            pilha.remove();

            pilha.imprime();



        }
    }
