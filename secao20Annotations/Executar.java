//-vamos criar uma Annotations customizada
package secao20Annotations;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)//em temopo de execução- ao executar o codigo
@Target(ElementType.METHOD)// aplicada em metdos - Aonde ele vai rodar 

@interface Executar {
    //o que le vai fazer
    int vezes() default 1;
}
