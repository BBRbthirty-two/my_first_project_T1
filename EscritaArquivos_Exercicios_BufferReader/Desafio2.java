import java.io.*;
public class Desafio2 {
    public static void main(String[] args) throws IOException {
        try {

            BufferedReader leitor = new BufferedReader(
                new FileReader("C:/Users/Admin/Downloads/ativos.csv")
            );

            int windows = 0;
            int linux = 0;
            int macos = 0;

            String linha = leitor.readLine();

            while ((linha = leitor.readLine()) != null) {

                String[] dados = linha.split(",");

                String so = dados[2];

                if (so.contains("Windows")) {

                    windows++;

                } else if (so.contains("Linux")) {

                    linux++;

                } else if (so.contains("macOS")) {

                    macos++;

                }

            }

            leitor.close();

            System.out.println("Contagem Hosts Sistemas Operacionais:");

            System.out.println("Windows: " + windows);
            System.out.println("Linux: " + linux);
            System.out.println("macOS: " + macos);

        } catch (IOException e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
}