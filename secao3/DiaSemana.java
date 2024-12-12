package secao3;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana (1-7): ");
        int diaSemana = sc.nextInt();
        sc.nextLine();
        switch (diaSemana) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia semanal");
                break;
            default:
                System.out.println("Dia inválido");
        }

        sc.close();
    }
}
