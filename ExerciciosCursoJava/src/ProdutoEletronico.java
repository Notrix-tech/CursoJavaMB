
public class ProdutoEletronico {
	private String marca;
	private double preco;
	private int garantia;
	
	// Construtor
	

	public ProdutoEletronico(String marca, double preco, int garantia) {
		this.marca = marca;
		this.preco = preco;
		this.garantia = garantia;
	}

	// Getters e Setters
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getGarantia() {
		return this.garantia;
	}
	
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	
	//metodos
	
	public void aplicarDesconto(double porcentagem) {
		if(porcentagem > 0 && porcentagem <= 100) {
			double valorDesconto = calcularDesconto(porcentagem);
			preco -= valorDesconto;
			System.out.println("========================");
			
			System.out.println("Desconto aplicado com sucesso! No valor de " + "R$" + valorDesconto + " reais");
			
		}else {
			System.out.println(" Porcentagem inválida deve ser de 0% a 100 %");
		}
		
		
	}
	
	//Calcular desconto do produto
	public double calcularDesconto(double porcentagem) {
		return (preco * porcentagem)/ 100;
	}
	
	//Metodo para exibir informacoes do produto
	public void exibirInfo() {
		System.out.println("Marca: " + marca);
		
		System.out.println("Preço com desconto: " + preco);
		System.out.println("Garantia: " + garantia + " meses");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// fim classe
