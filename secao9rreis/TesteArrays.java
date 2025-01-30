package secao9rreis;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class TesteArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();

        in.close();
    }

    private static void exercicio1() {
        int[] arrayOriginal = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayInvertido = new int[arrayOriginal.length];
        
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }
        
        System.out.println("Array invertido:");
        System.out.println(Arrays.toString(arrayInvertido));
    }

    private static void exercicio2() {
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
        }
        System.out.println("O número mais frequente é: " + maisFrequente);
    }

    private static void exercicio3() {
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
    }

    private static void exercicio4() {
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
    }

    private static void exercicio5() {
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
        System.out.println("Usando to string: ");
       

        System.out.println(Arrays.toString(numerosDuplicados));
        System.out.println(arraySemDuplicados);
    }
}