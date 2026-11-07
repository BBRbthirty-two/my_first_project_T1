import java.io.*;
public class Desafio3 {
    public static void main(String[] args) throws IOException {

        try {

            BufferedReader leitor = new BufferedReader(
                new FileReader("C:/Users/Admin/Downloads/ativos.csv")
            );

            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("C:/Users/Admin/Downloads/hosts_criticos.csv")
            );

            String linha = leitor.readLine();

            escritor.write("host,ip,so,criticidade");
            escritor.newLine();

            while ((linha = leitor.readLine()) != null) {

                String[] dados = linha.split(",");

                String host = dados[0];
                String ip = dados[1];
                String so = dados[2];
                String criticidade = dados[3];

                if (criticidade.equalsIgnoreCase("Alta")) {

                    escritor.write(host + "," + ip + "," + so + "," + criticidade);

                    escritor.newLine();

                }

            }

            leitor.close();
            escritor.close();

            System.out.println("Arquivo de hosts críticos gerado!");

        } catch (IOException e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
}