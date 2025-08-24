import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
//        Escreva um programa que dados dois vetores de 20 números cada, gere um
//        terceiro vetor para intercalar os elementos dos dois.

        Scanner sc = new Scanner(System.in);

        int[] A = new int[20];
        int[] B = new int[20];
        int[] C = new int[40];
        int j = 0, k = 0;

        for (int i = 0; i < A.length; i++) {
//            A[i] = (int)(Math.random()*100);
//            B[i] = (int)(Math.random()*100);

            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

//        System.out.println("VALORES DE A: ");
//        for (int i = 0; i < A.length; i++) {
//            System.out.println(A[i]);
//        }
//        System.out.println("VALORES DE B: ");
//        for (int i = 0; i < B.length; i++) {
//            System.out.println(B[i]);
//        }

        for (int i = 0; i < C.length; i++) {
            if (i % 2 == 0) {
                C[i] = A[j];
                j++;
            } else {
                C[i] = B[k];
                k++;
            }
        }
        System.out.println("VALORES DE C: ");
        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]);
        }

    }
}
