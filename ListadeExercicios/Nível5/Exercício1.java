import java.util.Locale;
import java.util.Scanner;
class exercicio1N5 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        double peso, altura, IMC;
        System.out.println("Vamos calcular o seu IMC!");
        System.out.println("Informe o seu peso (Kg):");
        peso = entrada.nextDouble();

        System.out.println("Agora informe sua altura:");
        altura = entrada.nextDouble();

        IMC = peso / Math.pow(altura, 2);

        System.out.printf("O seu IMC será: " + IMC);

        entrada.close();
    }
}