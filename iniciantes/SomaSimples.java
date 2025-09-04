import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia os dois valores inteirs
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Calcule a soma
        int SOMA = A + B;

        // Imprima o resultado
        System.out.println("SOMA = " + SOMA);

        scanner.close();
    }
}