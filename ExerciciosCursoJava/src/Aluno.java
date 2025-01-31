
public class Aluno {
	private String nome;
	private int matricula;
	private double notaFinal;

	public Aluno(String nome, int matricula, double notaFinal) {
		this.nome = nome;
		this.matricula = matricula;
		this.notaFinal = notaFinal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			System.out.println("Nome inválido");
		}
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		if (notaFinal >= 0 && notaFinal <= 10) {
			this.notaFinal = notaFinal;
		}
	}

	public void exbirInfo() {
		System.out.println("O aluno: " + nome + ", matrícula: " + matricula + ", obteve a nota final de " + notaFinal);
	}
}
