package ListadeExercicios.Nível5;
import java.util.Locale;
import java.util.Scanner;
class exercicio2N5 {
public static void main(String[] args){
    Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

    float metros , cent;
    System.out.println("Informe um valor em metros: ");
    metros = entrada.nextFloat();
    cent = metros * 100;
    System.out.println("O valor em centímetros será: " + cent + "cm.");

    }
}