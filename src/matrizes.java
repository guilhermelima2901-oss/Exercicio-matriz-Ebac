import java.util.Scanner;

public class matrizes {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da sua matriz");
        int linhas = scanner.nextInt();

        System.out.print("Digite a quantidade de colunas da sua matriz");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.printf("Digite os valores da matriz: %d x %d \n", linhas, colunas);
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("Digite o valor da posição [" + i + "][" + j + "], da matriz: ");
                matriz[i][j] = scanner.nextInt();
            }

        }
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

}
