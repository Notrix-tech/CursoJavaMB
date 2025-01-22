package secao9rreis;

public class Listas {
    public static void main(String[] args) {
        // 1 - Sintaxe de Arreis
        int [] numeros = {1, 2, 3, 4, 5, 10};
        System.out.println("O valor do primeiro elemento é : " + numeros[0]);

        exibirNumeros(numeros);

        // Tamaho fixo, só que vazio
        String [] nomes = new String [3];
        nomes[0] = "Maria";
        nomes[1] = "João";
        nomes[2] = "José";
        System.out.println("O valor do segundo elemento é : " + nomes[2]);

        //2 loops em arrays
        //somar todos os elementos de um array
        // acessar os elemntos e condensar a soma deles em uma variavel
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("A soma dos elementos do array é : " + soma);

        // for each
        for(String qualquerCoisa : nomes){
            System.out.println(" A cada passagem é um nome diferente " + qualquerCoisa);
        }

        //3 - encontrar o maior e o menor valor de um array
        int[] valores = {1, 2, 3, 4, 5, 6, 7, 30, 9};
        int maior = valores[0];
        int j = 0;
        while (j < valores.length) {
            if(valores[j] > maior){
                maior = valores[j];
            }
            j++;
        }
        System.out.println("O maior valor do array é : " + maior);

        for(int num: numeros){
            if(num % 2 == 0){
                System.out.println("O valor é par " + num);
            }else if(num % 2 != 0){
                System.out.println("O valor é impar " + num);
            }
        }
        // juntar palavras
        String[] palavras = {"Java", "é", "uma", "linguagem", "orientada", "a", "objetos"};
        String frase = "";
        for (String palavra : palavras) {
            frase += palavra + " ";
        }
        System.out.println(frase);
        //saber seo elemento estar no array
        char[] letras = {'a', 'e', 'i', 'o', 'u'};
        char letraProcurada = 'a';
        for(char letra : letras){
            if(letra == letraProcurada){
                System.out.println("A letra " + letraProcurada + " está no array");
                break;
            }
        }
        //loops com ifs
        int somasPares = 0;
        for(int numeroSomado : numeros){
            System.out.println("O número somado é : " + numeroSomado);
            if(numeroSomado % 2 == 0){
                somasPares += numeroSomado;
            }
        }
        System.out.println("A soma dos números pares é : " + somasPares);

        

    }

    public static void exibirNumeros(int[] array) {
        for (int valor : array) {
            System.out.println("Valor: " + valor);
        }

        
    }
}
