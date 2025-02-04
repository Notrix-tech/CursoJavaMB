package secao12poo.modificadores;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class Turma {
    private String[] alunos;

    public Turma(String[] alunos){
        this.alunos = copyOf(alunos, alunos.length);
    }
    public String[] getAlunos() {
        return Arrays.copyOf(alunos, alunos.length);
    }
    public void setAlunos(String[] alunos){
        this.alunos = Arrays.copyOf(alunos, alunos.length);
    }
}
