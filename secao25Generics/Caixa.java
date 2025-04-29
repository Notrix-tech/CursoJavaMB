package secao25Generics;

public class Caixa<T> {
    private T conteudo;

        //setter
        public void adcionar( T conteudo){
            this.conteudo = conteudo;
        }

        //getter
        public T abrir(){
            return this.conteudo;
        }
}
