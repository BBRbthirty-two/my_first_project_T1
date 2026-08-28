import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

class Main { 
    public static void main(String[] args) {
    System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
    Scanner entrada = new Scanner(System.in);

    double dolar, reais;
    System.out.println("Informe o valor em reais (R$): ");
    reais = entrada.nextDouble();
    dolar = reais / 5.21; 

    System.out.println("O valor em dólares é de " + dolar);
    entrada.close();
    }
}