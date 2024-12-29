package secao6;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial: ");
        int numero = scan.nextInt();
        scan.nextLine();
        int resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
    
    /**
     * Calcula o fatorial de um número
     * @param numero    
     * @return  O fatorial do número
     */
    public static int fatorial(int numero) {
        if(numero == 0 || numero == 1) {
            return 1;
        }else{
            return numero * fatorial(numero - 1);
        }
    }
}
