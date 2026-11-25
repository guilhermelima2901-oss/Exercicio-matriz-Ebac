import java.util.Scanner;

public class praticandoWhile {
    static void main() {

       Scanner scanner = new Scanner(System.in);

       double nota;
       double soma = 0;
       int quantidade = 0;

        System.out.println("Digite uma nota (-1 para finalizar): ");
        nota = scanner.nextInt();

        while( nota != -1){

            soma += nota;
            quantidade++;

            System.out.println("Digite uma nota (-1 para finalizar): ");
            nota = scanner.nextDouble();
        }
        if(quantidade > 0 ) {

            double media = soma / quantidade;

            System.out.println("Quantidades de nota: " + quantidade);
            System.out.println("Soma das notas: " + soma);
            System.out.println("Média final: " + media);
        }else{
            System.out.println("Quantidade de notas inválida");
        }
        scanner.close();

    }
}
