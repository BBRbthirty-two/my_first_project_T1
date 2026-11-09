import java.io.*;
public class DesafioFinal {
public static void main(String[] args) {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("C:/Users/Admin/Downloads/ativos.csv"));
            String linha;

            int linux = 0;
            int windows = 0;
            int firewall = 0;
            int total = 0;

            // Ler arquivo e classificar sistemas
            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                String sistema = dados[2].trim();

                if (sistema.equalsIgnoreCase("Linux")) {
                    linux++;
                } else if (sistema.equalsIgnoreCase("Windows")) {
                    windows++;
                } else if (sistema.equalsIgnoreCase("Firewall")) {
                    firewall++;
                }

                total++;
            }

            // Exibir relatório
            System.out.println("=== RELATÓRIO DE ATIVOS ===");
            System.out.println("Total de Ativos: " + total);
            System.out.println("Dispositivos Linux: " + linux);
            System.out.println("Dispositivos Windows: " + windows);
            System.out.println("Dispositivos Firewall: " + firewall);

            leitor.close();
        } catch (IOException e) {
            System.out.println("erro: " + e);
        }
    }
}
