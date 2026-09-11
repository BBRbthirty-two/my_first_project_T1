import java.util.Locale;
import java.util.Scanner;

public class questão6 {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
    float salario;


    System.out.print("Informe o seu salário: ");
        salario = entrada.nextFloat();

    System.out.println (salario <= 4000 ? "Você possui direito de VR" : "Você não possui direito de VR");
    }
}      

