package secao12poo.pessoa;

public class Pessoa {
    
        //Atributos e propriedades
        private String nome;
        private int idade;

        //Construtor
        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
        //construtor vazio
        public Pessoa() {
           
        }

        //Getters e Setters
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

        //Metodos
        public void imprimir(){
            System.out.println("Nome: " + this.nome);
            System.out.println("Idade: " + this.idade);
    }
}
    
    