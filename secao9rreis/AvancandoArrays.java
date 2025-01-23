package secao9rreis;
//import java.util.Scanner;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AvancandoArrays {
public static void main(String[] args) {
    // ordenação de interiros
    int [] num = {1, 5, 8, 2, 4, 3, 7};
    Arrays.sort(num);

    System.out.println(Arrays.toString(num));

// crie um Array de nomes 
    String [] nomes = {"João","Beto", "Kalos","Ana", "Carlos", "Lucas", "Maria", "Pedro"};
    //colocar em ordem alfabetica
    Arrays.sort(nomes);
    //modifica o Arrays
    System.out.println(Arrays.toString(nomes));
    // ordem inversa
    Arrays.sort(nomes, Comparator.reverseOrder());
    System.out.println(Arrays.toString(nomes));

// odeação de Matriz
int[][] matriz = {
   {4,6,7},
    {1,3,5},
    {2,8,9}
};    

Arrays.sort(matriz, Comparator.comparingInt(a -> a[0]));
for (int[] linha : matriz) {
    System.out.println(Arrays.toString(linha));
}

System.out.println(Arrays.deepToString(matriz));









        
    }//fim Main
}//Fim Classe
