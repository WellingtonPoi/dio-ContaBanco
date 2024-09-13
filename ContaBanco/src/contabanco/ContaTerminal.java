package contabanco;

import java.util.Scanner;

/**
 * @author wellington.poi
 */
public class ContaTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados do cliente
        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        String numeroConta = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        String saldo = scanner.nextLine();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                          + "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo "
                          + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}
