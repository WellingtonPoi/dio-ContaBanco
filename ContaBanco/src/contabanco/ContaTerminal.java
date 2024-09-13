/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabanco;

import java.util.Scanner;

/**
 *
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

        // Usando concatenação de Strings
        String mensagem = "Olá " + nomeCliente.concat(", obrigado por criar uma conta em nosso banco, ")
            + "sua agência é " + agencia.concat(", conta ") + numeroConta.concat(" e seu saldo ")
            + saldo.concat(" já está disponível para saque.");

        // Exibe a mensagem final com as informações inseridas pelo usuário
        System.out.println(mensagem);

        // Fecha o scanner
        scanner.close();
    }
}
