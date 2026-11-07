import java.io.*;
public class Desafio1 {

    public static void main(String[] args) throws IOException {

try {
           BufferedReader leitor = new BufferedReader(new FileReader("C:/Users/Admin/Downloads/ativos.csv"));
           BufferedWriter escritor = new BufferedWriter(new FileWriter("C:/Users/Admin/Downloads/ativos.csv"));

		String linha = leitor.readLine();
		escritor.newLine();

		while((linha = leitor.readLine()) != null){
               String[] dados = linha.split(",");
		String host = dados[0];
                String ip = dados[1];
                String so = dados[2];
                String Status = dados[3];

		if(so.contains("Linux")){
            System.out.println("Em monitoramento");
            } else if (so.contains("Windows")){
            System.out.println("Online");
            }

	escritor.write(host + "," + ip + "," + so + "," + Status);
    escritor.newLine();
           }

leitor.close();
           escritor.close();
System.out.println("O Relatório foi Gerado com Sucesso");

        } catch (IOException e) {
            System.out.println("Erro: "+ e.getMessage());
        }
    }
}
