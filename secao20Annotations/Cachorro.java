package secao20Annotations;

public class Cachorro extends Animal {

    @Override
    public void emitirSom(){
        System.out.println("O Cachorro está emitindo um som: au au");
    }

    @SuppressWarnings("deprecation")
    public void testeMover(){
       mover();
    }
}
