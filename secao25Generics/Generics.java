package secao25Generics;

public class Generics {
    public static void main(String[] args) {
        

        //Quando instancioamos o T é alguma coisa.
        Caixa<Integer> caixa1 = new Caixa<>();
        caixa1.adcionar(100);

         System.out.println(caixa1.abrir());

         Caixa<String> caixa2 = new Caixa<>();
         caixa2.adcionar("Hello word");

         System.out.println(caixa2.abrir());
        // 2 - METODOS GENERICOS
        System.out.println( "Maior valor entre 5 e 10: " + obterMaior(5, 10));

        String[] letras = {"a","b", "c", "d"};

        Integer[] numeros = {1, 34, 45, 56, 999};

        imprimirArray(letras);

        imprimirArray(numeros);



    }
    //AQUI CRIA O METODOS

    public static <T extends Comparable<T>> T obterMaior(T valor1, T valor2){
        return (valor1.compareTo(valor2) > 0) ? valor1: valor2;

    
    }

    public static <A> void imprimirArray(A[] array){
        for(A elemento: array){
            System.out.print(elemento + ", ");
        }
    }
}
