import java.util.Scanner;

public class questão4 {
    public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    double nota;
    System.out.println("Informe a sua nota: ");
    nota = ent.nextDouble();
    if (nota >= 9)
    {System.out.println("Excelente");}

    else if (nota >=7){System.out.println("Bom");}

    else if (nota >=5){System.out.println("Regular");}

    else {System.out.println("Insuficiente");}
    ent.close();
    }
}