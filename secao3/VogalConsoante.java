package secao3;
import java.util.Scanner;
public class VogalConsoante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        char letra = sc.next().charAt(0);
        

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");

            sc.close();
    }
}

}
