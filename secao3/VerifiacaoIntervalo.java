package secao3;
import java.util.Scanner;
public class VerifiacaoIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n >= 10 && n <= 20) {
            System.out.println("Entre 10 e 20");
        } else {
            System.out.println("Fora do intervalo");
        }
        sc.close();
    }
}
