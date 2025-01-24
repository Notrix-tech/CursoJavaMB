package secao12poo.automovel;

public class Carro {
    String marca;
    String cor;
    String modelo;
    int ano;

    double velocidadeAtual = 0;
    boolean motorLigado = false;


    // Metodos
    public void acelerar(int velocidade){
        System.out.println("Acelerando o carro...");
    }

    public void frear(){
        System.out.println("Freando o carro...");
    }
    public void buzinar(){
        System.out.println("Buzinando o carro...");
    }
    public void pararCarro(){
        System.out.println("Parando o carro...");
    }

    public void imprimir(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    void ligarMotor(){
        if(!motorLigado){
            motorLigado = true;
            System.out.println("Motor ligado");
        } else {
            System.out.println("Motor já está ligado");
        }
    }
    void velocidadeAtual( double incremento){
        velocidadeAtual += incremento;
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");

    }
    
}