import java.util.Scanner;

public class praticando_caixaeletronico {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        double saldo = 2000.00;
        int contador = 0;

        do{
            System.out.println("=========BANCO JAVA==========\n");
            System.out.println("1- Consultar saldo\n2- Realizar saque\n3- realizar depósito\n4- Sair");
            number = scanner.nextInt();

            if(number == 1){

                System.out.println("R$ "+saldo+"\n");

            }if(number == 2){

                double saque = 0;

                System.out.println("Digite o valor que deseja sacar: ");
                saque = scanner.nextDouble();

                    if (saque > 0 && saque < 1000) {


                        saldo = saldo - saque;
                        System.out.println("Saque realizado com sucesso\nSaldo restante: R$ " + saldo + "\n");

                        contador = contador + 1;
                        System.out.println("número de saques: " + contador);

                    } else {
                        System.out.println("Valor inválido, Digite novamente !");
                    }

            }else if(number == 3){

                System.out.println("Digite o valor do deposito: ");
                double deposito = scanner.nextDouble();

                if(deposito > 0) {

                    deposito = saldo + deposito;
                    System.out.println("Depósito realizado com sucesso\nNovo saldo: R$ " + deposito + "\n");

                }else{

                    System.out.println("Valor inválido, digite novamente !");
                }
            }

        }while(number != 4);

        System.out.println("Obrigado por utilizar o BANCO JAVA!");
        scanner.close();
    }

}
