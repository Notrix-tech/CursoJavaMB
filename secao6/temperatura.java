package secao6;

public class temperatura {
    public static void main(String[] args) {
        double celsius = 45;
        double fahrenheit = converterParaFahrenheit(celsius);
        System.out.println("O valor em Fahrenheit é: " + fahrenheit);
    }
    /**
     * Converte uma temperatura de Celsius para Fahrenheit
     * @param celsius A temperatura em Celsius
     * @return A temperatura em Fahrenheit
     */
    public static double converterParaFahrenheit(double celsius) {
        return (9 * celsius / 5) + 32;
    }
}
