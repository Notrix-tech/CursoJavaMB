package ProjetosDoCurso;

import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;

public class JogoForca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jogo da Forca");
        //Definir a palavra secreta
        String palavraSecreta = "banana";

        char[] palavraOculta = new char[palavraSecreta.length()];
        for (int i = 0; i < palavraOculta.length; i++) {
            palavraOculta[i] = '_';
        }
        int tentativas = 6;
        boolean acertou = false;
        while (tentativas > 0 && !acertou) {
            System.out.println("Digite uma letra: ");
            char letra = sc.next().charAt(0);
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    palavraOculta[i] = letra;
                }
            }
            if (palavraSecreta.equals(String.valueOf(palavraOculta))) {
                acertou = true;
            }
            System.out.println(palavraOculta);
            tentativas--;
        }
        if (acertou) {
            System.out.println("Parabéns, você acertou!");
        } else {
            System.out.println("Você perdeu!");
        }





        sc.close();



















    }//fim main
}//Fim classe
