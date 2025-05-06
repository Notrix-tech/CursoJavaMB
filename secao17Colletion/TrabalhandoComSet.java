package secao17Colletion;

import java.util.*
;
public class TrabalhandoComSet {
        /*O Set em Java é uma interface que representa uma coleção que não permite elementos duplicados. Ou seja, cada elemento só pode aparecer uma vez no conjunto. As principais implementações de Set são:

    HashSet: Não garante ordem dos elementos.ou seja, vou colocar os elemento e ele vai reordenar sem minha permição
    LinkedHashSet: Mantém a ordem de inserção.
    TreeSet: Mantém os elementos ordenados (ordem natural ou por comparador).
    Principais características do Set:

    Não aceita elementos repetidos.
    Permite elementos null (exceto TreeSet com tipos não comparáveis).
    Não garante ordem (exceto LinkedHashSet e TreeSet).
        * 
        *Não tem .get() para pegar os elementos
        */
    public static void main(String[] args) {
        //ordenou sem minha permissão
        Set<String> nomes = new HashSet<>();
        nomes.add("João");
        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("carvalho ");
        nomes.add("Willian");

        System.out.println(nomes);

        //manteve a ordem que coloquei no Array
        Set<Integer> num = new LinkedHashSet<>();
        num.add(23);
        num.add(45);
        num.add(45);
        num.add(1);
        num.add(100);
        num.add(600);
        System.out.println(num);

        //TreeSet() reordenou e colocou na ordem 
        Set<Integer> numeros = new TreeSet<>();
        numeros.add(45);
        numeros.add(12);
        numeros.add(12);//nao adciona repetidos
        numeros.add(9);
        numeros.add(1);
        System.out.println(numeros);



    }
}
