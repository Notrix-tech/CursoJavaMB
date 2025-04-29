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

    }
    
}
