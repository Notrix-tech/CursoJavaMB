public class Generic {
    public static void main(String[] args) {
        //1 classes genericas

        Caixa<String> caixa = new Caixa<>();

        caixa.guardar("Hello");
        String conteudo = caixa.abrir();

        System.out.println(conteudo);

        Caixa<Integer> caixa2 = new Caixa<>();
        caixa2.guardar(100);
        Integer conteudo2 = caixa2.abrir();
        System.out.println(conteudo2);
    }
}
