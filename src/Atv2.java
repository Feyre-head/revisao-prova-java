import java.util.Scanner;

public class Atv2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = 3;
        int[][] matriz = new int[tamanho][tamanho];

        //Preencher Matriz
        for (int l = 0; l < tamanho; l++) {
            for (int c = 0; c < tamanho; c++) {
                System.out.println("Informe o nº da linha " + (1 + l) + " e coluna " + (1 + c) + ":");
                matriz[l][c] = sc.nextInt();
            }
        }

        //Mostrar Matriz
        for (int l = 0; l < tamanho; l++) {
            for (int c = 0; c < tamanho; c++) {
                System.out.print(matriz[l][c] + "  ");
            }
            System.out.println();
        }

        somaLinhas(matriz);

        somaColunas(matriz);
    }

    //Soma Linhas
    public static void somaLinhas(int[][] matriz) {
        for (int l = 0; l < matriz.length; l++) {
            int soma = 0;
            for (int c = 0; c < matriz.length; c++) {
                soma = soma + matriz[l][c];

            }
            System.out.println(" soma da " + (1 + l) + " Coluna : " + soma);
        }
    }

    //Soma Coluna
    public static void somaColunas(int[][] matriz) {
        for (int c = 0; c < matriz.length; c++) {
            int soma = 0;
            for (int l = 0; l < matriz.length; l++) {
                soma = soma + matriz[l][c];
            }
            System.out.println(" soma da " + (1 + c) + " Linha : " + soma);
        }
    }
}
