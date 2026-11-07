import java.io.*;
public class Desafio4 {
public static void main(String[] args) {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("C:/Users/Admin/Downloads/ativos.csv"));
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");

                String ip = dados[1];
                String sistema = dados[2];

                // Filtrar Windows
                if (sistema.equalsIgnoreCase("Windows")) {
                    System.out.println("IP Windows: " + ip);
                }
            }

            leitor.close();
        } catch (IOException e) {
            System.out.println("erro: " + e);
        }
    }
}
