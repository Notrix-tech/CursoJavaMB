package secao14;
import java.io.*;

public class Arquivo {
    public static void main(String[] args) {
        //1-leiura de arquivos
        String currentDir = System.getProperty("user.dir") + "\\secao14\\";
        System.out.println(currentDir);

        //FileReader = caracter por caracter
        try (FileReader reader = new FileReader(currentDir + "arquivo.txt")) {
            int caracter;

            while( (caracter = reader.read()) != -1) {
                // -1 indica o fim do arquivo
                System.out.print((char) caracter);
                
            }
            
        } catch (Exception e) {
           System.out.println("Erro ao ler o arquivo" + e.getMessage());
        }
        System.out.println();

        //BufferReader = linha por linha
        // veja a firença entre um e outro. Ok!

        try (BufferedReader reader = new BufferedReader(new FileReader(currentDir + "arquivo.txt"))) {
            String linha;

            while( (linha = reader.readLine()) != null) {
                // -1 indica o fim do arquivo
                System.out.println(linha);
                
            }
            
        } catch (Exception e) {
           System.out.println("Erro ao ler o arquivo" + e.getMessage());
        }

        // 2 - escrevendo em arquivos
        //se o arquivo nao existe ele é automaticamente criado pelo Java
        try (FileWriter writer = new FileWriter(currentDir + "saida.pdf")) {

            writer.write("escrevendo em arquivo \n");
            writer.write("escrevendo em arquivo 2");
            
        } catch (Exception e) {
            System.out.println("Erro ao escrever no arquivo" + e.getMessage());
        }

        //Esse é mais moderno
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt", true))) {

            writer.write("Escrenvendo em arquivo com BufferedReader");
            writer.newLine();
            writer.write("Escrenvendo a linha dois sem usar o quebra linha com barra n");
            
        } catch (Exception e) {
            System.out.println("Erro ao escrever no arquivo" + e.getMessage());
        }

        System.out.println("-----------------Serializable--------------------");

        //3 serialização de objetos
        Pessoa pessoa = new Pessoa("ClairtonLima", 45);
        System.out.println(pessoa.getNome());
        // - SERIALIZAÇÃO
        // tem extensao .ser
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currentDir + "pessoa.ser"))) {
            oos.writeObject(pessoa);
            System.out.println("Objeto serializado com sucesso");
            
        } catch (Exception e) {
            System.out.println("Erro ao serializar objeto" + e.getMessage());
        }
        //4 Deserialização do obejto
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(currentDir + "pessoa.ser"))) {

            Pessoa pessoa2 = (Pessoa) ois.readObject();
            System.out.println("Nome: " + pessoa2.getNome());
            System.out.println("Idade: " + pessoa2.getIdade());
            
        } catch (Exception e) {
            System.out.println("Erro ao desserializar objeto" + e.getMessage());
        }
    }//fim main
}
