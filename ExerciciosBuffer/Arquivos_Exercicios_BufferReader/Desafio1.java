import java.io.*;
import java.io.IOException;
public class Desafio1{
    public static void main(String[] args) {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("C:/Users/Admin/Downloads/ativos.csv"));
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                String host = dados[0];
                System.out.println(host);
            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("erro: " + e);
        }
    }
}