import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        // 2. Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os valores lidos.

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[6];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
