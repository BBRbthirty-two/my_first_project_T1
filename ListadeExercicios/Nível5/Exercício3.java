package ListadeExercicios.Nível5;
import java.util.Scanner;

class exercicio3N5 {
 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, quociente, resto;

        System.out.println("Informe o primeiro número inteiro:");
        numero1 = entrada.nextInt();

        System.out.println("Informe o segundo número inteiro:");
        numero2 = entrada.nextInt();

        quociente = numero1 / numero2;
        resto = numero1 % numero2;

        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);

        entrada.close();
    }
}
