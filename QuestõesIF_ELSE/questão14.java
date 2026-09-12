import java.util.Scanner;

public class questão14 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario;

        System.out.println("Informe o salário médio mensal:");
        salario = entrada.nextDouble();

        if (salario > 5000) {
            System.out.println("Isenção de tarifa concedida!");
        } else {
            System.out.println("Tarifa será mantida.");
        }

        entrada.close();
    }
}