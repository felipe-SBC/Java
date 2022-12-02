public class ListaLigada {

    private No inicio;

    public ListaLigada() {
        inicio = null;
    }

    public int removeInicio() {
        int resp = -1;
        if (inicio == null) {
            System.out.println("Lista vazia");
        } else {
            resp = inicio.dado;
            inicio = inicio.prox;
        }
        return resp;
    }

    public void adicionaInicio(int e) {
        // 1 - instância um novo nó com o novo elemento(e)
        No novo = new No(e);
        // 2 - atribui o endereço do nó que está no inicio
        // lista ao atributo prox do novo nó

        novo.prox = inicio;
        // 3 - atribui o endereço do novo nó ao inicio da lista
        inicio = novo;
    }

    public void AdicionaFinal(int e) {
        No aux = inicio;
        if (aux == null) {
            inicio = new No(e);
        } else {
            while (aux.prox != null) {
                aux = aux.prox;
            }
            aux.prox = new No(e);
        }
    }

    public int RemoveFinal1() {
        No aux1 = inicio;
        No aux2 = null;
        int r = 0;
        if(aux1 != null){
            if(aux1.prox != null){
                while(aux1.prox != null){
                    aux2 = aux1;
                    aux1 = aux1.prox;
                }
                r = aux1.dado;
                aux2.prox = null;
            }else{
                r = inicio.dado;
                inicio = null;
            }
        }else{
            System.out.println("ERRO! Lista Vazia!");
        }
        return r;
    }

    public String toString() {
        // cria um nó auxiliar para percorrer
        No aux = inicio;
        String resp = "";
        // declara uma string que receberá elementos da lista
        while (aux != null) {
            // concatena o dado do nó atual à String que
            // será devolvida
            resp = resp + " " + aux.dado;
            aux = aux.prox;
        }
        return resp;
    }

    public static void main(String[] args) {
        ListaLigada lista1 = new ListaLigada();
        /*
         * lista1.adicionaInicio(9);
         * lista1.adicionaInicio(8);
         * lista1.adicionaInicio(7);
         * lista1.adicionaInicio(6);
         * 
         * System.out.println(lista1.toString());
         * int x = lista1.metodoB();
         * System.out.println("Metodo b "+x);
         * System.out.println(lista1.toString());
         */
        lista1.adicionaInicio(30);
        lista1.adicionaInicio(10);
        lista1.adicionaInicio(5);
        System.out.println(lista1.toString());
        int x = lista1.removeInicio();
        System.out.println("Elemento Removido " + x);
        System.out.println(lista1.toString());
        x = lista1.removeInicio();
        System.out.println("Elemento Removido " + x);
        System.out.println(lista1.toString());
        x = lista1.removeInicio();
        System.out.println("Elemento Removido " + x);
        System.out.println(lista1.toString());
        x = lista1.removeInicio();
        System.out.println("Elemento Removido " + x);
        System.out.println(lista1.toString());
    }
}
