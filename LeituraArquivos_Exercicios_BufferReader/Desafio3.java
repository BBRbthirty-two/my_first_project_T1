import java.io.*;
public class Desafio3 {
    public static void main(String[] args) {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("C:/Users/Admin/Downloads/ativos.csv"));
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");

                String host = dados[0];
                String sistema = dados[2];

                // Verificar se o sistema é Linux
                if (sistema.equalsIgnoreCase("Linux")) {
                    // Exibir o host
                    System.out.println("Host Linux: " + host);
                }
            }

            leitor.close();
        } catch (IOException e) {
            System.out.println("erro: " + e);
        }
    }
}
