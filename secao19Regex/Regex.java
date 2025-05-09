package secao19Regex;
import java.util.regex.*;
public class Regex {
    public static void main(String[] args) {
        
        String regex = "a*";
        String texto = "B aaa dfhgdfk mmaa aaaa ";

        Pattern verificandoNotexto = Pattern.compile(regex);
        Matcher padraoEncontrado = verificandoNotexto.matcher(texto);

        System.out.println(" Estamos procurando no texto por a");
        while (padraoEncontrado.find()) {
            //find() encontar algo na string
            System.out.println(" " + padraoEncontrado.group(0)+ "");
        }

    }
}
