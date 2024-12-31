package secao6;

public class FuncoesRecursivas {
    public static void main(String[] args) {
        //funçõa recursiva - Função que chama a si mesma
        int soma = somaRecursiva(6);
        System.out.println(soma);
    } 
    public static int somaRecursiva(int n){
        if(n == 1){
            return 1;
        } else {
            return n + somaRecursiva(n - 1);
        }
    }      
}
