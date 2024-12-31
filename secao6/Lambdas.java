package secao6;

import java.util.Arrays;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        // Lambda expression - expressão lambda - função anônima - arrow function - função flecha
        // (parametros) -> { corpo da função }
         Runnable tarefa = () -> System.out.println("Hello, Lambda!");
         tarefa.run();

         List<String> nomes = Arrays.asList("Pedro", "João", "Maria", "José");
         nomes.forEach(nome -> System.out.println(nome));
    }
}
