// Dia 001: Gerando um número aleatório dentro de um range específico
import java.security.SecureRandom;
import java.sql.SQLOutput;
import java.util.Scanner;


public final class Main {
    public static final SecureRandom ALEATORIO = new SecureRandom();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = scanner.nextInt();
        System.out.println("Gerando um número entre " + numero1 +" e "+ numero2+ "...");
        System.out.println(numeroAleatorio(numero1, numero2));
    }
    private static int numeroAleatorio(int minimo, int maximo) {
        return ALEATORIO.nextInt(maximo-minimo) + minimo;
    }
}
