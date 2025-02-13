package ProjetosDoCurso.loteria;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SimuladorLoteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bilhete> bilhetes = new ArrayList<>();

        while (true) {
            try {
                System.out.println("Digite 6 números para seu bilhete de 1 a 60");
                int[] numerosEscolhidos = new int[6];
                HashSet<Integer> numerosUsados = new HashSet<>();

                // usuario escolhe os numeros
                for(int i = 0; i < numerosEscolhidos.length; i++){
                    System.out.println("Digite o numero " + (i + 1) + ": ");
                    int numero = scanner.nextInt();
                    
                    // Validação do número
                    if(numero < 1 || numero > 63) {
                        System.out.println("Número inválido! Digite um número entre 1 e 60.");
                        i--;
                        continue;
                    }
                    
                    // Verificação de número repetido
                    if(numerosUsados.contains(numero)) {
                        System.out.println("Número já escolhido! Digite outro número.");
                        i--;
                        continue;
                    }
                    
                    numerosEscolhidos[i] = numero;
                    numerosUsados.add(numero);
                }

                Bilhete bilhete = new Bilhete(numerosEscolhidos);
                bilhetes.add(bilhete);

                System.out.println("Deseja registrar outro bilhete? (s / n) ");
                String resposta = scanner.next();
                if(resposta.toLowerCase().equals("n")){
                    break;
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Por favor, digite apenas números.");
                scanner.nextLine(); // limpa o buffer
                continue;
            }
        }

        System.out.println("Realizando Sorteio...");
        for(Bilhete bilhete : bilhetes){
            bilhete.realizarSorteio();
            bilhete.exibirResultado();
        }

        scanner.close();
    }
}
