import java.io.*;
public class Desafio5 {
    public static void main(String[] args) throws IOException {

        try {

            BufferedReader leitor = new BufferedReader(
                new FileReader("C:/Users/Admin/Downloads/ativos.csv")
            );

            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("C:/Users/Admin/Downloads/relatorio_risco.csv")
            );

            String linha = leitor.readLine();

            escritor.write("host,ip,so,criticidade,risco");
            escritor.newLine();

            while ((linha = leitor.readLine()) != null) {

                String[] dados = linha.split(",");

                String host = dados[0];
                String ip = dados[1];
                String so = dados[2];
                String criticidade = dados[3];

                int risco = 1;

                if (criticidade.equalsIgnoreCase("Alta")) {

                    risco = 10;

                } else if (criticidade.equalsIgnoreCase("Média")) {

                    risco = 5;

                } else if (criticidade.equalsIgnoreCase("Baixa")) {

                    risco = 1;

                }

                escritor.write(host + "," + ip + "," + so + "," + criticidade + "," + risco);

                escritor.newLine();

            }

            leitor.close();
            escritor.close();

            System.out.println("Relatório de risco NetSentinel gerado!");

        } catch (IOException e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
}