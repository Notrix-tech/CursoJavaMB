package secao17Colletion;

public class Pessoa {
    private String nome;

    private int idade;

    //#region construtor
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    //#endregion
    @Override
    public String toString() {
    return "Pessoa{nome='" + nome + "', idade=" + idade + "}";
}
}//fim da classe
