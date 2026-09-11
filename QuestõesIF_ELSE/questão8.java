import java.util.Locale;
import java.util.Scanner;

      public class questão8 {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
    String veiculo;

    System.out.print("Utiliza de veículo próprio ao trabalho?(S/N)");
        veiculo = entrada.next();

        System.out.println (veiculo.equalsIgnoreCase("S") || veiculo.equalsIgnoreCase("Sim")? "Você possui direito de auxilio-combústivel" : "Você não possui direito de auxilio-combustível");
    }
}

