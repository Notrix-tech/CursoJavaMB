package secao20Annotations;

public class Animal {

    public void emitirSom(){
        System.out.println("O animal estar emitindo som");
    }
   
    @Deprecated
   public void mover(){
    System.out.println(" o animal Está se movendo");
   }
}
