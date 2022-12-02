package Arvore;
public class Main {
    public static void main(String args[]){
        Arvore a = new Arvore();
        a.adicionaElemento(10);
        a.adicionaElemento(5);
        a.adicionaElemento(20);
        a.adicionaElemento(6);
        a.adicionaElemento(1);
        a.adicionaElemento(16);
        System.out.println("Pré Ordem");
        a.preOrdem(a.getRaiz());
        System.out.println("Pos Ordem");
        a.posOrdem(a.getRaiz());
        System.out.println("Em Ordem");
        a.emOrdem(a.getRaiz());
    }
}