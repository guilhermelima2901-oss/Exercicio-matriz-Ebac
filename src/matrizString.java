import java.util.Scanner;

public class matrizString {
    static void main() {
        String[][] produtos = new String[3][3];

        produtos[0][0] = "110";
        produtos[0][1] = "TV";
        produtos[0][2] = "5.300";

        produtos[1][0] = "335";
        produtos[1][1] = "PC";
        produtos[1][2] = "3.150";

        produtos[2][0] = "545";
        produtos[2][1] = "camiseta";
        produtos[2][2] = "75.89";

        for (String[] produto : produtos){
            for (String dadoDoProduto : produto){
                System.out.print(dadoDoProduto + " ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do produto que você deseja buscar: ");
        String codigoDoProduto = scanner.next();

        boolean produtoEncontrado = false;

        for (String[] produto : produtos){
            if(produto[0].equals(codigoDoProduto)){
                System.out.println("Produto encontrado");
                System.out.println("Código: "+ produto[0]+ "\nNome: "+ produto[1]+"\nPreço: "+ produto[2]);
                produtoEncontrado = true;
                break;
            }
        }
        if(produtoEncontrado == false){
            System.out.println("Produto não encontrado");
        }




    }
}
