import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        int fat = 1;
        int i = n;
        while (i > 1){
            fat *= i;
            i--;
        }
        System.out.println("O fatorial dos números de 1 até " + n + " é: " + fat);
    }
}