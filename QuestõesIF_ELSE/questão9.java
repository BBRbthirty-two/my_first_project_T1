import java.util.Scanner;
public class questão9 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Digite o cargo do funcionário: ");
String cargo = sc.nextLine();
if (cargo.equalsIgnoreCase("administrativo")) {
System.out.println("O funcionário pode participar do programa de idiomas.");
} else if (cargo.equalsIgnoreCase("liderança") || 
cargo.equalsIgnoreCase("lideranca")) {
System.out.println("O funcionário pode participar") ;
        }
    }
}