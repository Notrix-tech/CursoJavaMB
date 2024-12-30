package secao6;

import java.util.Scanner;

public class ClassificaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int nota; 
    do{
        System.out.println("Dogite a sua nota de 1  5");
        nota = scanner.nextInt();
        switch (nota) {
            case 1:
                System.out.println("Sua nota foi " + nota + " conceito E");
                break;
            case 2:
                System.out.println("Sua nota foi " + nota + " conceito D");
                break;
            case 3:
            System.out.println("Sua nota foi " + nota + " conceito C");
            break;
            case 4:
            System.out.println("Sua nota foi " + nota + " conceito B");
            break;
            case 5:
            System.out.println("Sua nota foi " + nota + " conceito A Parabéns!");
            break;
                  
            default:
            System.out.println("Nota inválida! Por favor, digite um número entre 1 e 5.");
            continue;
        }
        break;
    } while (true);
        
        scanner.close();
}
}
