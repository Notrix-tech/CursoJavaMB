package ProjetosDoCurso.loteria;
import java.util.Arrays;
import java.util.Random;

public class Bilhete {
    private int[] numerosEscolhidos;
    private int[] resultadoSorteio;

    public Bilhete(int[] numerosEscolhidos){
        this.numerosEscolhidos = numerosEscolhidos;
    }
    //metodo para realizar sorteio
    public void realizarSorteio(){
        Random random = new Random();
        resultadoSorteio = new int[6];
        for(int i = 0; i < resultadoSorteio.length; i++){
            resultadoSorteio[i] = random.nextInt(60) + 1;
        }
        Arrays.sort(resultadoSorteio);

    }
    // Método pra contar quantos números o jogador acrtou
    public int contarAcertos(){
        int acertos = 0;
        for(int numerosEscolhido : numerosEscolhidos){
           for(int numeroSorteado: resultadoSorteio ){
                if(numerosEscolhido == numeroSorteado){
                    acertos++;
                }
           }
        }
        return acertos;


    }

    
    //exibir os resultados
    public void exibirResultado(){
        System.out.println("Números escolhidos: " + Arrays.toString(numerosEscolhidos));
        System.out.println("Números sorteados: " + Arrays.toString(resultadoSorteio));

        int acertos = contarAcertos();
        System.out.println("Você acertou: " + acertos + " Acertos no jogo. ");
        System.out.println();
    }

}
