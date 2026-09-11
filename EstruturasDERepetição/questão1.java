package EstruturasDERepetição;

public class questão1 {
    public static void main(String[] args) {
        int contador = 1; 

        while (contador <= 10) {
            System.out.println("O participante " + contador + " foi registrado.");
            
            contador++; 
        }

        System.out.println("Fim do registro. Limite de participantes atingido.");
    }
}        