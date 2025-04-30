package secao25Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.*;


public class Generics {
    public static void main(String[] args) {
        

        //Quando instancioamos o T é alguma coisa.
         Caixa<Integer> caixa1 = new Caixa<>();
         caixa1.adcionar(100);

         Caixa<String> caixa2 = new Caixa<>();
         caixa2.adcionar("Hello word");


         System.out.println(caixa1.abrir());
         System.out.println(caixa2.abrir());


        // 2 - METODOS GENERICOS
        System.out.println( "Maior valor entre 5 e 10: " + obterMaior(5, 10));

        // --------------------------------------------------------------------------

        String[] letras = {"a","b", "c", "d"};

        Integer[] numeros = {1, 34, 45, 56, 999};

        imprimirArray(letras);

        imprimirArray(numeros);

        // 3 -Bounded Types

        Comparador<Integer> comparadorInterios = new Comparador<>();

        System.out.println("O maior numero entre 20 e 10 é :" + comparadorInterios.obterMaior(20, 10));

        Comparador<Double> comparadorDouble = new Comparador<>();

        System.out.println("O maior entre os dois  números é : " + comparadorDouble.obterMaior(20.45, 10.99));

        //4-wildcards


        //5- Colletion e Generics

        List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(10);
        listaInteiros.add(20);
        listaInteiros.add(30);
        listaInteiros.add(40);

        for(Number Listanumeros: listaInteiros){
            System.out.println(Listanumeros);
        }

        Set<String> palavras = new HashSet<>();
        palavras.add("_Java");
        palavras.add("Clairton_");
        palavras.add("Lima");

        for(String palavra: palavras){
            System.out.print(palavra);
        }

        Map<String, Integer> conjutoIdades = new HashMap<>();
        conjutoIdades.put("Clairton", 45);
        conjutoIdades.put("Maria", 44);
        conjutoIdades.put("Bruno", 32);
        conjutoIdades.put("Zoe", 56);

        for(Map.Entry<String, Integer> entrada : conjutoIdades.entrySet()) {
            System.out.println(entrada.getKey() + " tem " + entrada.getValue() + " anos de idade.");
        }


    }
    //AQUI CRIA O METODOS

    public static <T extends Comparable<T>> T obterMaior(T valor1, T valor2){
        return (valor1.compareTo(valor2) > 0) ? valor1: valor2;

    
    }

    public static <A> void imprimirArray(A[] array){
        for(A elemento: array){
            System.out.println(elemento + ", ");
        }
    }
}
