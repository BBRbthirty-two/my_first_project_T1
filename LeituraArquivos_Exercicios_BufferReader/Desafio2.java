import java.io.*;
public class Desafio2 {
    public static void main(String[] args) {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("C:/Users/Admin/Downloads/ativos.csv"));
            String linha;
            int total = 0;

            while ((linha = leitor.readLine()) != null) {
                // Incrementar contador para cada linha lida
                total++;
            }

            System.out.println("Total de registros encontrados: " + total);

            leitor.close();
        } catch (IOException e) {
            System.out.println("erro: " + e);
        }
    }
}