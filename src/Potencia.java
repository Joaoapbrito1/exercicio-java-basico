import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        int base, expo, result = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base: ");
        base = scanner.nextInt();
        System.out.println("Digite o expoente: ");
        expo = scanner.nextInt();

        //int  = 0;
        for (int i = expo; i >= 1; i--) {
            result = result * base;
        }
        System.out.println(result);
    }
}
