import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));

        System.out.print("Por favor, digite o número de sua conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o número de sua agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite seu saldo: ");
        String saldoString = scanner.nextLine();
        float saldo = Float.parseFloat(saldoString.replace(',', '.'));
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
