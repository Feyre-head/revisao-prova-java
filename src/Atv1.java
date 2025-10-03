import java.util.Scanner;

public class Atv1 {
    public int menor = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = 10;
        int[] vetorNum = new int[10];

        for (int v = 0; v < tamanho; v++) {
            System.out.println("Informe o " + (1 + v) + " número");
            vetorNum[v] = sc.nextInt();
        }
        //todo maiorNum()
        //todo menorNum()
        //todo paresImpares

       /* Escreva um programa em Java que:

        1. Leia **10 números inteiros** e armazene em um **vetor**.
        2. Mostre:

        - O **maior número** digitado.
                - O **menor número** digitado.
                - Quantos números são **pares** e quantos são **ímpares**.

👉 **Requisitos:**

        - Usar `Scanner` para entrada de dados.
        - Utilizar **laço de repetição** (`for` ou `while`).
        - Utilizar pelo menos **uma função** que receba o vetor como parâmetro e retorne o maior valor.*/


    }

    public class

    int maiorNum(int numVetor) {
        menor = 0;
        for (int l = 0; l < 10; l++) {

            if (numVetor > menor) {
                menor++;
            }
        }
    }
}
