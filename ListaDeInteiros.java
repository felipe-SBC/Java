public class ListaDeInteiros {
    private int dados[];
    private int tamanho;

    public ListaDeInteiros(int capacidade) {
        dados = new int[capacidade];
        tamanho = 0;
    }

    public int removeFinal() {
        int r = Integer.MIN_VALUE;
        if (tamanho == 0) {
            System.out.println("Lista vazia.");
        } else {
            r = dados[tamanho - 1];
            tamanho = tamanho - 1;
        }
        return r;
    }

    public void AdicionarFinal(int e) {
        if (tamanho == dados.length) {
            System.out.println("Erro! Lista cheia!");
        } else {
            dados[tamanho++] = e;
        }
    }

    public String toString() {
        String r = "";
        for (int i = 0; i < tamanho; i++) {
            r = r + dados[i] + "\t";
        }
        return r;
    }
}