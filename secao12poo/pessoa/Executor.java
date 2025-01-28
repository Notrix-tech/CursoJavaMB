package secao12poo.pessoa;

public class Executor {
    public static void main(String[] args) {
        // 1  criar um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Clairton Lima");
        pessoa.setIdade(30);

        pessoa.imprimir();
    }
}