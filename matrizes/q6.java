public class q6 {
    public static void main(String[] args) {
//        Gerar e imprimir uma matriz de tamanho 10 x 10, onde seus elementos são
//        da forma:
//        a. A[i][j] = 2i + 7j − 2, se i < j;
//        b. A[i][j] = 3i 2 − 1, se i = j;
//        c. A[i][j] = 4i 3 − 5j 2 + 1, se i > j
        int[][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i < j) {
                    matriz[i][j] = (2 * i) + (7 * j) - 2;
                } else if (i == j) {
                    matriz[i][j] = (3 * i * i) - 1;
                } else {
                    matriz[i][j] = (4 * i * i * i) - (5 * j * j) + 1;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t ");
            }
            System.out.println();
        }
    }
}
