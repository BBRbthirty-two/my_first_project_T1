import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

class Main { 
    public static void main(String[] args) {
    System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
    Scanner entrada = new Scanner(System.in);

    double celsius;
    System.out.println("Informe a temperatura em graus celsius: ");
    celsius = entrada.nextDouble();
    double fahrenheit = (celsius * 9/5) + 32;

    System.out.println("A temperatura em Fahrenheit é de " + fahrenheit);

    entrada.close();
    }
}