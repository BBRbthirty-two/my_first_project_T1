import java.util.Scanner;

public class questão11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double investimento;

        System.out.println("Informe o valor investido:");
        investimento = entrada.nextDouble();

        if (investimento <= 10000) {
            System.out.println("Categoria: Bronze");
        } else if (investimento <= 50000) {
            System.out.println("Categoria: Prata");
        } else if (investimento <= 100000) {
            System.out.println("Categoria: Ouro");
        } else {
            System.out.println("Categoria: Platinum");
        }

        entrada.close();
    }
}
