package secao17Colletion;

import java.util.*;
public class Collecion {
    /*add(E e): Adiciona um elemento ao final da lista.
    add(int index, E element): Adiciona um elemento em uma posição específica.
    get(int index): Retorna o elemento na posição informada.
    set(int index, E element): Substitui o elemento na posição informada.
    remove(int index): Remove o elemento na posição informada.
    remove(Object o): Remove a primeira ocorrência do objeto informado.
    size(): Retorna o número de elementos na lista.
    isEmpty(): Verifica se a lista está vazia.
    contains(Object o): Verifica se a lista contém o elemento informado.
    clear(): Remove todos os elementos da lista.
    indexOf(Object o): Retorna o índice da primeira ocorrência do elemento.
    lastIndexOf(Object o): Retorna o índice da última ocorrência do elemento.
    toArray(): Retorna um array contendo todos os elementos da lista
    Os principais métodos do LinkedList em Java são:

    add(E e): Adiciona um elemento ao final da lista.
    add(int index, E element): Adiciona um elemento em uma posição específica.
    addFirst(E e): Adiciona um elemento no início da lista.
    addLast(E e): Adiciona um elemento no final da lista.
    get(int index): Retorna o elemento na posição informada.
    getFirst(): Retorna o primeiro elemento.
    getLast(): Retorna o último elemento.
    remove(int index): Remove o elemento na posição informada.
    remove(Object o): Remove a primeira ocorrência do objeto informado.
    removeFirst(): Remove o primeiro elemento.
    removeLast(): Remove o último elemento.
    set(int index, E element): Substitui o elemento na posição informada.
    size(): Retorna o número de elementos na lista.
    isEmpty(): Verifica se a lista está vazia.
    contains(Object o): Verifica se a lista contém o elemento informado.
    clear(): Remove todos os elementos da lista.
     * 
     */
    public static void main(String[] args) {
        
        // 1- List
        List<String> listaNomes = new ArrayList<>();
        //tamanhho
        System.out.println(listaNomes.isEmpty());
        System.out.println(listaNomes.size());
        //adcionar elementos
        listaNomes.add("Pedro");
        listaNomes.add("João");
        listaNomes.add("Enzo");
        listaNomes.add("Zeuus");
        listaNomes.add("Theo");
        // toArray(): Retorna um array contendo todos os elementos da lista.
        System.out.println(Arrays.toString(listaNomes.toArray()));
        //Resgatar elemento nomevariavel.get(indice)
        System.out.println(listaNomes.get(0));
        System.out.println(listaNomes.size());
        System.out.println(listaNomes.isEmpty());
        System.out.println(listaNomes.contains("Pedro"));
        //alterar-um pouco mais lento, mas é possivel
        listaNomes.set(1, "Clairton");
        System.out.println(Arrays.toString(listaNomes.toArray()));

        //remover um elemento
        listaNomes.remove(2);
        System.out.println(listaNomes.get(2));
        System.out.println(Arrays.toString(listaNomes.toArray()));
       //System.out.println(listaNomes.get());

        //LinkedList
        List<Integer> numeros = new LinkedList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(50);
        numeros.add(60);
        System.out.println(Arrays.toString(numeros.toArray()));

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
         Set<Integer> numeros2 = new TreeSet<>();
         numeros2.add(45);
         numeros2.add(12);
         numeros2.add(12);//nao adciona repetidos
         numeros2.add(9);
         numeros2.add(1);
         System.out.println(numeros);

         Map<String, Integer> idades = new TreeMap<>();

         idades.put("Ana", 12);
         idades.put("Pedro", 30);
         idades.put("Clairton", 10);
         
 
 
         System.out.println(idades);

         //iteração com Collections
         //for-each
         System.out.println("Imprimindo nome de Pessoas");
         for(String nomePessoas : nomes){
           System.out.println(nomePessoas);
         }

         //iterator- hasNext verifica se ainda tem elementos 
         Iterator<String> nomesIterator = nomes.iterator();
         while (nomesIterator.hasNext()) {
            String nome = nomesIterator.next();
            if(nome.equals("Pedro"));
            nomesIterator.remove();
         }
         //System.out.println(nomes);

         //tem que ser uma lista
         ListIterator<String> listIteretorNomes = listaNomes.listIterator();
         //hasNext iprime o proximo
         //hasPrevious() iprimi ordem invertido
         while (listIteretorNomes.hasPrevious()) {
            System.out.println("Nomes " + listIteretorNomes.previous());
         }

         //trabalhando com lista Imutaveis
         /*Coleções imutáveis em Java são coleções que não podem ser modificadas após sua criação. Ou seja, não é possível adicionar, remover ou alterar elementos. Elas são úteis para garantir segurança, integridade dos dados e facilitar o uso em ambientes concorrentes.

        A partir do Java 9, você pode criar coleções imutáveis facilmente usando métodos de fábrica das interfaces List, Set e Map:
        * List<String> listaImutavel = List.of("A", "B", "C");
        Set<Integer> setImutavel = Set.of(1, 2, 3);
        Map<String, Integer> mapImutavel = Map.of("Ana", 10, "Pedro", 20);
        
        *Essas coleções são úteis quando você quer garantir que os dados não serão alterados após a criação.
                */

                List<String> listaMutavel = new ArrayList<>();
                listaMutavel.add("A");
                listaMutavel.add("B");

                System.out.println("Lista nao pode mudar");
                List<String> listaImutavel = Collections.unmodifiableList(listaMutavel);
                System.out.println(listaImutavel);

    
    }
}
