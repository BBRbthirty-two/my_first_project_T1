import java.util.Scanner;

public class questão10 {
        public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario, parcela, limite;

        System.out.println("Informe o salário do cliente:");
        salario = entrada.nextDouble();

        System.out.println("Informe o valor da parcela desejada:");
        parcela = entrada.nextDouble();

        limite = salario * 0.30;

        if (parcela <= limite) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo recusado!");
        }

        entrada.close();
    }
}