package secao17Colletion;
import java.util.*;
public class TrabalhandoMap {
        /*O Map em Java é uma interface que representa uma coleção de pares chave-valor. Cada chave é única e está associada a um valor. Os valores podem se repetir, mas as chaves não.

    Principais implementações:

    HashMap: Não garante ordem das chaves. OU seja ele muda sem minha permissão
    LinkedHashMap: Mantém a ordem de inserção das chaves.
    TreeMap: Mantém as chaves ordenadas.
    Principais métodos:

    put(K chave, V valor): Adiciona ou atualiza um par chave-valor.
    get(K chave): Retorna o valor associado à chave.
    remove(K chave): Remove o par pela chave.
    containsKey(K chave): Verifica se a chave existe.
    containsValue(V valor): Verifica se o valor existe.
    keySet(): Retorna um Set com todas as chaves.
    values(): Retorna uma coleção com todos os valores.
    entrySet(): Retorna um conjunto de pares chave-valor.

    map com chave existente ele atualiza o valor
        * 
        */
    public static void main(String[] args) {

        Map<String, Integer> idades = new TreeMap<>();

        idades.put("Ana", 12);
        idades.put("Pedro", 30);
        idades.put("Clairton", 10);
        


        System.out.println(idades);
    }
}
