package ExerciciosCursoJava.poo;
/* > Exercício 1: Criando uma Classe Celular

    Crie uma classe Celular que tenha as seguintes propriedades: marca, modelo, bateria. 
    Implemente os métodos para ligar e desligar o celular, 
    e outro método que simule o consumo da bateria quando o celular é usado. 
    Crie a classe principal para instanciar dois objetos Celular 
    e testar os métodos criados.
 * 
 */
public class Celular {
    private String marca;
    private String modelo;
    private int bateria;
    // Construtor
    public Celular(){

    }

    public Celular(String marca, String modelo, int bateria){
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;

    }
    // metodos
    public void Ligar(){
        System.out.println("Celular ligado");
    }
    public void Desligar(){
        System.out.println("Celular desligado");
    }
    public void Usar(){
        bateria -= 10;
        System.out.println("Celular usado, bateria atual: " + bateria);
    }
    // Getters e Setters
    
}
