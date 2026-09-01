import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

    class exercicio4N4 {
        public static void main(String[] args) {
    System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
    Scanner entrada = new Scanner(System.in);

    double raio, area;
    System.out.println("Informe o raio da esfera: ");
    raio = entrada.nextDouble();

    area = Math.PI * Math.pow(raio, 2);
    
    System.out.println("A area da esfera é: " + area);
    
    entrada.close();
}
}
