import java.util.Scanner;

public class questão3 {
        public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    double nota1, nota2; 

    System.out.println("Informe o valor da nota 1: ");
    nota1 = ent.nextDouble();

    System.out.println("Informe o valor da nota 2: ");
    nota2 = ent.nextDouble();

    if (nota1 > nota2)
    {System.out.println("Nota 1 é maior do que nota 2.");}

    else
    {System.out.println("Nota 2 é maior do que nota 1.");}
    ent.close();
}
}