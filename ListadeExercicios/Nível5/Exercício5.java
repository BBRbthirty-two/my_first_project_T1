package ListadeExercicios.Nível5;
import java.util.Scanner;

class exercicio5N5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int totalSegundos, horas, minutos, segundos;

        System.out.println("Informe a quantidade total de segundos:");
        totalSegundos = entrada.nextInt();

        horas = totalSegundos / 3600;
        minutos = (totalSegundos % 3600) / 60;
        segundos = totalSegundos % 60;

        System.out.println(horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");

        entrada.close();
    }
}
