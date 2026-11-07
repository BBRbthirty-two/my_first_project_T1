import java.io.*;
import java.time.LocalDate;

public class Desafio4 {

    public static void main(String[] args) throws IOException {

        try {

            BufferedReader leitor = new BufferedReader(
                new FileReader("C:/Users/Admin/Downloads/ativos.csv")
            );

            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("C:/Users/Admin/Downloads/relatorio_auditoria.csv")
            );

            String data = LocalDate.now().toString();

            String linha = leitor.readLine();

            escritor.write("host,ip,so,criticidade,data_auditoria");
            escritor.newLine();

            while ((linha = leitor.readLine()) != null) {

                String[] dados = linha.split(",");

                String host = dados[0];
                String ip = dados[1];
                String so = dados[2];
                String criticidade = dados[3];

                escritor.write(host + "," + ip + "," + so + "," + criticidade + "," + data);

                escritor.newLine();

            }

            leitor.close();
            escritor.close();

            System.out.println("Relatório de auditoria gerado!");

        } catch (IOException e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
}