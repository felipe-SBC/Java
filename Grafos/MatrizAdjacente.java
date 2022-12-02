package Grafos;
import java.util.Scanner;

public class MatrizAdjacente{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de vértices");
        int vertice = sc.nextInt();
        int[][] matriz = new int[vertice][vertice];

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.println("Quantos caminhos terão do vertice: "+(i+1)+ " até o vértice: "+(j+1));
                matriz[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+" \t");
            }
            System.out.println("\n");
        } 
    }
}