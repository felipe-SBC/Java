package Calculadora;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Calculadora {
    //Declaração de variáveis
    private String conta, operacao;
    //Declarando padrão de caracteres que precisam ser separados 
    private String regex = "[+xX*/-]";  
    private double num1, num2, resultado;
    private int indice;

    //Trazendo para Pattern aqueles padrões declarados acima
    Pattern p = Pattern.compile(regex); 

    //Construtor
    public Calculadora(String op){
        this.conta = op;
        validaOperacao();
        calcular();
    }

    public void validaOperacao(){
        //Trago para o Matcher o texto que será filtrado os padrões
        Matcher m = p.matcher(conta); 
        //Estrutura condicional para saber se o matcher encontrou algum caracter requerido pelo padrão 
        if(m.find()==true){
            //Método start para saber a posição do caracter
            indice = m.start();
            //Método group para saber o conteúdo do caracter
            operacao = m.group();
            //Chamada da função quebraString
            quebraString();
        }else{
            System.out.println("Digite uma operação válida");
        }
    }

    //Metodo para realizar a quebra da String e transformar em dois números retirando o caracter de operação
    public void quebraString(){
        num1 = Double.parseDouble(conta.substring(0, indice));
        num2 = Double.parseDouble(conta.substring(indice+1));
    }

    //Método para designar o operador para a operação
    public void calcular(){
        switch(operacao){
            case "+":
                adicao();
            break;
            case "-":
                subtracao();
            break;
            case "*": case "X": case "x":
                multiplicacao();
            break;
            case "/":
                divisao();
            break;
            default:
                System.out.println("Comando inválido");
        }   
    }
    
    //Métodos para realizar a operação
    public void adicao(){
        resultado = num1+num2;
    }

    public void subtracao(){
        resultado = num1-num2;
    }

    public void multiplicacao(){
        resultado = num1*num2;
    }

    public void divisao(){
        resultado = num1/num2;
    }

    //método para retornar a resposta
    public String toString(){
        return "A resposta é: "+resultado;
    }
}
 