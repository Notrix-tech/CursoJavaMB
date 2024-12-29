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
        verificarStatus("Admin", "senha125");
        System.out.println("oi");
        System.exit(0);



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

    public static void verificarStatus(String usario, String status){
       if(usario.equals("Admin") && status.equals("senha123")){
           System.out.println("Usuário administrador logado com sucesso!");
           System.exit(0);
       }
       System.out.println("Usuário ou senha inválidos!");
    }
}
