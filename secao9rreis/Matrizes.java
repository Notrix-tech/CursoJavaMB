package secao9rreis;

import java.util.Arrays;

public class Matrizes {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
       for (int i = 0; i < matriz.length; i++){
        for (int j = 0 ; j < matriz[i].length; j++){
            matriz[i][j] = i + j;
        }
       }
       for (int[] linha : matriz )
       System.out.println(Arrays.toString(linha));
    }
}
