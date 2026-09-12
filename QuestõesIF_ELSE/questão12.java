import java.util.Scanner;

public class questão12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double renda;
        int score;

        System.out.println("Informe a renda mensal:");
        renda = entrada.nextDouble();

        System.out.println("Informe o score de crédito:");
        score = entrada.nextInt();

        if (renda > 8000 && score > 700) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo recusado!");
        }

        entrada.close();
    }
}
