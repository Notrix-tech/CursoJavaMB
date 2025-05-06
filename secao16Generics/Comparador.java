package secao16Generics;
//-modelo de classe do tipo delimitador- Bounded Types- Um tipo generico delimitado pelo tipo
//-por exemplo vamos delimitar para ser so tipo NUmber
public class Comparador<T extends Number> {

    public T obterMaior(T numero1, T numero2){

        if(numero1.doubleValue() > numero2.doubleValue()){
            return numero1;
        }else {
            return numero2;
        }
    }
}
 