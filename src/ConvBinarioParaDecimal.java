import java.util.Scanner;

public class ConvBinarioParaDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número binário: ");
        String binario = scanner.nextLine();

        // Validação da entrada usando expressão regular
        if (!binario.matches("[01]+")) {
            System.out.println("Entrada inválida. Digite um número binário (apenas 0 e 1).");
            return;
        }

        // Conversão de binário para decimal
        int decimal = 0;
        int potencia = binario.length() - 1;

        for (int i = 0; i < binario.length(); i++) {
            if (binario.charAt(i) == '1') {
                decimal += Math.pow(2, potencia);
            }
            potencia--;
        }

        System.out.println("O número decimal equivalente é: " + decimal);
    }
}