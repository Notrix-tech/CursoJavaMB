package secao20Annotations;

public class Annotations {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.testeMover();

        //customizada 
        Exemplo exemplo = new Exemplo();
        for (java.lang.reflect.Method metodo : exemplo.getClass().getDeclaredMethods()) {
            System.out.println(metodo);
        }
    }
}
