package secao13;


public class Erros {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 10;

            int resultado = b / a;

        } catch (ArithmeticException e) {
            System.out.println("Divisão com zero não é possível");
            System.out.println("Msg"+ e.getMessage());
            System.out.println("Msg"+ e.getCause());
        }
    }
    
}
