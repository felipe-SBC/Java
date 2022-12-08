import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
    public static void main(String[] args) {
        //para java precisa usar 2 contra-barras pois o java entende um contra-barra como caracter de escape
        // \d = Trás todos os digitos
        // \D = Trás tudo que não for digito
        // \s = Espaços em branco
        // \S = tudo excluindo os brancos
        // \w = tudo de a-z ou A-Z, digitos e _ (sem caracterez especiais)
        // \W = o contrário do \w
        // [] = range de caracteres. EX. [a-z] (todos de a até z) ou [aAeE] (todos que possuam a, A, e, E)

        //String regex = "[abcABC]";
        String regex = "0[xX][0-9a-fA-F]";
        //String texto = "abaaba";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);//Para fixar o padrão
        Matcher matcher = pattern.matcher(texto2);//Para encontrar o padrão
        System.out.println("Texto:   "+texto2);
        System.out.println("Indice:  0123456789");
        System.out.println("Regex:   "+regex);
        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
