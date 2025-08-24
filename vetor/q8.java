import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
//        Faça um programa que leia dois vetores de 10 posições e calcule outro vetor
//        contendo, nas posições pares os valores do primeiro e nas posições ímpares os
//        valores do segundo.

        Scanner sc = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite A[" + i + "]: ");
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < B.length; i++) {
            System.out.print("Digite B[" + i + "]: ");
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            C[2*i] = A[i];
            C[2*i + 1] = B[i];
        }

        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]);
        }


    }
}
