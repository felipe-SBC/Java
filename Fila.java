public class Fila {
    int[] dados = new int[5];
    int tamanho = 0;

    public void adicionarFila(int e) {
        if (dados.length == tamanho) {
            System.out.println("A lista está cheia");
        } else {
            dados[tamanho] = e;
            tamanho += 1;
        }
    }
}