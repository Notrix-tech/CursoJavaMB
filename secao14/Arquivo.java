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




    }//fim main
}
