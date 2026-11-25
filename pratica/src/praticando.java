import java.util.Scanner;

public class praticando {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da sua matriz: ");
        int linhas = scanner.nextInt();

        System.out.println("Digite a quantidade de colunas da sua matriz: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os valores da sua matriz: "+ linhas + " x " + colunas);
        for (int x = 0; x < matriz.length; x++){
            for (int j = 0; j < matriz[x].length; j++){
                System.out.print("Digite o valor da posição [ " + x +" x " + j + " ]: " );
                matriz[x][j] = scanner.nextInt();
            }

        }
        for (int x = 0; x < matriz.length; x++) {
            for (int j = 0; j < matriz[x].length; j++) {
                System.out.print(matriz[x][j] + " ");

            }
            System.out.println();
        }



        for( int[] linha : matriz) {
            int somaTotalLinhas = 0;

            for (int valorColuna : linha){
                somaTotalLinhas += valorColuna;

            }
            double media = (double) somaTotalLinhas / colunas;

            System.out.println("soma da linha: " + somaTotalLinhas);
            System.out.println("media da linha: " + media);
            System.out.println();

        }

    }
}
