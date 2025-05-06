public class Caixa<B> {
    private B conteudo;
    
    public void guardar(B conteudo) {
        this.conteudo = conteudo;
    }

    public B abrir() {
        return this.conteudo;
    }
}
