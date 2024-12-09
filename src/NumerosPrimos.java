import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        double n = scanner.nextDouble();

        if (n % 2 == 0) {
            System.out.println("Não é primo");
        } else {
            System.out.println("É primo");
        }
    }
}