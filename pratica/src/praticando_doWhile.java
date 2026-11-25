import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class praticando_doWhile {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do{
            System.out.println("=====MENU PRINCIPAL=====\n\n1- Somar dois numeros\n2- Verificar par ou ímpar\n3- sair");
            number = scanner.nextInt();

            if(number == 1){
                MenuSoma(scanner);

            }if(number == 2) {
                verificarParImpar(scanner);
            }

        }while(number < 3);

        System.out.println("Obrigado por utilizar nosso programa ? ");
        scanner.close();

    }


    static void MenuSoma(Scanner scanner) {

        double n1;
        double n2;

        System.out.println("Vamos somar dois números ?\n");

        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextDouble();

        double soma = n1 + n2;
        System.out.println("resultado da soma "+ soma+"\n");

    }

    static void verificarParImpar(Scanner scanner) {

        int numero = 0;

        System.out.println("Vamos verificar se um numero é par ou ímpar ?");
        System.out.println("Digite um número: ");

        numero = scanner.nextInt();

        if( numero % 2 == 0){
            System.out.println("O número "+numero+" é par\n");

        }else{
            System.out.println("O número "+numero+" é ímpar\n");
        }


    }

}



