package secao20Annotations;

public class Exemplo {

    @Executar(vezes = 3)
    private void mostrarMensagem(){
        System.out.println("Executado método....");
    }
}
