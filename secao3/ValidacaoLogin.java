package secao3;

import java.util.Scanner;

class ValidacaoLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome de usuário:");
        String nomeDigitado = sc.nextLine();
        System.out.println("Digite sua senha:");
        String senhaDigitada = sc.nextLine();
        
       if (nomeDigitado.equals("admin") && senhaDigitada.equals("1234")) {
           System.out.println("Login efetuado com sucesso!");
       } else {
           System.out.println("Login ou senha incorretos."); 
       }
        sc.close();
    }
}