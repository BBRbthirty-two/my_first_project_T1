import java.util.Scanner;

class questão1 { 
    public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);

    int idade;
    System.out.println("Informe a sua idade: ");
    idade = ent.nextInt();
    
    if (idade < 18)
    {System.out.println("Menor de idade, você possui " + idade + " anos.");}

    else
    {System.out.println("Maior de idade, você possui " + idade + " anos.");}
    ent.close();
    }
}