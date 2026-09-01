import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

class exercicio4N3 { 
    public static void main(String[] args) {
    System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
    Scanner entrada = new Scanner(System.in);

    double base, altura, perimetro;
 
    System.out.println("Informe a base do retângulo");	
    base = entrada.nextDouble();

    System.out.println("Informe a altura do retângulo");	
    altura = entrada.nextDouble();

    perimetro = 2 * (base + altura);
    
    System.out.println("O retângulo tem " + perimetro + " de perímetro.");	    
    entrada.close();
    }
}