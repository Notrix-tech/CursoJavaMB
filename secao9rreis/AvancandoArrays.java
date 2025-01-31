package secao9rreis;
//import java.util.Scanner;
import java.util.ArrayList;
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

// operações vanaçadas com Arrays
int[] original = { 1,2,2,2,3,5,6};
int[] copia = Arrays.copyOf(original, 2);
System.out.println(Arrays.toString(copia));
int[] copia2 = Arrays.copyOfRange(original, 2, 5);
System.out.println(Arrays.toString(copia2));    
int[] copia3 = Arrays.copyOfRange(original, 2, 7);
System.out.println(Arrays.toString(copia3));

// Arrays.fill()
int[] arr = new int[5];
Arrays.fill(arr, 2);
System.out.println(Arrays.toString(arr));

// Arrays.stream()
int[] arr2 = {1,2,3,4,5};
int soma = Arrays.stream(arr2).sum();
System.out.println(soma);



//maior numero
int[] num7 = {1, 2, 3, 40, 50, 200, 7, 9, 100};
        int max = Arrays.stream(num7).max().getAsInt();
        System.out.println(Arrays.toString(num7));
        System.out.println("Maior número: " + max);


// Arrays Dinamicos ele inicia vazio
ArrayList<String> frutas = new ArrayList<>();
System.out.println("ArrayLista inicia vazio");
System.out.println(frutas);
frutas.add("Maça");
frutas.add("Banana");
frutas.add("Uva");
System.out.println(frutas);
Arrays.sort(frutas.toArray());

String encontreiFruta = "uva";

for (String fruta : frutas){
    if(fruta.equalsIgnoreCase(encontreiFruta)){
        System.out.println("Encontrei a fruta: " + encontreiFruta);
    }
    System.out.println(fruta);
}



        
    }//fim Main
}//Fim Classe
