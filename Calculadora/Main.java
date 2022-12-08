package Calculadora;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a operação que deseja: ");
        String op = sc.nextLine();
        Calculadora calc = new Calculadora(op);
        System.out.println(calc.toString());
    }
}