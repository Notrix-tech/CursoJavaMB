public class Main {
    public static void main(String[] args) {
    	Aluno aluno1 = new Aluno("Clairton Lima", 123456, 9);
    	aluno1.exbirInfo();
        aluno1.setNome("João Silva");
        aluno1.exbirInfo();
        
        
        ProdutoEletronico produto1 = new ProdutoEletronico("Samsung", 1500, 12);
        produto1.aplicarDesconto(15);
        produto1.exibirInfo();

        }//fim main
    }//fim classe main

