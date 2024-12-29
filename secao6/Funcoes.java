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

        //-Documentação Funções

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
    /**
     * 1- Funções sem retorno e sem parâmetros  - void  nomeFuncao() {} - exemplo: void saudacao() {
     * 
     * }
     * @param n1 o primeiro número a ser enviado
     * @param n2 o segundo número a ser enviado
     * @param n3 o  terceiro número a ser enviado
     * @return A média dos números
     */
    public static void calcularMedia(double n1, double n2, double n3){
        double media = (n1 + n2 + n3) / 3;
        System.out.println("A média é: " + media);
    }
    /**
     * 1- Funções sem retorno e sem parâmetros  - void  nomeFuncao() {} - exemplo: void saudacao() {}
     * 2- Funções sem retorno e com parâmetros - void nomeFuncao(tipo parametro1, tipo parametro2) {} - exemplo: void soma(int a, int b) {}
     * 3- Funções com retorno e sem parâmetros - tipo nomeFuncao() {} - exemplo: int dobrar() {}
     * 4- Funções com retorno e com parâmetros - tipo nomeFuncao(tipo parametro1, tipo parametro2) {} - exemplo: int soma(int a, int b) {}
     * 
     * 
     */
}
