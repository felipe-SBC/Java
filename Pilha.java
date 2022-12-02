public class Pilha {
    int dados[] = new int[5];
    int topo;
    int tamanho = 0;

    public void push(int e) {
        if (tamanho == dados.length) {
            System.out.println("A lista tá cheia");
        } else {
            dados[tamanho] = e;
            tamanho++;
        }
    }

    public int pop() {
        int r = 0;
        if (tamanho == 0) {
            System.out.println("A lista está vazia!");
        } else {
            r = dados[tamanho];
            tamanho--;
        }
        return r;
    }
}