package secao12poo.modificadores;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Pessoa clairton = new Pessoa("Clairton Lima", 44);
        Pessoa john = new Pessoa("John Doe", 23);

        clairton.exibirDados();
        john.exibirDados();

        System.out.println("============================");
        String[] meusAlunos = {"Clairton", "Maria", "Chico", "Tereza"};
        Turma novaTurma = new Turma(meusAlunos);
        System.out.println(Arrays.toString(novaTurma.getAlunos()));

        //Esrou mundando os Array de alunos
        String[] outrosAlunos = {"trakn", "eduardo", "Chaivo"};
        novaTurma = new Turma(outrosAlunos);
        System.out.println(Arrays.toString(novaTurma.getAlunos()));
    }
}
