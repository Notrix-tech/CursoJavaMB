public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Clairton Lima", 123456, 9);
        aluno1.exbirInfo();
        aluno1.setNome("João Silva");
        aluno1.exbirInfo();

        ProdutoEletronico produto1 = new ProdutoEletronico("Samsung", 1500, 12);
        produto1.aplicarDesconto(15);
        produto1.exibirInfo();

        System.out.println("========================");
        ProdutoEletronico produto2 = new ProdutoEletronico("LG", 1000, 24);
        produto2.aplicarDesconto(10);
        produto2.exibirInfo();
        
        System.out.println("===========Livro=============");
        LivroBiblioteca livro1 = new LivroBiblioteca("Java como programar", "Jemes AIP", true);
        livro1.devolver();
        System.out.println(livro1.getDisponive());
        livro1.pegarEmprestado();
        livro1.pegarEmprestado();
        livro1.devolver();

        LivroBiblioteca livro2 = new LivroBiblioteca("Clean Code", "Robert C. Martin", true);
        livro2.pegarEmprestado();
        livro2.devolver();

        LivroBiblioteca livro3 = new LivroBiblioteca("Effective Java", "Joshua Bloch", true);
        livro3.pegarEmprestado();
        livro3.devolver();
        System.out.println(livro3.getDisponive());;
        System.out.println("");

    }// fim main
}// fim classe main
