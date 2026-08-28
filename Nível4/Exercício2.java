import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

class Main { 
    public static void main(String[] args) {
    System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
    Scanner entrada = new Scanner(System.in);

    double km, litros, kmL;
    System.out.println("Para calcularmos o consumo de combustível, informe a distancia percorrida em km: ");
    km = entrada.nextDouble();

    System.out.println("Agora informe o total de litros de combustível consumidos: ");
    litros = entrada.nextDouble();

    kmL = km / litros;
    System.out.println("O consumo médio de combustível é de " + kmL + "km/L.");
    entrada.close();
    }
}