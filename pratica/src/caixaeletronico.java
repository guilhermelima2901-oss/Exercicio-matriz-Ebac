import java.util.Scanner;
import java.util.ArrayList;

public class caixaeletronico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variáveis do sistema
        double saldo = 1000.00;
        double valor;
        double totalMovimentado = 0;

        int opcao = 0;
        int senhaCorreta = 1234;
        int senhaDigitada;
        int tentativas = 0;
        int quantidadeSaques = 0;

        boolean acesso = false;

        // Histórico de operações
        ArrayList<String> extrato = new ArrayList<>();

        // SISTEMA DE SENHA
        System.out.println("===== ACESSO AO BANCO JAVA =====");

        while (tentativas < 3 && !acesso) {

            System.out.print("Digite sua senha: ");
            senhaDigitada = scanner.nextInt();

            if (senhaDigitada == senhaCorreta) {

                acesso = true;
                System.out.println("\nAcesso autorizado!");

            } else {

                tentativas++;

                System.out.println("Senha incorreta!");

                System.out.println("Tentativas restantes: " + (3 - tentativas));
            }
        }

        if (!acesso) {

            System.out.println("\nAcesso bloqueado!");

        } else {

            // MENU PRINCIPAL
            do {

                System.out.println("\n========== BANCO JAVA ==========");
                System.out.println("1 - Consultar saldo");
                System.out.println("2 - Realizar saque");
                System.out.println("3 - Realizar depósito");
                System.out.println("4 - Sair");
                System.out.println("5 - Consultar extrato");
                System.out.println("6 - Resumo das movimentações");

                System.out.print("\nEscolha uma opção: ");
                opcao = scanner.nextInt();

                switch (opcao) {

                    case 1:

                        System.out.printf(
                                "\nSaldo atual: R$ %.2f%n", saldo);

                        break;

                    case 2:

                        System.out.print("\nDigite o valor do saque: R$ ");
                        valor = scanner.nextDouble();

                        if (valor <= 0) {

                            System.out.println("Valor inválido!");

                        } else if (valor > 1000) {

                            System.out.println(
                                    "Limite máximo de saque: R$ 1.000,00");

                        } else if (valor > saldo) {

                            System.out.println("Saldo insuficiente!");

                        } else {

                            saldo -= valor;
                            quantidadeSaques++;
                            totalMovimentado += valor;

                            extrato.add(String.format("Saque: R$ %.2f", valor));

                            System.out.println("Saque realizado com sucesso!");

                            System.out.printf(
                                    "Saldo restante: R$ %.2f%n", saldo);
                        }

                        break;

                    case 3:

                        System.out.print("\nDigite o valor do depósito: R$ ");
                        valor = scanner.nextDouble();

                        if (valor <= 0) {

                            System.out.println("Valor inválido!");

                        } else {

                            saldo += valor;
                            totalMovimentado += valor;

                            extrato.add(String.format("Depósito: R$ %.2f%n", valor));

                            System.out.println("Depósito realizado com sucesso!");

                            System.out.printf("Novo saldo: R$ %.2f%n", saldo);
                        }

                        break;

                    case 4:

                        System.out.println("\nObrigado por utilizar o Banco Java!");

                        break;

                    case 5:

                        System.out.println("\n===== EXTRATO BANCÁRIO =====");

                        if (extrato.isEmpty()) {

                            System.out.println(
                                    "Nenhuma movimentação realizada.");

                        } else {

                            for (String operacao : extrato) {

                                System.out.println(operacao);

                            }
                        }

                        System.out.printf(
                                "\nSaldo atual: R$ %.2f%n", saldo);

                        break;

                    case 6:

                        System.out.println(
                                "\n===== RESUMO DAS MOVIMENTAÇÕES =====");

                        System.out.println("Quantidade de saques: " + quantidadeSaques);

                        System.out.printf("Total movimentado: R$ %.2f%n", totalMovimentado);

                        System.out.printf("Saldo atual: R$ %.2f%n", saldo);

                        break;

                    default:

                        System.out.println("\nOpção inválida! Tente novamente.");

                        break;
                }

            } while (opcao != 4);

            // RESUMO FINAL
            System.out.println("\n===== RESUMO FINAL =====");

            System.out.println(
                    "Quantidade de saques: " + quantidadeSaques);

            System.out.printf(
                    "Total movimentado: R$ %.2f%n", totalMovimentado);

            System.out.printf("Saldo final: R$ %.2f%n", saldo);
        }

        scanner.close();
    }
}