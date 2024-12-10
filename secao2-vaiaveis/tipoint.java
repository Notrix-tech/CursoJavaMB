import java.util.Scanner;

public class tipoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = sc.nextInt();
        System.out.println("Sua idade: 44" + idade);

        long populacaoMundial = 789_343_345_345_234L;
        System.out.println(populacaoMundial);

        System.out.println("Digite seu sário atual");
        double salario = sc.nextDouble();

        System.out.println("Salário digitado " + salario);

        sc.close();
    }
}
