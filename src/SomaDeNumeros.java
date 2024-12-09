import java.util.Scanner;

public class SomaDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        System.out.println("A soma dos números de 1 até " + n + " é: " + soma);
    }
}