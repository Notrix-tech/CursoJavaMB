package secao8;

public class LoopDoW {
    public static void main(String[] args) {
        // - Do While loop
       int i = 10;
       do{
        System.out.println(" O valor de i é: "+i);
        i--;
       }while(i > 0);
       

       //break 
       
        for(int k = 0; k <= 10; k++){
            if(k == 8){
                continue;
            }
            System.out.println("O valor de k é: "+k);
        }

        for(int x = 10; x > 0; x--){
            if(x % 2 == 0){
                System.out.println("O valor de x é: "+x + " é par");
                continue;
            }
            System.out.println("O valor de x é: "+x + " é impar");
        }
    }
    
}
