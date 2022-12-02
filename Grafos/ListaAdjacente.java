package Grafos;
public class ListaAdjacente {
    private ListaLigada tabela[];

    public ListaAdjacente(int q){
        tabela = new ListaLigada[q];
    }

    public void inserir(int vo, int vd){//vo - Vertice Origem;  vd - Vartice Destino

        if(tabela[vo-1] == null){
            tabela[vo-1] = new ListaLigada();
        }else{
            tabela[vo-1].adicionaInicio(vd);
        }
        //para fazer a volta (por não ser um grafo guiado)
        if(tabela[vd-1] == null){
            tabela[vd-1] = new ListaLigada();

        }else{
            tabela[vd-1].adicionaInicio(vo);
        }
    }    
	public String toString(){
		String r = "";
		for (int i=0;i<tabela.length;i++){
		    r = r + "Vertice " + (i+1) +" = " + tabela[i].toString() + '\n';
	    }
	    return r;
	}
}