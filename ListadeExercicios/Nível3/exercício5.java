import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

    class exercicio5N3 {
    public static void main(String[] args) {
    System.setOut(new PrintStream(System.out,  true, StandardCharsets.UTF_8));
    
    Scanner entrada = new Scanner(System.in);
	double produto, desconto, resultado;
        
	System.out.println("Para calcularmos o desconto, digite o valor do produto aplicado:");
	produto = entrada.nextDouble();

	desconto = 15;

	resultado = produto - ((desconto / 100) * produto);
	System.out.println("O valor do seu produto com desconto aplicado vai ser: R$" + resultado + ".");
    entrada.close();
    }       
}

