import java.util.Scanner;

public class Main {

    private static void SomarValores(){
        int a = 23;
        int b = 9;
        System.out.println(a+b);
    }
    private static void somarValoresComParametro(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        SomarValores();
        somarValoresComParametro(56, 36);
        System.out.println(subtracaoValores(56,36));;
        mostrarMenssagem();
        System.out.println(exibirMsg("Que venha o Feriado!"));
    }
    public static void mostrarMenssagem(){
        System.out.println("Minha Msg!");
    }

    private static String exibirMsg(String text){
        return text;
    }

    public static int subtracaoValores(int c, int d){
        return c-d;
    }

}


