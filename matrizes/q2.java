public class q2 {
    public static void main(String[] args) {
//        Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os
//        demais elementos. Escreva ao final a matriz obtida.

        int[][] a = new int[4][4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
