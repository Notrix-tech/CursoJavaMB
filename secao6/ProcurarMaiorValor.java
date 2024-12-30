package secao6;

import java.util.Scanner;

public class ProcurarMaiorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Entrada de dados
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
            scanner.nextLine();
        }

        // Encontrar maior valor e sua posição
        int maior = procurarMaiorValor(numeros);
        int posicaoMaior = encontrarPosicaoMaior(numeros, maior);

        // Exibir resultados
        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\nMaior valor: " + maior);
        System.out.println("Posição do maior valor: " + posicaoMaior);

        scanner.close();
    }

    public static int procurarMaiorValor(int[] numeros) {
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static int encontrarPosicaoMaior(int[] numeros, int maior) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == maior) {
                return i;
            }
        }
        return -1;
    }
}