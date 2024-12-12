package secao3;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int n = sc.nextInt();
        sc.nextLine();

        if (n % 2 == 0) {
            System.out.println(n + " Par");
        } else {
            System.out.println(n + " Impar");
            
        }





        sc.close();
    }
}
