package secao6;

public class Funcoes {
    public static void main(String[] args) {
        saudacao();
        // 2- paramentros
        soma(5, 5);
        soma(8, 12);
        //3-Returm
        saudar("Maria");

        int resultado = dobrar(5);
        System.out.println("O resultado é: " + resultado);

        int numero = 10;
        int resultado2 = dobrar(numero);
        System.out.println("O resultado é: " + resultado2);
        //VerificarStatus
        verificarStatus("Admin", "senha123");
        System.out.println("oi");

        //-Documentação Funções
     
        double resultado9 = calcularMedia(8, 9, 10);
        System.out.println(resultado9);
    }
    // funçoes em Java
    public static void saudacao() {
        System.out.println("Olá, tudo bem? Bem-vindo ao Java!");
    }
    public static void soma(int a, int b){
        int resultado = a + b;
        System.out.println(" O resultado da soma é: " + resultado);
    }
    public static void saudar(String nome){
        System.out.println("Olá, " + nome + " tudo bem?");
    }
    public static int dobrar(int n){
        return n * 2;
    }

    public static void verificarStatus(String usuario, String senha){
        if(usuario.equals("Admin") && senha.equals("senha123")){
            System.out.println("Usuário administrador logado com sucesso!");
            return;
        }
        System.out.println("Usuário ou senha inválidos!");
    }
    /**
     * Calcula a média de três números
     * @param n1 o primeiro número a ser enviado
     * @param n2 o segundo número a ser enviado
     * @param n3 o terceiro número a ser enviado
     * @return A média dos números
     */
    public static double calcularMedia(double n1, double n2, double n3){
        return (n1 + n2 + n3) / 3;
    }
}
