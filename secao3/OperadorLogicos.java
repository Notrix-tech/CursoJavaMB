package secao3;

public class OperadorLogicos {
    public static void main(String[] args) {
        int idade = 18;
        if (idade >= 18 || idade <= 65) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Não pode dirigir");
        }

        // outra forma
        int idade2 = 16;
        boolean ehMembro = true;
        if (idade2 >= 18 || ehMembro) {
            System.out.println("Pode entar na sala de aula");
        }else{
            System.out.println("Nao pode entar na sala de aula");
        }

        // outra forma com not

        boolean estaChovendo = true;
        if (!estaChovendo) {
            System.out.println("Esta chovendo");
        }else{
            System.out.println("Nao esta chovendo");
        }


    }//fim do  main     
    
}
