package ExerciciosCursoJava.poo;

import ExerciciosCursoJava.Celular;

/**
 * Classe executora para demonstrar o uso da classe Celular
 */
public class Executor {
    public static void main(String[] args) {
        Celular android = new Celular("Samsung", "Galaxy S10", 100);
        Celular iphone = new Celular("Apple", "iPhone 12", 100);
        
        // Adicionar demonstração de uso dos métodos
        System.out.println("Demonstração de celulares:");
        System.out.println(android);
        System.out.println(iphone);
    }
}