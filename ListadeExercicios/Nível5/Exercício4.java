package ListadeExercicios.Nível5;
import java.util.Scanner;

class exercicio4N5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double capital, taxa, tempo, juros, montante;

        System.out.println("Informe o capital inicial:");
        capital = entrada.nextDouble();

        System.out.println("Informe a taxa de juros mensal (%):");
        taxa = entrada.nextDouble();

        System.out.println("Informe o tempo em meses:");
        tempo = entrada.nextDouble();

        taxa = taxa / 100;

        juros = capital * taxa * tempo;
        montante = capital + juros;

        System.out.println("Juros: R$ " + juros);
        System.out.println("Montante final: R$ " + montante);

        entrada.close();
    }

}