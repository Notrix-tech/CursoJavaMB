package secao9rreis;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class MaiorNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] valores = {1, 2, 3, 4, 5, 6, 7, 30, 9};
        int limite = 100;
        for (int i = 0; i < valores.length; i++){
            if(valores[i] > limite){
                System.out.println("O valor " + valores[i] + " é menor que " + limite);
            }
            System.out.println("Não ha valor ");
        }

        // encontrat Linguagem
        String[] palavras = {"Java", "PHP", "Python", "C#", "C++", "Ruby"};

        System.out.println("Digite uma linguagem de programação: ");
        String linguagem = sc.nextLine();

        for (String palavra : palavras){
            if(palavra.equals(linguagem)){
                System.out.println("Linguagem encontrada " + linguagem);
                
            }
        }

        // metodo to estring
        String dadosNumericos = java.util.Arrays.toString(valores);
        System.out.println(dadosNumericos);

        String nomesLinguagem = Arrays.toString(palavras);
        System.out.println(nomesLinguagem);

        // Adcionando novos itens a Array
        int[] novoArray = new int[valores.length + 2];
        for (int i = 0; i < valores.length; i++){
            novoArray[i] = valores[i];
            novoArray[novoArray.length - 1] = 6;
        }
       System.out.println(Arrays.toString(novoArray));

       String[] frutas = {"Maçã", "Banana", "Pera"};

         String[] novaFruta = new String[frutas.length + 1];
            for (int i = 0; i < frutas.length; i++){
                novaFruta[i] = frutas[i];

            }
            novaFruta[novaFruta.length - 1] = "Uva";
            System.out.println(Arrays.toString(novaFruta));

        // ArrayList
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Manga", "Morango", "Abacaxi"));
        System.out.println(lista);
        lista.add("Maça");
        lista.addFirst("Jabuticaba");
        lista.size();
        System.out.println(lista);

        System.out.println("REFENCE TRAP");
        //REFENCE TRAP
        int[] arrayOriginal = {1, 2, 3, 4, 5};
        // programou bastante coisa
        int[] arrayCopia = arrayOriginal;
        arrayCopia[0] = 1000;
        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayCopia));

        System.out.println(" resolvendo REFENCE TRAP");
        int[] arrayClone = arrayOriginal.clone();
        arrayClone[0] = 2000;
        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayClone));    


        sc.close();
    }
}