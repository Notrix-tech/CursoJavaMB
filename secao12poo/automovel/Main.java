package secao12poo.automovel;

public class Main {
    public static void main(String[] args) {
        // 1  criar um objeto da classe Carro
      Carro car = new Carro();
        car.marca = "Fiat";
        car.modelo = "Uno";
        car.ano = 2015;
        car.cor = "Vermelho";
        // 2  chamar os metodos do objeto
        car.imprimir();
        car.acelerar(10);
        car.frear();
        car.buzinar();
        car.pararCarro();
        car.ligarMotor();
        car.acelerar(0);
        car.velocidadeAtual(100);


       
        
    }
    
}