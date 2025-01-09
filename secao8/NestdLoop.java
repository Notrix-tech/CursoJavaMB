package secao8;

public class NestdLoop {
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int x = 1; x <= 10; x++){
            for(int y = 1; y <=10; y++){
                System.out.println(x + "x" + y + " =" + (x*y));
            }
        }
        
    }
}
