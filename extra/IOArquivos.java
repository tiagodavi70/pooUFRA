import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.Writer;

public class IOArquivos {
    
    public static void main(String args[]) {
        Reader leitor;
        try {
            // Caminho absoluto: C:/usuarios/nome/........
            // Caminho relativo: ./pasta

            // \\ ou / para caminhos
            leitor = new FileReader("./pasta/arquivo_1.txt");
            int data = leitor.read();
            while(data != -1) {    
                System.out.print((char)data);
                data = leitor.read();
            }
            leitor.close();
            
            System.out.println();
            System.out.println();

            Writer escrita = new FileWriter("./pasta/arquivo_novo.txt");

            escrita.write("linha 1 \n");
            escrita.write("linha 2 \n");
            escrita.write("linha 3");

            escrita.close();


            InputStream inputstream = new FileInputStream("./pasta/arquivo_novo.txt");

            data = inputstream.read();
            while(data != -1) {
                System.out.print((char)data);
                data = inputstream.read();
            }
            inputstream.close();
            
            System.out.println();
            System.out.println();

            String linha;
            BufferedReader br = new BufferedReader(new FileReader("./pasta/arquivo_novo.txt"));
            while ((linha = br.readLine()) != null) { 
                System.out.println(linha);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
