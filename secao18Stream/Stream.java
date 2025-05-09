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

        Set<String> nomes = new HashSet<>();
         nomes.add("João");
         nomes.add("Pedro");
         nomes.add("Ana");
         nomes.add("carvalho ");
         nomes.add("Willian");

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

        //-busca
        //1-for
        int numeroParaEncontrar = 20;
        boolean encontrou = false;
        for(Integer numeroQueprocuro : numeros){
            if(numeroQueprocuro == numeroParaEncontrar){
                encontrou = true;
            }
        }
        System.out.println(numeroParaEncontrar);
        System.out.println("Encontrou? " + numeroParaEncontrar);

        String nomeBuscado = "Clairton";
        boolean encontrouNome = nomes.contains(nomeBuscado);
        
        System.out.println(nomes);
        System.out.println("Encontrei o nome da pesquisa: " + encontrouNome);

        //-findAny()--procura qualquerCoisa na coleção que eu passar.
        Optional<Integer> qualquerNumero = numeros.stream()
        .findAny();
        System.out.println(qualquerNumero);

        Optional<Integer> primeiroNumero = numeros.stream().findFirst();
        System.out.println(primeiroNumero);

        Optional<Integer> primeiroPar = numeros.stream()
        .filter(num -> num % 2 == 0)
        .findFirst();
        System.out.println("Encontrei na lista o primeiro número par: " + primeiroPar);

        //MapO método map() em streams Java é usado para transformar cada elemento da coleção original em outro valor, criando uma nova coleção com os resultados. Ele recebe uma função (lambda) que define como cada elemento será transformado.
        List<Integer> quadrados = numeros.stream()
        .map(n -> n * n)
        .collect(Collectors.toList());
        System.out.println(numeros);
        System.out.println(quadrados);
        quadrados.removeIf(n -> n > 200);
        System.out.println(quadrados);

        //colocar em upcase
        List<String> nomeMaisculo = nomes.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
        System.out.println(nomeMaisculo);

        //reduce
        System.out.println("---Usando REDUCE---");
        int soma = numeros.stream()
        .reduce(0, (acumulador, numero)-> acumulador + numero);
        System.out.println("Soma de todos os números: " + soma);

        System.out.println("Concatenando String com reduce");
        String frase = nomes.stream()
        .reduce(" ", (concatenador, nome)-> concatenador + " " + nome);
        System.out.println(frase);
    }//main
}//
