import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Arquivos {

    public static void main(String[] args) {
        
        // Leitura de dados de arquivos prontos
        // . = pasta atual
        // .. = pasta mãe
        // C:/usuarios/nome/documentos/arquivo.txt
        // C:\\usuarios\\nome\\documentos\\arquivo.txt

        FileReader leitorArquivo;

        try {
            leitorArquivo = new FileReader("arquivo.txt");
            Scanner in = new Scanner(leitorArquivo);
            while (in.hasNextLine()) {
                String linha = in.nextLine();
                System.out.println(linha);
            }
            in.close();   
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado.");
            e.printStackTrace();
        }

        // Escrever dados em arquivos (ou criar arquivos novos)
        File arquivoNovo;
        arquivoNovo = new File("arquivoNovo.txt");
        try {
            FileWriter escreverArquivo = new FileWriter(arquivoNovo, false);
            escreverArquivo.write("Tiago"+"\n");
            escreverArquivo.write("Alexandre"+"\n");
            escreverArquivo.write("Marcio"+"\n");
            escreverArquivo.close();

        } catch (IOException e) {
            System.out.println("Não é possível escrever nesse arquivo.");
            e.printStackTrace();
        }
    }
}