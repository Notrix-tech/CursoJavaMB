package secao9rreis;

import java.util.Arrays;
import java.util.Scanner;

public class MaiorNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] valores = {1, 2, 3, 4, 5, 6, 7, 30, 9};
        int limite = 100;
        for (int i = 0; i < valores.length; i++){
            if(valores[i] > limite){
                System.out.println("O valor " + valores[i] + " é menor que " + limite);
            }
            System.out.println("Não ha valor ");
        }

        // encontrat Linguagem
        String[] palavras = {"Java", "PHP", "Python", "C#", "C++", "Ruby"};

        System.out.println("Digite uma linguagem de programação: ");
        String linguagem = sc.nextLine();

        for (String palavra : palavras){
            if(palavra.equals(linguagem)){
                System.out.println("Linguagem encontrada " + linguagem);
                
            }
        }

        // metodo to estring
        String dadosNumericos = java.util.Arrays.toString(valores);
        System.out.println(dadosNumericos);

        String nomesLinguagem = Arrays.toString(palavras);
        System.out.println(nomesLinguagem);

        // Adcionando novos itens a Array
        
       
        sc.close();
    }
}