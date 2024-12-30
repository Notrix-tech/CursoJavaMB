package secao6;

import java.util.Scanner;

public class VerificarIdade {
    /**
     * Verifica se o usuário é maior de idade
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        do {
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            if (idade <=0) {
                System.out.println("Idade inválida! Por favor, digite um número positivo.");
                continue;
            } 
            
            if (idade < 18) {
                System.out.println("Acesso negado - Menor de idade");
            } else {
                System.out.println("Acesso permitido - Maior de idade");
            }
            break; // Sai do loop após uma entrada válida
            
        } while (true);

        scanner.close();
    }
}
