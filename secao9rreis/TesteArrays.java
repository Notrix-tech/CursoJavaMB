package secao9rreis;

import java.util.Scanner;
import java.util.ArrayList;

public class TesteArrays {
    public static void main(String[] args) {
        // crie um programa que receba um array de inteiros do usuarioe exiba o valor do array invertido
        Scanner in = new Scanner(System.in);
        // EXERCICIO 1
        int[] arryOriginal = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arryInvertido = new int[arryOriginal.length];
        for (int i = 0; i < arryOriginal.length; i++) {
            arryInvertido[i] = arryOriginal[arryOriginal.length - 1 - i];
        }
        for (int i = 0; i < arryInvertido.length; i++) {
            System.out.println(arryInvertido[i]);
        }

        // EXERCIICO 2
        /*
         * ENCONTRAR O LEMENTO MAIS FREQUENTE EM UM ARRAY
         * DESENVOLVA UM PROGRAMA QUE PREENCHA UM ARRAY DE INTEIROS
         * E DETERMINE QUAL ELEMENTO APARECE COM MAIOR FREQUENCIA
         * CASO HAJA EMPATE, EXIBA TODOS OS ELEMENTOS EMPATADOS.

         */
        int[] arryFre = {2, 3, 2, 10, 2, 5, 6};
       
        int maisFrequente = arryFre[0];

        int maxContagem = 1;
        for (int i = 0; i < arryFre.length; i++) {
            int contagem = 0;
            for (int j = 0; j < arryFre.length; j++) {
                if (arryFre[i] == arryFre[j]) {
                    contagem++;
                }
            }
            if (contagem > maxContagem) {
                maxContagem = contagem;
                maisFrequente = arryFre[i];
            }
            System.out.println("O número mais frequente é: " + maisFrequente);

        }

        // exercio 3
        /*
         * escreva um programa que receba uma matriz 2d e crei uma mantriz transposta.
         * onde troca a linha por colunas e imprima a matriz original e a transposta.
         */
        int[][] matriz = {
               { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        
        int[][] transposta = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz original: ");
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz transposta: ");
        for (int[] linha : transposta) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        /*
         * Escreva um programa que receba um arry de inteiros e subistitua todos
         * os valores negativos por zero. Em seguida, exiba o array modificado e o array
         * original.

         */
        int[] numeros = { -1, 2, -3, 4, -5, 6, -7, 8, -9, 10 };
        int[] numerosModificados = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                numerosModificados[i] = 0;
            } else {
                numerosModificados[i] = numeros[i];
            }

        }
        System.out.println("Array original: ");
        for (int valor : numeros) {
            System.out.print(valor + " ");
        }
        System.out.println();
        System.out.println("Array Modificado: ");
        for (int valor : numerosModificados) {
            System.out.print(valor + " ");
        }
        System.out.println();


        /*
         * Remover elementos duplicados no array
         * remova os lementos duplicados de um array de inteiros, mantendo apenas a primeira ocorrencia de cada valor.
         * exiba o array original e o array sem duplicados.
         */

        int[] numerosDuplicados = {1, 2,2,2,2,3, 4, 2, 5, 6, 3, 7, 8, 1};
       
        ArrayList<Integer> arraySemDuplicados = new ArrayList<>();
        for (int valor : numerosDuplicados) {
            if (!arraySemDuplicados.contains(valor)) {
                arraySemDuplicados.add(valor);
            }
        }
        System.out.println("Array original: ");
        for (int valor : numerosDuplicados) {
            System.out.print(valor + " ");
        }
        System.out.println();
        System.out.println("Array sem duplicados: ");
        for (int valor : arraySemDuplicados) {
            System.out.print(valor + " ");
        }
        System.out.println();





















        in.close();
    }
}