import java.util.Scanner;

public class questão13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valor;

        System.out.println("Informe o valor da transação:");
        valor = entrada.nextDouble();

        if (valor > 10000) {
            System.out.println("Transação suspeita! Deve ser sinalizada para análise.");
        } else {
            System.out.println("Transação normal.");
        }

        entrada.close();
    }
}
