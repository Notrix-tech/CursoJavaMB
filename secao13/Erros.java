
public class Erros {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 10;

            int resultado = b / a;
            System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não é possível");
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Causa: " + e.getCause());
        } finally {
            System.out.println("Finally");
        }
        // - erros com Throwable sintaxe --> throw new Exceção Tipo("Mensagem de erro")
        // - throw
        try {
            validarIdade(20);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

    // - função
    public static void validarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Idade deve ser maior que 18 anos");

        }

        System.out.println("Idade válida: " + idade);
    }
}
