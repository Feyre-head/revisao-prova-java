import java.util.Scanner;

public class Atv1 {
    //Armazenar valores de Pares
    static int[] impar = new int[10];
    //Armazenar Valores de ímpares
    static int[] par = new int[10];

    public static void main(String[] args) {

        int tamanho = 10;
        int[] vetorNum = new int[tamanho];

        Scanner sc = new Scanner(System.in);

        //Ler 10 números
        for (int v = 0; v < tamanho; v++) {
            System.out.println("Informe o " + (1 + v) + "° número:");
            vetorNum[v] = sc.nextInt();
        }

        //Números na Lista
        mostrarLista(vetorNum);

        //Maior número da lista
        maiorNum(vetorNum);

        //Menor número
        menorNum(vetorNum);

        //Pares
        pares(vetorNum);


    }


    //Retornar números Pares e ímpares
    public static void pares(int[] vetor) {
        int cont = 0;
        System.out.println("Números Pares: ");
        for (int c = 0; c < 10; c++) {
            if (vetor[c] % 2 == 0) {
                par[cont] = vetor[c];
                cont++;
            } else {

            }
        }

        for (int c = 0; c < cont; c++) {
            System.out.print(par[c] + " ");
        }
        System.out.println();
    }


    //Retornar Maior número
    public static void maiorNum(int[] vetor) {
        int maior = 0;
        for (int i : vetor) { //Lê todos os números dentro do vetor
            if (maior < i) {
                maior = i;
            }
        }
        System.out.print(maior + " é o maior número!");
        System.out.println();

    }


    //Retornar Menor número
    public static void menorNum(int[] vetor) {
        int menor = vetor[0];
        for (int c : vetor) { //Lê todos os números dentro do vetor
            if (c < menor) {
                menor = c;
            }
        }
        System.out.print(menor + " é o menor número");
        System.out.println();
    }

    //Mostrar números na Lista
    public static void mostrarLista(int[] vetor) {
        System.out.println("Números Adicionados:");
        for (int lista : vetor) {

            System.out.print(lista + " ");
        }
        System.out.println();

    }
}
