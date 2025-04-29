package contaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Define o Locale para usar o ponto como separador decimal

        System.out.println("Por favor, digite o número da agência: ");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo do cliente: ");
        sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco." +
                " sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}