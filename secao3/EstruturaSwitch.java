package secao3;

import java.util.Scanner;

public class EstruturaSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int diaSemana;
        
        do {
            System.out.println("Digite o dia da semana (1-7): ");
            while (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, digite um número entre 1 e 7.");
                sc.next(); // Consume the invalid input
            }
            diaSemana = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            if (diaSemana < 1 || diaSemana > 7) {
                System.out.println("Dia inválido. Por favor, digite um número entre 1 e 7.");
            }
        } while (diaSemana < 1 || diaSemana > 7);

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia invalido");
        }

        sc.close();

    }
}
