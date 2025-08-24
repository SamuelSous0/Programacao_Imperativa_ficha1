import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Escreva um algoritmo que Leia 10 valores inteiros e armazene-os em um Vetor.
        //Após a digitação do último valor, imprima os elementos com conteúdo par.

        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
            System.out.println(vetor[i]);
            }
        }
    }
}
