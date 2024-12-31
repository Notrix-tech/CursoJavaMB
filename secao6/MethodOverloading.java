package secao6;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(soma(5, 5));
        System.out.println(soma(5, 5, 5));
        System.out.println(soma(5.5, 5.5));

    }
    //method overloading - sobrecarga de métodos - mesmo nome, parâmetros diferentes (tipo, quantidade) - polimorfismo de sobrecarga 
    public static int soma(int a, int b) {
        return a + b;
    }
    public static int soma(int a, int b, int c) {
        return a + b + c;
    }
    public static int soma(double a, double b) {
        return (int) (a + b);
    }
}
