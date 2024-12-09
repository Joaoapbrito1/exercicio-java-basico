import java.util.Scanner;

public class MultiploDeUmNumero{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número n: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o limite m: ");
        int multiplos = scanner.nextInt();

        System.out.println("Múltiplos de " + numero + " até " + multiplos + ":");

        for (int i = numero; i <= multiplos; i += numero) {
            System.out.print(i + " ");
        }
    }
}