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





    }
}
