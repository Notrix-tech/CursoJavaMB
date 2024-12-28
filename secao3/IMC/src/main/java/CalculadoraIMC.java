

import java.text.DecimalFormat;
import java.util.Scanner;


public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("=== Calculadora de IMC - Ministério da Saúde ===");

        // Solicitar peso
        System.out.println("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        // Solicitar altura
        System.out.println("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();
        scanner.nextLine();
        // Calcular IMC
        double imc = calcularIMC(peso, altura);

        // Exibir resultados
        System.out.println("\nResultados:");
        System.out.println("Seu IMC: " + df.format(imc));
        System.out.println("Classificação: " + classificarIMC(imc));

        scanner.close();
    }

    // Método para calcular IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método para classificar IMC segundo o Ministério da Saúde
    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidade Grau I";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III";
        }
    }
}
