import java.util.Scanner;

public class questão2 {
        public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    double nota = ent.nextDouble();

    System.out.println("Informe a sua nota: ");
    
    if (nota >= 7)
    {System.out.println("Aprovado");}

    else
    {System.out.println("Reprovado");}
    ent.close();
}
}