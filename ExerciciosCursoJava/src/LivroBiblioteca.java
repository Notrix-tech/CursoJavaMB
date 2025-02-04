
public class LivroBiblioteca {
	private String titulo;
	private String autor;
	private boolean disponivel = true;
	
	
	public LivroBiblioteca(String titulo, String autor, boolean disponivel) {
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = disponivel;
		
	}

// get e set
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		if(titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		}else {
			System.out.println("Titulo é Inválido");
		}
		
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public boolean getDisponive() {
		return disponivel;
	}


	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	// metodos
	public void pegarEmprestado() {
		if(disponivel) {
			System.out.println("Você pegou emprestado, o livro " + titulo);
			disponivel = false;
		}else {
			System.out.println("O livro " + titulo + ", não está disponível");
		}
		
	}
	public void devolver() {
		if(!disponivel) {
			disponivel = true;
			System.out.println("Você devolveu, o livro " + titulo);
		}else {
			System.out.println("O livro " + titulo + ", já está disponível");
		}
		
	}
	//
	

}// fim Classe 
