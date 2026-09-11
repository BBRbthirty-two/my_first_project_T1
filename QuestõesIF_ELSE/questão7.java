import java.util.Locale;
import java.util.Scanner;

public class questão7 {

    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
    int tempoMes;

    System.out.print("Qual o seu tempo em meses na empresa? ");
        tempoMes = entrada.nextInt();

    System.out.println (tempoMes > 3 ? "Você possui direito a Plano de Saúde Empresarial" : "Você não possui direito a Plano de Saúde Empresarial");
    }
}      

