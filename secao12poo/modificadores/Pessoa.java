package secao12poo.modificadores;

public class Pessoa {
    private final String nome;
    private final int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public void exibirDados(){
        System.out.println("=====Dados da Pessoa==" + nome);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
