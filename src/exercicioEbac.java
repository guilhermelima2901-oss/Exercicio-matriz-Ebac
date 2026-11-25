import java.util.Scanner;

public class exercicioEbac {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("VAMOS PREENCHER UMA MATRIZ 3X3: \n");

        for(int x = 0; x < matriz.length; x++){
            for(int j = 0; j < matriz[x].length; j++){
                System.out.println("Digite um numero para preencher a posição: "+ x + " x "+ j);
                matriz[x][j] = scanner.nextInt();
            }
        }

        for(int x = 0; x < matriz.length; x++){
            for(int j = 0; j < matriz[x].length; j++){
                System.out.print(matriz[x][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
