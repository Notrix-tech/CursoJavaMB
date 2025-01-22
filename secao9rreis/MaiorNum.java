package secao9rreis;

public class MaiorNum {
    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4, 5, 6, 7, 30, 9};
        int limite = 100;
        for (int i = 0; i < valores.length; i++){
            if(valores[i] > limite){
                System.out.println("O valor " + valores[i] + " é menor que " + limite);
            }
            System.out.println("Não ha valor ");
        }

    }
    
}
