package secao3;

import java.util.Scanner;

public class CondicaoTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        String resultado = idade >= 18 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado);

        sc.close();
    }
}
