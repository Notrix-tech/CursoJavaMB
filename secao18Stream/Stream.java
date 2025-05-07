package secao18Stream;
import java.util.*;
import java.util.stream.*;
public class Stream {
    /*
    Em Java, Stream é uma API que permite processar coleções de dados de forma funcional, declarativa e eficiente. Com streams, você pode filtrar, mapear, ordenar e reduzir dados de listas, conjuntos, mapas, arrays, etc., sem alterar a coleção original.

    Principais características:

    Não armazenam dados, apenas processam.
    Podem ser sequenciais ou paralelos.
    Permitem operações encadeadas (pipeline).
    Exemplo de uso com uma lista:
    Principais métodos:
    filter(Predicate): filtra elementos.
    map(Function): transforma elementos.
    sorted(): ordena.
    collect(Collectors.toList()): coleta o resultado em uma lista.
    forEach(Consumer): executa uma ação para cada elemento.
    Streams facilitam o processamento de dados de forma clara e concisa.

    No exemplo .filter(nome -> nome.startsWith("A")), o nome é cada elemento da coleção (por exemplo, cada item da lista de nomes) durante a operação do stream. Ele representa, a cada iteração, um valor da lista que está sendo processada pelo filtro.

    Ou seja, qualquerCoisa é o parâmetro da função lambda, representando cada elemento da lista enquanto o stream está sendo processado.
     * 
     */
    public static void main(String[] args) {

        List<Integer> numeros = new LinkedList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(50);
        numeros.add(60);

        //fazer uma filtragem dos numeros
        List<Integer> numerosFiltrados = numeros.stream()
        .filter(qualquerCoisa -> qualquerCoisa < 20)
        .collect(Collectors.toList());

        System.out.println(numeros);
        System.out.println(numerosFiltrados);

    }
}
