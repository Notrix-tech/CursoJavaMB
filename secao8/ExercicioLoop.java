package secao8;

public class ExercicioLoop {
    public static void main(String[] args){
        // exercicio 1
        int somatorio = 0;
        for(int i = 0; i <=100; i++){
            somatorio += i;
        }
        System.out.println("O somatório de 1 ate 100  é: "+ somatorio);

        // exercicio 2
        int numero = 0;
        while (numero < 10){ {
            numero += 1;
            if(numero % 2 != 0){
                System.out.println("O número "+numero+" é impar");
            }
            
        }
    }
}
}
