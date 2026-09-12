package ListadeExercicios.Nível4;
import java.util.Scanner;

public class Exercício3 {
        public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
        float valor;
        int horas;

    System.out.print("Informe quanto você ganha por hora trabalhada: R$");
    valor = entrada.nextFloat();
    System.out.print("Informe quantas horas você trabalha por mês: ");
    horas = entrada.nextInt();
    System.out.println ("Seu salário bruto será de: R$" + (valor * horas));
    }
}