import java.util.Scanner;

public class ContagemDeDigitos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número com mais de um digito: ");
        Long numero = scanner.nextLong();

        String s = Long.toString(numero);
        System.out.println(s.length());

    }
}